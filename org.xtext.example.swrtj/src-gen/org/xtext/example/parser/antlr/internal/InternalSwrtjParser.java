package org.xtext.example.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.example.services.SwrtjGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSwrtjParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'interface'", "'extends'", "','", "'{'", "'}'", "'record'", "'is'", "'trait'", "'class'", "'implements'", "'by'", "'and'", "'program'", "'+'", "'['", "']'", "'('", "')'", "'exclude'", "'renameTo'", "'renameF'", "'aliasAs'", "'renameM'", "'renameFieldTo'", "'transient'", "'volatile'", "';'", "'synchronized'", "'return'", "'byte'", "'char'", "'boolean'", "'short'", "'int'", "'long'", "'float'", "'double'", "'void'", "'if'", "'else'", "'while'", "'&'", "'&&'", "'|'", "'||'", "'^'", "'!'", "'<'", "'<='", "'=='", "'!='", "'>'", "'>='", "'='", "'-'", "'*'", "'/'", "'%'", "'.'", "'null'", "'in'", "'args'", "'out'", "'true'", "'false'", "'this'", "'new'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSwrtjParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[247+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SwrtjGrammarAccess grammarAccess;
     	
        public InternalSwrtjParser(TokenStream input, IAstFactory factory, SwrtjGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/parser/antlr/internal/InternalSwrtj.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	}
       	
       	@Override
       	protected SwrtjGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleFile
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:83:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:84:2: (iv_ruleFile= ruleFile EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:85:2: iv_ruleFile= ruleFile EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFile_in_entryRuleFile81);
            iv_ruleFile=ruleFile();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFile91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFile


    // $ANTLR start ruleFile
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:92:1: ruleFile returns [EObject current=null] : ( ( (lv_importList_0_0= ruleImport ) )* ( (lv_elementList_1_0= ruleElement ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_importList_0_0 = null;

        EObject lv_elementList_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:97:6: ( ( ( (lv_importList_0_0= ruleImport ) )* ( (lv_elementList_1_0= ruleElement ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:98:1: ( ( (lv_importList_0_0= ruleImport ) )* ( (lv_elementList_1_0= ruleElement ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:98:1: ( ( (lv_importList_0_0= ruleImport ) )* ( (lv_elementList_1_0= ruleElement ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:98:2: ( (lv_importList_0_0= ruleImport ) )* ( (lv_elementList_1_0= ruleElement ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:98:2: ( (lv_importList_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:99:1: (lv_importList_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:99:1: (lv_importList_0_0= ruleImport )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:100:3: lv_importList_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFileAccess().getImportListImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleFile137);
            	    lv_importList_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"importList",
            	      	        		lv_importList_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:122:3: ( (lv_elementList_1_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==17||(LA2_0>=19 && LA2_0<=20)||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:123:1: (lv_elementList_1_0= ruleElement )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:123:1: (lv_elementList_1_0= ruleElement )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:124:3: lv_elementList_1_0= ruleElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFileAccess().getElementListElementParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleFile159);
            	    lv_elementList_1_0=ruleElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elementList",
            	      	        		lv_elementList_1_0, 
            	      	        		"Element", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFile


    // $ANTLR start entryRuleImport
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:154:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:155:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:156:2: iv_ruleImport= ruleImport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport196);
            iv_ruleImport=ruleImport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport206); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:163:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:168:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:169:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:169:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:169:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleImport241); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:173:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:174:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:174:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:175:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport258); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleElement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:205:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:206:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:207:2: iv_ruleElement= ruleElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement299);
            iv_ruleElement=ruleElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement309); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:214:1: ruleElement returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Record_1= ruleRecord | this_Trait_2= ruleTrait | this_Class_3= ruleClass | this_Program_4= ruleProgram ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Record_1 = null;

        EObject this_Trait_2 = null;

        EObject this_Class_3 = null;

        EObject this_Program_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:219:6: ( (this_Interface_0= ruleInterface | this_Record_1= ruleRecord | this_Trait_2= ruleTrait | this_Class_3= ruleClass | this_Program_4= ruleProgram ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:220:1: (this_Interface_0= ruleInterface | this_Record_1= ruleRecord | this_Trait_2= ruleTrait | this_Class_3= ruleClass | this_Program_4= ruleProgram )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:220:1: (this_Interface_0= ruleInterface | this_Record_1= ruleRecord | this_Trait_2= ruleTrait | this_Class_3= ruleClass | this_Program_4= ruleProgram )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("220:1: (this_Interface_0= ruleInterface | this_Record_1= ruleRecord | this_Trait_2= ruleTrait | this_Class_3= ruleClass | this_Program_4= ruleProgram )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:221:2: this_Interface_0= ruleInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementAccess().getInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterface_in_ruleElement359);
                    this_Interface_0=ruleInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Interface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:234:2: this_Record_1= ruleRecord
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementAccess().getRecordParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecord_in_ruleElement389);
                    this_Record_1=ruleRecord();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Record_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:247:2: this_Trait_2= ruleTrait
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementAccess().getTraitParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTrait_in_ruleElement419);
                    this_Trait_2=ruleTrait();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Trait_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:260:2: this_Class_3= ruleClass
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementAccess().getClassParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_ruleElement449);
                    this_Class_3=ruleClass();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Class_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:273:2: this_Program_4= ruleProgram
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementAccess().getProgramParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleProgram_in_ruleElement479);
                    this_Program_4=ruleProgram();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Program_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleInterface
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:292:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:293:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:294:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterface_in_entryRuleInterface514);
            iv_ruleInterface=ruleInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterface524); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterface


    // $ANTLR start ruleInterface
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:301:1: ruleInterface returns [EObject current=null] : ( ( (lv_construct_0_0= 'interface' ) ) ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )* '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_construct_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_requiredMethodList_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:306:6: ( ( ( (lv_construct_0_0= 'interface' ) ) ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )* '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:307:1: ( ( (lv_construct_0_0= 'interface' ) ) ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )* '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:307:1: ( ( (lv_construct_0_0= 'interface' ) ) ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )* '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:307:2: ( (lv_construct_0_0= 'interface' ) ) ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )* '}'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:307:2: ( (lv_construct_0_0= 'interface' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:308:1: (lv_construct_0_0= 'interface' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:308:1: (lv_construct_0_0= 'interface' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:309:3: lv_construct_0_0= 'interface'
            {
            lv_construct_0_0=(Token)input.LT(1);
            match(input,12,FollowSets000.FOLLOW_12_in_ruleInterface567); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getConstructInterfaceKeyword_0_0(), "construct"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "construct", lv_construct_0_0, "interface", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:328:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:329:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:329:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterface597); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:352:2: ( 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:352:4: 'extends' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleInterface613); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getExtendsKeyword_2_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:356:1: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:357:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:357:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:358:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterface635); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getInterfaceAccess().getExtendsListInterfaceCrossReference_2_1_0(), "extendsList"); 
                      	
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:373:2: ( ',' ( ( RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:373:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleInterface646); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:377:1: ( ( RULE_ID ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:378:1: ( RULE_ID )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:378:1: ( RULE_ID )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:379:3: RULE_ID
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterface668); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		createLeafNode(grammarAccess.getInterfaceAccess().getExtendsListInterfaceCrossReference_2_2_1_0(), "extendsList"); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleInterface682); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:398:1: ( (lv_requiredMethodList_7_0= ruleRequiredMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=41 && LA6_0<=49)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:399:1: (lv_requiredMethodList_7_0= ruleRequiredMethod )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:399:1: (lv_requiredMethodList_7_0= ruleRequiredMethod )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:400:3: lv_requiredMethodList_7_0= ruleRequiredMethod
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getRequiredMethodListRequiredMethodParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleRequiredMethod_in_ruleInterface703);
            	    lv_requiredMethodList_7_0=ruleRequiredMethod();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"requiredMethodList",
            	      	        		lv_requiredMethodList_7_0, 
            	      	        		"RequiredMethod", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleInterface714); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterface


    // $ANTLR start entryRuleRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:434:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:435:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:436:2: iv_ruleRecord= ruleRecord EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRecordRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecord_in_entryRuleRecord750);
            iv_ruleRecord=ruleRecord();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRecord; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecord760); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRecord


    // $ANTLR start ruleRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:443:1: ruleRecord returns [EObject current=null] : ( ( (lv_construct_0_0= 'record' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleRecordExpression ) ) ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token lv_construct_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:448:6: ( ( ( (lv_construct_0_0= 'record' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleRecordExpression ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:449:1: ( ( (lv_construct_0_0= 'record' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleRecordExpression ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:449:1: ( ( (lv_construct_0_0= 'record' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleRecordExpression ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:449:2: ( (lv_construct_0_0= 'record' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleRecordExpression ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:449:2: ( (lv_construct_0_0= 'record' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:450:1: (lv_construct_0_0= 'record' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:450:1: (lv_construct_0_0= 'record' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:451:3: lv_construct_0_0= 'record'
            {
            lv_construct_0_0=(Token)input.LT(1);
            match(input,17,FollowSets000.FOLLOW_17_in_ruleRecord803); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRecordAccess().getConstructRecordKeyword_0_0(), "construct"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRecordRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "construct", lv_construct_0_0, "record", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:470:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:471:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:471:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRecord833); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRecordRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,18,FollowSets000.FOLLOW_18_in_ruleRecord848); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRecordAccess().getIsKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:498:1: ( (lv_expression_3_0= ruleRecordExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:499:1: (lv_expression_3_0= ruleRecordExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:499:1: (lv_expression_3_0= ruleRecordExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:500:3: lv_expression_3_0= ruleRecordExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRecordAccess().getExpressionRecordExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordExpression_in_ruleRecord869);
            lv_expression_3_0=ruleRecordExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRecordRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_3_0, 
              	        		"RecordExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRecord


    // $ANTLR start entryRuleTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:530:1: entryRuleTrait returns [EObject current=null] : iv_ruleTrait= ruleTrait EOF ;
    public final EObject entryRuleTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrait = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:531:2: (iv_ruleTrait= ruleTrait EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:532:2: iv_ruleTrait= ruleTrait EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTraitRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTrait_in_entryRuleTrait905);
            iv_ruleTrait=ruleTrait();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTrait; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrait915); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrait


    // $ANTLR start ruleTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:539:1: ruleTrait returns [EObject current=null] : ( ( (lv_construct_0_0= 'trait' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleTraitExpression ) ) ) ;
    public final EObject ruleTrait() throws RecognitionException {
        EObject current = null;

        Token lv_construct_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:544:6: ( ( ( (lv_construct_0_0= 'trait' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleTraitExpression ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:545:1: ( ( (lv_construct_0_0= 'trait' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleTraitExpression ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:545:1: ( ( (lv_construct_0_0= 'trait' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleTraitExpression ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:545:2: ( (lv_construct_0_0= 'trait' ) ) ( (lv_name_1_0= RULE_ID ) ) 'is' ( (lv_expression_3_0= ruleTraitExpression ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:545:2: ( (lv_construct_0_0= 'trait' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:546:1: (lv_construct_0_0= 'trait' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:546:1: (lv_construct_0_0= 'trait' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:547:3: lv_construct_0_0= 'trait'
            {
            lv_construct_0_0=(Token)input.LT(1);
            match(input,19,FollowSets000.FOLLOW_19_in_ruleTrait958); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTraitAccess().getConstructTraitKeyword_0_0(), "construct"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTraitRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "construct", lv_construct_0_0, "trait", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:566:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:567:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:567:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:568:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTrait988); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTraitAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTraitRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,18,FollowSets000.FOLLOW_18_in_ruleTrait1003); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTraitAccess().getIsKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:594:1: ( (lv_expression_3_0= ruleTraitExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:595:1: (lv_expression_3_0= ruleTraitExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:595:1: (lv_expression_3_0= ruleTraitExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:596:3: lv_expression_3_0= ruleTraitExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTraitAccess().getExpressionTraitExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitExpression_in_ruleTrait1024);
            lv_expression_3_0=ruleTraitExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTraitRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_3_0, 
              	        		"TraitExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTrait


    // $ANTLR start entryRuleClass
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:626:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:627:2: (iv_ruleClass= ruleClass EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:628:2: iv_ruleClass= ruleClass EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getClassRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClass_in_entryRuleClass1060);
            iv_ruleClass=ruleClass();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass1070); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClass


    // $ANTLR start ruleClass
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:635:1: ruleClass returns [EObject current=null] : ( ( (lv_construct_0_0= 'class' ) ) ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'by' ( (lv_recordExpression_7_0= ruleRecordExpression ) ) 'and' ( (lv_traitExpression_9_0= ruleTraitExpression ) ) '{' ( (lv_constructorList_11_0= ruleConstructor ) )* '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_construct_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_recordExpression_7_0 = null;

        EObject lv_traitExpression_9_0 = null;

        EObject lv_constructorList_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:640:6: ( ( ( (lv_construct_0_0= 'class' ) ) ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'by' ( (lv_recordExpression_7_0= ruleRecordExpression ) ) 'and' ( (lv_traitExpression_9_0= ruleTraitExpression ) ) '{' ( (lv_constructorList_11_0= ruleConstructor ) )* '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:641:1: ( ( (lv_construct_0_0= 'class' ) ) ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'by' ( (lv_recordExpression_7_0= ruleRecordExpression ) ) 'and' ( (lv_traitExpression_9_0= ruleTraitExpression ) ) '{' ( (lv_constructorList_11_0= ruleConstructor ) )* '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:641:1: ( ( (lv_construct_0_0= 'class' ) ) ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'by' ( (lv_recordExpression_7_0= ruleRecordExpression ) ) 'and' ( (lv_traitExpression_9_0= ruleTraitExpression ) ) '{' ( (lv_constructorList_11_0= ruleConstructor ) )* '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:641:2: ( (lv_construct_0_0= 'class' ) ) ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* 'by' ( (lv_recordExpression_7_0= ruleRecordExpression ) ) 'and' ( (lv_traitExpression_9_0= ruleTraitExpression ) ) '{' ( (lv_constructorList_11_0= ruleConstructor ) )* '}'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:641:2: ( (lv_construct_0_0= 'class' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:642:1: (lv_construct_0_0= 'class' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:642:1: (lv_construct_0_0= 'class' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:643:3: lv_construct_0_0= 'class'
            {
            lv_construct_0_0=(Token)input.LT(1);
            match(input,20,FollowSets000.FOLLOW_20_in_ruleClass1113); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getConstructClassKeyword_0_0(), "construct"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "construct", lv_construct_0_0, "class", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:662:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:663:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:663:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:664:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClass1143); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,21,FollowSets000.FOLLOW_21_in_ruleClass1158); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getImplementsKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:690:1: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:691:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:691:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:692:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClass1180); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getClassAccess().getImplementsListInterfaceCrossReference_3_0(), "implementsList"); 
              	
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:707:2: ( ',' ( ( RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:707:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FollowSets000.FOLLOW_14_in_ruleClass1191); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getClassAccess().getCommaKeyword_4_0(), null); 
            	          
            	    }
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:711:1: ( ( RULE_ID ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:712:1: ( RULE_ID )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:712:1: ( RULE_ID )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:713:3: RULE_ID
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	              
            	    }
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClass1213); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		createLeafNode(grammarAccess.getClassAccess().getImplementsListInterfaceCrossReference_4_1_0(), "implementsList"); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,22,FollowSets000.FOLLOW_22_in_ruleClass1225); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getByKeyword_5(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:732:1: ( (lv_recordExpression_7_0= ruleRecordExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:733:1: (lv_recordExpression_7_0= ruleRecordExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:733:1: (lv_recordExpression_7_0= ruleRecordExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:734:3: lv_recordExpression_7_0= ruleRecordExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getClassAccess().getRecordExpressionRecordExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordExpression_in_ruleClass1246);
            lv_recordExpression_7_0=ruleRecordExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"recordExpression",
              	        		lv_recordExpression_7_0, 
              	        		"RecordExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleClass1256); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getAndKeyword_7(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:760:1: ( (lv_traitExpression_9_0= ruleTraitExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:761:1: (lv_traitExpression_9_0= ruleTraitExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:761:1: (lv_traitExpression_9_0= ruleTraitExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:762:3: lv_traitExpression_9_0= ruleTraitExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getClassAccess().getTraitExpressionTraitExpressionParserRuleCall_8_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitExpression_in_ruleClass1277);
            lv_traitExpression_9_0=ruleTraitExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"traitExpression",
              	        		lv_traitExpression_9_0, 
              	        		"TraitExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleClass1287); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:788:1: ( (lv_constructorList_11_0= ruleConstructor ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:789:1: (lv_constructorList_11_0= ruleConstructor )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:789:1: (lv_constructorList_11_0= ruleConstructor )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:790:3: lv_constructorList_11_0= ruleConstructor
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getClassAccess().getConstructorListConstructorParserRuleCall_10_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_ruleClass1308);
            	    lv_constructorList_11_0=ruleConstructor();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getClassRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"constructorList",
            	      	        		lv_constructorList_11_0, 
            	      	        		"Constructor", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleClass1319); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_11(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClass


    // $ANTLR start entryRuleProgram
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:824:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:825:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:826:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProgram_in_entryRuleProgram1355);
            iv_ruleProgram=ruleProgram();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProgram1365); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:833:1: ruleProgram returns [EObject current=null] : ( ( (lv_construct_0_0= 'program' ) ) ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_block_3_0= ruleBlock ) ) '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_construct_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_block_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:838:6: ( ( ( (lv_construct_0_0= 'program' ) ) ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_block_3_0= ruleBlock ) ) '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:839:1: ( ( (lv_construct_0_0= 'program' ) ) ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_block_3_0= ruleBlock ) ) '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:839:1: ( ( (lv_construct_0_0= 'program' ) ) ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_block_3_0= ruleBlock ) ) '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:839:2: ( (lv_construct_0_0= 'program' ) ) ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_block_3_0= ruleBlock ) ) '}'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:839:2: ( (lv_construct_0_0= 'program' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:840:1: (lv_construct_0_0= 'program' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:840:1: (lv_construct_0_0= 'program' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:841:3: lv_construct_0_0= 'program'
            {
            lv_construct_0_0=(Token)input.LT(1);
            match(input,24,FollowSets000.FOLLOW_24_in_ruleProgram1408); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProgramAccess().getConstructProgramKeyword_0_0(), "construct"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "construct", lv_construct_0_0, "program", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:860:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:861:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:861:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:862:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleProgram1438); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleProgram1453); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:888:1: ( (lv_block_3_0= ruleBlock ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:889:1: (lv_block_3_0= ruleBlock )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:889:1: (lv_block_3_0= ruleBlock )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:890:3: lv_block_3_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleProgram1474);
            lv_block_3_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_3_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleProgram1484); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleRecordExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:924:1: entryRuleRecordExpression returns [EObject current=null] : iv_ruleRecordExpression= ruleRecordExpression EOF ;
    public final EObject entryRuleRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:925:2: (iv_ruleRecordExpression= ruleRecordExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:926:2: iv_ruleRecordExpression= ruleRecordExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRecordExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression1520);
            iv_ruleRecordExpression=ruleRecordExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRecordExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordExpression1530); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRecordExpression


    // $ANTLR start ruleRecordExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:933:1: ruleRecordExpression returns [EObject current=null] : ( ( (lv_recordList_0_0= ruleBaseRecord ) ) ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )* ) ;
    public final EObject ruleRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_recordList_0_0 = null;

        EObject lv_recordList_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:938:6: ( ( ( (lv_recordList_0_0= ruleBaseRecord ) ) ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:939:1: ( ( (lv_recordList_0_0= ruleBaseRecord ) ) ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:939:1: ( ( (lv_recordList_0_0= ruleBaseRecord ) ) ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:939:2: ( (lv_recordList_0_0= ruleBaseRecord ) ) ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:939:2: ( (lv_recordList_0_0= ruleBaseRecord ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:940:1: (lv_recordList_0_0= ruleBaseRecord )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:940:1: (lv_recordList_0_0= ruleBaseRecord )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:941:3: lv_recordList_0_0= ruleBaseRecord
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRecordExpressionAccess().getRecordListBaseRecordParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBaseRecord_in_ruleRecordExpression1576);
            lv_recordList_0_0=ruleBaseRecord();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRecordExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"recordList",
              	        		lv_recordList_0_0, 
              	        		"BaseRecord", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:963:2: ( '+' ( (lv_recordList_2_0= ruleBaseRecord ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:963:4: '+' ( (lv_recordList_2_0= ruleBaseRecord ) )
            	    {
            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleRecordExpression1587); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:967:1: ( (lv_recordList_2_0= ruleBaseRecord ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:968:1: (lv_recordList_2_0= ruleBaseRecord )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:968:1: (lv_recordList_2_0= ruleBaseRecord )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:969:3: lv_recordList_2_0= ruleBaseRecord
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRecordExpressionAccess().getRecordListBaseRecordParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBaseRecord_in_ruleRecordExpression1608);
            	    lv_recordList_2_0=ruleBaseRecord();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRecordExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"recordList",
            	      	        		lv_recordList_2_0, 
            	      	        		"BaseRecord", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRecordExpression


    // $ANTLR start entryRuleBaseRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:999:1: entryRuleBaseRecord returns [EObject current=null] : iv_ruleBaseRecord= ruleBaseRecord EOF ;
    public final EObject entryRuleBaseRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseRecord = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1000:2: (iv_ruleBaseRecord= ruleBaseRecord EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1001:2: iv_ruleBaseRecord= ruleBaseRecord EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBaseRecordRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBaseRecord_in_entryRuleBaseRecord1646);
            iv_ruleBaseRecord=ruleBaseRecord();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBaseRecord; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBaseRecord1656); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBaseRecord


    // $ANTLR start ruleBaseRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1008:1: ruleBaseRecord returns [EObject current=null] : (this_AnonimousRecord_0= ruleAnonimousRecord | this_RecordName_1= ruleRecordName | this_NestedRecordExpression_2= ruleNestedRecordExpression ) ;
    public final EObject ruleBaseRecord() throws RecognitionException {
        EObject current = null;

        EObject this_AnonimousRecord_0 = null;

        EObject this_RecordName_1 = null;

        EObject this_NestedRecordExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1013:6: ( (this_AnonimousRecord_0= ruleAnonimousRecord | this_RecordName_1= ruleRecordName | this_NestedRecordExpression_2= ruleNestedRecordExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1014:1: (this_AnonimousRecord_0= ruleAnonimousRecord | this_RecordName_1= ruleRecordName | this_NestedRecordExpression_2= ruleNestedRecordExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1014:1: (this_AnonimousRecord_0= ruleAnonimousRecord | this_RecordName_1= ruleRecordName | this_NestedRecordExpression_2= ruleNestedRecordExpression )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1014:1: (this_AnonimousRecord_0= ruleAnonimousRecord | this_RecordName_1= ruleRecordName | this_NestedRecordExpression_2= ruleNestedRecordExpression )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1015:2: this_AnonimousRecord_0= ruleAnonimousRecord
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseRecordAccess().getAnonimousRecordParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnonimousRecord_in_ruleBaseRecord1706);
                    this_AnonimousRecord_0=ruleAnonimousRecord();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AnonimousRecord_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1028:2: this_RecordName_1= ruleRecordName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseRecordAccess().getRecordNameParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordName_in_ruleBaseRecord1736);
                    this_RecordName_1=ruleRecordName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_RecordName_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1041:2: this_NestedRecordExpression_2= ruleNestedRecordExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseRecordAccess().getNestedRecordExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedRecordExpression_in_ruleBaseRecord1766);
                    this_NestedRecordExpression_2=ruleNestedRecordExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NestedRecordExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBaseRecord


    // $ANTLR start entryRuleAnonimousRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1060:1: entryRuleAnonimousRecord returns [EObject current=null] : iv_ruleAnonimousRecord= ruleAnonimousRecord EOF ;
    public final EObject entryRuleAnonimousRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonimousRecord = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1061:2: (iv_ruleAnonimousRecord= ruleAnonimousRecord EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1062:2: iv_ruleAnonimousRecord= ruleAnonimousRecord EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnonimousRecordRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnonimousRecord_in_entryRuleAnonimousRecord1801);
            iv_ruleAnonimousRecord=ruleAnonimousRecord();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnonimousRecord; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonimousRecord1811); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnonimousRecord


    // $ANTLR start ruleAnonimousRecord
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1069:1: ruleAnonimousRecord returns [EObject current=null] : ( '{' () ( (lv_declarationList_2_0= ruleFieldDeclaration ) )* '}' ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )? ) ;
    public final EObject ruleAnonimousRecord() throws RecognitionException {
        EObject current = null;

        EObject lv_declarationList_2_0 = null;

        EObject lv_operationList_5_0 = null;

        EObject lv_operationList_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1074:6: ( ( '{' () ( (lv_declarationList_2_0= ruleFieldDeclaration ) )* '}' ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1075:1: ( '{' () ( (lv_declarationList_2_0= ruleFieldDeclaration ) )* '}' ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1075:1: ( '{' () ( (lv_declarationList_2_0= ruleFieldDeclaration ) )* '}' ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1075:3: '{' () ( (lv_declarationList_2_0= ruleFieldDeclaration ) )* '}' ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleAnonimousRecord1846); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnonimousRecordAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1079:1: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1080:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAnonimousRecordAccess().getAnonimousRecordAction_1().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAnonimousRecordAccess().getAnonimousRecordAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1093:2: ( (lv_declarationList_2_0= ruleFieldDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=36 && LA11_0<=37)||(LA11_0>=41 && LA11_0<=48)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1094:1: (lv_declarationList_2_0= ruleFieldDeclaration )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1094:1: (lv_declarationList_2_0= ruleFieldDeclaration )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1095:3: lv_declarationList_2_0= ruleFieldDeclaration
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnonimousRecordAccess().getDeclarationListFieldDeclarationParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_ruleAnonimousRecord1879);
            	    lv_declarationList_2_0=ruleFieldDeclaration();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnonimousRecordRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"declarationList",
            	      	        		lv_declarationList_2_0, 
            	      	        		"FieldDeclaration", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleAnonimousRecord1890); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnonimousRecordAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1121:1: ( '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1121:3: '[' ( (lv_operationList_5_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleAnonimousRecord1901); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnonimousRecordAccess().getLeftSquareBracketKeyword_4_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1125:1: ( (lv_operationList_5_0= ruleRecordOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1126:1: (lv_operationList_5_0= ruleRecordOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1126:1: (lv_operationList_5_0= ruleRecordOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1127:3: lv_operationList_5_0= ruleRecordOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnonimousRecordAccess().getOperationListRecordOperationParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleAnonimousRecord1922);
                    lv_operationList_5_0=ruleRecordOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnonimousRecordRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_5_0, 
                      	        		"RecordOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1149:2: ( ',' ( (lv_operationList_7_0= ruleRecordOperation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1149:4: ',' ( (lv_operationList_7_0= ruleRecordOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleAnonimousRecord1933); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnonimousRecordAccess().getCommaKeyword_4_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1153:1: ( (lv_operationList_7_0= ruleRecordOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1154:1: (lv_operationList_7_0= ruleRecordOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1154:1: (lv_operationList_7_0= ruleRecordOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1155:3: lv_operationList_7_0= ruleRecordOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnonimousRecordAccess().getOperationListRecordOperationParserRuleCall_4_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleAnonimousRecord1954);
                    	    lv_operationList_7_0=ruleRecordOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAnonimousRecordRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_7_0, 
                    	      	        		"RecordOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleAnonimousRecord1966); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnonimousRecordAccess().getRightSquareBracketKeyword_4_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnonimousRecord


    // $ANTLR start entryRuleRecordName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1189:1: entryRuleRecordName returns [EObject current=null] : iv_ruleRecordName= ruleRecordName EOF ;
    public final EObject entryRuleRecordName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordName = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1190:2: (iv_ruleRecordName= ruleRecordName EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1191:2: iv_ruleRecordName= ruleRecordName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRecordNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordName_in_entryRuleRecordName2004);
            iv_ruleRecordName=ruleRecordName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRecordName; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordName2014); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRecordName


    // $ANTLR start ruleRecordName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1198:1: ruleRecordName returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )? ) ;
    public final EObject ruleRecordName() throws RecognitionException {
        EObject current = null;

        EObject lv_operationList_2_0 = null;

        EObject lv_operationList_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1203:6: ( ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1204:1: ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1204:1: ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1204:2: ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )?
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1204:2: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1205:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1205:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1206:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getRecordNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRecordName2061); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getRecordNameAccess().getRecordRecordCrossReference_0_0(), "record"); 
              	
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1221:2: ( '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1221:4: '[' ( (lv_operationList_2_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleRecordName2072); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRecordNameAccess().getLeftSquareBracketKeyword_1_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1225:1: ( (lv_operationList_2_0= ruleRecordOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1226:1: (lv_operationList_2_0= ruleRecordOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1226:1: (lv_operationList_2_0= ruleRecordOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1227:3: lv_operationList_2_0= ruleRecordOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRecordNameAccess().getOperationListRecordOperationParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleRecordName2093);
                    lv_operationList_2_0=ruleRecordOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_2_0, 
                      	        		"RecordOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1249:2: ( ',' ( (lv_operationList_4_0= ruleRecordOperation ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1249:4: ',' ( (lv_operationList_4_0= ruleRecordOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleRecordName2104); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getRecordNameAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1253:1: ( (lv_operationList_4_0= ruleRecordOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1254:1: (lv_operationList_4_0= ruleRecordOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1254:1: (lv_operationList_4_0= ruleRecordOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1255:3: lv_operationList_4_0= ruleRecordOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRecordNameAccess().getOperationListRecordOperationParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleRecordName2125);
                    	    lv_operationList_4_0=ruleRecordOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRecordNameRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_4_0, 
                    	      	        		"RecordOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleRecordName2137); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRecordNameAccess().getRightSquareBracketKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRecordName


    // $ANTLR start entryRuleNestedRecordExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1289:1: entryRuleNestedRecordExpression returns [EObject current=null] : iv_ruleNestedRecordExpression= ruleNestedRecordExpression EOF ;
    public final EObject entryRuleNestedRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRecordExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1290:2: (iv_ruleNestedRecordExpression= ruleNestedRecordExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1291:2: iv_ruleNestedRecordExpression= ruleNestedRecordExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedRecordExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedRecordExpression_in_entryRuleNestedRecordExpression2175);
            iv_ruleNestedRecordExpression=ruleNestedRecordExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedRecordExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedRecordExpression2185); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedRecordExpression


    // $ANTLR start ruleNestedRecordExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1298:1: ruleNestedRecordExpression returns [EObject current=null] : ( '(' ( (lv_expression_1_0= ruleRecordExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )? ) ;
    public final EObject ruleNestedRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_operationList_4_0 = null;

        EObject lv_operationList_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1303:6: ( ( '(' ( (lv_expression_1_0= ruleRecordExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1304:1: ( '(' ( (lv_expression_1_0= ruleRecordExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1304:1: ( '(' ( (lv_expression_1_0= ruleRecordExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1304:3: '(' ( (lv_expression_1_0= ruleRecordExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )?
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleNestedRecordExpression2220); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedRecordExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1308:1: ( (lv_expression_1_0= ruleRecordExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1309:1: (lv_expression_1_0= ruleRecordExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1309:1: (lv_expression_1_0= ruleRecordExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1310:3: lv_expression_1_0= ruleRecordExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedRecordExpressionAccess().getExpressionRecordExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordExpression_in_ruleNestedRecordExpression2241);
            lv_expression_1_0=ruleRecordExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNestedRecordExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_1_0, 
              	        		"RecordExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleNestedRecordExpression2251); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedRecordExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1336:1: ( '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1336:3: '[' ( (lv_operationList_4_0= ruleRecordOperation ) ) ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleNestedRecordExpression2262); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedRecordExpressionAccess().getLeftSquareBracketKeyword_3_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1340:1: ( (lv_operationList_4_0= ruleRecordOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1341:1: (lv_operationList_4_0= ruleRecordOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1341:1: (lv_operationList_4_0= ruleRecordOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1342:3: lv_operationList_4_0= ruleRecordOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNestedRecordExpressionAccess().getOperationListRecordOperationParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleNestedRecordExpression2283);
                    lv_operationList_4_0=ruleRecordOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNestedRecordExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_4_0, 
                      	        		"RecordOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1364:2: ( ',' ( (lv_operationList_6_0= ruleRecordOperation ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1364:4: ',' ( (lv_operationList_6_0= ruleRecordOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleNestedRecordExpression2294); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getNestedRecordExpressionAccess().getCommaKeyword_3_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1368:1: ( (lv_operationList_6_0= ruleRecordOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1369:1: (lv_operationList_6_0= ruleRecordOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1369:1: (lv_operationList_6_0= ruleRecordOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1370:3: lv_operationList_6_0= ruleRecordOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getNestedRecordExpressionAccess().getOperationListRecordOperationParserRuleCall_3_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_ruleNestedRecordExpression2315);
                    	    lv_operationList_6_0=ruleRecordOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getNestedRecordExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_6_0, 
                    	      	        		"RecordOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleNestedRecordExpression2327); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedRecordExpressionAccess().getRightSquareBracketKeyword_3_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedRecordExpression


    // $ANTLR start entryRuleRecordOperation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1404:1: entryRuleRecordOperation returns [EObject current=null] : iv_ruleRecordOperation= ruleRecordOperation EOF ;
    public final EObject entryRuleRecordOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordOperation = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1405:2: (iv_ruleRecordOperation= ruleRecordOperation EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1406:2: iv_ruleRecordOperation= ruleRecordOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRecordOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordOperation_in_entryRuleRecordOperation2365);
            iv_ruleRecordOperation=ruleRecordOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRecordOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordOperation2375); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRecordOperation


    // $ANTLR start ruleRecordOperation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1413:1: ruleRecordOperation returns [EObject current=null] : ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) ) ;
    public final EObject ruleRecordOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_newField_6_0 = null;

        EObject lv_newField_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1418:6: ( ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==32) ) {
                    alt18=3;
                }
                else if ( (LA18_2==31) ) {
                    alt18=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1419:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) )", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1419:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:2: ( () 'exclude' ( ( RULE_ID ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:2: ( () 'exclude' ( ( RULE_ID ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:3: () 'exclude' ( ( RULE_ID ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1419:3: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1420:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRecordOperationAccess().getRecordExcludeAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRecordOperationAccess().getRecordExcludeAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleRecordOperation2423); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRecordOperationAccess().getExcludeKeyword_0_1(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1437:1: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1438:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1438:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1439:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRecordOperation2445); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRecordOperationAccess().getFieldFieldNameCrossReference_0_2_0(), "field"); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1455:6: ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1455:6: ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1455:7: () ( ( RULE_ID ) ) 'renameTo' ( (lv_newField_6_0= ruleFieldName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1455:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1456:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRecordOperationAccess().getRecordRenameAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRecordOperationAccess().getRecordRenameAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1469:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1470:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1470:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1471:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRecordOperation2487); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRecordOperationAccess().getOriginalFieldFieldNameCrossReference_1_1_0(), "originalField"); 
                      	
                    }

                    }


                    }

                    match(input,31,FollowSets000.FOLLOW_31_in_ruleRecordOperation2497); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRecordOperationAccess().getRenameToKeyword_1_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1490:1: ( (lv_newField_6_0= ruleFieldName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1491:1: (lv_newField_6_0= ruleFieldName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1491:1: (lv_newField_6_0= ruleFieldName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1492:3: lv_newField_6_0= ruleFieldName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRecordOperationAccess().getNewFieldFieldNameParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleRecordOperation2518);
                    lv_newField_6_0=ruleFieldName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newField",
                      	        		lv_newField_6_0, 
                      	        		"FieldName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1515:6: ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1515:6: ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1515:7: () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_10_0= ruleFieldName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1515:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1516:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRecordOperationAccess().getRecordRenameAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRecordOperationAccess().getRecordRenameAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1529:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1530:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1530:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1531:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRecordOperation2560); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRecordOperationAccess().getOriginalFieldFieldNameCrossReference_2_1_0(), "originalField"); 
                      	
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleRecordOperation2570); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRecordOperationAccess().getRenameFKeyword_2_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1550:1: ( (lv_newField_10_0= ruleFieldName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1551:1: (lv_newField_10_0= ruleFieldName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1551:1: (lv_newField_10_0= ruleFieldName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1552:3: lv_newField_10_0= ruleFieldName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRecordOperationAccess().getNewFieldFieldNameParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleRecordOperation2591);
                    lv_newField_10_0=ruleFieldName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRecordOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newField",
                      	        		lv_newField_10_0, 
                      	        		"FieldName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRecordOperation


    // $ANTLR start entryRuleTraitExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1582:1: entryRuleTraitExpression returns [EObject current=null] : iv_ruleTraitExpression= ruleTraitExpression EOF ;
    public final EObject entryRuleTraitExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1583:2: (iv_ruleTraitExpression= ruleTraitExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1584:2: iv_ruleTraitExpression= ruleTraitExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTraitExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitExpression_in_entryRuleTraitExpression2628);
            iv_ruleTraitExpression=ruleTraitExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTraitExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraitExpression2638); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTraitExpression


    // $ANTLR start ruleTraitExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1591:1: ruleTraitExpression returns [EObject current=null] : ( ( (lv_traitList_0_0= ruleBaseTrait ) ) ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )* ) ;
    public final EObject ruleTraitExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_traitList_0_0 = null;

        EObject lv_traitList_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1596:6: ( ( ( (lv_traitList_0_0= ruleBaseTrait ) ) ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1597:1: ( ( (lv_traitList_0_0= ruleBaseTrait ) ) ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1597:1: ( ( (lv_traitList_0_0= ruleBaseTrait ) ) ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1597:2: ( (lv_traitList_0_0= ruleBaseTrait ) ) ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1597:2: ( (lv_traitList_0_0= ruleBaseTrait ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1598:1: (lv_traitList_0_0= ruleBaseTrait )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1598:1: (lv_traitList_0_0= ruleBaseTrait )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1599:3: lv_traitList_0_0= ruleBaseTrait
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTraitExpressionAccess().getTraitListBaseTraitParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBaseTrait_in_ruleTraitExpression2684);
            lv_traitList_0_0=ruleBaseTrait();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTraitExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"traitList",
              	        		lv_traitList_0_0, 
              	        		"BaseTrait", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1621:2: ( '+' ( (lv_traitList_2_0= ruleBaseTrait ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1621:4: '+' ( (lv_traitList_2_0= ruleBaseTrait ) )
            	    {
            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleTraitExpression2695); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTraitExpressionAccess().getPlusSignKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1625:1: ( (lv_traitList_2_0= ruleBaseTrait ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1626:1: (lv_traitList_2_0= ruleBaseTrait )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1626:1: (lv_traitList_2_0= ruleBaseTrait )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1627:3: lv_traitList_2_0= ruleBaseTrait
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTraitExpressionAccess().getTraitListBaseTraitParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBaseTrait_in_ruleTraitExpression2716);
            	    lv_traitList_2_0=ruleBaseTrait();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTraitExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"traitList",
            	      	        		lv_traitList_2_0, 
            	      	        		"BaseTrait", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTraitExpression


    // $ANTLR start entryRuleBaseTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1657:1: entryRuleBaseTrait returns [EObject current=null] : iv_ruleBaseTrait= ruleBaseTrait EOF ;
    public final EObject entryRuleBaseTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseTrait = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1658:2: (iv_ruleBaseTrait= ruleBaseTrait EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1659:2: iv_ruleBaseTrait= ruleBaseTrait EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBaseTraitRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBaseTrait_in_entryRuleBaseTrait2754);
            iv_ruleBaseTrait=ruleBaseTrait();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBaseTrait; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBaseTrait2764); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBaseTrait


    // $ANTLR start ruleBaseTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1666:1: ruleBaseTrait returns [EObject current=null] : (this_AnonimousTrait_0= ruleAnonimousTrait | this_TraitName_1= ruleTraitName | this_NestedTraitExpression_2= ruleNestedTraitExpression ) ;
    public final EObject ruleBaseTrait() throws RecognitionException {
        EObject current = null;

        EObject this_AnonimousTrait_0 = null;

        EObject this_TraitName_1 = null;

        EObject this_NestedTraitExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1671:6: ( (this_AnonimousTrait_0= ruleAnonimousTrait | this_TraitName_1= ruleTraitName | this_NestedTraitExpression_2= ruleNestedTraitExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1672:1: (this_AnonimousTrait_0= ruleAnonimousTrait | this_TraitName_1= ruleTraitName | this_NestedTraitExpression_2= ruleNestedTraitExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1672:1: (this_AnonimousTrait_0= ruleAnonimousTrait | this_TraitName_1= ruleTraitName | this_NestedTraitExpression_2= ruleNestedTraitExpression )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1672:1: (this_AnonimousTrait_0= ruleAnonimousTrait | this_TraitName_1= ruleTraitName | this_NestedTraitExpression_2= ruleNestedTraitExpression )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1673:2: this_AnonimousTrait_0= ruleAnonimousTrait
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseTraitAccess().getAnonimousTraitParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnonimousTrait_in_ruleBaseTrait2814);
                    this_AnonimousTrait_0=ruleAnonimousTrait();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AnonimousTrait_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1686:2: this_TraitName_1= ruleTraitName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseTraitAccess().getTraitNameParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraitName_in_ruleBaseTrait2844);
                    this_TraitName_1=ruleTraitName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TraitName_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1699:2: this_NestedTraitExpression_2= ruleNestedTraitExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBaseTraitAccess().getNestedTraitExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedTraitExpression_in_ruleBaseTrait2874);
                    this_NestedTraitExpression_2=ruleNestedTraitExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NestedTraitExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBaseTrait


    // $ANTLR start entryRuleAnonimousTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1718:1: entryRuleAnonimousTrait returns [EObject current=null] : iv_ruleAnonimousTrait= ruleAnonimousTrait EOF ;
    public final EObject entryRuleAnonimousTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonimousTrait = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1719:2: (iv_ruleAnonimousTrait= ruleAnonimousTrait EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1720:2: iv_ruleAnonimousTrait= ruleAnonimousTrait EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnonimousTraitRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnonimousTrait_in_entryRuleAnonimousTrait2909);
            iv_ruleAnonimousTrait=ruleAnonimousTrait();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnonimousTrait; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonimousTrait2919); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnonimousTrait


    // $ANTLR start ruleAnonimousTrait
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1727:1: ruleAnonimousTrait returns [EObject current=null] : ( '{' () ( (lv_definitionList_2_0= ruleTraitElement ) )* '}' ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )? ) ;
    public final EObject ruleAnonimousTrait() throws RecognitionException {
        EObject current = null;

        EObject lv_definitionList_2_0 = null;

        EObject lv_operationList_5_0 = null;

        EObject lv_operationList_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1732:6: ( ( '{' () ( (lv_definitionList_2_0= ruleTraitElement ) )* '}' ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1733:1: ( '{' () ( (lv_definitionList_2_0= ruleTraitElement ) )* '}' ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1733:1: ( '{' () ( (lv_definitionList_2_0= ruleTraitElement ) )* '}' ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1733:3: '{' () ( (lv_definitionList_2_0= ruleTraitElement ) )* '}' ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleAnonimousTrait2954); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnonimousTraitAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1737:1: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1738:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAnonimousTraitAccess().getAnonimousTraitAction_1().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAnonimousTraitAccess().getAnonimousTraitAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1751:2: ( (lv_definitionList_2_0= ruleTraitElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==39||(LA21_0>=41 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1752:1: (lv_definitionList_2_0= ruleTraitElement )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1752:1: (lv_definitionList_2_0= ruleTraitElement )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1753:3: lv_definitionList_2_0= ruleTraitElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnonimousTraitAccess().getDefinitionListTraitElementParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTraitElement_in_ruleAnonimousTrait2987);
            	    lv_definitionList_2_0=ruleTraitElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnonimousTraitRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"definitionList",
            	      	        		lv_definitionList_2_0, 
            	      	        		"TraitElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleAnonimousTrait2998); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnonimousTraitAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1779:1: ( '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1779:3: '[' ( (lv_operationList_5_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleAnonimousTrait3009); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnonimousTraitAccess().getLeftSquareBracketKeyword_4_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1783:1: ( (lv_operationList_5_0= ruleTraitOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1784:1: (lv_operationList_5_0= ruleTraitOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1784:1: (lv_operationList_5_0= ruleTraitOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1785:3: lv_operationList_5_0= ruleTraitOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnonimousTraitAccess().getOperationListTraitOperationParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleAnonimousTrait3030);
                    lv_operationList_5_0=ruleTraitOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnonimousTraitRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_5_0, 
                      	        		"TraitOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1807:2: ( ',' ( (lv_operationList_7_0= ruleTraitOperation ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1807:4: ',' ( (lv_operationList_7_0= ruleTraitOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleAnonimousTrait3041); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnonimousTraitAccess().getCommaKeyword_4_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1811:1: ( (lv_operationList_7_0= ruleTraitOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1812:1: (lv_operationList_7_0= ruleTraitOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1812:1: (lv_operationList_7_0= ruleTraitOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1813:3: lv_operationList_7_0= ruleTraitOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnonimousTraitAccess().getOperationListTraitOperationParserRuleCall_4_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleAnonimousTrait3062);
                    	    lv_operationList_7_0=ruleTraitOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAnonimousTraitRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_7_0, 
                    	      	        		"TraitOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleAnonimousTrait3074); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnonimousTraitAccess().getRightSquareBracketKeyword_4_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnonimousTrait


    // $ANTLR start entryRuleTraitName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1847:1: entryRuleTraitName returns [EObject current=null] : iv_ruleTraitName= ruleTraitName EOF ;
    public final EObject entryRuleTraitName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitName = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1848:2: (iv_ruleTraitName= ruleTraitName EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1849:2: iv_ruleTraitName= ruleTraitName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTraitNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitName_in_entryRuleTraitName3112);
            iv_ruleTraitName=ruleTraitName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTraitName; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraitName3122); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTraitName


    // $ANTLR start ruleTraitName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1856:1: ruleTraitName returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )? ) ;
    public final EObject ruleTraitName() throws RecognitionException {
        EObject current = null;

        EObject lv_operationList_2_0 = null;

        EObject lv_operationList_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1861:6: ( ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1862:1: ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1862:1: ( ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1862:2: ( ( RULE_ID ) ) ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )?
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1862:2: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1863:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1863:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1864:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTraitNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitName3169); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTraitNameAccess().getTraitTraitCrossReference_0_0(), "trait"); 
              	
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1879:2: ( '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1879:4: '[' ( (lv_operationList_2_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleTraitName3180); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitNameAccess().getLeftSquareBracketKeyword_1_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1883:1: ( (lv_operationList_2_0= ruleTraitOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1884:1: (lv_operationList_2_0= ruleTraitOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1884:1: (lv_operationList_2_0= ruleTraitOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1885:3: lv_operationList_2_0= ruleTraitOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitNameAccess().getOperationListTraitOperationParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleTraitName3201);
                    lv_operationList_2_0=ruleTraitOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_2_0, 
                      	        		"TraitOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1907:2: ( ',' ( (lv_operationList_4_0= ruleTraitOperation ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1907:4: ',' ( (lv_operationList_4_0= ruleTraitOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleTraitName3212); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTraitNameAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1911:1: ( (lv_operationList_4_0= ruleTraitOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1912:1: (lv_operationList_4_0= ruleTraitOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1912:1: (lv_operationList_4_0= ruleTraitOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1913:3: lv_operationList_4_0= ruleTraitOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTraitNameAccess().getOperationListTraitOperationParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleTraitName3233);
                    	    lv_operationList_4_0=ruleTraitOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTraitNameRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_4_0, 
                    	      	        		"TraitOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleTraitName3245); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitNameAccess().getRightSquareBracketKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTraitName


    // $ANTLR start entryRuleNestedTraitExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1947:1: entryRuleNestedTraitExpression returns [EObject current=null] : iv_ruleNestedTraitExpression= ruleNestedTraitExpression EOF ;
    public final EObject entryRuleNestedTraitExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTraitExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1948:2: (iv_ruleNestedTraitExpression= ruleNestedTraitExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1949:2: iv_ruleNestedTraitExpression= ruleNestedTraitExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedTraitExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedTraitExpression_in_entryRuleNestedTraitExpression3283);
            iv_ruleNestedTraitExpression=ruleNestedTraitExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedTraitExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedTraitExpression3293); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedTraitExpression


    // $ANTLR start ruleNestedTraitExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1956:1: ruleNestedTraitExpression returns [EObject current=null] : ( '(' ( (lv_expression_1_0= ruleTraitExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )? ) ;
    public final EObject ruleNestedTraitExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_operationList_4_0 = null;

        EObject lv_operationList_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1961:6: ( ( '(' ( (lv_expression_1_0= ruleTraitExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1962:1: ( '(' ( (lv_expression_1_0= ruleTraitExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1962:1: ( '(' ( (lv_expression_1_0= ruleTraitExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1962:3: '(' ( (lv_expression_1_0= ruleTraitExpression ) ) ')' ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )?
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleNestedTraitExpression3328); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedTraitExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1966:1: ( (lv_expression_1_0= ruleTraitExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1967:1: (lv_expression_1_0= ruleTraitExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1967:1: (lv_expression_1_0= ruleTraitExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1968:3: lv_expression_1_0= ruleTraitExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedTraitExpressionAccess().getExpressionTraitExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitExpression_in_ruleNestedTraitExpression3349);
            lv_expression_1_0=ruleTraitExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNestedTraitExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_1_0, 
              	        		"TraitExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleNestedTraitExpression3359); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedTraitExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1994:1: ( '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1994:3: '[' ( (lv_operationList_4_0= ruleTraitOperation ) ) ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )* ']'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleNestedTraitExpression3370); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedTraitExpressionAccess().getLeftSquareBracketKeyword_3_0(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1998:1: ( (lv_operationList_4_0= ruleTraitOperation ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1999:1: (lv_operationList_4_0= ruleTraitOperation )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:1999:1: (lv_operationList_4_0= ruleTraitOperation )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2000:3: lv_operationList_4_0= ruleTraitOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNestedTraitExpressionAccess().getOperationListTraitOperationParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleNestedTraitExpression3391);
                    lv_operationList_4_0=ruleTraitOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNestedTraitExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"operationList",
                      	        		lv_operationList_4_0, 
                      	        		"TraitOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2022:2: ( ',' ( (lv_operationList_6_0= ruleTraitOperation ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2022:4: ',' ( (lv_operationList_6_0= ruleTraitOperation ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleNestedTraitExpression3402); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getNestedTraitExpressionAccess().getCommaKeyword_3_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2026:1: ( (lv_operationList_6_0= ruleTraitOperation ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2027:1: (lv_operationList_6_0= ruleTraitOperation )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2027:1: (lv_operationList_6_0= ruleTraitOperation )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2028:3: lv_operationList_6_0= ruleTraitOperation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getNestedTraitExpressionAccess().getOperationListTraitOperationParserRuleCall_3_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_ruleNestedTraitExpression3423);
                    	    lv_operationList_6_0=ruleTraitOperation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getNestedTraitExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"operationList",
                    	      	        		lv_operationList_6_0, 
                    	      	        		"TraitOperation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleNestedTraitExpression3435); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedTraitExpressionAccess().getRightSquareBracketKeyword_3_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedTraitExpression


    // $ANTLR start entryRuleTraitOperation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2062:1: entryRuleTraitOperation returns [EObject current=null] : iv_ruleTraitOperation= ruleTraitOperation EOF ;
    public final EObject entryRuleTraitOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitOperation = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2063:2: (iv_ruleTraitOperation= ruleTraitOperation EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2064:2: iv_ruleTraitOperation= ruleTraitOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTraitOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitOperation_in_entryRuleTraitOperation3473);
            iv_ruleTraitOperation=ruleTraitOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTraitOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraitOperation3483); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTraitOperation


    // $ANTLR start ruleTraitOperation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2071:1: ruleTraitOperation returns [EObject current=null] : ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) ) ;
    public final EObject ruleTraitOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_newMethod_6_0 = null;

        EObject lv_newMethod_10_0 = null;

        EObject lv_newMethod_14_0 = null;

        EObject lv_newField_18_0 = null;

        EObject lv_newField_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2076:6: ( ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) )
            int alt28=6;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt28=2;
                    }
                    break;
                case 32:
                    {
                    alt28=6;
                    }
                    break;
                case 34:
                    {
                    alt28=4;
                    }
                    break;
                case 35:
                    {
                    alt28=5;
                    }
                    break;
                case 31:
                    {
                    alt28=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2077:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) )", 28, 2, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2077:1: ( ( () 'exclude' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) ) | ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) ) | ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:2: ( () 'exclude' ( ( RULE_ID ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:2: ( () 'exclude' ( ( RULE_ID ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:3: () 'exclude' ( ( RULE_ID ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2077:3: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2078:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitExcludeAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitExcludeAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleTraitOperation3531); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getExcludeKeyword_0_1(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2095:1: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2096:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2096:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2097:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3553); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getMethodMethodNameCrossReference_0_2_0(), "method"); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2113:6: ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2113:6: ( () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2113:7: () ( ( RULE_ID ) ) 'aliasAs' ( (lv_newMethod_6_0= ruleMethodName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2113:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2114:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitAliasAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitAliasAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2127:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2128:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2128:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2129:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3595); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getOriginalMethodMethodNameCrossReference_1_1_0(), "originalMethod"); 
                      	
                    }

                    }


                    }

                    match(input,33,FollowSets000.FOLLOW_33_in_ruleTraitOperation3605); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getAliasAsKeyword_1_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2148:1: ( (lv_newMethod_6_0= ruleMethodName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2149:1: (lv_newMethod_6_0= ruleMethodName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2149:1: (lv_newMethod_6_0= ruleMethodName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2150:3: lv_newMethod_6_0= ruleMethodName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitOperationAccess().getNewMethodMethodNameParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_ruleTraitOperation3626);
                    lv_newMethod_6_0=ruleMethodName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newMethod",
                      	        		lv_newMethod_6_0, 
                      	        		"MethodName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2173:6: ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2173:6: ( () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2173:7: () ( ( RULE_ID ) ) 'renameTo' ( (lv_newMethod_10_0= ruleMethodName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2173:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2174:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitMethodRenameAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitMethodRenameAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2187:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2188:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2188:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2189:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3668); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getOriginalMethodMethodNameCrossReference_2_1_0(), "originalMethod"); 
                      	
                    }

                    }


                    }

                    match(input,31,FollowSets000.FOLLOW_31_in_ruleTraitOperation3678); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getRenameToKeyword_2_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2208:1: ( (lv_newMethod_10_0= ruleMethodName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2209:1: (lv_newMethod_10_0= ruleMethodName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2209:1: (lv_newMethod_10_0= ruleMethodName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2210:3: lv_newMethod_10_0= ruleMethodName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitOperationAccess().getNewMethodMethodNameParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_ruleTraitOperation3699);
                    lv_newMethod_10_0=ruleMethodName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newMethod",
                      	        		lv_newMethod_10_0, 
                      	        		"MethodName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2233:6: ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2233:6: ( () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2233:7: () ( ( RULE_ID ) ) 'renameM' ( (lv_newMethod_14_0= ruleMethodName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2233:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2234:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitMethodRenameAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitMethodRenameAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2247:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2248:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2248:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2249:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3741); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getOriginalMethodMethodNameCrossReference_3_1_0(), "originalMethod"); 
                      	
                    }

                    }


                    }

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleTraitOperation3751); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getRenameMKeyword_3_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2268:1: ( (lv_newMethod_14_0= ruleMethodName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2269:1: (lv_newMethod_14_0= ruleMethodName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2269:1: (lv_newMethod_14_0= ruleMethodName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2270:3: lv_newMethod_14_0= ruleMethodName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitOperationAccess().getNewMethodMethodNameParserRuleCall_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_ruleTraitOperation3772);
                    lv_newMethod_14_0=ruleMethodName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newMethod",
                      	        		lv_newMethod_14_0, 
                      	        		"MethodName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2293:6: ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2293:6: ( () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2293:7: () ( ( RULE_ID ) ) 'renameFieldTo' ( (lv_newField_18_0= ruleFieldName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2293:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2294:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitFieldRenameAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitFieldRenameAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2307:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2308:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2308:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2309:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3814); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getOriginalFieldFieldNameCrossReference_4_1_0(), "originalField"); 
                      	
                    }

                    }


                    }

                    match(input,35,FollowSets000.FOLLOW_35_in_ruleTraitOperation3824); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getRenameFieldToKeyword_4_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2328:1: ( (lv_newField_18_0= ruleFieldName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2329:1: (lv_newField_18_0= ruleFieldName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2329:1: (lv_newField_18_0= ruleFieldName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2330:3: lv_newField_18_0= ruleFieldName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitOperationAccess().getNewFieldFieldNameParserRuleCall_4_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleTraitOperation3845);
                    lv_newField_18_0=ruleFieldName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newField",
                      	        		lv_newField_18_0, 
                      	        		"FieldName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2353:6: ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2353:6: ( () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2353:7: () ( ( RULE_ID ) ) 'renameF' ( (lv_newField_22_0= ruleFieldName ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2353:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2354:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTraitOperationAccess().getTraitFieldRenameAction_5_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTraitOperationAccess().getTraitFieldRenameAction_5_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2367:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2368:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2368:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2369:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTraitOperation3887); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTraitOperationAccess().getOriginalFieldFieldNameCrossReference_5_1_0(), "originalField"); 
                      	
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleTraitOperation3897); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTraitOperationAccess().getRenameFKeyword_5_2(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2388:1: ( (lv_newField_22_0= ruleFieldName ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2389:1: (lv_newField_22_0= ruleFieldName )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2389:1: (lv_newField_22_0= ruleFieldName )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2390:3: lv_newField_22_0= ruleFieldName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTraitOperationAccess().getNewFieldFieldNameParserRuleCall_5_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleTraitOperation3918);
                    lv_newField_22_0=ruleFieldName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTraitOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newField",
                      	        		lv_newField_22_0, 
                      	        		"FieldName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTraitOperation


    // $ANTLR start entryRuleTraitElement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2420:1: entryRuleTraitElement returns [EObject current=null] : iv_ruleTraitElement= ruleTraitElement EOF ;
    public final EObject entryRuleTraitElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraitElement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2421:2: (iv_ruleTraitElement= ruleTraitElement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2422:2: iv_ruleTraitElement= ruleTraitElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTraitElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTraitElement_in_entryRuleTraitElement3955);
            iv_ruleTraitElement=ruleTraitElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTraitElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTraitElement3965); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTraitElement


    // $ANTLR start ruleTraitElement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2429:1: ruleTraitElement returns [EObject current=null] : (this_RequiredField_0= ruleRequiredField | this_RequiredMethod_1= ruleRequiredMethod | this_ProvidedMethod_2= ruleProvidedMethod ) ;
    public final EObject ruleTraitElement() throws RecognitionException {
        EObject current = null;

        EObject this_RequiredField_0 = null;

        EObject this_RequiredMethod_1 = null;

        EObject this_ProvidedMethod_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2434:6: ( (this_RequiredField_0= ruleRequiredField | this_RequiredMethod_1= ruleRequiredMethod | this_ProvidedMethod_2= ruleProvidedMethod ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2435:1: (this_RequiredField_0= ruleRequiredField | this_RequiredMethod_1= ruleRequiredMethod | this_ProvidedMethod_2= ruleProvidedMethod )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2435:1: (this_RequiredField_0= ruleRequiredField | this_RequiredMethod_1= ruleRequiredMethod | this_ProvidedMethod_2= ruleProvidedMethod )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2436:2: this_RequiredField_0= ruleRequiredField
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTraitElementAccess().getRequiredFieldParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredField_in_ruleTraitElement4015);
                    this_RequiredField_0=ruleRequiredField();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_RequiredField_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2449:2: this_RequiredMethod_1= ruleRequiredMethod
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTraitElementAccess().getRequiredMethodParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredMethod_in_ruleTraitElement4045);
                    this_RequiredMethod_1=ruleRequiredMethod();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_RequiredMethod_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2462:2: this_ProvidedMethod_2= ruleProvidedMethod
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTraitElementAccess().getProvidedMethodParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleProvidedMethod_in_ruleTraitElement4075);
                    this_ProvidedMethod_2=ruleProvidedMethod();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ProvidedMethod_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTraitElement


    // $ANTLR start entryRuleFieldDeclaration
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2481:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2482:2: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2483:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFieldDeclarationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration4110);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFieldDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDeclaration4120); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFieldDeclaration


    // $ANTLR start ruleFieldDeclaration
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2490:1: ruleFieldDeclaration returns [EObject current=null] : ( () ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )? ( (lv_type_3_0= ruleType ) ) ( (lv_fieldRef_4_0= ruleFieldName ) ) ';' ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_1_0=null;
        Token lv_modifier_2_0=null;
        EObject lv_type_3_0 = null;

        EObject lv_fieldRef_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2495:6: ( ( () ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )? ( (lv_type_3_0= ruleType ) ) ( (lv_fieldRef_4_0= ruleFieldName ) ) ';' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2496:1: ( () ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )? ( (lv_type_3_0= ruleType ) ) ( (lv_fieldRef_4_0= ruleFieldName ) ) ';' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2496:1: ( () ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )? ( (lv_type_3_0= ruleType ) ) ( (lv_fieldRef_4_0= ruleFieldName ) ) ';' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2496:2: () ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )? ( (lv_type_3_0= ruleType ) ) ( (lv_fieldRef_4_0= ruleFieldName ) ) ';'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2496:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2497:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2510:2: ( ( (lv_modifier_1_0= 'transient' ) ) | ( (lv_modifier_2_0= 'volatile' ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            else if ( (LA30_0==37) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2510:3: ( (lv_modifier_1_0= 'transient' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2510:3: ( (lv_modifier_1_0= 'transient' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2511:1: (lv_modifier_1_0= 'transient' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2511:1: (lv_modifier_1_0= 'transient' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2512:3: lv_modifier_1_0= 'transient'
                    {
                    lv_modifier_1_0=(Token)input.LT(1);
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleFieldDeclaration4176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFieldDeclarationAccess().getModifierTransientKeyword_1_0_0(), "modifier"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFieldDeclarationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "modifier", lv_modifier_1_0, "transient", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2532:6: ( (lv_modifier_2_0= 'volatile' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2532:6: ( (lv_modifier_2_0= 'volatile' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2533:1: (lv_modifier_2_0= 'volatile' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2533:1: (lv_modifier_2_0= 'volatile' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2534:3: lv_modifier_2_0= 'volatile'
                    {
                    lv_modifier_2_0=(Token)input.LT(1);
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleFieldDeclaration4213); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFieldDeclarationAccess().getModifierVolatileKeyword_1_1_0(), "modifier"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFieldDeclarationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "modifier", lv_modifier_2_0, "volatile", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2553:4: ( (lv_type_3_0= ruleType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2554:1: (lv_type_3_0= ruleType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2554:1: (lv_type_3_0= ruleType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2555:3: lv_type_3_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFieldDeclarationAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFieldDeclaration4249);
            lv_type_3_0=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFieldDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_3_0, 
              	        		"Type", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2577:2: ( (lv_fieldRef_4_0= ruleFieldName ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2578:1: (lv_fieldRef_4_0= ruleFieldName )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2578:1: (lv_fieldRef_4_0= ruleFieldName )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2579:3: lv_fieldRef_4_0= ruleFieldName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFieldDeclarationAccess().getFieldRefFieldNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleFieldDeclaration4270);
            lv_fieldRef_4_0=ruleFieldName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFieldDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fieldRef",
              	        		lv_fieldRef_4_0, 
              	        		"FieldName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FollowSets000.FOLLOW_38_in_ruleFieldDeclaration4280); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFieldDeclarationAccess().getSemicolonKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFieldDeclaration


    // $ANTLR start entryRuleRequiredField
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2613:1: entryRuleRequiredField returns [EObject current=null] : iv_ruleRequiredField= ruleRequiredField EOF ;
    public final EObject entryRuleRequiredField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredField = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2614:2: (iv_ruleRequiredField= ruleRequiredField EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2615:2: iv_ruleRequiredField= ruleRequiredField EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRequiredFieldRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRequiredField_in_entryRuleRequiredField4316);
            iv_ruleRequiredField=ruleRequiredField();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRequiredField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredField4326); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRequiredField


    // $ANTLR start ruleRequiredField
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2622:1: ruleRequiredField returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_fieldRef_2_0= ruleFieldName ) ) ';' ) ;
    public final EObject ruleRequiredField() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_fieldRef_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2627:6: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_fieldRef_2_0= ruleFieldName ) ) ';' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2628:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_fieldRef_2_0= ruleFieldName ) ) ';' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2628:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_fieldRef_2_0= ruleFieldName ) ) ';' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2628:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_fieldRef_2_0= ruleFieldName ) ) ';'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2628:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2629:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getRequiredFieldAccess().getRequiredFieldAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getRequiredFieldAccess().getRequiredFieldAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2642:2: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2643:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2643:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2644:3: lv_type_1_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRequiredFieldAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleRequiredField4384);
            lv_type_1_0=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRequiredFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"Type", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2666:2: ( (lv_fieldRef_2_0= ruleFieldName ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2667:1: (lv_fieldRef_2_0= ruleFieldName )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2667:1: (lv_fieldRef_2_0= ruleFieldName )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2668:3: lv_fieldRef_2_0= ruleFieldName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRequiredFieldAccess().getFieldRefFieldNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_ruleRequiredField4405);
            lv_fieldRef_2_0=ruleFieldName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRequiredFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fieldRef",
              	        		lv_fieldRef_2_0, 
              	        		"FieldName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FollowSets000.FOLLOW_38_in_ruleRequiredField4415); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRequiredFieldAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRequiredField


    // $ANTLR start entryRuleRequiredMethod
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2702:1: entryRuleRequiredMethod returns [EObject current=null] : iv_ruleRequiredMethod= ruleRequiredMethod EOF ;
    public final EObject entryRuleRequiredMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredMethod = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2703:2: (iv_ruleRequiredMethod= ruleRequiredMethod EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2704:2: iv_ruleRequiredMethod= ruleRequiredMethod EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRequiredMethodRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRequiredMethod_in_entryRuleRequiredMethod4451);
            iv_ruleRequiredMethod=ruleRequiredMethod();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRequiredMethod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredMethod4461); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRequiredMethod


    // $ANTLR start ruleRequiredMethod
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2711:1: ruleRequiredMethod returns [EObject current=null] : ( () ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodRef_2_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )? ')' ';' ) ;
    public final EObject ruleRequiredMethod() throws RecognitionException {
        EObject current = null;

        EObject lv_returnType_1_0 = null;

        EObject lv_methodRef_2_0 = null;

        EObject lv_parameterList_4_0 = null;

        EObject lv_parameterList_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2716:6: ( ( () ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodRef_2_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )? ')' ';' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2717:1: ( () ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodRef_2_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )? ')' ';' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2717:1: ( () ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodRef_2_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )? ')' ';' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2717:2: () ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodRef_2_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )? ')' ';'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2717:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2718:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getRequiredMethodAccess().getRequiredMethodAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getRequiredMethodAccess().getRequiredMethodAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2731:2: ( (lv_returnType_1_0= ruleReturnType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2732:1: (lv_returnType_1_0= ruleReturnType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2732:1: (lv_returnType_1_0= ruleReturnType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2733:3: lv_returnType_1_0= ruleReturnType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRequiredMethodAccess().getReturnTypeReturnTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleReturnType_in_ruleRequiredMethod4519);
            lv_returnType_1_0=ruleReturnType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRequiredMethodRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"returnType",
              	        		lv_returnType_1_0, 
              	        		"ReturnType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2755:2: ( (lv_methodRef_2_0= ruleMethodName ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2756:1: (lv_methodRef_2_0= ruleMethodName )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2756:1: (lv_methodRef_2_0= ruleMethodName )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2757:3: lv_methodRef_2_0= ruleMethodName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRequiredMethodAccess().getMethodRefMethodNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_ruleRequiredMethod4540);
            lv_methodRef_2_0=ruleMethodName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRequiredMethodRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"methodRef",
              	        		lv_methodRef_2_0, 
              	        		"MethodName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleRequiredMethod4550); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRequiredMethodAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2783:1: ( ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||(LA32_0>=41 && LA32_0<=48)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2783:2: ( (lv_parameterList_4_0= ruleParameter ) ) ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2783:2: ( (lv_parameterList_4_0= ruleParameter ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2784:1: (lv_parameterList_4_0= ruleParameter )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2784:1: (lv_parameterList_4_0= ruleParameter )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2785:3: lv_parameterList_4_0= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRequiredMethodAccess().getParameterListParameterParserRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRequiredMethod4572);
                    lv_parameterList_4_0=ruleParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRequiredMethodRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameterList",
                      	        		lv_parameterList_4_0, 
                      	        		"Parameter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2807:2: ( ',' ( (lv_parameterList_6_0= ruleParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2807:4: ',' ( (lv_parameterList_6_0= ruleParameter ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleRequiredMethod4583); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getRequiredMethodAccess().getCommaKeyword_4_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2811:1: ( (lv_parameterList_6_0= ruleParameter ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2812:1: (lv_parameterList_6_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2812:1: (lv_parameterList_6_0= ruleParameter )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2813:3: lv_parameterList_6_0= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRequiredMethodAccess().getParameterListParameterParserRuleCall_4_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRequiredMethod4604);
                    	    lv_parameterList_6_0=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRequiredMethodRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameterList",
                    	      	        		lv_parameterList_6_0, 
                    	      	        		"Parameter", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleRequiredMethod4618); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRequiredMethodAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,38,FollowSets000.FOLLOW_38_in_ruleRequiredMethod4628); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRequiredMethodAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRequiredMethod


    // $ANTLR start entryRuleProvidedMethod
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2851:1: entryRuleProvidedMethod returns [EObject current=null] : iv_ruleProvidedMethod= ruleProvidedMethod EOF ;
    public final EObject entryRuleProvidedMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedMethod = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2852:2: (iv_ruleProvidedMethod= ruleProvidedMethod EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2853:2: iv_ruleProvidedMethod= ruleProvidedMethod EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProvidedMethodRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProvidedMethod_in_entryRuleProvidedMethod4664);
            iv_ruleProvidedMethod=ruleProvidedMethod();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProvidedMethod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProvidedMethod4674); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProvidedMethod


    // $ANTLR start ruleProvidedMethod
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2860:1: ruleProvidedMethod returns [EObject current=null] : ( () ( (lv_isSynchronized_1_0= 'synchronized' ) )? ( (lv_returnType_2_0= ruleReturnType ) ) ( (lv_methodRef_3_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_10_0= ruleBlock ) ) ( (lv_returnStatement_11_0= ruleReturnStatement ) )? '}' ) ;
    public final EObject ruleProvidedMethod() throws RecognitionException {
        EObject current = null;

        Token lv_isSynchronized_1_0=null;
        EObject lv_returnType_2_0 = null;

        EObject lv_methodRef_3_0 = null;

        EObject lv_parameterList_5_0 = null;

        EObject lv_parameterList_7_0 = null;

        EObject lv_block_10_0 = null;

        EObject lv_returnStatement_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2865:6: ( ( () ( (lv_isSynchronized_1_0= 'synchronized' ) )? ( (lv_returnType_2_0= ruleReturnType ) ) ( (lv_methodRef_3_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_10_0= ruleBlock ) ) ( (lv_returnStatement_11_0= ruleReturnStatement ) )? '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2866:1: ( () ( (lv_isSynchronized_1_0= 'synchronized' ) )? ( (lv_returnType_2_0= ruleReturnType ) ) ( (lv_methodRef_3_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_10_0= ruleBlock ) ) ( (lv_returnStatement_11_0= ruleReturnStatement ) )? '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2866:1: ( () ( (lv_isSynchronized_1_0= 'synchronized' ) )? ( (lv_returnType_2_0= ruleReturnType ) ) ( (lv_methodRef_3_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_10_0= ruleBlock ) ) ( (lv_returnStatement_11_0= ruleReturnStatement ) )? '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2866:2: () ( (lv_isSynchronized_1_0= 'synchronized' ) )? ( (lv_returnType_2_0= ruleReturnType ) ) ( (lv_methodRef_3_0= ruleMethodName ) ) '(' ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_10_0= ruleBlock ) ) ( (lv_returnStatement_11_0= ruleReturnStatement ) )? '}'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2866:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2867:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getProvidedMethodAccess().getProvidedMethodAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getProvidedMethodAccess().getProvidedMethodAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2880:2: ( (lv_isSynchronized_1_0= 'synchronized' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2881:1: (lv_isSynchronized_1_0= 'synchronized' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2881:1: (lv_isSynchronized_1_0= 'synchronized' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2882:3: lv_isSynchronized_1_0= 'synchronized'
                    {
                    lv_isSynchronized_1_0=(Token)input.LT(1);
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleProvidedMethod4729); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getProvidedMethodAccess().getIsSynchronizedSynchronizedKeyword_1_0(), "isSynchronized"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isSynchronized", true, "synchronized", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2901:3: ( (lv_returnType_2_0= ruleReturnType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2902:1: (lv_returnType_2_0= ruleReturnType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2902:1: (lv_returnType_2_0= ruleReturnType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2903:3: lv_returnType_2_0= ruleReturnType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getReturnTypeReturnTypeParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleReturnType_in_ruleProvidedMethod4764);
            lv_returnType_2_0=ruleReturnType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"returnType",
              	        		lv_returnType_2_0, 
              	        		"ReturnType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2925:2: ( (lv_methodRef_3_0= ruleMethodName ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2926:1: (lv_methodRef_3_0= ruleMethodName )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2926:1: (lv_methodRef_3_0= ruleMethodName )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2927:3: lv_methodRef_3_0= ruleMethodName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getMethodRefMethodNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_ruleProvidedMethod4785);
            lv_methodRef_3_0=ruleMethodName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"methodRef",
              	        		lv_methodRef_3_0, 
              	        		"MethodName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleProvidedMethod4795); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProvidedMethodAccess().getLeftParenthesisKeyword_4(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2953:1: ( ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=41 && LA35_0<=48)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2953:2: ( (lv_parameterList_5_0= ruleParameter ) ) ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2953:2: ( (lv_parameterList_5_0= ruleParameter ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2954:1: (lv_parameterList_5_0= ruleParameter )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2954:1: (lv_parameterList_5_0= ruleParameter )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2955:3: lv_parameterList_5_0= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getParameterListParameterParserRuleCall_5_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleProvidedMethod4817);
                    lv_parameterList_5_0=ruleParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameterList",
                      	        		lv_parameterList_5_0, 
                      	        		"Parameter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2977:2: ( ',' ( (lv_parameterList_7_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2977:4: ',' ( (lv_parameterList_7_0= ruleParameter ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleProvidedMethod4828); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getProvidedMethodAccess().getCommaKeyword_5_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2981:1: ( (lv_parameterList_7_0= ruleParameter ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2982:1: (lv_parameterList_7_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2982:1: (lv_parameterList_7_0= ruleParameter )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:2983:3: lv_parameterList_7_0= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getParameterListParameterParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleProvidedMethod4849);
                    	    lv_parameterList_7_0=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameterList",
                    	      	        		lv_parameterList_7_0, 
                    	      	        		"Parameter", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleProvidedMethod4863); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProvidedMethodAccess().getRightParenthesisKeyword_6(), null); 
                  
            }
            match(input,15,FollowSets000.FOLLOW_15_in_ruleProvidedMethod4873); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProvidedMethodAccess().getLeftCurlyBracketKeyword_7(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3013:1: ( (lv_block_10_0= ruleBlock ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3014:1: (lv_block_10_0= ruleBlock )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3014:1: (lv_block_10_0= ruleBlock )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3015:3: lv_block_10_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getBlockBlockParserRuleCall_8_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleProvidedMethod4894);
            lv_block_10_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_10_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3037:2: ( (lv_returnStatement_11_0= ruleReturnStatement ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3038:1: (lv_returnStatement_11_0= ruleReturnStatement )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3038:1: (lv_returnStatement_11_0= ruleReturnStatement )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3039:3: lv_returnStatement_11_0= ruleReturnStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getProvidedMethodAccess().getReturnStatementReturnStatementParserRuleCall_9_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_ruleProvidedMethod4915);
                    lv_returnStatement_11_0=ruleReturnStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getProvidedMethodRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"returnStatement",
                      	        		lv_returnStatement_11_0, 
                      	        		"ReturnStatement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleProvidedMethod4926); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProvidedMethodAccess().getRightCurlyBracketKeyword_10(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProvidedMethod


    // $ANTLR start entryRuleConstructor
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3073:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3074:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3075:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstructorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructor_in_entryRuleConstructor4962);
            iv_ruleConstructor=ruleConstructor();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructor4972); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstructor


    // $ANTLR start ruleConstructor
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3082:1: ruleConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_7_0= ruleBlock ) ) '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_parameterList_2_0 = null;

        EObject lv_parameterList_4_0 = null;

        EObject lv_block_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3087:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_7_0= ruleBlock ) ) '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3088:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_7_0= ruleBlock ) ) '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3088:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_7_0= ruleBlock ) ) '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3088:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )? ')' '{' ( (lv_block_7_0= ruleBlock ) ) '}'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3088:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3089:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3089:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3090:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstructor5014); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleConstructor5029); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3116:1: ( ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||(LA38_0>=41 && LA38_0<=48)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3116:2: ( (lv_parameterList_2_0= ruleParameter ) ) ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3116:2: ( (lv_parameterList_2_0= ruleParameter ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3117:1: (lv_parameterList_2_0= ruleParameter )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3117:1: (lv_parameterList_2_0= ruleParameter )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3118:3: lv_parameterList_2_0= ruleParameter
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getParameterListParameterParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConstructor5051);
                    lv_parameterList_2_0=ruleParameter();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameterList",
                      	        		lv_parameterList_2_0, 
                      	        		"Parameter", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3140:2: ( ',' ( (lv_parameterList_4_0= ruleParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3140:4: ',' ( (lv_parameterList_4_0= ruleParameter ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleConstructor5062); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3144:1: ( (lv_parameterList_4_0= ruleParameter ) )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3145:1: (lv_parameterList_4_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3145:1: (lv_parameterList_4_0= ruleParameter )
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3146:3: lv_parameterList_4_0= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getParameterListParameterParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleConstructor5083);
                    	    lv_parameterList_4_0=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameterList",
                    	      	        		lv_parameterList_4_0, 
                    	      	        		"Parameter", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleConstructor5097); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            match(input,15,FollowSets000.FOLLOW_15_in_ruleConstructor5107); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3176:1: ( (lv_block_7_0= ruleBlock ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3177:1: (lv_block_7_0= ruleBlock )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3177:1: (lv_block_7_0= ruleBlock )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3178:3: lv_block_7_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleConstructor5128);
            lv_block_7_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_7_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleConstructor5138); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstructor


    // $ANTLR start entryRuleReturnStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3212:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3213:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3214:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReturnStatementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5174);
            iv_ruleReturnStatement=ruleReturnStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnStatement5184); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReturnStatement


    // $ANTLR start ruleReturnStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3221:1: ruleReturnStatement returns [EObject current=null] : ( 'return' ( (lv_expression_1_0= ruleExpression ) ) ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3226:6: ( ( 'return' ( (lv_expression_1_0= ruleExpression ) ) ';' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3227:1: ( 'return' ( (lv_expression_1_0= ruleExpression ) ) ';' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3227:1: ( 'return' ( (lv_expression_1_0= ruleExpression ) ) ';' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3227:3: 'return' ( (lv_expression_1_0= ruleExpression ) ) ';'
            {
            match(input,40,FollowSets000.FOLLOW_40_in_ruleReturnStatement5219); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReturnStatementAccess().getReturnKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3231:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3232:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3232:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3233:3: lv_expression_1_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleReturnStatement5240);
            lv_expression_1_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getReturnStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_1_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FollowSets000.FOLLOW_38_in_ruleReturnStatement5250); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReturnStatement


    // $ANTLR start entryRuleParameter
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3267:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3268:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3269:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter5286);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter5296); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3276:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3281:6: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3282:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3282:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3282:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3282:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3283:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getParameterAccess().getFormalParameterAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getParameterAccess().getFormalParameterAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3296:2: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3297:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3297:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3298:3: lv_type_1_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleParameter5354);
            lv_type_1_0=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"Type", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3320:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3321:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3321:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3322:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameter5371); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleFieldName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3352:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3353:2: (iv_ruleFieldName= ruleFieldName EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3354:2: iv_ruleFieldName= ruleFieldName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFieldNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldName_in_entryRuleFieldName5412);
            iv_ruleFieldName=ruleFieldName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFieldName; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldName5422); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFieldName


    // $ANTLR start ruleFieldName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3361:1: ruleFieldName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3366:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3367:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3367:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3368:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3368:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3369:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldName5463); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFieldNameAccess().getNameIDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFieldNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFieldName


    // $ANTLR start entryRuleMethodName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3399:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3400:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3401:2: iv_ruleMethodName= ruleMethodName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMethodNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodName_in_entryRuleMethodName5503);
            iv_ruleMethodName=ruleMethodName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMethodName; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodName5513); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethodName


    // $ANTLR start ruleMethodName
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3408:1: ruleMethodName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3413:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3414:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3414:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3415:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3415:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3416:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodName5554); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getMethodNameAccess().getNameIDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMethodNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMethodName


    // $ANTLR start entryRuleType
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3446:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3447:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3448:2: iv_ruleType= ruleType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType5594);
            iv_ruleType=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType5604); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3455:1: ruleType returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_primitiveType_1_0=null;
        Token lv_primitiveType_2_0=null;
        Token lv_primitiveType_3_0=null;
        Token lv_primitiveType_4_0=null;
        Token lv_primitiveType_5_0=null;
        Token lv_primitiveType_6_0=null;
        Token lv_primitiveType_7_0=null;
        Token lv_primitiveType_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3460:6: ( ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3461:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3461:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) )
            int alt39=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 41:
                {
                alt39=2;
                }
                break;
            case 42:
                {
                alt39=3;
                }
                break;
            case 43:
                {
                alt39=4;
                }
                break;
            case 44:
                {
                alt39=5;
                }
                break;
            case 45:
                {
                alt39=6;
                }
                break;
            case 46:
                {
                alt39=7;
                }
                break;
            case 47:
                {
                alt39=8;
                }
                break;
            case 48:
                {
                alt39=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3461:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3461:2: ( ( RULE_ID ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3461:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3462:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3462:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3463:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleType5651); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypeAccess().getInterfaceTypeInterfaceCrossReference_0_0(), "interfaceType"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3479:6: ( (lv_primitiveType_1_0= 'byte' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3479:6: ( (lv_primitiveType_1_0= 'byte' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3480:1: (lv_primitiveType_1_0= 'byte' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3480:1: (lv_primitiveType_1_0= 'byte' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3481:3: lv_primitiveType_1_0= 'byte'
                    {
                    lv_primitiveType_1_0=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleType5675); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeByteKeyword_1_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_1_0, "byte", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3501:6: ( (lv_primitiveType_2_0= 'char' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3501:6: ( (lv_primitiveType_2_0= 'char' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3502:1: (lv_primitiveType_2_0= 'char' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3502:1: (lv_primitiveType_2_0= 'char' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3503:3: lv_primitiveType_2_0= 'char'
                    {
                    lv_primitiveType_2_0=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleType5712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeCharKeyword_2_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_2_0, "char", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3523:6: ( (lv_primitiveType_3_0= 'boolean' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3523:6: ( (lv_primitiveType_3_0= 'boolean' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3524:1: (lv_primitiveType_3_0= 'boolean' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3524:1: (lv_primitiveType_3_0= 'boolean' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3525:3: lv_primitiveType_3_0= 'boolean'
                    {
                    lv_primitiveType_3_0=(Token)input.LT(1);
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleType5749); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeBooleanKeyword_3_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_3_0, "boolean", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3545:6: ( (lv_primitiveType_4_0= 'short' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3545:6: ( (lv_primitiveType_4_0= 'short' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3546:1: (lv_primitiveType_4_0= 'short' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3546:1: (lv_primitiveType_4_0= 'short' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3547:3: lv_primitiveType_4_0= 'short'
                    {
                    lv_primitiveType_4_0=(Token)input.LT(1);
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleType5786); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeShortKeyword_4_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_4_0, "short", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3567:6: ( (lv_primitiveType_5_0= 'int' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3567:6: ( (lv_primitiveType_5_0= 'int' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3568:1: (lv_primitiveType_5_0= 'int' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3568:1: (lv_primitiveType_5_0= 'int' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3569:3: lv_primitiveType_5_0= 'int'
                    {
                    lv_primitiveType_5_0=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleType5823); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeIntKeyword_5_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_5_0, "int", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3589:6: ( (lv_primitiveType_6_0= 'long' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3589:6: ( (lv_primitiveType_6_0= 'long' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3590:1: (lv_primitiveType_6_0= 'long' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3590:1: (lv_primitiveType_6_0= 'long' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3591:3: lv_primitiveType_6_0= 'long'
                    {
                    lv_primitiveType_6_0=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleType5860); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeLongKeyword_6_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_6_0, "long", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3611:6: ( (lv_primitiveType_7_0= 'float' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3611:6: ( (lv_primitiveType_7_0= 'float' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3612:1: (lv_primitiveType_7_0= 'float' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3612:1: (lv_primitiveType_7_0= 'float' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3613:3: lv_primitiveType_7_0= 'float'
                    {
                    lv_primitiveType_7_0=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleType5897); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeFloatKeyword_7_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_7_0, "float", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3633:6: ( (lv_primitiveType_8_0= 'double' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3633:6: ( (lv_primitiveType_8_0= 'double' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3634:1: (lv_primitiveType_8_0= 'double' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3634:1: (lv_primitiveType_8_0= 'double' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3635:3: lv_primitiveType_8_0= 'double'
                    {
                    lv_primitiveType_8_0=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleType5934); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getPrimitiveTypeDoubleKeyword_8_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_8_0, "double", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleReturnType
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3662:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3663:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3664:2: iv_ruleReturnType= ruleReturnType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReturnTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReturnType_in_entryRuleReturnType5983);
            iv_ruleReturnType=ruleReturnType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReturnType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnType5993); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReturnType


    // $ANTLR start ruleReturnType
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3671:1: ruleReturnType returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) | ( (lv_primitiveType_9_0= 'void' ) ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_primitiveType_1_0=null;
        Token lv_primitiveType_2_0=null;
        Token lv_primitiveType_3_0=null;
        Token lv_primitiveType_4_0=null;
        Token lv_primitiveType_5_0=null;
        Token lv_primitiveType_6_0=null;
        Token lv_primitiveType_7_0=null;
        Token lv_primitiveType_8_0=null;
        Token lv_primitiveType_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3676:6: ( ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) | ( (lv_primitiveType_9_0= 'void' ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3677:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) | ( (lv_primitiveType_9_0= 'void' ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3677:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) | ( (lv_primitiveType_9_0= 'void' ) ) )
            int alt40=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 41:
                {
                alt40=2;
                }
                break;
            case 42:
                {
                alt40=3;
                }
                break;
            case 43:
                {
                alt40=4;
                }
                break;
            case 44:
                {
                alt40=5;
                }
                break;
            case 45:
                {
                alt40=6;
                }
                break;
            case 46:
                {
                alt40=7;
                }
                break;
            case 47:
                {
                alt40=8;
                }
                break;
            case 48:
                {
                alt40=9;
                }
                break;
            case 49:
                {
                alt40=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3677:1: ( ( ( RULE_ID ) ) | ( (lv_primitiveType_1_0= 'byte' ) ) | ( (lv_primitiveType_2_0= 'char' ) ) | ( (lv_primitiveType_3_0= 'boolean' ) ) | ( (lv_primitiveType_4_0= 'short' ) ) | ( (lv_primitiveType_5_0= 'int' ) ) | ( (lv_primitiveType_6_0= 'long' ) ) | ( (lv_primitiveType_7_0= 'float' ) ) | ( (lv_primitiveType_8_0= 'double' ) ) | ( (lv_primitiveType_9_0= 'void' ) ) )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3677:2: ( ( RULE_ID ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3677:2: ( ( RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3678:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3678:1: ( RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3679:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReturnType6040); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReturnTypeAccess().getInterfaceTypeInterfaceCrossReference_0_0(), "interfaceType"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3695:6: ( (lv_primitiveType_1_0= 'byte' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3695:6: ( (lv_primitiveType_1_0= 'byte' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3696:1: (lv_primitiveType_1_0= 'byte' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3696:1: (lv_primitiveType_1_0= 'byte' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3697:3: lv_primitiveType_1_0= 'byte'
                    {
                    lv_primitiveType_1_0=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleReturnType6064); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeByteKeyword_1_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_1_0, "byte", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3717:6: ( (lv_primitiveType_2_0= 'char' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3717:6: ( (lv_primitiveType_2_0= 'char' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3718:1: (lv_primitiveType_2_0= 'char' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3718:1: (lv_primitiveType_2_0= 'char' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3719:3: lv_primitiveType_2_0= 'char'
                    {
                    lv_primitiveType_2_0=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleReturnType6101); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeCharKeyword_2_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_2_0, "char", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3739:6: ( (lv_primitiveType_3_0= 'boolean' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3739:6: ( (lv_primitiveType_3_0= 'boolean' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3740:1: (lv_primitiveType_3_0= 'boolean' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3740:1: (lv_primitiveType_3_0= 'boolean' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3741:3: lv_primitiveType_3_0= 'boolean'
                    {
                    lv_primitiveType_3_0=(Token)input.LT(1);
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleReturnType6138); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeBooleanKeyword_3_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_3_0, "boolean", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3761:6: ( (lv_primitiveType_4_0= 'short' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3761:6: ( (lv_primitiveType_4_0= 'short' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3762:1: (lv_primitiveType_4_0= 'short' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3762:1: (lv_primitiveType_4_0= 'short' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3763:3: lv_primitiveType_4_0= 'short'
                    {
                    lv_primitiveType_4_0=(Token)input.LT(1);
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleReturnType6175); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeShortKeyword_4_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_4_0, "short", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3783:6: ( (lv_primitiveType_5_0= 'int' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3783:6: ( (lv_primitiveType_5_0= 'int' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3784:1: (lv_primitiveType_5_0= 'int' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3784:1: (lv_primitiveType_5_0= 'int' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3785:3: lv_primitiveType_5_0= 'int'
                    {
                    lv_primitiveType_5_0=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleReturnType6212); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeIntKeyword_5_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_5_0, "int", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3805:6: ( (lv_primitiveType_6_0= 'long' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3805:6: ( (lv_primitiveType_6_0= 'long' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3806:1: (lv_primitiveType_6_0= 'long' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3806:1: (lv_primitiveType_6_0= 'long' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3807:3: lv_primitiveType_6_0= 'long'
                    {
                    lv_primitiveType_6_0=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleReturnType6249); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeLongKeyword_6_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_6_0, "long", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3827:6: ( (lv_primitiveType_7_0= 'float' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3827:6: ( (lv_primitiveType_7_0= 'float' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3828:1: (lv_primitiveType_7_0= 'float' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3828:1: (lv_primitiveType_7_0= 'float' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3829:3: lv_primitiveType_7_0= 'float'
                    {
                    lv_primitiveType_7_0=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleReturnType6286); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeFloatKeyword_7_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_7_0, "float", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3849:6: ( (lv_primitiveType_8_0= 'double' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3849:6: ( (lv_primitiveType_8_0= 'double' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3850:1: (lv_primitiveType_8_0= 'double' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3850:1: (lv_primitiveType_8_0= 'double' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3851:3: lv_primitiveType_8_0= 'double'
                    {
                    lv_primitiveType_8_0=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleReturnType6323); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeDoubleKeyword_8_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_8_0, "double", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3871:6: ( (lv_primitiveType_9_0= 'void' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3871:6: ( (lv_primitiveType_9_0= 'void' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3872:1: (lv_primitiveType_9_0= 'void' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3872:1: (lv_primitiveType_9_0= 'void' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3873:3: lv_primitiveType_9_0= 'void'
                    {
                    lv_primitiveType_9_0=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleReturnType6360); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReturnTypeAccess().getPrimitiveTypeVoidKeyword_9_0(), "primitiveType"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReturnTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveType", lv_primitiveType_9_0, "void", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReturnType


    // $ANTLR start entryRuleBlock
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3900:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3901:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3902:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock6409);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock6419); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3909:1: ruleBlock returns [EObject current=null] : ( () ( (lv_parameterList_1_0= ruleLocalParameter ) )* ( (lv_statementList_2_0= ruleStatement ) )* ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterList_1_0 = null;

        EObject lv_statementList_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3914:6: ( ( () ( (lv_parameterList_1_0= ruleLocalParameter ) )* ( (lv_statementList_2_0= ruleStatement ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3915:1: ( () ( (lv_parameterList_1_0= ruleLocalParameter ) )* ( (lv_statementList_2_0= ruleStatement ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3915:1: ( () ( (lv_parameterList_1_0= ruleLocalParameter ) )* ( (lv_statementList_2_0= ruleStatement ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3915:2: () ( (lv_parameterList_1_0= ruleLocalParameter ) )* ( (lv_statementList_2_0= ruleStatement ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3915:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3916:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBlockAccess().getBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBlockAccess().getBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3929:2: ( (lv_parameterList_1_0= ruleLocalParameter ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=41 && LA41_0<=48)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3930:1: (lv_parameterList_1_0= ruleLocalParameter )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3930:1: (lv_parameterList_1_0= ruleLocalParameter )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3931:3: lv_parameterList_1_0= ruleLocalParameter
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getParameterListLocalParameterParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLocalParameter_in_ruleBlock6477);
            	    lv_parameterList_1_0=ruleLocalParameter();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"parameterList",
            	      	        		lv_parameterList_1_0, 
            	      	        		"LocalParameter", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3953:3: ( (lv_statementList_2_0= ruleStatement ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||LA42_0==25||LA42_0==28||LA42_0==50||LA42_0==52||LA42_0==66||(LA42_0>=71 && LA42_0<=78)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3954:1: (lv_statementList_2_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3954:1: (lv_statementList_2_0= ruleStatement )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3955:3: lv_statementList_2_0= ruleStatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementListStatementParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStatement_in_ruleBlock6499);
            	    lv_statementList_2_0=ruleStatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"statementList",
            	      	        		lv_statementList_2_0, 
            	      	        		"Statement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3985:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3986:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3987:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStatement_in_entryRuleStatement6536);
            iv_ruleStatement=ruleStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatement6546); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3994:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_IfThenElseStatement_1= ruleIfThenElseStatement | this_WhileStatement_2= ruleWhileStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionStatement_0 = null;

        EObject this_IfThenElseStatement_1 = null;

        EObject this_WhileStatement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:3999:6: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_IfThenElseStatement_1= ruleIfThenElseStatement | this_WhileStatement_2= ruleWhileStatement ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4000:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_IfThenElseStatement_1= ruleIfThenElseStatement | this_WhileStatement_2= ruleWhileStatement )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4000:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_IfThenElseStatement_1= ruleIfThenElseStatement | this_WhileStatement_2= ruleWhileStatement )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 25:
            case 28:
            case 66:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt43=1;
                }
                break;
            case 50:
                {
                alt43=2;
                }
                break;
            case 52:
                {
                alt43=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4000:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_IfThenElseStatement_1= ruleIfThenElseStatement | this_WhileStatement_2= ruleWhileStatement )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4001:2: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionStatement_in_ruleStatement6596);
                    this_ExpressionStatement_0=ruleExpressionStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ExpressionStatement_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4014:2: this_IfThenElseStatement_1= ruleIfThenElseStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getIfThenElseStatementParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfThenElseStatement_in_ruleStatement6626);
                    this_IfThenElseStatement_1=ruleIfThenElseStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IfThenElseStatement_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4027:2: this_WhileStatement_2= ruleWhileStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWhileStatement_in_ruleStatement6656);
                    this_WhileStatement_2=ruleWhileStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_WhileStatement_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleExpressionStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4046:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4047:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4048:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionStatementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement6691);
            iv_ruleExpressionStatement=ruleExpressionStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStatement6701); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionStatement


    // $ANTLR start ruleExpressionStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4055:1: ruleExpressionStatement returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4060:6: ( ( ( (lv_expression_0_0= ruleExpression ) ) ';' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4061:1: ( ( (lv_expression_0_0= ruleExpression ) ) ';' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4061:1: ( ( (lv_expression_0_0= ruleExpression ) ) ';' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4061:2: ( (lv_expression_0_0= ruleExpression ) ) ';'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4061:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4062:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4062:1: (lv_expression_0_0= ruleExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4063:3: lv_expression_0_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleExpressionStatement6747);
            lv_expression_0_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_0_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FollowSets000.FOLLOW_38_in_ruleExpressionStatement6757); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionStatement


    // $ANTLR start entryRuleIfThenElseStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4097:1: entryRuleIfThenElseStatement returns [EObject current=null] : iv_ruleIfThenElseStatement= ruleIfThenElseStatement EOF ;
    public final EObject entryRuleIfThenElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseStatement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4098:2: (iv_ruleIfThenElseStatement= ruleIfThenElseStatement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4099:2: iv_ruleIfThenElseStatement= ruleIfThenElseStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIfThenElseStatementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElseStatement_in_entryRuleIfThenElseStatement6793);
            iv_ruleIfThenElseStatement=ruleIfThenElseStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIfThenElseStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElseStatement6803); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfThenElseStatement


    // $ANTLR start ruleIfThenElseStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4106:1: ruleIfThenElseStatement returns [EObject current=null] : ( 'if' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_trueBranch_5_0= ruleBlock ) ) '}' ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )? ) ;
    public final EObject ruleIfThenElseStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_condiction_2_0 = null;

        EObject lv_trueBranch_5_0 = null;

        EObject lv_falseBranch_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4111:6: ( ( 'if' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_trueBranch_5_0= ruleBlock ) ) '}' ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4112:1: ( 'if' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_trueBranch_5_0= ruleBlock ) ) '}' ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4112:1: ( 'if' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_trueBranch_5_0= ruleBlock ) ) '}' ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4112:3: 'if' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_trueBranch_5_0= ruleBlock ) ) '}' ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )?
            {
            match(input,50,FollowSets000.FOLLOW_50_in_ruleIfThenElseStatement6838); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfThenElseStatementAccess().getIfKeyword_0(), null); 
                  
            }
            match(input,28,FollowSets000.FOLLOW_28_in_ruleIfThenElseStatement6848); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfThenElseStatementAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4120:1: ( (lv_condiction_2_0= ruleBooleanExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4121:1: (lv_condiction_2_0= ruleBooleanExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4121:1: (lv_condiction_2_0= ruleBooleanExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4122:3: lv_condiction_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfThenElseStatementAccess().getCondictionBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleIfThenElseStatement6869);
            lv_condiction_2_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIfThenElseStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"condiction",
              	        		lv_condiction_2_0, 
              	        		"BooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleIfThenElseStatement6879); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfThenElseStatementAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            match(input,15,FollowSets000.FOLLOW_15_in_ruleIfThenElseStatement6889); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfThenElseStatementAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4152:1: ( (lv_trueBranch_5_0= ruleBlock ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4153:1: (lv_trueBranch_5_0= ruleBlock )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4153:1: (lv_trueBranch_5_0= ruleBlock )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4154:3: lv_trueBranch_5_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIfThenElseStatementAccess().getTrueBranchBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfThenElseStatement6910);
            lv_trueBranch_5_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIfThenElseStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"trueBranch",
              	        		lv_trueBranch_5_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleIfThenElseStatement6920); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIfThenElseStatementAccess().getRightCurlyBracketKeyword_6(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4180:1: ( 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4180:3: 'else' '{' ( (lv_falseBranch_9_0= ruleBlock ) ) '}'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleIfThenElseStatement6931); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIfThenElseStatementAccess().getElseKeyword_7_0(), null); 
                          
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleIfThenElseStatement6941); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIfThenElseStatementAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4188:1: ( (lv_falseBranch_9_0= ruleBlock ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4189:1: (lv_falseBranch_9_0= ruleBlock )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4189:1: (lv_falseBranch_9_0= ruleBlock )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4190:3: lv_falseBranch_9_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIfThenElseStatementAccess().getFalseBranchBlockParserRuleCall_7_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfThenElseStatement6962);
                    lv_falseBranch_9_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIfThenElseStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"falseBranch",
                      	        		lv_falseBranch_9_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleIfThenElseStatement6972); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIfThenElseStatementAccess().getRightCurlyBracketKeyword_7_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfThenElseStatement


    // $ANTLR start entryRuleWhileStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4224:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4225:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4226:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWhileStatementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement7010);
            iv_ruleWhileStatement=ruleWhileStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileStatement7020); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWhileStatement


    // $ANTLR start ruleWhileStatement
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4233:1: ruleWhileStatement returns [EObject current=null] : ( 'while' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_whileBlock_5_0= ruleBlock ) ) '}' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_condiction_2_0 = null;

        EObject lv_whileBlock_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4238:6: ( ( 'while' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_whileBlock_5_0= ruleBlock ) ) '}' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4239:1: ( 'while' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_whileBlock_5_0= ruleBlock ) ) '}' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4239:1: ( 'while' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_whileBlock_5_0= ruleBlock ) ) '}' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4239:3: 'while' '(' ( (lv_condiction_2_0= ruleBooleanExpression ) ) ')' '{' ( (lv_whileBlock_5_0= ruleBlock ) ) '}'
            {
            match(input,52,FollowSets000.FOLLOW_52_in_ruleWhileStatement7055); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhileStatementAccess().getWhileKeyword_0(), null); 
                  
            }
            match(input,28,FollowSets000.FOLLOW_28_in_ruleWhileStatement7065); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4247:1: ( (lv_condiction_2_0= ruleBooleanExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4248:1: (lv_condiction_2_0= ruleBooleanExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4248:1: (lv_condiction_2_0= ruleBooleanExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4249:3: lv_condiction_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWhileStatementAccess().getCondictionBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleWhileStatement7086);
            lv_condiction_2_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWhileStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"condiction",
              	        		lv_condiction_2_0, 
              	        		"BooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleWhileStatement7096); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            match(input,15,FollowSets000.FOLLOW_15_in_ruleWhileStatement7106); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4279:1: ( (lv_whileBlock_5_0= ruleBlock ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4280:1: (lv_whileBlock_5_0= ruleBlock )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4280:1: (lv_whileBlock_5_0= ruleBlock )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4281:3: lv_whileBlock_5_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileStatement7127);
            lv_whileBlock_5_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWhileStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"whileBlock",
              	        		lv_whileBlock_5_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleWhileStatement7137); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhileStatement


    // $ANTLR start entryRuleBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4315:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4316:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4317:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression7173);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression7183); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4324:1: ruleBooleanExpression returns [EObject current=null] : ( () ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) ) ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_atomicList_1_0 = null;

        EObject lv_booleanOperatorList_2_0 = null;

        EObject lv_atomicList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4329:6: ( ( () ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) ) ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4330:1: ( () ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) ) ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4330:1: ( () ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) ) ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4330:2: () ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) ) ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4330:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4331:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4344:2: ( (lv_atomicList_1_0= ruleAtomicBooleanExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4345:1: (lv_atomicList_1_0= ruleAtomicBooleanExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4345:1: (lv_atomicList_1_0= ruleAtomicBooleanExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4346:3: lv_atomicList_1_0= ruleAtomicBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getAtomicListAtomicBooleanExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicBooleanExpression_in_ruleBooleanExpression7241);
            lv_atomicList_1_0=ruleAtomicBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"atomicList",
              	        		lv_atomicList_1_0, 
              	        		"AtomicBooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:2: ( ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA45_2 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA45_3 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA45_4 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA45_5 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt45=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA45_6 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt45=1;
                    }


                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:3: ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) ) ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:3: ( (lv_booleanOperatorList_2_0= ruleBooleanOperator ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4369:1: (lv_booleanOperatorList_2_0= ruleBooleanOperator )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4369:1: (lv_booleanOperatorList_2_0= ruleBooleanOperator )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4370:3: lv_booleanOperatorList_2_0= ruleBooleanOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanOperatorListBooleanOperatorParserRuleCall_2_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBooleanOperator_in_ruleBooleanExpression7263);
            	    lv_booleanOperatorList_2_0=ruleBooleanOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBooleanExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"booleanOperatorList",
            	      	        		lv_booleanOperatorList_2_0, 
            	      	        		"BooleanOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4392:2: ( (lv_atomicList_3_0= ruleAtomicBooleanExpression ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4393:1: (lv_atomicList_3_0= ruleAtomicBooleanExpression )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4393:1: (lv_atomicList_3_0= ruleAtomicBooleanExpression )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4394:3: lv_atomicList_3_0= ruleAtomicBooleanExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getAtomicListAtomicBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAtomicBooleanExpression_in_ruleBooleanExpression7284);
            	    lv_atomicList_3_0=ruleAtomicBooleanExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBooleanExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"atomicList",
            	      	        		lv_atomicList_3_0, 
            	      	        		"AtomicBooleanExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleBooleanOperator
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4424:1: entryRuleBooleanOperator returns [EObject current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final EObject entryRuleBooleanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperator = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4425:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4426:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator7322);
            iv_ruleBooleanOperator=ruleBooleanOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanOperator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanOperator7332); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanOperator


    // $ANTLR start ruleBooleanOperator
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4433:1: ruleBooleanOperator returns [EObject current=null] : ( ( (lv_operator_0_0= '&' ) ) | ( (lv_operator_1_0= '&&' ) ) | ( (lv_operator_2_0= '|' ) ) | ( (lv_operator_3_0= '||' ) ) | ( (lv_operator_4_0= '^' ) ) ) ;
    public final EObject ruleBooleanOperator() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_operator_1_0=null;
        Token lv_operator_2_0=null;
        Token lv_operator_3_0=null;
        Token lv_operator_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4438:6: ( ( ( (lv_operator_0_0= '&' ) ) | ( (lv_operator_1_0= '&&' ) ) | ( (lv_operator_2_0= '|' ) ) | ( (lv_operator_3_0= '||' ) ) | ( (lv_operator_4_0= '^' ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4439:1: ( ( (lv_operator_0_0= '&' ) ) | ( (lv_operator_1_0= '&&' ) ) | ( (lv_operator_2_0= '|' ) ) | ( (lv_operator_3_0= '||' ) ) | ( (lv_operator_4_0= '^' ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4439:1: ( ( (lv_operator_0_0= '&' ) ) | ( (lv_operator_1_0= '&&' ) ) | ( (lv_operator_2_0= '|' ) ) | ( (lv_operator_3_0= '||' ) ) | ( (lv_operator_4_0= '^' ) ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt46=1;
                }
                break;
            case 54:
                {
                alt46=2;
                }
                break;
            case 55:
                {
                alt46=3;
                }
                break;
            case 56:
                {
                alt46=4;
                }
                break;
            case 57:
                {
                alt46=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4439:1: ( ( (lv_operator_0_0= '&' ) ) | ( (lv_operator_1_0= '&&' ) ) | ( (lv_operator_2_0= '|' ) ) | ( (lv_operator_3_0= '||' ) ) | ( (lv_operator_4_0= '^' ) ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4439:2: ( (lv_operator_0_0= '&' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4439:2: ( (lv_operator_0_0= '&' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4440:1: (lv_operator_0_0= '&' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4440:1: (lv_operator_0_0= '&' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4441:3: lv_operator_0_0= '&'
                    {
                    lv_operator_0_0=(Token)input.LT(1);
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleBooleanOperator7375); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanOperatorAccess().getOperatorAmpersandKeyword_0_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_0_0, "&", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4461:6: ( (lv_operator_1_0= '&&' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4461:6: ( (lv_operator_1_0= '&&' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4462:1: (lv_operator_1_0= '&&' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4462:1: (lv_operator_1_0= '&&' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4463:3: lv_operator_1_0= '&&'
                    {
                    lv_operator_1_0=(Token)input.LT(1);
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleBooleanOperator7412); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanOperatorAccess().getOperatorAmpersandAmpersandKeyword_1_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_1_0, "&&", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4483:6: ( (lv_operator_2_0= '|' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4483:6: ( (lv_operator_2_0= '|' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4484:1: (lv_operator_2_0= '|' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4484:1: (lv_operator_2_0= '|' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4485:3: lv_operator_2_0= '|'
                    {
                    lv_operator_2_0=(Token)input.LT(1);
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleBooleanOperator7449); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanOperatorAccess().getOperatorVerticalLineKeyword_2_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_2_0, "|", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4505:6: ( (lv_operator_3_0= '||' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4505:6: ( (lv_operator_3_0= '||' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4506:1: (lv_operator_3_0= '||' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4506:1: (lv_operator_3_0= '||' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4507:3: lv_operator_3_0= '||'
                    {
                    lv_operator_3_0=(Token)input.LT(1);
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleBooleanOperator7486); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanOperatorAccess().getOperatorVerticalLineVerticalLineKeyword_3_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_3_0, "||", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4527:6: ( (lv_operator_4_0= '^' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4527:6: ( (lv_operator_4_0= '^' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4528:1: (lv_operator_4_0= '^' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4528:1: (lv_operator_4_0= '^' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4529:3: lv_operator_4_0= '^'
                    {
                    lv_operator_4_0=(Token)input.LT(1);
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleBooleanOperator7523); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanOperatorAccess().getOperatorCircumflexAccentKeyword_4_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_4_0, "^", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanOperator


    // $ANTLR start entryRuleAtomicBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4556:1: entryRuleAtomicBooleanExpression returns [EObject current=null] : iv_ruleAtomicBooleanExpression= ruleAtomicBooleanExpression EOF ;
    public final EObject entryRuleAtomicBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicBooleanExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4557:2: (iv_ruleAtomicBooleanExpression= ruleAtomicBooleanExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4558:2: iv_ruleAtomicBooleanExpression= ruleAtomicBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicBooleanExpression_in_entryRuleAtomicBooleanExpression7572);
            iv_ruleAtomicBooleanExpression=ruleAtomicBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicBooleanExpression7582); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicBooleanExpression


    // $ANTLR start ruleAtomicBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4565:1: ruleAtomicBooleanExpression returns [EObject current=null] : (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression ) ;
    public final EObject ruleAtomicBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleComparation_0 = null;

        EObject this_NestedBooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4570:6: ( (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )
            int alt47=2;
            switch ( input.LA(1) ) {
            case 58:
                {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=RULE_STRING && LA47_1<=RULE_INT)||LA47_1==25||LA47_1==66||(LA47_1>=71 && LA47_1<=78)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==28) ) {
                    int LA47_4 = input.LA(3);

                    if ( (synpred78()) ) {
                        alt47=1;
                    }
                    else if ( (true) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )", 47, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 25:
            case 66:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt47=1;
                }
                break;
            case 28:
                {
                int LA47_3 = input.LA(2);

                if ( (synpred78()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )", 47, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4571:1: (this_SimpleComparation_0= ruleSimpleComparation | this_NestedBooleanExpression_1= ruleNestedBooleanExpression )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4572:2: this_SimpleComparation_0= ruleSimpleComparation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicBooleanExpressionAccess().getSimpleComparationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleComparation_in_ruleAtomicBooleanExpression7632);
                    this_SimpleComparation_0=ruleSimpleComparation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimpleComparation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4585:2: this_NestedBooleanExpression_1= ruleNestedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicBooleanExpressionAccess().getNestedBooleanExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedBooleanExpression_in_ruleAtomicBooleanExpression7662);
                    this_NestedBooleanExpression_1=ruleNestedBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NestedBooleanExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicBooleanExpression


    // $ANTLR start entryRuleSimpleComparation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4604:1: entryRuleSimpleComparation returns [EObject current=null] : iv_ruleSimpleComparation= ruleSimpleComparation EOF ;
    public final EObject entryRuleSimpleComparation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleComparation = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4605:2: (iv_ruleSimpleComparation= ruleSimpleComparation EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4606:2: iv_ruleSimpleComparation= ruleSimpleComparation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleComparationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleComparation_in_entryRuleSimpleComparation7697);
            iv_ruleSimpleComparation=ruleSimpleComparation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleComparation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleComparation7707); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleComparation


    // $ANTLR start ruleSimpleComparation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4613:1: ruleSimpleComparation returns [EObject current=null] : ( ( (lv_negated_0_0= '!' ) )? ( (lv_leftExpression_1_0= ruleExpression ) ) ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleSimpleComparation() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        EObject lv_leftExpression_1_0 = null;

        EObject lv_compare_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4618:6: ( ( ( (lv_negated_0_0= '!' ) )? ( (lv_leftExpression_1_0= ruleExpression ) ) ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4619:1: ( ( (lv_negated_0_0= '!' ) )? ( (lv_leftExpression_1_0= ruleExpression ) ) ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4619:1: ( ( (lv_negated_0_0= '!' ) )? ( (lv_leftExpression_1_0= ruleExpression ) ) ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4619:2: ( (lv_negated_0_0= '!' ) )? ( (lv_leftExpression_1_0= ruleExpression ) ) ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )?
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4619:2: ( (lv_negated_0_0= '!' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4620:1: (lv_negated_0_0= '!' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4620:1: (lv_negated_0_0= '!' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4621:3: lv_negated_0_0= '!'
                    {
                    lv_negated_0_0=(Token)input.LT(1);
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleSimpleComparation7750); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSimpleComparationAccess().getNegatedExclamationMarkKeyword_0_0(), "negated"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSimpleComparationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "negated", true, "!", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4640:3: ( (lv_leftExpression_1_0= ruleExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4641:1: (lv_leftExpression_1_0= ruleExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4641:1: (lv_leftExpression_1_0= ruleExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4642:3: lv_leftExpression_1_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSimpleComparationAccess().getLeftExpressionExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSimpleComparation7785);
            lv_leftExpression_1_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSimpleComparationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpression",
              	        		lv_leftExpression_1_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:2: ( ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) )?
            int alt49=2;
            switch ( input.LA(1) ) {
                case 59:
                    {
                    int LA49_1 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA49_2 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA49_3 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 62:
                    {
                    int LA49_4 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 63:
                    {
                    int LA49_5 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
                case 64:
                    {
                    int LA49_6 = input.LA(2);

                    if ( (synpred80()) ) {
                        alt49=1;
                    }
                    }
                    break;
            }

            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:3: ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_rightExpression_3_0= ruleExpression ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:3: ( (lv_compare_2_0= ruleCompareOperator ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4665:1: (lv_compare_2_0= ruleCompareOperator )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4665:1: (lv_compare_2_0= ruleCompareOperator )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4666:3: lv_compare_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSimpleComparationAccess().getCompareCompareOperatorParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleSimpleComparation7807);
                    lv_compare_2_0=ruleCompareOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSimpleComparationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"compare",
                      	        		lv_compare_2_0, 
                      	        		"CompareOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4688:2: ( (lv_rightExpression_3_0= ruleExpression ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4689:1: (lv_rightExpression_3_0= ruleExpression )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4689:1: (lv_rightExpression_3_0= ruleExpression )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4690:3: lv_rightExpression_3_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSimpleComparationAccess().getRightExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSimpleComparation7828);
                    lv_rightExpression_3_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSimpleComparationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpression",
                      	        		lv_rightExpression_3_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleComparation


    // $ANTLR start entryRuleNestedBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4720:1: entryRuleNestedBooleanExpression returns [EObject current=null] : iv_ruleNestedBooleanExpression= ruleNestedBooleanExpression EOF ;
    public final EObject entryRuleNestedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedBooleanExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4721:2: (iv_ruleNestedBooleanExpression= ruleNestedBooleanExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4722:2: iv_ruleNestedBooleanExpression= ruleNestedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedBooleanExpression_in_entryRuleNestedBooleanExpression7866);
            iv_ruleNestedBooleanExpression=ruleNestedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedBooleanExpression7876); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedBooleanExpression


    // $ANTLR start ruleNestedBooleanExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4729:1: ruleNestedBooleanExpression returns [EObject current=null] : ( ( (lv_negated_0_0= '!' ) )? '(' ( (lv_nestedExpression_2_0= ruleBooleanExpression ) ) ')' ) ;
    public final EObject ruleNestedBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        EObject lv_nestedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4734:6: ( ( ( (lv_negated_0_0= '!' ) )? '(' ( (lv_nestedExpression_2_0= ruleBooleanExpression ) ) ')' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4735:1: ( ( (lv_negated_0_0= '!' ) )? '(' ( (lv_nestedExpression_2_0= ruleBooleanExpression ) ) ')' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4735:1: ( ( (lv_negated_0_0= '!' ) )? '(' ( (lv_nestedExpression_2_0= ruleBooleanExpression ) ) ')' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4735:2: ( (lv_negated_0_0= '!' ) )? '(' ( (lv_nestedExpression_2_0= ruleBooleanExpression ) ) ')'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4735:2: ( (lv_negated_0_0= '!' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4736:1: (lv_negated_0_0= '!' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4736:1: (lv_negated_0_0= '!' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4737:3: lv_negated_0_0= '!'
                    {
                    lv_negated_0_0=(Token)input.LT(1);
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleNestedBooleanExpression7919); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNestedBooleanExpressionAccess().getNegatedExclamationMarkKeyword_0_0(), "negated"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNestedBooleanExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "negated", true, "!", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleNestedBooleanExpression7943); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedBooleanExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4760:1: ( (lv_nestedExpression_2_0= ruleBooleanExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4761:1: (lv_nestedExpression_2_0= ruleBooleanExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4761:1: (lv_nestedExpression_2_0= ruleBooleanExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4762:3: lv_nestedExpression_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedBooleanExpressionAccess().getNestedExpressionBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleNestedBooleanExpression7964);
            lv_nestedExpression_2_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNestedBooleanExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"nestedExpression",
              	        		lv_nestedExpression_2_0, 
              	        		"BooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleNestedBooleanExpression7974); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedBooleanExpressionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedBooleanExpression


    // $ANTLR start entryRuleCompareOperator
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4796:1: entryRuleCompareOperator returns [EObject current=null] : iv_ruleCompareOperator= ruleCompareOperator EOF ;
    public final EObject entryRuleCompareOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperator = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4797:2: (iv_ruleCompareOperator= ruleCompareOperator EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4798:2: iv_ruleCompareOperator= ruleCompareOperator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator8010);
            iv_ruleCompareOperator=ruleCompareOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperator8020); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompareOperator


    // $ANTLR start ruleCompareOperator
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4805:1: ruleCompareOperator returns [EObject current=null] : ( ( (lv_operator_0_0= '<' ) ) | ( (lv_operator_1_0= '<=' ) ) | ( (lv_operator_2_0= '==' ) ) | ( (lv_operator_3_0= '!=' ) ) | ( (lv_operator_4_0= '>' ) ) | ( (lv_operator_5_0= '>=' ) ) ) ;
    public final EObject ruleCompareOperator() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_operator_1_0=null;
        Token lv_operator_2_0=null;
        Token lv_operator_3_0=null;
        Token lv_operator_4_0=null;
        Token lv_operator_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4810:6: ( ( ( (lv_operator_0_0= '<' ) ) | ( (lv_operator_1_0= '<=' ) ) | ( (lv_operator_2_0= '==' ) ) | ( (lv_operator_3_0= '!=' ) ) | ( (lv_operator_4_0= '>' ) ) | ( (lv_operator_5_0= '>=' ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4811:1: ( ( (lv_operator_0_0= '<' ) ) | ( (lv_operator_1_0= '<=' ) ) | ( (lv_operator_2_0= '==' ) ) | ( (lv_operator_3_0= '!=' ) ) | ( (lv_operator_4_0= '>' ) ) | ( (lv_operator_5_0= '>=' ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4811:1: ( ( (lv_operator_0_0= '<' ) ) | ( (lv_operator_1_0= '<=' ) ) | ( (lv_operator_2_0= '==' ) ) | ( (lv_operator_3_0= '!=' ) ) | ( (lv_operator_4_0= '>' ) ) | ( (lv_operator_5_0= '>=' ) ) )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt51=1;
                }
                break;
            case 60:
                {
                alt51=2;
                }
                break;
            case 61:
                {
                alt51=3;
                }
                break;
            case 62:
                {
                alt51=4;
                }
                break;
            case 63:
                {
                alt51=5;
                }
                break;
            case 64:
                {
                alt51=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4811:1: ( ( (lv_operator_0_0= '<' ) ) | ( (lv_operator_1_0= '<=' ) ) | ( (lv_operator_2_0= '==' ) ) | ( (lv_operator_3_0= '!=' ) ) | ( (lv_operator_4_0= '>' ) ) | ( (lv_operator_5_0= '>=' ) ) )", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4811:2: ( (lv_operator_0_0= '<' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4811:2: ( (lv_operator_0_0= '<' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4812:1: (lv_operator_0_0= '<' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4812:1: (lv_operator_0_0= '<' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4813:3: lv_operator_0_0= '<'
                    {
                    lv_operator_0_0=(Token)input.LT(1);
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleCompareOperator8063); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorLessThanSignKeyword_0_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_0_0, "<", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4833:6: ( (lv_operator_1_0= '<=' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4833:6: ( (lv_operator_1_0= '<=' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4834:1: (lv_operator_1_0= '<=' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4834:1: (lv_operator_1_0= '<=' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4835:3: lv_operator_1_0= '<='
                    {
                    lv_operator_1_0=(Token)input.LT(1);
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleCompareOperator8100); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorLessThanSignEqualsSignKeyword_1_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_1_0, "<=", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4855:6: ( (lv_operator_2_0= '==' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4855:6: ( (lv_operator_2_0= '==' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4856:1: (lv_operator_2_0= '==' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4856:1: (lv_operator_2_0= '==' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4857:3: lv_operator_2_0= '=='
                    {
                    lv_operator_2_0=(Token)input.LT(1);
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleCompareOperator8137); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorEqualsSignEqualsSignKeyword_2_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_2_0, "==", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4877:6: ( (lv_operator_3_0= '!=' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4877:6: ( (lv_operator_3_0= '!=' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4878:1: (lv_operator_3_0= '!=' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4878:1: (lv_operator_3_0= '!=' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4879:3: lv_operator_3_0= '!='
                    {
                    lv_operator_3_0=(Token)input.LT(1);
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleCompareOperator8174); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorExclamationMarkEqualsSignKeyword_3_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_3_0, "!=", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4899:6: ( (lv_operator_4_0= '>' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4899:6: ( (lv_operator_4_0= '>' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4900:1: (lv_operator_4_0= '>' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4900:1: (lv_operator_4_0= '>' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4901:3: lv_operator_4_0= '>'
                    {
                    lv_operator_4_0=(Token)input.LT(1);
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleCompareOperator8211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorGreaterThanSignKeyword_4_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_4_0, ">", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4921:6: ( (lv_operator_5_0= '>=' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4921:6: ( (lv_operator_5_0= '>=' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4922:1: (lv_operator_5_0= '>=' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4922:1: (lv_operator_5_0= '>=' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4923:3: lv_operator_5_0= '>='
                    {
                    lv_operator_5_0=(Token)input.LT(1);
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleCompareOperator8248); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareOperatorAccess().getOperatorGreaterThanSignEqualsSignKeyword_5_0(), "operator"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperatorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "operator", lv_operator_5_0, ">=", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperator


    // $ANTLR start entryRuleLocalParameter
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4950:1: entryRuleLocalParameter returns [EObject current=null] : iv_ruleLocalParameter= ruleLocalParameter EOF ;
    public final EObject entryRuleLocalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalParameter = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4951:2: (iv_ruleLocalParameter= ruleLocalParameter EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4952:2: iv_ruleLocalParameter= ruleLocalParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLocalParameterRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalParameter_in_entryRuleLocalParameter8297);
            iv_ruleLocalParameter=ruleLocalParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLocalParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalParameter8307); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalParameter


    // $ANTLR start ruleLocalParameter
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4959:1: ruleLocalParameter returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) ) ;
    public final EObject ruleLocalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_8_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4964:6: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )
            int alt52=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA52_1 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA52_2 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA52_3 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 3, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA52_4 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA52_5 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 5, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA52_6 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 6, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA52_7 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 7, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA52_8 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 8, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA52_9 = input.LA(2);

                if ( (synpred87()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 9, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4965:1: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' ) | ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' ) )", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ';'
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:3: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4966:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getLocalParameterAccess().getLocalParameterAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getLocalParameterAccess().getLocalParameterAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4979:2: ( (lv_type_1_0= ruleType ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4980:1: (lv_type_1_0= ruleType )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4980:1: (lv_type_1_0= ruleType )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4981:3: lv_type_1_0= ruleType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getTypeTypeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleLocalParameter8366);
                    lv_type_1_0=ruleType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_1_0, 
                      	        		"Type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5003:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5004:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5004:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5005:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalParameter8383); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getLocalParameterAccess().getNameIDTerminalRuleCall_0_2_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,65,FollowSets000.FOLLOW_65_in_ruleLocalParameter8398); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLocalParameterAccess().getEqualsSignKeyword_0_3(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5031:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5032:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5032:1: (lv_value_4_0= ruleExpression )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5033:3: lv_value_4_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getValueExpressionParserRuleCall_0_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLocalParameter8419);
                    lv_value_4_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_4_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLocalParameter8429); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLocalParameterAccess().getSemicolonKeyword_0_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5060:6: ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5060:6: ( () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5060:7: () ( (lv_type_7_0= ruleType ) ) ( (lv_name_8_0= RULE_ID ) ) '=' ( (lv_value_10_0= ruleBooleanExpression ) ) ';'
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5060:7: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5061:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getLocalParameterAccess().getLocalParameterAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getLocalParameterAccess().getLocalParameterAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5074:2: ( (lv_type_7_0= ruleType ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5075:1: (lv_type_7_0= ruleType )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5075:1: (lv_type_7_0= ruleType )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5076:3: lv_type_7_0= ruleType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getTypeTypeParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleLocalParameter8470);
                    lv_type_7_0=ruleType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_7_0, 
                      	        		"Type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5098:2: ( (lv_name_8_0= RULE_ID ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5099:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5099:1: (lv_name_8_0= RULE_ID )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5100:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalParameter8487); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getLocalParameterAccess().getNameIDTerminalRuleCall_1_2_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_8_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,65,FollowSets000.FOLLOW_65_in_ruleLocalParameter8502); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLocalParameterAccess().getEqualsSignKeyword_1_3(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5126:1: ( (lv_value_10_0= ruleBooleanExpression ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5127:1: (lv_value_10_0= ruleBooleanExpression )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5127:1: (lv_value_10_0= ruleBooleanExpression )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5128:3: lv_value_10_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getValueBooleanExpressionParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleLocalParameter8523);
                    lv_value_10_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLocalParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_10_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLocalParameter8533); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLocalParameterAccess().getSemicolonKeyword_1_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalParameter


    // $ANTLR start entryRuleExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5162:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5163:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5164:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression8570);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression8580); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5171:1: ruleExpression returns [EObject current=null] : ( () ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )? ( (lv_termList_3_0= ruleDottedExpression ) ) ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_sign_1_0=null;
        Token lv_sign_2_0=null;
        Token lv_operatorList_4_1=null;
        Token lv_operatorList_4_2=null;
        Token lv_operatorList_4_3=null;
        Token lv_operatorList_4_4=null;
        Token lv_operatorList_4_5=null;
        EObject lv_termList_3_0 = null;

        EObject lv_termList_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5176:6: ( ( () ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )? ( (lv_termList_3_0= ruleDottedExpression ) ) ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )* ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5177:1: ( () ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )? ( (lv_termList_3_0= ruleDottedExpression ) ) ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )* )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5177:1: ( () ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )? ( (lv_termList_3_0= ruleDottedExpression ) ) ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )* )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5177:2: () ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )? ( (lv_termList_3_0= ruleDottedExpression ) ) ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )*
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5177:2: ()
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5178:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getExpressionAccess().getExpressionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getExpressionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5191:2: ( ( (lv_sign_1_0= '-' ) ) | ( (lv_sign_2_0= '+' ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            else if ( (LA53_0==25) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5191:3: ( (lv_sign_1_0= '-' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5191:3: ( (lv_sign_1_0= '-' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5192:1: (lv_sign_1_0= '-' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5192:1: (lv_sign_1_0= '-' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5193:3: lv_sign_1_0= '-'
                    {
                    lv_sign_1_0=(Token)input.LT(1);
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleExpression8636); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExpressionAccess().getSignHyphenMinusKeyword_1_0_0(), "sign"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sign", lv_sign_1_0, "-", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5213:6: ( (lv_sign_2_0= '+' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5213:6: ( (lv_sign_2_0= '+' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5214:1: (lv_sign_2_0= '+' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5214:1: (lv_sign_2_0= '+' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5215:3: lv_sign_2_0= '+'
                    {
                    lv_sign_2_0=(Token)input.LT(1);
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleExpression8673); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExpressionAccess().getSignPlusSignKeyword_1_1_0(), "sign"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sign", lv_sign_2_0, "+", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5234:4: ( (lv_termList_3_0= ruleDottedExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5235:1: (lv_termList_3_0= ruleDottedExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5235:1: (lv_termList_3_0= ruleDottedExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5236:3: lv_termList_3_0= ruleDottedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTermListDottedExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDottedExpression_in_ruleExpression8709);
            lv_termList_3_0=ruleDottedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"termList",
              	        		lv_termList_3_0, 
              	        		"DottedExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:2: ( ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred94()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred94()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred94()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA55_5 = input.LA(2);

                    if ( (synpred94()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA55_6 = input.LA(2);

                    if ( (synpred94()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:3: ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) ) ( (lv_termList_5_0= ruleDottedExpression ) )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:3: ( ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5259:1: ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5259:1: ( (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5260:1: (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5260:1: (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' )
            	    int alt54=5;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt54=4;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt54=5;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("5260:1: (lv_operatorList_4_1= '+' | lv_operatorList_4_2= '-' | lv_operatorList_4_3= '*' | lv_operatorList_4_4= '/' | lv_operatorList_4_5= '%' )", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5261:3: lv_operatorList_4_1= '+'
            	            {
            	            lv_operatorList_4_1=(Token)input.LT(1);
            	            match(input,25,FollowSets000.FOLLOW_25_in_ruleExpression8730); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getOperatorListPlusSignKeyword_3_0_0_0(), "operatorList"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "operatorList", lv_operatorList_4_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5279:8: lv_operatorList_4_2= '-'
            	            {
            	            lv_operatorList_4_2=(Token)input.LT(1);
            	            match(input,66,FollowSets000.FOLLOW_66_in_ruleExpression8759); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getOperatorListHyphenMinusKeyword_3_0_0_1(), "operatorList"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "operatorList", lv_operatorList_4_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5297:8: lv_operatorList_4_3= '*'
            	            {
            	            lv_operatorList_4_3=(Token)input.LT(1);
            	            match(input,67,FollowSets000.FOLLOW_67_in_ruleExpression8788); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getOperatorListAsteriskKeyword_3_0_0_2(), "operatorList"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "operatorList", lv_operatorList_4_3, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5315:8: lv_operatorList_4_4= '/'
            	            {
            	            lv_operatorList_4_4=(Token)input.LT(1);
            	            match(input,68,FollowSets000.FOLLOW_68_in_ruleExpression8817); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getOperatorListSolidusKeyword_3_0_0_3(), "operatorList"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "operatorList", lv_operatorList_4_4, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5333:8: lv_operatorList_4_5= '%'
            	            {
            	            lv_operatorList_4_5=(Token)input.LT(1);
            	            match(input,69,FollowSets000.FOLLOW_69_in_ruleExpression8846); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getOperatorListPercentSignKeyword_3_0_0_4(), "operatorList"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "operatorList", lv_operatorList_4_5, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5354:2: ( (lv_termList_5_0= ruleDottedExpression ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5355:1: (lv_termList_5_0= ruleDottedExpression )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5355:1: (lv_termList_5_0= ruleDottedExpression )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5356:3: lv_termList_5_0= ruleDottedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTermListDottedExpressionParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDottedExpression_in_ruleExpression8883);
            	    lv_termList_5_0=ruleDottedExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"termList",
            	      	        		lv_termList_5_0, 
            	      	        		"DottedExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleDottedExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5386:1: entryRuleDottedExpression returns [EObject current=null] : iv_ruleDottedExpression= ruleDottedExpression EOF ;
    public final EObject entryRuleDottedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5387:2: (iv_ruleDottedExpression= ruleDottedExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5388:2: iv_ruleDottedExpression= ruleDottedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDottedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDottedExpression_in_entryRuleDottedExpression8921);
            iv_ruleDottedExpression=ruleDottedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDottedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDottedExpression8931); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDottedExpression


    // $ANTLR start ruleDottedExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5395:1: ruleDottedExpression returns [EObject current=null] : ( ( (lv_start_0_0= ruleStart ) ) ( () '.' ( (lv_message_3_0= ruleMessage ) ) )* ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )? ) ;
    public final EObject ruleDottedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;

        EObject lv_message_3_0 = null;

        EObject lv_message_6_0 = null;

        EObject lv_value_8_0 = null;

        EObject lv_value_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5400:6: ( ( ( (lv_start_0_0= ruleStart ) ) ( () '.' ( (lv_message_3_0= ruleMessage ) ) )* ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )? ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5401:1: ( ( (lv_start_0_0= ruleStart ) ) ( () '.' ( (lv_message_3_0= ruleMessage ) ) )* ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )? )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5401:1: ( ( (lv_start_0_0= ruleStart ) ) ( () '.' ( (lv_message_3_0= ruleMessage ) ) )* ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )? )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5401:2: ( (lv_start_0_0= ruleStart ) ) ( () '.' ( (lv_message_3_0= ruleMessage ) ) )* ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )?
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5401:2: ( (lv_start_0_0= ruleStart ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5402:1: (lv_start_0_0= ruleStart )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5402:1: (lv_start_0_0= ruleStart )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5403:3: lv_start_0_0= ruleStart
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getStartStartParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStart_in_ruleDottedExpression8977);
            lv_start_0_0=ruleStart();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDottedExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"start",
              	        		lv_start_0_0, 
              	        		"Start", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:2: ( () '.' ( (lv_message_3_0= ruleMessage ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==70) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred95()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:3: () '.' ( (lv_message_3_0= ruleMessage ) )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:3: ()
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5426:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getDottedExpressionAccess().getDottedExpressionReceiverAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "receiver", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getDottedExpressionAccess().getDottedExpressionReceiverAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    match(input,70,FollowSets000.FOLLOW_70_in_ruleDottedExpression9000); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDottedExpressionAccess().getFullStopKeyword_1_1(), null); 
            	          
            	    }
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5448:1: ( (lv_message_3_0= ruleMessage ) )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5449:1: (lv_message_3_0= ruleMessage )
            	    {
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5449:1: (lv_message_3_0= ruleMessage )
            	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5450:3: lv_message_3_0= ruleMessage
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getMessageMessageParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMessage_in_ruleDottedExpression9021);
            	    lv_message_3_0=ruleMessage();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDottedExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"message",
            	      	        		lv_message_3_0, 
            	      	        		"Message", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:4: ( () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==70) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred98()) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:5: () '.' ( (lv_message_6_0= ruleFieldAccess ) ) ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )?
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:5: ()
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5473:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getDottedExpressionAccess().getDottedExpressionReceiverAction_2_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "receiver", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getDottedExpressionAccess().getDottedExpressionReceiverAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,70,FollowSets000.FOLLOW_70_in_ruleDottedExpression9046); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDottedExpressionAccess().getFullStopKeyword_2_1(), null); 
                          
                    }
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5495:1: ( (lv_message_6_0= ruleFieldAccess ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5496:1: (lv_message_6_0= ruleFieldAccess )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5496:1: (lv_message_6_0= ruleFieldAccess )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5497:3: lv_message_6_0= ruleFieldAccess
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getMessageFieldAccessParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldAccess_in_ruleDottedExpression9067);
                    lv_message_6_0=ruleFieldAccess();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDottedExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"message",
                      	        		lv_message_6_0, 
                      	        		"FieldAccess", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5519:2: ( '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==65) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5519:4: '=' ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )
                            {
                            match(input,65,FollowSets000.FOLLOW_65_in_ruleDottedExpression9078); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getDottedExpressionAccess().getEqualsSignKeyword_2_3_0(), null); 
                                  
                            }
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )
                            int alt57=2;
                            switch ( input.LA(1) ) {
                            case 66:
                                {
                                int LA57_1 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 1, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 25:
                                {
                                int LA57_2 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 2, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 71:
                                {
                                int LA57_3 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 3, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 74:
                                {
                                int LA57_4 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 4, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 72:
                                {
                                int LA57_5 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 5, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 73:
                                {
                                int LA57_6 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 6, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 75:
                                {
                                int LA57_7 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 7, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 76:
                                {
                                int LA57_8 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_INT:
                                {
                                int LA57_9 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 9, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_STRING:
                                {
                                int LA57_10 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 10, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 28:
                                {
                                int LA57_11 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 11, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 77:
                                {
                                int LA57_12 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 12, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA57_13 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 13, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 78:
                                {
                                int LA57_14 = input.LA(2);

                                if ( (synpred96()) ) {
                                    alt57=1;
                                }
                                else if ( (true) ) {
                                    alt57=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 14, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 58:
                                {
                                alt57=2;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("5523:1: ( ( (lv_value_8_0= ruleExpression ) ) | ( (lv_value_9_0= ruleBooleanExpression ) ) )", 57, 0, input);

                                throw nvae;
                            }

                            switch (alt57) {
                                case 1 :
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( (lv_value_8_0= ruleExpression ) )
                                    {
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( (lv_value_8_0= ruleExpression ) )
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: (lv_value_8_0= ruleExpression )
                                    {
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: (lv_value_8_0= ruleExpression )
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5525:3: lv_value_8_0= ruleExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getValueExpressionParserRuleCall_2_3_1_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDottedExpression9100);
                                    lv_value_8_0=ruleExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getDottedExpressionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"value",
                                      	        		lv_value_8_0, 
                                      	        		"Expression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5548:6: ( (lv_value_9_0= ruleBooleanExpression ) )
                                    {
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5548:6: ( (lv_value_9_0= ruleBooleanExpression ) )
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5549:1: (lv_value_9_0= ruleBooleanExpression )
                                    {
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5549:1: (lv_value_9_0= ruleBooleanExpression )
                                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5550:3: lv_value_9_0= ruleBooleanExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getValueBooleanExpressionParserRuleCall_2_3_1_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleDottedExpression9127);
                                    lv_value_9_0=ruleBooleanExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getDottedExpressionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"value",
                                      	        		lv_value_9_0, 
                                      	        		"BooleanExpression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDottedExpression


    // $ANTLR start entryRuleStart
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5580:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5581:2: (iv_ruleStart= ruleStart EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5582:2: iv_ruleStart= ruleStart EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStartRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStart_in_entryRuleStart9168);
            iv_ruleStart=ruleStart();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStart9178); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStart


    // $ANTLR start ruleStart
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5589:1: ruleStart returns [EObject current=null] : (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject this_Null_0 = null;

        EObject this_Output_1 = null;

        EObject this_Input_2 = null;

        EObject this_Args_3 = null;

        EObject this_BooleanConstant_4 = null;

        EObject this_Number_5 = null;

        EObject this_StringConstant_6 = null;

        EObject this_Cast_7 = null;

        EObject this_This_8 = null;

        EObject this_ParameterReference_9 = null;

        EObject this_ConstructorInvocation_10 = null;

        EObject this_NestedExpression_11 = null;

        EObject this_ParameterAssignment_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5594:6: ( (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )
            int alt60=13;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt60=1;
                }
                break;
            case 74:
                {
                alt60=2;
                }
                break;
            case 72:
                {
                alt60=3;
                }
                break;
            case 73:
                {
                alt60=4;
                }
                break;
            case 75:
            case 76:
                {
                alt60=5;
                }
                break;
            case RULE_INT:
                {
                alt60=6;
                }
                break;
            case RULE_STRING:
                {
                alt60=7;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_INT:
                case 25:
                case 28:
                case 66:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt60=12;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA60_13 = input.LA(3);

                    if ( (LA60_13==25||(LA60_13>=65 && LA60_13<=70)) ) {
                        alt60=12;
                    }
                    else if ( (LA60_13==29) ) {
                        int LA60_17 = input.LA(4);

                        if ( (synpred106()) ) {
                            alt60=8;
                        }
                        else if ( (synpred110()) ) {
                            alt60=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )", 60, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )", 60, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    {
                    alt60=8;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )", 60, 8, input);

                    throw nvae;
                }

                }
                break;
            case 77:
                {
                alt60=9;
                }
                break;
            case RULE_ID:
                {
                int LA60_10 = input.LA(2);

                if ( (LA60_10==65) ) {
                    alt60=13;
                }
                else if ( (LA60_10==EOF||LA60_10==14||LA60_10==25||LA60_10==29||LA60_10==38||(LA60_10>=53 && LA60_10<=57)||(LA60_10>=59 && LA60_10<=64)||(LA60_10>=66 && LA60_10<=70)) ) {
                    alt60=10;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )", 60, 10, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                alt60=11;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5595:1: (this_Null_0= ruleNull | this_Output_1= ruleOutput | this_Input_2= ruleInput | this_Args_3= ruleArgs | this_BooleanConstant_4= ruleBooleanConstant | this_Number_5= ruleNumber | this_StringConstant_6= ruleStringConstant | this_Cast_7= ruleCast | this_This_8= ruleThis | this_ParameterReference_9= ruleParameterReference | this_ConstructorInvocation_10= ruleConstructorInvocation | this_NestedExpression_11= ruleNestedExpression | this_ParameterAssignment_12= ruleParameterAssignment )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5596:2: this_Null_0= ruleNull
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getNullParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNull_in_ruleStart9228);
                    this_Null_0=ruleNull();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Null_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5609:2: this_Output_1= ruleOutput
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getOutputParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOutput_in_ruleStart9258);
                    this_Output_1=ruleOutput();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Output_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5622:2: this_Input_2= ruleInput
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getInputParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleStart9288);
                    this_Input_2=ruleInput();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Input_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5635:2: this_Args_3= ruleArgs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getArgsParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArgs_in_ruleStart9318);
                    this_Args_3=ruleArgs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Args_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5648:2: this_BooleanConstant_4= ruleBooleanConstant
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getBooleanConstantParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanConstant_in_ruleStart9348);
                    this_BooleanConstant_4=ruleBooleanConstant();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanConstant_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5661:2: this_Number_5= ruleNumber
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getNumberParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleStart9378);
                    this_Number_5=ruleNumber();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Number_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5674:2: this_StringConstant_6= ruleStringConstant
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getStringConstantParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringConstant_in_ruleStart9408);
                    this_StringConstant_6=ruleStringConstant();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StringConstant_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5687:2: this_Cast_7= ruleCast
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getCastParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCast_in_ruleStart9438);
                    this_Cast_7=ruleCast();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Cast_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5700:2: this_This_8= ruleThis
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getThisParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleThis_in_ruleStart9468);
                    this_This_8=ruleThis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_This_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5713:2: this_ParameterReference_9= ruleParameterReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getParameterReferenceParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterReference_in_ruleStart9498);
                    this_ParameterReference_9=ruleParameterReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParameterReference_9; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5726:2: this_ConstructorInvocation_10= ruleConstructorInvocation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getConstructorInvocationParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstructorInvocation_in_ruleStart9528);
                    this_ConstructorInvocation_10=ruleConstructorInvocation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ConstructorInvocation_10; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5739:2: this_NestedExpression_11= ruleNestedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getNestedExpressionParserRuleCall_11(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpression_in_ruleStart9558);
                    this_NestedExpression_11=ruleNestedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NestedExpression_11; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5752:2: this_ParameterAssignment_12= ruleParameterAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStartAccess().getParameterAssignmentParserRuleCall_12(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterAssignment_in_ruleStart9588);
                    this_ParameterAssignment_12=ruleParameterAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParameterAssignment_12; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStart


    // $ANTLR start entryRuleNull
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5771:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5772:2: (iv_ruleNull= ruleNull EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5773:2: iv_ruleNull= ruleNull EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNull_in_entryRuleNull9623);
            iv_ruleNull=ruleNull();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNull; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNull9633); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNull


    // $ANTLR start ruleNull
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5780:1: ruleNull returns [EObject current=null] : ( (lv_null_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_null_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5785:6: ( ( (lv_null_0_0= 'null' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5786:1: ( (lv_null_0_0= 'null' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5786:1: ( (lv_null_0_0= 'null' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5787:1: (lv_null_0_0= 'null' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5787:1: (lv_null_0_0= 'null' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5788:3: lv_null_0_0= 'null'
            {
            lv_null_0_0=(Token)input.LT(1);
            match(input,71,FollowSets000.FOLLOW_71_in_ruleNull9675); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNullAccess().getNullNullKeyword_0(), "null"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNullRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "null", true, "null", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNull


    // $ANTLR start entryRuleInput
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5815:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5816:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5817:2: iv_ruleInput= ruleInput EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput9723);
            iv_ruleInput=ruleInput();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput9733); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInput


    // $ANTLR start ruleInput
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5824:1: ruleInput returns [EObject current=null] : ( (lv_input_0_0= 'in' ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_input_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5829:6: ( ( (lv_input_0_0= 'in' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5830:1: ( (lv_input_0_0= 'in' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5830:1: ( (lv_input_0_0= 'in' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5831:1: (lv_input_0_0= 'in' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5831:1: (lv_input_0_0= 'in' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5832:3: lv_input_0_0= 'in'
            {
            lv_input_0_0=(Token)input.LT(1);
            match(input,72,FollowSets000.FOLLOW_72_in_ruleInput9775); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputAccess().getInputInKeyword_0(), "input"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "input", true, "in", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInput


    // $ANTLR start entryRuleArgs
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5859:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5860:2: (iv_ruleArgs= ruleArgs EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5861:2: iv_ruleArgs= ruleArgs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArgs_in_entryRuleArgs9823);
            iv_ruleArgs=ruleArgs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgs9833); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgs


    // $ANTLR start ruleArgs
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5868:1: ruleArgs returns [EObject current=null] : ( (lv_args_0_0= 'args' ) ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        Token lv_args_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5873:6: ( ( (lv_args_0_0= 'args' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5874:1: ( (lv_args_0_0= 'args' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5874:1: ( (lv_args_0_0= 'args' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5875:1: (lv_args_0_0= 'args' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5875:1: (lv_args_0_0= 'args' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5876:3: lv_args_0_0= 'args'
            {
            lv_args_0_0=(Token)input.LT(1);
            match(input,73,FollowSets000.FOLLOW_73_in_ruleArgs9875); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArgsAccess().getArgsArgsKeyword_0(), "args"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArgsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "args", true, "args", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgs


    // $ANTLR start entryRuleOutput
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5903:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5904:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5905:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOutput_in_entryRuleOutput9923);
            iv_ruleOutput=ruleOutput();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutput9933); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOutput


    // $ANTLR start ruleOutput
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5912:1: ruleOutput returns [EObject current=null] : ( (lv_output_0_0= 'out' ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_output_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5917:6: ( ( (lv_output_0_0= 'out' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5918:1: ( (lv_output_0_0= 'out' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5918:1: ( (lv_output_0_0= 'out' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5919:1: (lv_output_0_0= 'out' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5919:1: (lv_output_0_0= 'out' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5920:3: lv_output_0_0= 'out'
            {
            lv_output_0_0=(Token)input.LT(1);
            match(input,74,FollowSets000.FOLLOW_74_in_ruleOutput9975); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputAccess().getOutputOutKeyword_0(), "output"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "output", true, "out", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOutput


    // $ANTLR start entryRuleBooleanConstant
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5947:1: entryRuleBooleanConstant returns [EObject current=null] : iv_ruleBooleanConstant= ruleBooleanConstant EOF ;
    public final EObject entryRuleBooleanConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConstant = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5948:2: (iv_ruleBooleanConstant= ruleBooleanConstant EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5949:2: iv_ruleBooleanConstant= ruleBooleanConstant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanConstantRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanConstant_in_entryRuleBooleanConstant10023);
            iv_ruleBooleanConstant=ruleBooleanConstant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanConstant10033); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanConstant


    // $ANTLR start ruleBooleanConstant
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5956:1: ruleBooleanConstant returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5961:6: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5962:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5962:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==75) ) {
                alt61=1;
            }
            else if ( (LA61_0==76) ) {
                alt61=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5962:1: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5962:2: ( (lv_value_0_0= 'true' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5962:2: ( (lv_value_0_0= 'true' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5963:1: (lv_value_0_0= 'true' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5963:1: (lv_value_0_0= 'true' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5964:3: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,75,FollowSets000.FOLLOW_75_in_ruleBooleanConstant10076); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanConstantAccess().getValueTrueKeyword_0_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_0_0, "true", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5984:6: ( (lv_value_1_0= 'false' ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5984:6: ( (lv_value_1_0= 'false' ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5985:1: (lv_value_1_0= 'false' )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5985:1: (lv_value_1_0= 'false' )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5986:3: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,76,FollowSets000.FOLLOW_76_in_ruleBooleanConstant10113); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanConstantAccess().getValueFalseKeyword_1_0(), "value"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBooleanConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_1_0, "false", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanConstant


    // $ANTLR start entryRuleNumber
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6013:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6014:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6015:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber10162);
            iv_ruleNumber=ruleNumber();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber10172); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNumber


    // $ANTLR start ruleNumber
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6022:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6027:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6028:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6028:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6029:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6029:1: (lv_value_0_0= RULE_INT )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6030:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNumber10213); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNumber


    // $ANTLR start entryRuleStringConstant
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6060:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6061:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6062:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringConstantRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringConstant_in_entryRuleStringConstant10253);
            iv_ruleStringConstant=ruleStringConstant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringConstant10263); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringConstant


    // $ANTLR start ruleStringConstant
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6069:1: ruleStringConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6074:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6075:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6075:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6076:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6076:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6077:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringConstant10304); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringConstantRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringConstant


    // $ANTLR start entryRuleThis
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6107:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6108:2: (iv_ruleThis= ruleThis EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6109:2: iv_ruleThis= ruleThis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getThisRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleThis_in_entryRuleThis10344);
            iv_ruleThis=ruleThis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleThis; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleThis10354); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThis


    // $ANTLR start ruleThis
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6116:1: ruleThis returns [EObject current=null] : ( (lv_this_0_0= 'this' ) ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token lv_this_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6121:6: ( ( (lv_this_0_0= 'this' ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6122:1: ( (lv_this_0_0= 'this' ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6122:1: ( (lv_this_0_0= 'this' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6123:1: (lv_this_0_0= 'this' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6123:1: (lv_this_0_0= 'this' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6124:3: lv_this_0_0= 'this'
            {
            lv_this_0_0=(Token)input.LT(1);
            match(input,77,FollowSets000.FOLLOW_77_in_ruleThis10396); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getThisAccess().getThisThisKeyword_0(), "this"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getThisRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "this", true, "this", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleThis


    // $ANTLR start entryRuleParameterReference
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6151:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6152:2: (iv_ruleParameterReference= ruleParameterReference EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6153:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterReference_in_entryRuleParameterReference10444);
            iv_ruleParameterReference=ruleParameterReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterReference10454); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterReference


    // $ANTLR start ruleParameterReference
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6160:1: ruleParameterReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6165:6: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6166:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6166:1: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6167:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6167:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6168:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getParameterReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterReference10500); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0(), "parameter"); 
              	
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterReference


    // $ANTLR start entryRuleConstructorInvocation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6191:1: entryRuleConstructorInvocation returns [EObject current=null] : iv_ruleConstructorInvocation= ruleConstructorInvocation EOF ;
    public final EObject entryRuleConstructorInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorInvocation = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6192:2: (iv_ruleConstructorInvocation= ruleConstructorInvocation EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6193:2: iv_ruleConstructorInvocation= ruleConstructorInvocation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstructorInvocationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructorInvocation_in_entryRuleConstructorInvocation10535);
            iv_ruleConstructorInvocation=ruleConstructorInvocation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstructorInvocation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructorInvocation10545); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstructorInvocation


    // $ANTLR start ruleConstructorInvocation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6200:1: ruleConstructorInvocation returns [EObject current=null] : ( 'new' ( ( RULE_ID ) ) '(' ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )? ')' ) ;
    public final EObject ruleConstructorInvocation() throws RecognitionException {
        EObject current = null;

        EObject lv_argumentList_3_0 = null;

        EObject lv_argumentList_4_0 = null;

        EObject lv_argumentList_6_0 = null;

        EObject lv_argumentList_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6205:6: ( ( 'new' ( ( RULE_ID ) ) '(' ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )? ')' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6206:1: ( 'new' ( ( RULE_ID ) ) '(' ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )? ')' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6206:1: ( 'new' ( ( RULE_ID ) ) '(' ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )? ')' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6206:3: 'new' ( ( RULE_ID ) ) '(' ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )? ')'
            {
            match(input,78,FollowSets000.FOLLOW_78_in_ruleConstructorInvocation10580); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorInvocationAccess().getNewKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6210:1: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6211:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6211:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6212:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getConstructorInvocationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstructorInvocation10602); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getConstructorInvocationAccess().getClassRefClassCrossReference_1_0(), "classRef"); 
              	
            }

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleConstructorInvocation10612); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorInvocationAccess().getLeftParenthesisKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:1: ( ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_INT)||LA65_0==25||LA65_0==28||LA65_0==58||LA65_0==66||(LA65_0>=71 && LA65_0<=78)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:2: ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )* ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:2: ( ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ',' )*
                    loop63:
                    do {
                        int alt63=2;
                        switch ( input.LA(1) ) {
                        case 66:
                            {
                            int LA63_1 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 25:
                            {
                            int LA63_2 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 71:
                            {
                            int LA63_3 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 74:
                            {
                            int LA63_4 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 72:
                            {
                            int LA63_5 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 73:
                            {
                            int LA63_6 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 75:
                            {
                            int LA63_7 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 76:
                            {
                            int LA63_8 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case RULE_INT:
                            {
                            int LA63_9 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA63_10 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 28:
                            {
                            int LA63_11 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 77:
                            {
                            int LA63_12 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA63_13 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 78:
                            {
                            int LA63_14 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;
                        case 58:
                            {
                            int LA63_15 = input.LA(2);

                            if ( (synpred113()) ) {
                                alt63=1;
                            }


                            }
                            break;

                        }

                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) ) ','
                    	    {
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )
                    	    int alt62=2;
                    	    switch ( input.LA(1) ) {
                    	    case 66:
                    	        {
                    	        int LA62_1 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 25:
                    	        {
                    	        int LA62_2 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 71:
                    	        {
                    	        int LA62_3 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 3, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 74:
                    	        {
                    	        int LA62_4 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 4, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 72:
                    	        {
                    	        int LA62_5 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 5, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 73:
                    	        {
                    	        int LA62_6 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 6, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 75:
                    	        {
                    	        int LA62_7 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 7, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 76:
                    	        {
                    	        int LA62_8 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 8, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_INT:
                    	        {
                    	        int LA62_9 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 9, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_STRING:
                    	        {
                    	        int LA62_10 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 10, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        int LA62_11 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 11, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 77:
                    	        {
                    	        int LA62_12 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 12, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA62_13 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 13, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 78:
                    	        {
                    	        int LA62_14 = input.LA(2);

                    	        if ( (synpred112()) ) {
                    	            alt62=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt62=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 14, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 58:
                    	        {
                    	        alt62=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("6231:3: ( ( (lv_argumentList_3_0= ruleExpression ) ) | ( (lv_argumentList_4_0= ruleBooleanExpression ) ) )", 62, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt62) {
                    	        case 1 :
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( (lv_argumentList_3_0= ruleExpression ) )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( (lv_argumentList_3_0= ruleExpression ) )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: (lv_argumentList_3_0= ruleExpression )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: (lv_argumentList_3_0= ruleExpression )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6233:3: lv_argumentList_3_0= ruleExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListExpressionParserRuleCall_3_0_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstructorInvocation10636);
                    	            lv_argumentList_3_0=ruleExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getConstructorInvocationRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"argumentList",
                    	              	        		lv_argumentList_3_0, 
                    	              	        		"Expression", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6256:6: ( (lv_argumentList_4_0= ruleBooleanExpression ) )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6256:6: ( (lv_argumentList_4_0= ruleBooleanExpression ) )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6257:1: (lv_argumentList_4_0= ruleBooleanExpression )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6257:1: (lv_argumentList_4_0= ruleBooleanExpression )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6258:3: lv_argumentList_4_0= ruleBooleanExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListBooleanExpressionParserRuleCall_3_0_0_1_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleConstructorInvocation10663);
                    	            lv_argumentList_4_0=ruleBooleanExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getConstructorInvocationRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"argumentList",
                    	              	        		lv_argumentList_4_0, 
                    	              	        		"BooleanExpression", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleConstructorInvocation10674); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getConstructorInvocationAccess().getCommaKeyword_3_0_1(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )
                    int alt64=2;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        int LA64_1 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                        {
                        int LA64_2 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 71:
                        {
                        int LA64_3 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 74:
                        {
                        int LA64_4 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 72:
                        {
                        int LA64_5 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 73:
                        {
                        int LA64_6 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 75:
                        {
                        int LA64_7 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 76:
                        {
                        int LA64_8 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA64_9 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA64_10 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        int LA64_11 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 77:
                        {
                        int LA64_12 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA64_13 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 78:
                        {
                        int LA64_14 = input.LA(2);

                        if ( (synpred114()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
                        {
                        alt64=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("6284:3: ( ( (lv_argumentList_6_0= ruleExpression ) ) | ( (lv_argumentList_7_0= ruleBooleanExpression ) ) )", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:4: ( (lv_argumentList_6_0= ruleExpression ) )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:4: ( (lv_argumentList_6_0= ruleExpression ) )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6285:1: (lv_argumentList_6_0= ruleExpression )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6285:1: (lv_argumentList_6_0= ruleExpression )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6286:3: lv_argumentList_6_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListExpressionParserRuleCall_3_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstructorInvocation10698);
                            lv_argumentList_6_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getConstructorInvocationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"argumentList",
                              	        		lv_argumentList_6_0, 
                              	        		"Expression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6309:6: ( (lv_argumentList_7_0= ruleBooleanExpression ) )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6309:6: ( (lv_argumentList_7_0= ruleBooleanExpression ) )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6310:1: (lv_argumentList_7_0= ruleBooleanExpression )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6310:1: (lv_argumentList_7_0= ruleBooleanExpression )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6311:3: lv_argumentList_7_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListBooleanExpressionParserRuleCall_3_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleConstructorInvocation10725);
                            lv_argumentList_7_0=ruleBooleanExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getConstructorInvocationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"argumentList",
                              	        		lv_argumentList_7_0, 
                              	        		"BooleanExpression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleConstructorInvocation10738); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorInvocationAccess().getRightParenthesisKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstructorInvocation


    // $ANTLR start entryRuleCast
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6345:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6346:2: (iv_ruleCast= ruleCast EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6347:2: iv_ruleCast= ruleCast EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCastRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCast_in_entryRuleCast10774);
            iv_ruleCast=ruleCast();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCast; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCast10784); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCast


    // $ANTLR start ruleCast
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6354:1: ruleCast returns [EObject current=null] : ( '(' ( (lv_type_1_0= ruleType ) ) ')' ( (lv_start_3_0= ruleStart ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_start_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6359:6: ( ( '(' ( (lv_type_1_0= ruleType ) ) ')' ( (lv_start_3_0= ruleStart ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6360:1: ( '(' ( (lv_type_1_0= ruleType ) ) ')' ( (lv_start_3_0= ruleStart ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6360:1: ( '(' ( (lv_type_1_0= ruleType ) ) ')' ( (lv_start_3_0= ruleStart ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6360:3: '(' ( (lv_type_1_0= ruleType ) ) ')' ( (lv_start_3_0= ruleStart ) )
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleCast10819); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6364:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6365:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6365:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6366:3: lv_type_1_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCastAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleCast10840);
            lv_type_1_0=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCastRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"Type", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleCast10850); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCastAccess().getRightParenthesisKeyword_2(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6392:1: ( (lv_start_3_0= ruleStart ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6393:1: (lv_start_3_0= ruleStart )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6393:1: (lv_start_3_0= ruleStart )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6394:3: lv_start_3_0= ruleStart
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCastAccess().getStartStartParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStart_in_ruleCast10871);
            lv_start_3_0=ruleStart();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCastRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"start",
              	        		lv_start_3_0, 
              	        		"Start", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCast


    // $ANTLR start entryRuleNestedExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6424:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6425:2: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6426:2: iv_ruleNestedExpression= ruleNestedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNestedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpression_in_entryRuleNestedExpression10907);
            iv_ruleNestedExpression=ruleNestedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNestedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpression10917); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedExpression


    // $ANTLR start ruleNestedExpression
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6433:1: ruleNestedExpression returns [EObject current=null] : ( '(' ( (lv_expression_1_0= ruleExpression ) ) ')' ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6438:6: ( ( '(' ( (lv_expression_1_0= ruleExpression ) ) ')' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6439:1: ( '(' ( (lv_expression_1_0= ruleExpression ) ) ')' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6439:1: ( '(' ( (lv_expression_1_0= ruleExpression ) ) ')' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6439:3: '(' ( (lv_expression_1_0= ruleExpression ) ) ')'
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleNestedExpression10952); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedExpressionAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6443:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6444:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6444:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6445:3: lv_expression_1_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNestedExpressionAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleNestedExpression10973);
            lv_expression_1_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNestedExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_1_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleNestedExpression10983); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNestedExpressionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedExpression


    // $ANTLR start entryRuleMessage
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6479:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6480:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6481:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMessageRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMessage_in_entryRuleMessage11019);
            iv_ruleMessage=ruleMessage();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessage11029); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6488:1: ruleMessage returns [EObject current=null] : (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_MethodInvocation_0 = null;

        EObject this_FieldAccess_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6493:6: ( (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6494:1: (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6494:1: (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==28) ) {
                    alt66=1;
                }
                else if ( (LA66_1==EOF||LA66_1==14||LA66_1==25||LA66_1==29||LA66_1==38||(LA66_1>=53 && LA66_1<=57)||(LA66_1>=59 && LA66_1<=64)||(LA66_1>=66 && LA66_1<=70)) ) {
                    alt66=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6494:1: (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess )", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6494:1: (this_MethodInvocation_0= ruleMethodInvocation | this_FieldAccess_1= ruleFieldAccess )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6495:2: this_MethodInvocation_0= ruleMethodInvocation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMessageAccess().getMethodInvocationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMethodInvocation_in_ruleMessage11079);
                    this_MethodInvocation_0=ruleMethodInvocation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MethodInvocation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6508:2: this_FieldAccess_1= ruleFieldAccess
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMessageAccess().getFieldAccessParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFieldAccess_in_ruleMessage11109);
                    this_FieldAccess_1=ruleFieldAccess();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FieldAccess_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleMethodInvocation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6527:1: entryRuleMethodInvocation returns [EObject current=null] : iv_ruleMethodInvocation= ruleMethodInvocation EOF ;
    public final EObject entryRuleMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodInvocation = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6528:2: (iv_ruleMethodInvocation= ruleMethodInvocation EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6529:2: iv_ruleMethodInvocation= ruleMethodInvocation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMethodInvocationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation11144);
            iv_ruleMethodInvocation=ruleMethodInvocation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMethodInvocation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodInvocation11154); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMethodInvocation


    // $ANTLR start ruleMethodInvocation
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6536:1: ruleMethodInvocation returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )? ')' ) ;
    public final EObject ruleMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject lv_argumentList_2_0 = null;

        EObject lv_argumentList_3_0 = null;

        EObject lv_argumentList_5_0 = null;

        EObject lv_argumentList_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6541:6: ( ( ( ( RULE_ID ) ) '(' ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )? ')' ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6542:1: ( ( ( RULE_ID ) ) '(' ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )? ')' )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6542:1: ( ( ( RULE_ID ) ) '(' ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )? ')' )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6542:2: ( ( RULE_ID ) ) '(' ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )? ')'
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6542:2: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6543:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6543:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6544:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getMethodInvocationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodInvocation11201); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getMethodInvocationAccess().getMethodMethodNameCrossReference_0_0(), "method"); 
              	
            }

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleMethodInvocation11211); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMethodInvocationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:1: ( ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_INT)||LA70_0==25||LA70_0==28||LA70_0==58||LA70_0==66||(LA70_0>=71 && LA70_0<=78)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) ) ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )*
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )
                    int alt67=2;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        int LA67_1 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                        {
                        int LA67_2 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 71:
                        {
                        int LA67_3 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 74:
                        {
                        int LA67_4 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 72:
                        {
                        int LA67_5 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 73:
                        {
                        int LA67_6 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 75:
                        {
                        int LA67_7 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 76:
                        {
                        int LA67_8 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA67_9 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA67_10 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                        {
                        int LA67_11 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 77:
                        {
                        int LA67_12 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA67_13 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 78:
                        {
                        int LA67_14 = input.LA(2);

                        if ( (synpred117()) ) {
                            alt67=1;
                        }
                        else if ( (true) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
                        {
                        alt67=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("6563:2: ( ( (lv_argumentList_2_0= ruleExpression ) ) | ( (lv_argumentList_3_0= ruleBooleanExpression ) ) )", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:3: ( (lv_argumentList_2_0= ruleExpression ) )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:3: ( (lv_argumentList_2_0= ruleExpression ) )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6564:1: (lv_argumentList_2_0= ruleExpression )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6564:1: (lv_argumentList_2_0= ruleExpression )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6565:3: lv_argumentList_2_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListExpressionParserRuleCall_2_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodInvocation11234);
                            lv_argumentList_2_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getMethodInvocationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"argumentList",
                              	        		lv_argumentList_2_0, 
                              	        		"Expression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6588:6: ( (lv_argumentList_3_0= ruleBooleanExpression ) )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6588:6: ( (lv_argumentList_3_0= ruleBooleanExpression ) )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6589:1: (lv_argumentList_3_0= ruleBooleanExpression )
                            {
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6589:1: (lv_argumentList_3_0= ruleBooleanExpression )
                            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6590:3: lv_argumentList_3_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListBooleanExpressionParserRuleCall_2_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleMethodInvocation11261);
                            lv_argumentList_3_0=ruleBooleanExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getMethodInvocationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"argumentList",
                              	        		lv_argumentList_3_0, 
                              	        		"BooleanExpression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6612:3: ( ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6612:5: ',' ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )
                    	    {
                    	    match(input,14,FollowSets000.FOLLOW_14_in_ruleMethodInvocation11273); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getMethodInvocationAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )
                    	    int alt68=2;
                    	    switch ( input.LA(1) ) {
                    	    case 66:
                    	        {
                    	        int LA68_1 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 1, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 25:
                    	        {
                    	        int LA68_2 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 71:
                    	        {
                    	        int LA68_3 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 3, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 74:
                    	        {
                    	        int LA68_4 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 4, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 72:
                    	        {
                    	        int LA68_5 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 5, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 73:
                    	        {
                    	        int LA68_6 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 6, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 75:
                    	        {
                    	        int LA68_7 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 7, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 76:
                    	        {
                    	        int LA68_8 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 8, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_INT:
                    	        {
                    	        int LA68_9 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 9, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_STRING:
                    	        {
                    	        int LA68_10 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 10, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 28:
                    	        {
                    	        int LA68_11 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 11, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 77:
                    	        {
                    	        int LA68_12 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 12, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA68_13 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 13, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 78:
                    	        {
                    	        int LA68_14 = input.LA(2);

                    	        if ( (synpred118()) ) {
                    	            alt68=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt68=2;
                    	        }
                    	        else {
                    	            if (backtracking>0) {failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 14, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 58:
                    	        {
                    	        alt68=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("6616:1: ( ( (lv_argumentList_5_0= ruleExpression ) ) | ( (lv_argumentList_6_0= ruleBooleanExpression ) ) )", 68, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt68) {
                    	        case 1 :
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:2: ( (lv_argumentList_5_0= ruleExpression ) )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:2: ( (lv_argumentList_5_0= ruleExpression ) )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6617:1: (lv_argumentList_5_0= ruleExpression )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6617:1: (lv_argumentList_5_0= ruleExpression )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6618:3: lv_argumentList_5_0= ruleExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListExpressionParserRuleCall_2_1_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleMethodInvocation11295);
                    	            lv_argumentList_5_0=ruleExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getMethodInvocationRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"argumentList",
                    	              	        		lv_argumentList_5_0, 
                    	              	        		"Expression", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6641:6: ( (lv_argumentList_6_0= ruleBooleanExpression ) )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6641:6: ( (lv_argumentList_6_0= ruleBooleanExpression ) )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6642:1: (lv_argumentList_6_0= ruleBooleanExpression )
                    	            {
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6642:1: (lv_argumentList_6_0= ruleBooleanExpression )
                    	            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6643:3: lv_argumentList_6_0= ruleBooleanExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListBooleanExpressionParserRuleCall_2_1_1_1_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleMethodInvocation11322);
                    	            lv_argumentList_6_0=ruleBooleanExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getMethodInvocationRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"argumentList",
                    	              	        		lv_argumentList_6_0, 
                    	              	        		"BooleanExpression", 
                    	              	        		currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleMethodInvocation11337); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMethodInvocationAccess().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMethodInvocation


    // $ANTLR start entryRuleFieldAccess
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6677:1: entryRuleFieldAccess returns [EObject current=null] : iv_ruleFieldAccess= ruleFieldAccess EOF ;
    public final EObject entryRuleFieldAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAccess = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6678:2: (iv_ruleFieldAccess= ruleFieldAccess EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6679:2: iv_ruleFieldAccess= ruleFieldAccess EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFieldAccessRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldAccess_in_entryRuleFieldAccess11373);
            iv_ruleFieldAccess=ruleFieldAccess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFieldAccess; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldAccess11383); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFieldAccess


    // $ANTLR start ruleFieldAccess
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6686:1: ruleFieldAccess returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleFieldAccess() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6691:6: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6692:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6692:1: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6693:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6693:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6694:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getFieldAccessRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldAccess11429); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getFieldAccessAccess().getFieldFieldNameCrossReference_0(), "field"); 
              	
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFieldAccess


    // $ANTLR start entryRuleParameterAssignment
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6717:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6718:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6719:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterAssignmentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment11464);
            iv_ruleParameterAssignment=ruleParameterAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterAssignment11474); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterAssignment


    // $ANTLR start ruleParameterAssignment
    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6726:1: ruleParameterAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6731:6: ( ( ( ( RULE_ID ) ) '=' ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6732:1: ( ( ( RULE_ID ) ) '=' ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6732:1: ( ( ( RULE_ID ) ) '=' ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6732:2: ( ( RULE_ID ) ) '=' ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6732:2: ( ( RULE_ID ) )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6733:1: ( RULE_ID )
            {
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6733:1: ( RULE_ID )
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6734:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getParameterAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterAssignment11521); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getParameterAssignmentAccess().getParameterParameterCrossReference_0_0(), "parameter"); 
              	
            }

            }


            }

            match(input,65,FollowSets000.FOLLOW_65_in_ruleParameterAssignment11531); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )
            int alt71=2;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA71_1 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 1, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA71_2 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                int LA71_3 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 3, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                int LA71_4 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 4, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA71_5 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 5, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA71_6 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 6, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                int LA71_7 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 7, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                int LA71_8 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 8, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA71_9 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 9, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA71_10 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 10, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA71_11 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 11, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA71_12 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 12, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA71_13 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 13, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                int LA71_14 = input.LA(2);

                if ( (synpred121()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 14, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt71=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6753:1: ( ( (lv_value_2_0= ruleExpression ) ) | ( (lv_value_3_0= ruleBooleanExpression ) ) )", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:2: ( (lv_value_2_0= ruleExpression ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:2: ( (lv_value_2_0= ruleExpression ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6754:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6754:1: (lv_value_2_0= ruleExpression )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6755:3: lv_value_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameterAssignment11553);
                    lv_value_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_2_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6778:6: ( (lv_value_3_0= ruleBooleanExpression ) )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6778:6: ( (lv_value_3_0= ruleBooleanExpression ) )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6779:1: (lv_value_3_0= ruleBooleanExpression )
                    {
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6779:1: (lv_value_3_0= ruleBooleanExpression )
                    // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6780:3: lv_value_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleParameterAssignment11580);
                    lv_value_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_3_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterAssignment

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:3: ( ( ( ruleBooleanOperator ) ) ( ( ruleAtomicBooleanExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:3: ( ( ruleBooleanOperator ) ) ( ( ruleAtomicBooleanExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4368:3: ( ( ruleBooleanOperator ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4369:1: ( ruleBooleanOperator )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4369:1: ( ruleBooleanOperator )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4370:3: ruleBooleanOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanOperatorListBooleanOperatorParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanOperator_in_synpred737263);
        ruleBooleanOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4392:2: ( ( ruleAtomicBooleanExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4393:1: ( ruleAtomicBooleanExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4393:1: ( ruleAtomicBooleanExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4394:3: ruleAtomicBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getAtomicListAtomicBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleAtomicBooleanExpression_in_synpred737284);
        ruleAtomicBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4572:2: ( ruleSimpleComparation )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4572:2: ruleSimpleComparation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleSimpleComparation_in_synpred787632);
        ruleSimpleComparation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:3: ( ( ( ruleCompareOperator ) ) ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:3: ( ( ruleCompareOperator ) ) ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4664:3: ( ( ruleCompareOperator ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4665:1: ( ruleCompareOperator )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4665:1: ( ruleCompareOperator )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4666:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSimpleComparationAccess().getCompareCompareOperatorParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred807807);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4688:2: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4689:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4689:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4690:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSimpleComparationAccess().getRightExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred807828);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:2: ( ( () ( ( ruleType ) ) ( ( RULE_ID ) ) '=' ( ( ruleExpression ) ) ';' ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:2: ( () ( ( ruleType ) ) ( ( RULE_ID ) ) '=' ( ( ruleExpression ) ) ';' )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:2: ( () ( ( ruleType ) ) ( ( RULE_ID ) ) '=' ( ( ruleExpression ) ) ';' )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:3: () ( ( ruleType ) ) ( ( RULE_ID ) ) '=' ( ( ruleExpression ) ) ';'
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4965:3: ()
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4966:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4979:2: ( ( ruleType ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4980:1: ( ruleType )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4980:1: ( ruleType )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:4981:3: ruleType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getTypeTypeParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleType_in_synpred878366);
        ruleType();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5003:2: ( ( RULE_ID ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5004:1: ( RULE_ID )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5004:1: ( RULE_ID )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5005:3: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred878383); if (failed) return ;

        }


        }

        match(input,65,FollowSets000.FOLLOW_65_in_synpred878398); if (failed) return ;
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5031:1: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5032:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5032:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5033:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getLocalParameterAccess().getValueExpressionParserRuleCall_0_4_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred878419);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,38,FollowSets000.FOLLOW_38_in_synpred878429); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:3: ( ( ( ( '+' | '-' | '*' | '/' | '%' ) ) ) ( ( ruleDottedExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:3: ( ( ( '+' | '-' | '*' | '/' | '%' ) ) ) ( ( ruleDottedExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5258:3: ( ( ( '+' | '-' | '*' | '/' | '%' ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5259:1: ( ( '+' | '-' | '*' | '/' | '%' ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5259:1: ( ( '+' | '-' | '*' | '/' | '%' ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5260:1: ( '+' | '-' | '*' | '/' | '%' )
        {
        if ( input.LA(1)==25||(input.LA(1)>=66 && input.LA(1)<=69) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FollowSets000.FOLLOW_set_in_synpred948723);    throw mse;
        }


        }


        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5354:2: ( ( ruleDottedExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5355:1: ( ruleDottedExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5355:1: ( ruleDottedExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5356:3: ruleDottedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTermListDottedExpressionParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDottedExpression_in_synpred948883);
        ruleDottedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:3: ( () '.' ( ( ruleMessage ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:3: () '.' ( ( ruleMessage ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5425:3: ()
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5426:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        match(input,70,FollowSets000.FOLLOW_70_in_synpred959000); if (failed) return ;
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5448:1: ( ( ruleMessage ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5449:1: ( ruleMessage )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5449:1: ( ruleMessage )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5450:3: ruleMessage
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getMessageMessageParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleMessage_in_synpred959021);
        ruleMessage();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5525:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getValueExpressionParserRuleCall_2_3_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred969100);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:5: ( () '.' ( ( ruleFieldAccess ) ) ( '=' ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) ) )? )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:5: () '.' ( ( ruleFieldAccess ) ) ( '=' ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) ) )?
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5472:5: ()
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5473:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        match(input,70,FollowSets000.FOLLOW_70_in_synpred989046); if (failed) return ;
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5495:1: ( ( ruleFieldAccess ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5496:1: ( ruleFieldAccess )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5496:1: ( ruleFieldAccess )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5497:3: ruleFieldAccess
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getMessageFieldAccessParserRuleCall_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleFieldAccess_in_synpred989067);
        ruleFieldAccess();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5519:2: ( '=' ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) ) )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==65) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5519:4: '=' ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )
                {
                match(input,65,FollowSets000.FOLLOW_65_in_synpred989078); if (failed) return ;
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )
                int alt83=2;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    int LA83_1 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 1, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    int LA83_2 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 71:
                    {
                    int LA83_3 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 74:
                    {
                    int LA83_4 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 72:
                    {
                    int LA83_5 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 73:
                    {
                    int LA83_6 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 75:
                    {
                    int LA83_7 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 76:
                    {
                    int LA83_8 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA83_9 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA83_10 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA83_11 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 77:
                    {
                    int LA83_12 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA83_13 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 78:
                    {
                    int LA83_14 = input.LA(2);

                    if ( (synpred96()) ) {
                        alt83=1;
                    }
                    else if ( (true) ) {
                        alt83=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    alt83=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("5523:1: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 83, 0, input);

                    throw nvae;
                }

                switch (alt83) {
                    case 1 :
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( ( ruleExpression ) )
                        {
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5523:2: ( ( ruleExpression ) )
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: ( ruleExpression )
                        {
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5524:1: ( ruleExpression )
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5525:3: ruleExpression
                        {
                        if ( backtracking==0 ) {
                           
                          	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getValueExpressionParserRuleCall_2_3_1_0_0(), currentNode); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred989100);
                        ruleExpression();
                        _fsp--;
                        if (failed) return ;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5548:6: ( ( ruleBooleanExpression ) )
                        {
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5548:6: ( ( ruleBooleanExpression ) )
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5549:1: ( ruleBooleanExpression )
                        {
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5549:1: ( ruleBooleanExpression )
                        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5550:3: ruleBooleanExpression
                        {
                        if ( backtracking==0 ) {
                           
                          	        currentNode=createCompositeNode(grammarAccess.getDottedExpressionAccess().getValueBooleanExpressionParserRuleCall_2_3_1_1_0(), currentNode); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred989127);
                        ruleBooleanExpression();
                        _fsp--;
                        if (failed) return ;

                        }


                        }


                        }
                        break;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5687:2: ( ruleCast )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5687:2: ruleCast
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCast_in_synpred1069438);
        ruleCast();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred110
    public final void synpred110_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5739:2: ( ruleNestedExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:5739:2: ruleNestedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNestedExpression_in_synpred1109558);
        ruleNestedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred110

    // $ANTLR start synpred112
    public final void synpred112_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6233:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListExpressionParserRuleCall_3_0_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred11210636);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred112

    // $ANTLR start synpred113
    public final void synpred113_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:3: ( ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) ) ',' )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) ) ','
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )
        int alt85=2;
        switch ( input.LA(1) ) {
        case 66:
            {
            int LA85_1 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 1, input);

                throw nvae;
            }
            }
            break;
        case 25:
            {
            int LA85_2 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 2, input);

                throw nvae;
            }
            }
            break;
        case 71:
            {
            int LA85_3 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 3, input);

                throw nvae;
            }
            }
            break;
        case 74:
            {
            int LA85_4 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 4, input);

                throw nvae;
            }
            }
            break;
        case 72:
            {
            int LA85_5 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 5, input);

                throw nvae;
            }
            }
            break;
        case 73:
            {
            int LA85_6 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 6, input);

                throw nvae;
            }
            }
            break;
        case 75:
            {
            int LA85_7 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 7, input);

                throw nvae;
            }
            }
            break;
        case 76:
            {
            int LA85_8 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 8, input);

                throw nvae;
            }
            }
            break;
        case RULE_INT:
            {
            int LA85_9 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 9, input);

                throw nvae;
            }
            }
            break;
        case RULE_STRING:
            {
            int LA85_10 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 10, input);

                throw nvae;
            }
            }
            break;
        case 28:
            {
            int LA85_11 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 11, input);

                throw nvae;
            }
            }
            break;
        case 77:
            {
            int LA85_12 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 12, input);

                throw nvae;
            }
            }
            break;
        case RULE_ID:
            {
            int LA85_13 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 13, input);

                throw nvae;
            }
            }
            break;
        case 78:
            {
            int LA85_14 = input.LA(2);

            if ( (synpred112()) ) {
                alt85=1;
            }
            else if ( (true) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 14, input);

                throw nvae;
            }
            }
            break;
        case 58:
            {
            alt85=2;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("6231:3: ( ( ( ruleExpression ) ) | ( ( ruleBooleanExpression ) ) )", 85, 0, input);

            throw nvae;
        }

        switch (alt85) {
            case 1 :
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( ( ruleExpression ) )
                {
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6231:4: ( ( ruleExpression ) )
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: ( ruleExpression )
                {
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6232:1: ( ruleExpression )
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6233:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListExpressionParserRuleCall_3_0_0_0_0(), currentNode); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred11310636);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6256:6: ( ( ruleBooleanExpression ) )
                {
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6256:6: ( ( ruleBooleanExpression ) )
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6257:1: ( ruleBooleanExpression )
                {
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6257:1: ( ruleBooleanExpression )
                // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6258:3: ruleBooleanExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListBooleanExpressionParserRuleCall_3_0_0_1_0(), currentNode); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred11310663);
                ruleBooleanExpression();
                _fsp--;
                if (failed) return ;

                }


                }


                }
                break;

        }

        match(input,14,FollowSets000.FOLLOW_14_in_synpred11310674); if (failed) return ;

        }
    }
    // $ANTLR end synpred113

    // $ANTLR start synpred114
    public final void synpred114_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:4: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:4: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6284:4: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6285:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6285:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6286:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getConstructorInvocationAccess().getArgumentListExpressionParserRuleCall_3_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred11410698);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred114

    // $ANTLR start synpred117
    public final void synpred117_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:3: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:3: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6563:3: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6564:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6564:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6565:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListExpressionParserRuleCall_2_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred11711234);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred117

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:2: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:2: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6616:2: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6617:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6617:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6618:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMethodInvocationAccess().getArgumentListExpressionParserRuleCall_2_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred11811295);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred118

    // $ANTLR start synpred121
    public final void synpred121_fragment() throws RecognitionException {   
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:2: ( ( ( ruleExpression ) ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:2: ( ( ruleExpression ) )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6753:2: ( ( ruleExpression ) )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6754:1: ( ruleExpression )
        {
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6754:1: ( ruleExpression )
        // ../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g:6755:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpression_in_synpred12111553);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred121

    public final boolean synpred117() {
        backtracking++;
        int start = input.mark();
        try {
            synpred117_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred118() {
        backtracking++;
        int start = input.mark();
        try {
            synpred118_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred113() {
        backtracking++;
        int start = input.mark();
        try {
            synpred113_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred114() {
        backtracking++;
        int start = input.mark();
        try {
            synpred114_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred73() {
        backtracking++;
        int start = input.mark();
        try {
            synpred73_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred112() {
        backtracking++;
        int start = input.mark();
        try {
            synpred112_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred110() {
        backtracking++;
        int start = input.mark();
        try {
            synpred110_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred121() {
        backtracking++;
        int start = input.mark();
        try {
            synpred121_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred106() {
        backtracking++;
        int start = input.mark();
        try {
            synpred106_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\47\uffff";
    static final String DFA29_eofS =
        "\47\uffff";
    static final String DFA29_minS =
        "\13\5\1\uffff\2\34\1\5\1\uffff\11\5\1\17\1\16\1\uffff\12\5\1\16";
    static final String DFA29_maxS =
        "\1\61\12\5\1\uffff\1\46\1\34\1\60\1\uffff\11\5\1\46\1\35\1\uffff"+
        "\1\60\11\5\1\35";
    static final String DFA29_acceptS =
        "\13\uffff\1\3\3\uffff\1\1\13\uffff\1\2\13\uffff";
    static final String DFA29_specialS =
        "\47\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\41\uffff\1\13\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\15",
            "",
            "\1\16\11\uffff\1\17",
            "\1\16",
            "\1\20\27\uffff\1\31\13\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30",
            "",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\13\26\uffff\1\33",
            "\1\34\16\uffff\1\31",
            "",
            "\1\35\43\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\34\16\uffff\1\31"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2435:1: (this_RequiredField_0= ruleRequiredField | this_RequiredMethod_1= ruleRequiredMethod | this_ProvidedMethod_2= ruleProvidedMethod )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFile_in_entryRuleFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleFile137 = new BitSet(new long[]{0x00000000011A1802L});
        public static final BitSet FOLLOW_ruleElement_in_ruleFile159 = new BitSet(new long[]{0x00000000011A1002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleImport241 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterface_in_ruleElement359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecord_in_ruleElement389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrait_in_ruleElement419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_ruleElement449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProgram_in_ruleElement479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterface524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleInterface567 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterface597 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleInterface613 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterface635 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInterface646 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterface668 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleInterface682 = new BitSet(new long[]{0x0003FE0000010020L});
        public static final BitSet FOLLOW_ruleRequiredMethod_in_ruleInterface703 = new BitSet(new long[]{0x0003FE0000010020L});
        public static final BitSet FOLLOW_16_in_ruleInterface714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecord760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRecord803 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRecord833 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRecord848 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleRecordExpression_in_ruleRecord869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrait_in_entryRuleTrait905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrait915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTrait958 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTrait988 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTrait1003 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleTraitExpression_in_ruleTrait1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1060 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleClass1113 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClass1143 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleClass1158 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClass1180 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleClass1191 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClass1213 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleClass1225 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleRecordExpression_in_ruleClass1246 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleClass1256 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleTraitExpression_in_ruleClass1277 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleClass1287 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_ruleConstructor_in_ruleClass1308 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_16_in_ruleClass1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram1355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProgram1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleProgram1408 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleProgram1438 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProgram1453 = new BitSet(new long[]{0x0015FE0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleProgram1474 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProgram1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression1520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseRecord_in_ruleRecordExpression1576 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRecordExpression1587 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleBaseRecord_in_ruleRecordExpression1608 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleBaseRecord_in_entryRuleBaseRecord1646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBaseRecord1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonimousRecord_in_ruleBaseRecord1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordName_in_ruleBaseRecord1736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedRecordExpression_in_ruleBaseRecord1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonimousRecord_in_entryRuleAnonimousRecord1801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonimousRecord1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAnonimousRecord1846 = new BitSet(new long[]{0x0001FE3000010020L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleAnonimousRecord1879 = new BitSet(new long[]{0x0001FE3000010020L});
        public static final BitSet FOLLOW_16_in_ruleAnonimousRecord1890 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleAnonimousRecord1901 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleAnonimousRecord1922 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleAnonimousRecord1933 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleAnonimousRecord1954 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleAnonimousRecord1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordName_in_entryRuleRecordName2004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordName2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRecordName2061 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRecordName2072 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleRecordName2093 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleRecordName2104 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleRecordName2125 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleRecordName2137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedRecordExpression_in_entryRuleNestedRecordExpression2175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedRecordExpression2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNestedRecordExpression2220 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleRecordExpression_in_ruleNestedRecordExpression2241 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleNestedRecordExpression2251 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNestedRecordExpression2262 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleNestedRecordExpression2283 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleNestedRecordExpression2294 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_ruleNestedRecordExpression2315 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleNestedRecordExpression2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordOperation_in_entryRuleRecordOperation2365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordOperation2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRecordOperation2423 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRecordOperation2445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRecordOperation2487 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRecordOperation2497 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleRecordOperation2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRecordOperation2560 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRecordOperation2570 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleRecordOperation2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraitExpression_in_entryRuleTraitExpression2628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraitExpression2638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseTrait_in_ruleTraitExpression2684 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleTraitExpression2695 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleBaseTrait_in_ruleTraitExpression2716 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleBaseTrait_in_entryRuleBaseTrait2754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBaseTrait2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonimousTrait_in_ruleBaseTrait2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraitName_in_ruleBaseTrait2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedTraitExpression_in_ruleBaseTrait2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonimousTrait_in_entryRuleAnonimousTrait2909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonimousTrait2919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAnonimousTrait2954 = new BitSet(new long[]{0x0003FE8000010020L});
        public static final BitSet FOLLOW_ruleTraitElement_in_ruleAnonimousTrait2987 = new BitSet(new long[]{0x0003FE8000010020L});
        public static final BitSet FOLLOW_16_in_ruleAnonimousTrait2998 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleAnonimousTrait3009 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleAnonimousTrait3030 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleAnonimousTrait3041 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleAnonimousTrait3062 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleAnonimousTrait3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraitName_in_entryRuleTraitName3112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraitName3122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitName3169 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleTraitName3180 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleTraitName3201 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleTraitName3212 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleTraitName3233 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleTraitName3245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedTraitExpression_in_entryRuleNestedTraitExpression3283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedTraitExpression3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNestedTraitExpression3328 = new BitSet(new long[]{0x0000000010008020L});
        public static final BitSet FOLLOW_ruleTraitExpression_in_ruleNestedTraitExpression3349 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleNestedTraitExpression3359 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleNestedTraitExpression3370 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleNestedTraitExpression3391 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_14_in_ruleNestedTraitExpression3402 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_ruleNestedTraitExpression3423 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_27_in_ruleNestedTraitExpression3435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraitOperation_in_entryRuleTraitOperation3473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraitOperation3483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTraitOperation3531 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3595 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleTraitOperation3605 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMethodName_in_ruleTraitOperation3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3668 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTraitOperation3678 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMethodName_in_ruleTraitOperation3699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3741 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTraitOperation3751 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMethodName_in_ruleTraitOperation3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3814 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleTraitOperation3824 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleTraitOperation3845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTraitOperation3887 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTraitOperation3897 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleTraitOperation3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTraitElement_in_entryRuleTraitElement3955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTraitElement3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredField_in_ruleTraitElement4015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredMethod_in_ruleTraitElement4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProvidedMethod_in_ruleTraitElement4075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration4110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDeclaration4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFieldDeclaration4176 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_37_in_ruleFieldDeclaration4213 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_ruleType_in_ruleFieldDeclaration4249 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleFieldDeclaration4270 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleFieldDeclaration4280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredField_in_entryRuleRequiredField4316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredField4326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_ruleRequiredField4384 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldName_in_ruleRequiredField4405 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRequiredField4415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredMethod_in_entryRuleRequiredMethod4451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredMethod4461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnType_in_ruleRequiredMethod4519 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMethodName_in_ruleRequiredMethod4540 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRequiredMethod4550 = new BitSet(new long[]{0x0001FE0020000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRequiredMethod4572 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_14_in_ruleRequiredMethod4583 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRequiredMethod4604 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_29_in_ruleRequiredMethod4618 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRequiredMethod4628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProvidedMethod_in_entryRuleProvidedMethod4664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProvidedMethod4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleProvidedMethod4729 = new BitSet(new long[]{0x0003FE0000000020L});
        public static final BitSet FOLLOW_ruleReturnType_in_ruleProvidedMethod4764 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMethodName_in_ruleProvidedMethod4785 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleProvidedMethod4795 = new BitSet(new long[]{0x0001FE0020000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleProvidedMethod4817 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_14_in_ruleProvidedMethod4828 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleProvidedMethod4849 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_29_in_ruleProvidedMethod4863 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProvidedMethod4873 = new BitSet(new long[]{0x0015FF0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleProvidedMethod4894 = new BitSet(new long[]{0x0000010000010000L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_ruleProvidedMethod4915 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProvidedMethod4926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor4962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructor4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor5014 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleConstructor5029 = new BitSet(new long[]{0x0001FE0020000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor5051 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_14_in_ruleConstructor5062 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor5083 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_29_in_ruleConstructor5097 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConstructor5107 = new BitSet(new long[]{0x0015FE0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleConstructor5128 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConstructor5138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement5184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleReturnStatement5219 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement5240 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleReturnStatement5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter5296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_ruleParameter5354 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameter5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName5412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldName5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldName5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName5503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodName5513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodName5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType5594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType5604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleType5651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleType5675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleType5712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleType5749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleType5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleType5823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleType5860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleType5897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleType5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType5983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnType5993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReturnType6040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleReturnType6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleReturnType6101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleReturnType6138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleReturnType6175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleReturnType6212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleReturnType6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleReturnType6286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleReturnType6323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleReturnType6360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock6409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock6419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalParameter_in_ruleBlock6477 = new BitSet(new long[]{0x0015FE0012000072L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleStatement_in_ruleBlock6499 = new BitSet(new long[]{0x0014000012000072L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement6536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatement6546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleStatement6596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseStatement_in_ruleStatement6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement6656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement6691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStatement6701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStatement6747 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleExpressionStatement6757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseStatement_in_entryRuleIfThenElseStatement6793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElseStatement6803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleIfThenElseStatement6838 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleIfThenElseStatement6848 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleIfThenElseStatement6869 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleIfThenElseStatement6879 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIfThenElseStatement6889 = new BitSet(new long[]{0x0015FE0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfThenElseStatement6910 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfThenElseStatement6920 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_ruleIfThenElseStatement6931 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIfThenElseStatement6941 = new BitSet(new long[]{0x0015FE0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfThenElseStatement6962 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfThenElseStatement6972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement7010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement7020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleWhileStatement7055 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleWhileStatement7065 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleWhileStatement7086 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleWhileStatement7096 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWhileStatement7106 = new BitSet(new long[]{0x0015FE0012010070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileStatement7127 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWhileStatement7137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression7173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression7183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicBooleanExpression_in_ruleBooleanExpression7241 = new BitSet(new long[]{0x03E0000000000002L});
        public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleBooleanExpression7263 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleAtomicBooleanExpression_in_ruleBooleanExpression7284 = new BitSet(new long[]{0x03E0000000000002L});
        public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator7322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator7332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleBooleanOperator7375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleBooleanOperator7412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleBooleanOperator7449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleBooleanOperator7486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleBooleanOperator7523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicBooleanExpression_in_entryRuleAtomicBooleanExpression7572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicBooleanExpression7582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleComparation_in_ruleAtomicBooleanExpression7632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedBooleanExpression_in_ruleAtomicBooleanExpression7662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleComparation_in_entryRuleSimpleComparation7697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleComparation7707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleSimpleComparation7750 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleComparation7785 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleSimpleComparation7807 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSimpleComparation7828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedBooleanExpression_in_entryRuleNestedBooleanExpression7866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedBooleanExpression7876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleNestedBooleanExpression7919 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleNestedBooleanExpression7943 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNestedBooleanExpression7964 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleNestedBooleanExpression7974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_entryRuleCompareOperator8010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperator8020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleCompareOperator8063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCompareOperator8100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCompareOperator8137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCompareOperator8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCompareOperator8211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCompareOperator8248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalParameter_in_entryRuleLocalParameter8297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalParameter8307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_ruleLocalParameter8366 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalParameter8383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleLocalParameter8398 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLocalParameter8419 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleLocalParameter8429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_ruleLocalParameter8470 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalParameter8487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleLocalParameter8502 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleLocalParameter8523 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleLocalParameter8533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression8570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleExpression8636 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_25_in_ruleExpression8673 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_ruleDottedExpression_in_ruleExpression8709 = new BitSet(new long[]{0x0000000002000002L,0x000000000000003CL});
        public static final BitSet FOLLOW_25_in_ruleExpression8730 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_66_in_ruleExpression8759 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_67_in_ruleExpression8788 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_68_in_ruleExpression8817 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_69_in_ruleExpression8846 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_ruleDottedExpression_in_ruleExpression8883 = new BitSet(new long[]{0x0000000002000002L,0x000000000000003CL});
        public static final BitSet FOLLOW_ruleDottedExpression_in_entryRuleDottedExpression8921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDottedExpression8931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStart_in_ruleDottedExpression8977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleDottedExpression9000 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMessage_in_ruleDottedExpression9021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleDottedExpression9046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldAccess_in_ruleDottedExpression9067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleDottedExpression9078 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDottedExpression9100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDottedExpression9127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStart_in_entryRuleStart9168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStart9178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNull_in_ruleStart9228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutput_in_ruleStart9258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_ruleStart9288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgs_in_ruleStart9318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanConstant_in_ruleStart9348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleStart9378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringConstant_in_ruleStart9408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCast_in_ruleStart9438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThis_in_ruleStart9468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterReference_in_ruleStart9498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorInvocation_in_ruleStart9528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpression_in_ruleStart9558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleStart9588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNull_in_entryRuleNull9623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNull9633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleNull9675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput9723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput9733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleInput9775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgs_in_entryRuleArgs9823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgs9833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleArgs9875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput9923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutput9933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleOutput9975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanConstant_in_entryRuleBooleanConstant10023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanConstant10033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleBooleanConstant10076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleBooleanConstant10113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber10172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant10253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant10263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant10304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThis_in_entryRuleThis10344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleThis10354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleThis10396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterReference_in_entryRuleParameterReference10444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterReference10454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterReference10500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorInvocation_in_entryRuleConstructorInvocation10535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructorInvocation10545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleConstructorInvocation10580 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstructorInvocation10602 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleConstructorInvocation10612 = new BitSet(new long[]{0x0400000032000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorInvocation10636 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleConstructorInvocation10663 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstructorInvocation10674 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstructorInvocation10698 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleConstructorInvocation10725 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleConstructorInvocation10738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCast_in_entryRuleCast10774 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCast10784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCast10819 = new BitSet(new long[]{0x0001FE0000000020L});
        public static final BitSet FOLLOW_ruleType_in_ruleCast10840 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleCast10850 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_ruleStart_in_ruleCast10871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpression_in_entryRuleNestedExpression10907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpression10917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNestedExpression10952 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleNestedExpression10973 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleNestedExpression10983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage11019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessage11029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleMessage11079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldAccess_in_ruleMessage11109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation11144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodInvocation11154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodInvocation11201 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMethodInvocation11211 = new BitSet(new long[]{0x0400000032000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodInvocation11234 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleMethodInvocation11261 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_14_in_ruleMethodInvocation11273 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleMethodInvocation11295 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleMethodInvocation11322 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_29_in_ruleMethodInvocation11337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldAccess_in_entryRuleFieldAccess11373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccess11383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAccess11429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment11464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment11474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterAssignment11521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleParameterAssignment11531 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameterAssignment11553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleParameterAssignment11580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanOperator_in_synpred737263 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleAtomicBooleanExpression_in_synpred737284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleComparation_in_synpred787632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred807807 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred807828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_synpred878366 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred878383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred878398 = new BitSet(new long[]{0x0000000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred878419 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_synpred878429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_set_in_synpred948723 = new BitSet(new long[]{0x0000000010000070L,0x0000000000007F80L});
        public static final BitSet FOLLOW_ruleDottedExpression_in_synpred948883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_synpred959000 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMessage_in_synpred959021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred969100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_synpred989046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFieldAccess_in_synpred989067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred989078 = new BitSet(new long[]{0x0400000012000070L,0x0000000000007F84L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred989100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred989127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCast_in_synpred1069438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpression_in_synpred1109558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred11210636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred11310636 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred11310663 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_synpred11310674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred11410698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred11711234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred11811295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_synpred12111553 = new BitSet(new long[]{0x0000000000000002L});
    }


}