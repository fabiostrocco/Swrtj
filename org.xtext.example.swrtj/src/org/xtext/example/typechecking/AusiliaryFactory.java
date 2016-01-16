package org.xtext.example.typechecking;

import org.xtext.example.linker.ElementFactory;
import org.xtext.example.navigation.ExpressionNavigator;
import org.xtext.example.swrtj.Args;
import org.xtext.example.swrtj.BooleanConstant;
import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.Cast;
import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.Input;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.NestedExpression;
import org.xtext.example.swrtj.Null;
import org.xtext.example.swrtj.Number;
import org.xtext.example.swrtj.Output;
import org.xtext.example.swrtj.ParameterAssignment;
import org.xtext.example.swrtj.ParameterReference;
import org.xtext.example.swrtj.StringConstant;
import org.xtext.example.swrtj.This;
import org.xtext.example.swrtj.Type;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;

public class AusiliaryFactory extends ExpressionNavigator<ExpressionType> {
	private boolean withoutCast;
	private boolean isFirst = true;
	private boolean isFirstCast = true;
	
	private Lookup lookup = new Lookup();
	
	protected AusiliaryFactory(boolean withoutCast) {this.withoutCast = withoutCast;}
	protected AusiliaryFactory() {this(false);}
	
	@Override
	protected ExpressionType bind(Expression expression,
			ExpressionType previousReturn) {
		ExpressionType type = null;
		boolean check = expression.getTermList().size() > 1;
		
		 for(DottedExpression term : expression.getTermList()) {
			boolean oldIsFirst = isFirst;
			boolean oldIsFirstCast = isFirstCast;
			boolean oldWithoutCast = withoutCast;
			ExpressionType termType = bind(term, previousReturn);
			isFirst = oldIsFirst;
			isFirstCast = oldIsFirstCast;
			withoutCast = oldWithoutCast;
			
			String typeName = (type == null ? null : type.getPrimitiveType());
			if (type != null && (typeName == null || typeName.equals("boolean") || 
					typeName.equals("void")) && check) {
				return null;
			}
			
			if(termType != null && (type == null || type.isSubtype(termType))) type = termType;
		}
		
		return type;
	}

	@Override
	protected ExpressionType bind(FieldAccess message,
			                      ExpressionType previousReturn) {
		if(!withoutCast && !isFirstCast)
			return previousReturn;
		if(isFirst) {
			isFirst = false;
			return typeToExpressionType(lookup.getType(message.getField()));
		}
		return previousReturn;
	}

	@Override
	protected ExpressionType bind(MethodInvocation message,
			                      ExpressionType previousReturn) {
		if(!withoutCast && !isFirstCast)
			return previousReturn;
		if(isFirst) {
			isFirst = false;
			return typeToExpressionType(lookup.getReturnType(message.getMethod()));
		}
		return previousReturn;
	}

	@Override
	protected ExpressionType bind(This start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return new ThisType(start);
		return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(Input start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return javaType("IScanner");
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(Args start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return javaType("IList");
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(Output start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return javaType("IPrintStream");
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(StringConstant start,
			ExpressionType previousReturn) {
		if(previousReturn == null)
			return javaType("IString");
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(BooleanConstant start,
			ExpressionType previousReturn) {
		if(previousReturn == null)
			return new PrimitiveType("boolean");
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(Number start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return new PrimitiveType("int");
		else return previousReturn;
	}

	@Override
	protected ExpressionType bind(ParameterReference start,
			                      ExpressionType previousReturn) {
		if(previousReturn == null)
			return typeToExpressionType(start.getParameter().getType());
		return previousReturn;
	}

	@Override
	protected ExpressionType bind(ConstructorInvocation start,
			                      ExpressionType previousReturn) {
		if(previousReturn == null)
			return new ClassType(start.getClassRef());
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(Null start, ExpressionType previousReturn) {
		if(previousReturn == null)
			return new NullType();
		else return previousReturn;
	}
	
	@Override
	protected ExpressionType bind(DottedExpression expression,
			                      ExpressionType previousReturn) {
		if(expression.getValue() == null)
			return super.bind(expression, previousReturn);
		
		return ExpressionType.createInstance(lookup.getType(((FieldAccess)expression.getMessage()).getField()));
	}

	@Override
	protected ExpressionType bind(Cast start, ExpressionType previousReturn) {
		if(withoutCast)
			return previousReturn;
		
		if(isFirstCast) {
			isFirstCast = false;
			return typeToExpressionType(start.getType());
		}
		return previousReturn;
	}

	@Override
	protected ExpressionType bind(NestedExpression start,
			                      ExpressionType previousReturn) {
		withoutCast = false;
		return previousReturn;
	}
	
	/**
	 * Creates a new default instance for the type Collection<ErrorMessage>.
	 * @return the default insance
	 */
	@Override
	protected ExpressionType defaultConstructor() {
		return null;
	}
	
	public static ExpressionType typeToExpressionType(Type type) {
		return ExpressionType.typeToExpressionType(type);
	}
	
	/*Service methods*/
	
	private ExpressionType javaType(String name) {
		return new InterfaceType((Interface)ElementFactory.getFactory().forName(name));
	}
	
	@Override
	protected ExpressionType bind(BooleanExpression start,
			ExpressionType previousReturn) {
		return new PrimitiveType("boolean");
	}
	@Override
	protected ExpressionType bind(ParameterAssignment start,
			ExpressionType previousReturn) {
		return typeToExpressionType(start.getParameter().getType());
	}
}