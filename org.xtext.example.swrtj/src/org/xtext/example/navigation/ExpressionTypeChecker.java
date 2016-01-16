package org.xtext.example.navigation;

import java.util.*;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Number;
import org.xtext.example.typechecking.ExpressionType;
import org.xtext.example.typechecking.ParamArgumentChecker;
import org.xtext.example.typechecking.TypeChecker;
import org.xtext.example.utils.*;

public class ExpressionTypeChecker extends
		ExpressionNavigator<Collection<ErrorMessage>> {
	private ParamArgumentChecker paramChecker = new ParamArgumentChecker();
	private Lookup lookup = new Lookup();
	private ExpressionType noCastType;
	
	public ExpressionTypeChecker() {
		this(null);		
	}
	
	public ExpressionTypeChecker(ExpressionTypeChecker nestedTypeChecker) {
		if(nestedTypeChecker != null) {
			this.paramChecker = nestedTypeChecker.paramChecker;
			this.lookup = nestedTypeChecker.lookup;
			this.noCastType = nestedTypeChecker.noCastType;
		}
	}

	@Override
	protected Collection<ErrorMessage> bind(FieldAccess message,
			Collection<ErrorMessage> previousReturn) {
		noCastType = ExpressionType.createInstance(message);

		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(MethodInvocation message,
			Collection<ErrorMessage> previousReturn) {
		noCastType = ExpressionType.createInstance(message);

		Collection<ErrorMessage> errorList = evaluate(previousReturn);

		errorList.addAll(paramChecker.compareMethodParameter(
				lookup.getOwnerMethod(message.getMethod()), message));
		List<GenericExpression> argumentList = message.getArgumentList();

		for (EObject argument : argumentList) {
			Collection<ErrorMessage> errors = null;
			
			if(argument instanceof Expression) {
				errors = new ExpressionTypeChecker().navigate((Expression)argument);
			} else {
				errors = new ExpressionTypeChecker().navigate((BooleanExpression)argument);
			}
					
			if (errors != null)
				errorList.addAll(errors);
		}

		return errorList;
	}

	@Override
	protected Collection<ErrorMessage> bind(Output start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(BooleanConstant start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(Number start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(StringConstant start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(This start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(ParameterReference start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(ConstructorInvocation start,
			Collection<ErrorMessage> previousReturn) {
		Collection<ErrorMessage> errorList = evaluate(previousReturn);
		Constructor constructor = paramChecker.matchConstructor(
				start.getClassRef(), start.getArgumentList());
		List<GenericExpression> argumentList = start.getArgumentList();

		if (constructor == null && start.getClassRef() != null) {
			errorList.add(new ErrorMessage("Cannot find constructor in class "
					+ start.getClassRef().getName(), start));
		} else
			errorList.addAll(paramChecker.compareConstructorParameters(
					constructor, start));

		for (EObject argument : argumentList) {
			if(argument instanceof Expression) {
				errorList.addAll(new ExpressionTypeChecker().navigate((Expression)argument));
			} else {
				errorList.addAll(new ExpressionTypeChecker().navigate((BooleanExpression)argument));
			}
		}

		return errorList;
	}

	@Override
	protected Collection<ErrorMessage> bind(Cast start,
			Collection<ErrorMessage> previousReturn) {
		if (start == null || start.getStart() == null)
			return previousReturn;
		Collection<ErrorMessage> errorList = evaluate(previousReturn);
		ExpressionType castType = ExpressionType.createInstance(start);
		ExpressionType receiverType = (start.getStart().eClass()
				.getClassifierID() == SwrtjPackage.CAST ? ExpressionType
				.createInstance(start.getStart())
				: (noCastType == null ? ExpressionType.createInstance(start
						.getStart()) : noCastType));

		if (receiverType != null && !receiverType.canCastTo(castType)) {
			errorList.add(new ErrorMessage("Cannot cast "
					+ receiverType.getName() + " to " + castType.getName(),
					start));
		}

		return errorList;
	}

	@Override
	protected Collection<ErrorMessage> bind(NestedExpression start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	/**
	 * Creates a new default instance for the type Collection<ErrorMessage>.
	 * 
	 * @return the default insance
	 */
	@Override
	protected Collection<ErrorMessage> defaultConstructor() {
		return new LinkedList<ErrorMessage>();
	}

	@Override
	protected Collection<ErrorMessage> bind(Expression expression,
			Collection<ErrorMessage> previousReturn) {
		Collection<ErrorMessage> errorList = evaluate(previousReturn);
		boolean check = expression.getTermList().size() > 1 || expression.getSign() != null;

		for (DottedExpression term : expression.getTermList()) {
			ExpressionType termType = ExpressionType.createInstance(term);
			String typeName = (termType != null ? termType.getPrimitiveType()
					: null);
			if (termType != null
					&& (typeName == null || typeName.equals("boolean") || typeName
							.equals("void")) && check) {
				errorList.add(new ErrorMessage(
						"Arithmetic expression terms must have numeric type",
						term));
			}

			Collection<ErrorMessage> newErrors = new ExpressionTypeChecker()
					.navigate(term);
			if (newErrors != null)
				errorList.addAll(newErrors);
		}

		return errorList;
	}

	@Override
	protected Collection<ErrorMessage> bind(DottedExpression expression,
			Collection<ErrorMessage> previousReturn) {
		Collection<ErrorMessage> errorList = super.bind(expression,
				previousReturn);
		EObject value = expression.getValue();
		if (value == null || !(expression.getMessage() instanceof FieldAccess))
			return errorList;
		FieldName field = ((FieldAccess) expression.getMessage()).getField();

		ExpressionType valueType = (value instanceof Expression ? ExpressionType
				.createInstance((Expression) value) : ExpressionType
				.createInstance("boolean"));
		ExpressionType fieldType = ExpressionType.createInstance(lookup
				.getType(field));

		if (valueType != null && fieldType != null
				&& !valueType.isSubtype(fieldType))
			errorList.add(new ErrorMessage("Incompatible types in assignment: "
					+ valueType.getName() + " is not subtype of "
					+ fieldType.getName(), expression));
		return errorList;
	}

	@Override
	protected Collection<ErrorMessage> bind(Null start,
			Collection<ErrorMessage> previousReturn) {
		return evaluate(previousReturn);
	}

	@Override
	protected Collection<ErrorMessage> bind(Input start,
			Collection<ErrorMessage> previousReturn) {
		return previousReturn;
	}

	@Override
	protected Collection<ErrorMessage> bind(Args start,
			Collection<ErrorMessage> previousReturn) {
		return previousReturn;
	}

	@Override
	protected Collection<ErrorMessage> bind(BooleanExpression expression,
			Collection<ErrorMessage> previousReturn) {
		return new TypeChecker(this).caseBooleanExpression(expression);
	}

	@Override
	protected Collection<ErrorMessage> bind(ParameterAssignment start,
			Collection<ErrorMessage> previousReturn) {
		previousReturn = evaluate(previousReturn);
		ExpressionType leftHand = ExpressionType.createInstance(start);
		ExpressionType rightHand = ExpressionType.createInstance(start.getValue());
		
		if(leftHand != null && rightHand != null && !(rightHand.isSubtype(leftHand))) {
			previousReturn.add(new ErrorMessage("The expression is not subtype of " + leftHand.getName(),
					start.getValue()));
		}
		
		previousReturn.addAll(navigate(start.getValue()));
		
		return previousReturn;
	}
}
