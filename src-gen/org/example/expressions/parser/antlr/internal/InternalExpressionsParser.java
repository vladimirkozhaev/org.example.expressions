package org.example.expressions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'+'", "'-'", "'*'", "'/'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ExpressionsModel";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpressionsModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:67:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:68:2: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:69:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
            {
             newCompositeNode(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel75);
            iv_ruleExpressionsModel=ruleExpressionsModel();

            state._fsp--;

             current =iv_ruleExpressionsModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionsModel85); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:76:1: ruleExpressionsModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleExpressionsModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionsModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:115:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:118:28: ( (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=12 && LA2_1<=15)||(LA2_1>=23 && LA2_1<=24)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=23 && LA2_0<=24)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:120:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleAbstractElement223);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:130:5: this_Expression_1= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractElement250);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:147:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:148:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable285);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable295); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:155:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:158:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVariable354); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:181:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:183:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable375);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:207:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:208:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:209:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression411);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression421); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:216:1: ruleExpression returns [EObject current=null] : this_PlusOrMinus_0= rulePlusOrMinus ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOrMinus_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:219:28: (this_PlusOrMinus_0= rulePlusOrMinus )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:221:5: this_PlusOrMinus_0= rulePlusOrMinus
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleExpression467);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:237:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:238:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:239:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus501);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus511); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:246:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:249:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:250:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:250:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:251:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus558);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==12) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==13) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:3: ( () otherlv_2= '+' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:4: () otherlv_2= '+'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:4: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:260:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePlusOrMinus581); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:6: ( () otherlv_4= '-' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:7: () otherlv_4= '-'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:7: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:271:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePlusOrMinus610); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:280:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:281:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:281:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:282:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus633);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MulOrDiv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:306:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:308:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv671);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv681); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:315:1: ruleMulOrDiv returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:318:28: ( (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:319:1: (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:319:1: (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:320:5: this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_ruleMulOrDiv728);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:1: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:2: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:2: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:3: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:3: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:329:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:334:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:335:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:335:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:336:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:336:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==14) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==15) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:337:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,14,FOLLOW_14_in_ruleMulOrDiv758); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:349:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,15,FOLLOW_15_in_ruleMulOrDiv787); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:364:3: ( (lv_right_3_0= ruleAtomic ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:365:1: (lv_right_3_0= ruleAtomic )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:365:1: (lv_right_3_0= ruleAtomic )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:366:3: lv_right_3_0= ruleAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomic_in_ruleMulOrDiv825);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Atomic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleAnd"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:392:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:393:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:394:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd865);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd875); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:401:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:404:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:405:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:405:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:406:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd922);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:414:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:414:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:414:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:415:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAnd943); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:424:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:425:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:425:1: (lv_right_3_0= ruleEquality )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:426:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd964);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Equality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:450:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:451:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:452:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1002);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1012); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:459:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:462:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:463:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:463:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:464:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality1059);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:472:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:472:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:472:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:473:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:478:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:479:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:479:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:480:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:480:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==17) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==18) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:481:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,17,FOLLOW_17_in_ruleEquality1088); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:493:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,18,FOLLOW_18_in_ruleEquality1117); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:508:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:509:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:509:1: (lv_right_3_0= ruleComparison )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:510:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality1154);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:534:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:535:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:536:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1192);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1202); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:543:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:546:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:547:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:547:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:548:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1249);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:556:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:556:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:556:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:557:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:562:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:563:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:563:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:564:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:564:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:565:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,19,FOLLOW_19_in_ruleComparison1278); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:577:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,20,FOLLOW_20_in_ruleComparison1307); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:589:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,21,FOLLOW_21_in_ruleComparison1336); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:601:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,22,FOLLOW_22_in_ruleComparison1365); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:616:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:617:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:617:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:618:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1402);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PlusOrMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:642:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:643:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:644:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1440);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1450); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:651:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:654:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case 23:
            case 24:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:655:3: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:656:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:661:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:662:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:662:1: (lv_value_1_0= RULE_INT )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:663:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic1502); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:680:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:680:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:680:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:680:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:681:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:686:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:687:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:687:1: (lv_value_3_0= RULE_STRING )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:688:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1541); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:705:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:705:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:705:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:705:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:706:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:712:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:712:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:713:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:713:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==24) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:714:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomic1583); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:726:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,24,FOLLOW_24_in_ruleAtomic1612); 

                                    newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:742:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:742:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:742:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:742:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:743:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:748:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:749:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:749:1: (otherlv_7= RULE_ID )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:750:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1665); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionsModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExpressionsModel130 = new BitSet(new long[]{0x0000000001800072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVariable354 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleExpression467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus558 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_rulePlusOrMinus581 = new BitSet(new long[]{0x0000000001803070L});
    public static final BitSet FOLLOW_13_in_rulePlusOrMinus610 = new BitSet(new long[]{0x0000000001803070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus633 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleMulOrDiv728 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleMulOrDiv758 = new BitSet(new long[]{0x000000000180C070L});
    public static final BitSet FOLLOW_15_in_ruleMulOrDiv787 = new BitSet(new long[]{0x000000000180C070L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleMulOrDiv825 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd922 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnd943 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd964 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1059 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleEquality1088 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_18_in_ruleEquality1117 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality1154 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1249 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_19_in_ruleComparison1278 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_20_in_ruleComparison1307 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_21_in_ruleComparison1336 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_22_in_ruleComparison1365 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1402 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtomic1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomic1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1665 = new BitSet(new long[]{0x0000000000000002L});

}