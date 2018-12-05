package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_STRING", "RULE_COMMENT_1", "RULE_COMMENT_2", "RULE_INT", "RULE_EXPONENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'.'", "'program'", "'('", "')'", "';'", "'unit'", "'implementation'", "'uses'", "'label'", "','", "'const'", "'='", "'chr'", "'+'", "'-'", "'true'", "'false'", "'type'", "'function'", "':'", "'procedure'", "'..'", "'Char'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'packed'", "'['", "']'", "'record'", "'end'", "'case'", "'of'", "'^'", "'var'", "':='", "'@'", "'(.'", "'.)'", "'or'", "'xor'", "'*'", "'/'", "'div'", "'mod'", "'and'", "'<>'", "'not'", "'nil'", "'goto'", "'begin'", "'repeat'", "'until'", "'with'", "'do'"
    };
    public static final int T__50=50;
    public static final int RULE_COMMENT_2=9;
    public static final int RULE_COMMENT_1=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_NUM_REAL=6;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_EXPONENT=11;
    public static final int RULE_NUM_INT=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "toBegin";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuletoBegin"
    // InternalPascal.g:64:1: entryRuletoBegin returns [EObject current=null] : iv_ruletoBegin= ruletoBegin EOF ;
    public final EObject entryRuletoBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletoBegin = null;


        try {
            // InternalPascal.g:64:48: (iv_ruletoBegin= ruletoBegin EOF )
            // InternalPascal.g:65:2: iv_ruletoBegin= ruletoBegin EOF
            {
             newCompositeNode(grammarAccess.getToBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletoBegin=ruletoBegin();

            state._fsp--;

             current =iv_ruletoBegin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletoBegin"


    // $ANTLR start "ruletoBegin"
    // InternalPascal.g:71:1: ruletoBegin returns [EObject current=null] : ( (lv_elements_0_0= ruleprogramStart ) )? ;
    public final EObject ruletoBegin() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_elements_0_0= ruleprogramStart ) )? )
            // InternalPascal.g:78:2: ( (lv_elements_0_0= ruleprogramStart ) )?
            {
            // InternalPascal.g:78:2: ( (lv_elements_0_0= ruleprogramStart ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19||LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:79:3: (lv_elements_0_0= ruleprogramStart )
                    {
                    // InternalPascal.g:79:3: (lv_elements_0_0= ruleprogramStart )
                    // InternalPascal.g:80:4: lv_elements_0_0= ruleprogramStart
                    {

                    				newCompositeNode(grammarAccess.getToBeginAccess().getElementsProgramStartParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleprogramStart();

                    state._fsp--;


                    				if (current==null) {
                    					current = createModelElementForParent(grammarAccess.getToBeginRule());
                    				}
                    				set(
                    					current,
                    					"elements",
                    					lv_elements_0_0,
                    					"org.xtext.example.mydsl.Pascal.programStart");
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruletoBegin"


    // $ANTLR start "entryRuleprogramStart"
    // InternalPascal.g:100:1: entryRuleprogramStart returns [EObject current=null] : iv_ruleprogramStart= ruleprogramStart EOF ;
    public final EObject entryRuleprogramStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogramStart = null;


        try {
            // InternalPascal.g:100:53: (iv_ruleprogramStart= ruleprogramStart EOF )
            // InternalPascal.g:101:2: iv_ruleprogramStart= ruleprogramStart EOF
            {
             newCompositeNode(grammarAccess.getProgramStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogramStart=ruleprogramStart();

            state._fsp--;

             current =iv_ruleprogramStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogramStart"


    // $ANTLR start "ruleprogramStart"
    // InternalPascal.g:107:1: ruleprogramStart returns [EObject current=null] : ( ( (lv_programHeading_0_0= ruleprogramHeading ) ) ( (lv_interface_1_0= 'interface' ) )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' ) ;
    public final EObject ruleprogramStart() throws RecognitionException {
        EObject current = null;

        Token lv_interface_1_0=null;
        Token otherlv_3=null;
        EObject lv_programHeading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_programHeading_0_0= ruleprogramHeading ) ) ( (lv_interface_1_0= 'interface' ) )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_programHeading_0_0= ruleprogramHeading ) ) ( (lv_interface_1_0= 'interface' ) )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_programHeading_0_0= ruleprogramHeading ) ) ( (lv_interface_1_0= 'interface' ) )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.' )
            // InternalPascal.g:115:3: ( (lv_programHeading_0_0= ruleprogramHeading ) ) ( (lv_interface_1_0= 'interface' ) )? ( (lv_block_2_0= ruleblock ) ) otherlv_3= '.'
            {
            // InternalPascal.g:115:3: ( (lv_programHeading_0_0= ruleprogramHeading ) )
            // InternalPascal.g:116:4: (lv_programHeading_0_0= ruleprogramHeading )
            {
            // InternalPascal.g:116:4: (lv_programHeading_0_0= ruleprogramHeading )
            // InternalPascal.g:117:5: lv_programHeading_0_0= ruleprogramHeading
            {

            					newCompositeNode(grammarAccess.getProgramStartAccess().getProgramHeadingProgramHeadingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_programHeading_0_0=ruleprogramHeading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramStartRule());
            					}
            					set(
            						current,
            						"programHeading",
            						lv_programHeading_0_0,
            						"org.xtext.example.mydsl.Pascal.programHeading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:134:3: ( (lv_interface_1_0= 'interface' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:135:4: (lv_interface_1_0= 'interface' )
                    {
                    // InternalPascal.g:135:4: (lv_interface_1_0= 'interface' )
                    // InternalPascal.g:136:5: lv_interface_1_0= 'interface'
                    {
                    lv_interface_1_0=(Token)match(input,17,FOLLOW_3); 

                    					newLeafNode(lv_interface_1_0, grammarAccess.getProgramStartAccess().getInterfaceInterfaceKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProgramStartRule());
                    					}
                    					setWithLastConsumed(current, "interface", lv_interface_1_0, "interface");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:148:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:149:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:149:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:150:5: lv_block_2_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramStartAccess().getBlockBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_2_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramStartRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_2_0,
            						"org.xtext.example.mydsl.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramStartAccess().getFullStopKeyword_3());
            		

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
    // $ANTLR end "ruleprogramStart"


    // $ANTLR start "entryRuleprogramHeading"
    // InternalPascal.g:175:1: entryRuleprogramHeading returns [EObject current=null] : iv_ruleprogramHeading= ruleprogramHeading EOF ;
    public final EObject entryRuleprogramHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogramHeading = null;


        try {
            // InternalPascal.g:175:55: (iv_ruleprogramHeading= ruleprogramHeading EOF )
            // InternalPascal.g:176:2: iv_ruleprogramHeading= ruleprogramHeading EOF
            {
             newCompositeNode(grammarAccess.getProgramHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogramHeading=ruleprogramHeading();

            state._fsp--;

             current =iv_ruleprogramHeading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogramHeading"


    // $ANTLR start "ruleprogramHeading"
    // InternalPascal.g:182:1: ruleprogramHeading returns [EObject current=null] : ( (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) | ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleprogramHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_identifier1_1_0 = null;

        EObject lv_identifierList_3_0 = null;

        EObject lv_identifier2_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:188:2: ( ( (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) | ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' ) ) )
            // InternalPascal.g:189:2: ( (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) | ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' ) )
            {
            // InternalPascal.g:189:2: ( (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' ) | ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:190:3: (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' )
                    {
                    // InternalPascal.g:190:3: (otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';' )
                    // InternalPascal.g:191:4: otherlv_0= 'program' ( (lv_identifier1_1_0= ruleidentifier ) ) (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )? otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getProgramHeadingAccess().getProgramKeyword_0_0());
                    			
                    // InternalPascal.g:195:4: ( (lv_identifier1_1_0= ruleidentifier ) )
                    // InternalPascal.g:196:5: (lv_identifier1_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:196:5: (lv_identifier1_1_0= ruleidentifier )
                    // InternalPascal.g:197:6: lv_identifier1_1_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getProgramHeadingAccess().getIdentifier1IdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_identifier1_1_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramHeadingRule());
                    						}
                    						set(
                    							current,
                    							"identifier1",
                    							lv_identifier1_1_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:214:4: (otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==20) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPascal.g:215:5: otherlv_2= '(' ( (lv_identifierList_3_0= ruleidentifierList ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getProgramHeadingAccess().getLeftParenthesisKeyword_0_2_0());
                            				
                            // InternalPascal.g:219:5: ( (lv_identifierList_3_0= ruleidentifierList ) )
                            // InternalPascal.g:220:6: (lv_identifierList_3_0= ruleidentifierList )
                            {
                            // InternalPascal.g:220:6: (lv_identifierList_3_0= ruleidentifierList )
                            // InternalPascal.g:221:7: lv_identifierList_3_0= ruleidentifierList
                            {

                            							newCompositeNode(grammarAccess.getProgramHeadingAccess().getIdentifierListIdentifierListParserRuleCall_0_2_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_identifierList_3_0=ruleidentifierList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getProgramHeadingRule());
                            							}
                            							add(
                            								current,
                            								"identifierList",
                            								lv_identifierList_3_0,
                            								"org.xtext.example.mydsl.Pascal.identifierList");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,21,FOLLOW_8); 

                            					newLeafNode(otherlv_4, grammarAccess.getProgramHeadingAccess().getRightParenthesisKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getProgramHeadingAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:249:3: ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' )
                    {
                    // InternalPascal.g:249:3: ( () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';' )
                    // InternalPascal.g:250:4: () otherlv_7= 'unit' ( (lv_identifier2_8_0= ruleidentifier ) ) otherlv_9= ';'
                    {
                    // InternalPascal.g:250:4: ()
                    // InternalPascal.g:251:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getProgramHeadingAccess().getProgramHeadingAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getProgramHeadingAccess().getUnitKeyword_1_1());
                    			
                    // InternalPascal.g:261:4: ( (lv_identifier2_8_0= ruleidentifier ) )
                    // InternalPascal.g:262:5: (lv_identifier2_8_0= ruleidentifier )
                    {
                    // InternalPascal.g:262:5: (lv_identifier2_8_0= ruleidentifier )
                    // InternalPascal.g:263:6: lv_identifier2_8_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getProgramHeadingAccess().getIdentifier2IdentifierParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_identifier2_8_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramHeadingRule());
                    						}
                    						set(
                    							current,
                    							"identifier2",
                    							lv_identifier2_8_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getProgramHeadingAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "ruleprogramHeading"


    // $ANTLR start "entryRuleidentifier"
    // InternalPascal.g:289:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascal.g:289:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascal.g:290:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalPascal.g:296:1: ruleidentifier returns [EObject current=null] : ( (lv_identifier_0_0= RULE_IDENT ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:302:2: ( ( (lv_identifier_0_0= RULE_IDENT ) ) )
            // InternalPascal.g:303:2: ( (lv_identifier_0_0= RULE_IDENT ) )
            {
            // InternalPascal.g:303:2: ( (lv_identifier_0_0= RULE_IDENT ) )
            // InternalPascal.g:304:3: (lv_identifier_0_0= RULE_IDENT )
            {
            // InternalPascal.g:304:3: (lv_identifier_0_0= RULE_IDENT )
            // InternalPascal.g:305:4: lv_identifier_0_0= RULE_IDENT
            {
            lv_identifier_0_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getIdentifierAccess().getIdentifierIDENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentifierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"org.xtext.example.mydsl.Pascal.IDENT");
            			

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:324:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:324:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:325:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:331:1: ruleblock returns [EObject current=null] : ( ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )* ( (lv_compoundStatement_7_0= rulecompoundStatement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        Token lv_ImplemeTerminal_6_0=null;
        EObject lv_labelDeclarationPart_0_0 = null;

        EObject lv_constantDefinitionPart_1_0 = null;

        EObject lv_typeDefinitionPart_2_0 = null;

        EObject lv_variableDeclarationPart_3_0 = null;

        EObject lv_procedureAndFunctionDeclarationPart_4_0 = null;

        EObject lv_usesUnitsPart_5_0 = null;

        EObject lv_compoundStatement_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:337:2: ( ( ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )* ( (lv_compoundStatement_7_0= rulecompoundStatement ) ) ) )
            // InternalPascal.g:338:2: ( ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )* ( (lv_compoundStatement_7_0= rulecompoundStatement ) ) )
            {
            // InternalPascal.g:338:2: ( ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )* ( (lv_compoundStatement_7_0= rulecompoundStatement ) ) )
            // InternalPascal.g:339:3: ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )* ( (lv_compoundStatement_7_0= rulecompoundStatement ) )
            {
            // InternalPascal.g:339:3: ( ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) ) | ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) ) | ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) ) | ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) ) | ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) ) | ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) ) | ( (lv_ImplemeTerminal_6_0= 'implementation' ) ) )*
            loop5:
            do {
                int alt5=8;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                    {
                    alt5=2;
                    }
                    break;
                case 35:
                    {
                    alt5=3;
                    }
                    break;
                case 53:
                    {
                    alt5=4;
                    }
                    break;
                case 36:
                case 38:
                    {
                    alt5=5;
                    }
                    break;
                case 25:
                    {
                    alt5=6;
                    }
                    break;
                case 24:
                    {
                    alt5=7;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalPascal.g:340:4: ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) )
            	    {
            	    // InternalPascal.g:340:4: ( (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart ) )
            	    // InternalPascal.g:341:5: (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart )
            	    {
            	    // InternalPascal.g:341:5: (lv_labelDeclarationPart_0_0= rulelabelDeclarationPart )
            	    // InternalPascal.g:342:6: lv_labelDeclarationPart_0_0= rulelabelDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getLabelDeclarationPartLabelDeclarationPartParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_labelDeclarationPart_0_0=rulelabelDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labelDeclarationPart",
            	    							lv_labelDeclarationPart_0_0,
            	    							"org.xtext.example.mydsl.Pascal.labelDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:360:4: ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) )
            	    {
            	    // InternalPascal.g:360:4: ( (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart ) )
            	    // InternalPascal.g:361:5: (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart )
            	    {
            	    // InternalPascal.g:361:5: (lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart )
            	    // InternalPascal.g:362:6: lv_constantDefinitionPart_1_0= ruleconstantDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getConstantDefinitionPartConstantDefinitionPartParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_constantDefinitionPart_1_0=ruleconstantDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantDefinitionPart",
            	    							lv_constantDefinitionPart_1_0,
            	    							"org.xtext.example.mydsl.Pascal.constantDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:380:4: ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) )
            	    {
            	    // InternalPascal.g:380:4: ( (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart ) )
            	    // InternalPascal.g:381:5: (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart )
            	    {
            	    // InternalPascal.g:381:5: (lv_typeDefinitionPart_2_0= ruletypeDefinitionPart )
            	    // InternalPascal.g:382:6: lv_typeDefinitionPart_2_0= ruletypeDefinitionPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getTypeDefinitionPartTypeDefinitionPartParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_typeDefinitionPart_2_0=ruletypeDefinitionPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefinitionPart",
            	    							lv_typeDefinitionPart_2_0,
            	    							"org.xtext.example.mydsl.Pascal.typeDefinitionPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:400:4: ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) )
            	    {
            	    // InternalPascal.g:400:4: ( (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart ) )
            	    // InternalPascal.g:401:5: (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart )
            	    {
            	    // InternalPascal.g:401:5: (lv_variableDeclarationPart_3_0= rulevariableDeclarationPart )
            	    // InternalPascal.g:402:6: lv_variableDeclarationPart_3_0= rulevariableDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getVariableDeclarationPartVariableDeclarationPartParserRuleCall_0_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_variableDeclarationPart_3_0=rulevariableDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDeclarationPart",
            	    							lv_variableDeclarationPart_3_0,
            	    							"org.xtext.example.mydsl.Pascal.variableDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPascal.g:420:4: ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    {
            	    // InternalPascal.g:420:4: ( (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart ) )
            	    // InternalPascal.g:421:5: (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart )
            	    {
            	    // InternalPascal.g:421:5: (lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart )
            	    // InternalPascal.g:422:6: lv_procedureAndFunctionDeclarationPart_4_0= ruleprocedureAndFunctionDeclarationPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getProcedureAndFunctionDeclarationPartProcedureAndFunctionDeclarationPartParserRuleCall_0_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_procedureAndFunctionDeclarationPart_4_0=ruleprocedureAndFunctionDeclarationPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procedureAndFunctionDeclarationPart",
            	    							lv_procedureAndFunctionDeclarationPart_4_0,
            	    							"org.xtext.example.mydsl.Pascal.procedureAndFunctionDeclarationPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPascal.g:440:4: ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) )
            	    {
            	    // InternalPascal.g:440:4: ( (lv_usesUnitsPart_5_0= ruleusesUnitsPart ) )
            	    // InternalPascal.g:441:5: (lv_usesUnitsPart_5_0= ruleusesUnitsPart )
            	    {
            	    // InternalPascal.g:441:5: (lv_usesUnitsPart_5_0= ruleusesUnitsPart )
            	    // InternalPascal.g:442:6: lv_usesUnitsPart_5_0= ruleusesUnitsPart
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getUsesUnitsPartUsesUnitsPartParserRuleCall_0_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_usesUnitsPart_5_0=ruleusesUnitsPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"usesUnitsPart",
            	    							lv_usesUnitsPart_5_0,
            	    							"org.xtext.example.mydsl.Pascal.usesUnitsPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalPascal.g:460:4: ( (lv_ImplemeTerminal_6_0= 'implementation' ) )
            	    {
            	    // InternalPascal.g:460:4: ( (lv_ImplemeTerminal_6_0= 'implementation' ) )
            	    // InternalPascal.g:461:5: (lv_ImplemeTerminal_6_0= 'implementation' )
            	    {
            	    // InternalPascal.g:461:5: (lv_ImplemeTerminal_6_0= 'implementation' )
            	    // InternalPascal.g:462:6: lv_ImplemeTerminal_6_0= 'implementation'
            	    {
            	    lv_ImplemeTerminal_6_0=(Token)match(input,24,FOLLOW_3); 

            	    						newLeafNode(lv_ImplemeTerminal_6_0, grammarAccess.getBlockAccess().getImplemeTerminalImplementationKeyword_0_6_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBlockRule());
            	    						}
            	    						addWithLastConsumed(current, "ImplemeTerminal", lv_ImplemeTerminal_6_0, "implementation");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPascal.g:475:3: ( (lv_compoundStatement_7_0= rulecompoundStatement ) )
            // InternalPascal.g:476:4: (lv_compoundStatement_7_0= rulecompoundStatement )
            {
            // InternalPascal.g:476:4: (lv_compoundStatement_7_0= rulecompoundStatement )
            // InternalPascal.g:477:5: lv_compoundStatement_7_0= rulecompoundStatement
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getCompoundStatementCompoundStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_compoundStatement_7_0=rulecompoundStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"compoundStatement",
            						lv_compoundStatement_7_0,
            						"org.xtext.example.mydsl.Pascal.compoundStatement");
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuleusesUnitsPart"
    // InternalPascal.g:498:1: entryRuleusesUnitsPart returns [EObject current=null] : iv_ruleusesUnitsPart= ruleusesUnitsPart EOF ;
    public final EObject entryRuleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusesUnitsPart = null;


        try {
            // InternalPascal.g:498:54: (iv_ruleusesUnitsPart= ruleusesUnitsPart EOF )
            // InternalPascal.g:499:2: iv_ruleusesUnitsPart= ruleusesUnitsPart EOF
            {
             newCompositeNode(grammarAccess.getUsesUnitsPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusesUnitsPart=ruleusesUnitsPart();

            state._fsp--;

             current =iv_ruleusesUnitsPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleusesUnitsPart"


    // $ANTLR start "ruleusesUnitsPart"
    // InternalPascal.g:505:1: ruleusesUnitsPart returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) ;
    public final EObject ruleusesUnitsPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:511:2: ( (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' ) )
            // InternalPascal.g:512:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:512:2: (otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';' )
            // InternalPascal.g:513:3: otherlv_0= 'uses' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesUnitsPartAccess().getUsesKeyword_0());
            		
            // InternalPascal.g:517:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:518:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:518:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:519:5: lv_identifierList_1_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getUsesUnitsPartAccess().getIdentifierListIdentifierListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_identifierList_1_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsesUnitsPartRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_1_0,
            						"org.xtext.example.mydsl.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getUsesUnitsPartAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleusesUnitsPart"


    // $ANTLR start "entryRulelabelDeclarationPart"
    // InternalPascal.g:544:1: entryRulelabelDeclarationPart returns [EObject current=null] : iv_rulelabelDeclarationPart= rulelabelDeclarationPart EOF ;
    public final EObject entryRulelabelDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabelDeclarationPart = null;


        try {
            // InternalPascal.g:544:61: (iv_rulelabelDeclarationPart= rulelabelDeclarationPart EOF )
            // InternalPascal.g:545:2: iv_rulelabelDeclarationPart= rulelabelDeclarationPart EOF
            {
             newCompositeNode(grammarAccess.getLabelDeclarationPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabelDeclarationPart=rulelabelDeclarationPart();

            state._fsp--;

             current =iv_rulelabelDeclarationPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabelDeclarationPart"


    // $ANTLR start "rulelabelDeclarationPart"
    // InternalPascal.g:551:1: rulelabelDeclarationPart returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labelStart1_1_0= rulelabelStart ) ) ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabelDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_commaTerminal_2_0=null;
        Token otherlv_4=null;
        EObject lv_labelStart1_1_0 = null;

        EObject lv_labelStart2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:557:2: ( (otherlv_0= 'label' ( (lv_labelStart1_1_0= rulelabelStart ) ) ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:558:2: (otherlv_0= 'label' ( (lv_labelStart1_1_0= rulelabelStart ) ) ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:558:2: (otherlv_0= 'label' ( (lv_labelStart1_1_0= rulelabelStart ) ) ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )* otherlv_4= ';' )
            // InternalPascal.g:559:3: otherlv_0= 'label' ( (lv_labelStart1_1_0= rulelabelStart ) ) ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelDeclarationPartAccess().getLabelKeyword_0());
            		
            // InternalPascal.g:563:3: ( (lv_labelStart1_1_0= rulelabelStart ) )
            // InternalPascal.g:564:4: (lv_labelStart1_1_0= rulelabelStart )
            {
            // InternalPascal.g:564:4: (lv_labelStart1_1_0= rulelabelStart )
            // InternalPascal.g:565:5: lv_labelStart1_1_0= rulelabelStart
            {

            					newCompositeNode(grammarAccess.getLabelDeclarationPartAccess().getLabelStart1LabelStartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_labelStart1_1_0=rulelabelStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelDeclarationPartRule());
            					}
            					set(
            						current,
            						"labelStart1",
            						lv_labelStart1_1_0,
            						"org.xtext.example.mydsl.Pascal.labelStart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:582:3: ( ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:583:4: ( (lv_commaTerminal_2_0= ',' ) ) ( (lv_labelStart2_3_0= rulelabelStart ) )
            	    {
            	    // InternalPascal.g:583:4: ( (lv_commaTerminal_2_0= ',' ) )
            	    // InternalPascal.g:584:5: (lv_commaTerminal_2_0= ',' )
            	    {
            	    // InternalPascal.g:584:5: (lv_commaTerminal_2_0= ',' )
            	    // InternalPascal.g:585:6: lv_commaTerminal_2_0= ','
            	    {
            	    lv_commaTerminal_2_0=(Token)match(input,27,FOLLOW_9); 

            	    						newLeafNode(lv_commaTerminal_2_0, grammarAccess.getLabelDeclarationPartAccess().getCommaTerminalCommaKeyword_2_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLabelDeclarationPartRule());
            	    						}
            	    						addWithLastConsumed(current, "commaTerminal", lv_commaTerminal_2_0, ",");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:597:4: ( (lv_labelStart2_3_0= rulelabelStart ) )
            	    // InternalPascal.g:598:5: (lv_labelStart2_3_0= rulelabelStart )
            	    {
            	    // InternalPascal.g:598:5: (lv_labelStart2_3_0= rulelabelStart )
            	    // InternalPascal.g:599:6: lv_labelStart2_3_0= rulelabelStart
            	    {

            	    						newCompositeNode(grammarAccess.getLabelDeclarationPartAccess().getLabelStart2LabelStartParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_labelStart2_3_0=rulelabelStart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabelDeclarationPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labelStart2",
            	    							lv_labelStart2_3_0,
            	    							"org.xtext.example.mydsl.Pascal.labelStart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabelDeclarationPartAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulelabelDeclarationPart"


    // $ANTLR start "entryRulelabelStart"
    // InternalPascal.g:625:1: entryRulelabelStart returns [EObject current=null] : iv_rulelabelStart= rulelabelStart EOF ;
    public final EObject entryRulelabelStart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabelStart = null;


        try {
            // InternalPascal.g:625:51: (iv_rulelabelStart= rulelabelStart EOF )
            // InternalPascal.g:626:2: iv_rulelabelStart= rulelabelStart EOF
            {
             newCompositeNode(grammarAccess.getLabelStartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabelStart=rulelabelStart();

            state._fsp--;

             current =iv_rulelabelStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabelStart"


    // $ANTLR start "rulelabelStart"
    // InternalPascal.g:632:1: rulelabelStart returns [EObject current=null] : ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) ;
    public final EObject rulelabelStart() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:638:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) )
            // InternalPascal.g:639:2: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
            {
            // InternalPascal.g:639:2: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
            // InternalPascal.g:640:3: (lv_unsignedInteger_0_0= ruleunsignedInteger )
            {
            // InternalPascal.g:640:3: (lv_unsignedInteger_0_0= ruleunsignedInteger )
            // InternalPascal.g:641:4: lv_unsignedInteger_0_0= ruleunsignedInteger
            {

            				newCompositeNode(grammarAccess.getLabelStartAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_unsignedInteger_0_0=ruleunsignedInteger();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLabelStartRule());
            				}
            				set(
            					current,
            					"unsignedInteger",
            					lv_unsignedInteger_0_0,
            					"org.xtext.example.mydsl.Pascal.unsignedInteger");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulelabelStart"


    // $ANTLR start "entryRuleconstantDefinitionPart"
    // InternalPascal.g:661:1: entryRuleconstantDefinitionPart returns [EObject current=null] : iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF ;
    public final EObject entryRuleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinitionPart = null;


        try {
            // InternalPascal.g:661:63: (iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF )
            // InternalPascal.g:662:2: iv_ruleconstantDefinitionPart= ruleconstantDefinitionPart EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantDefinitionPart=ruleconstantDefinitionPart();

            state._fsp--;

             current =iv_ruleconstantDefinitionPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstantDefinitionPart"


    // $ANTLR start "ruleconstantDefinitionPart"
    // InternalPascal.g:668:1: ruleconstantDefinitionPart returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ ) ;
    public final EObject ruleconstantDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semiTerminal_2_0=null;
        EObject lv_constantDefinition_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:674:2: ( (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ ) )
            // InternalPascal.g:675:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ )
            {
            // InternalPascal.g:675:2: (otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ )
            // InternalPascal.g:676:3: otherlv_0= 'const' ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionPartAccess().getConstKeyword_0());
            		
            // InternalPascal.g:680:3: ( ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_IDENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:681:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) )
            	    {
            	    // InternalPascal.g:681:4: ( (lv_constantDefinition_1_0= ruleconstantDefinition ) )
            	    // InternalPascal.g:682:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    {
            	    // InternalPascal.g:682:5: (lv_constantDefinition_1_0= ruleconstantDefinition )
            	    // InternalPascal.g:683:6: lv_constantDefinition_1_0= ruleconstantDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getConstantDefinitionPartAccess().getConstantDefinitionConstantDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_constantDefinition_1_0=ruleconstantDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstantDefinitionPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantDefinition",
            	    							lv_constantDefinition_1_0,
            	    							"org.xtext.example.mydsl.Pascal.constantDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPascal.g:700:4: ( (lv_semiTerminal_2_0= ';' ) )
            	    // InternalPascal.g:701:5: (lv_semiTerminal_2_0= ';' )
            	    {
            	    // InternalPascal.g:701:5: (lv_semiTerminal_2_0= ';' )
            	    // InternalPascal.g:702:6: lv_semiTerminal_2_0= ';'
            	    {
            	    lv_semiTerminal_2_0=(Token)match(input,22,FOLLOW_11); 

            	    						newLeafNode(lv_semiTerminal_2_0, grammarAccess.getConstantDefinitionPartAccess().getSemiTerminalSemicolonKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConstantDefinitionPartRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal", lv_semiTerminal_2_0, ";");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleconstantDefinitionPart"


    // $ANTLR start "entryRuleconstantDefinition"
    // InternalPascal.g:719:1: entryRuleconstantDefinition returns [EObject current=null] : iv_ruleconstantDefinition= ruleconstantDefinition EOF ;
    public final EObject entryRuleconstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefinition = null;


        try {
            // InternalPascal.g:719:59: (iv_ruleconstantDefinition= ruleconstantDefinition EOF )
            // InternalPascal.g:720:2: iv_ruleconstantDefinition= ruleconstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantDefinition=ruleconstantDefinition();

            state._fsp--;

             current =iv_ruleconstantDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstantDefinition"


    // $ANTLR start "ruleconstantDefinition"
    // InternalPascal.g:726:1: ruleconstantDefinition returns [EObject current=null] : ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ID_0_0 = null;

        EObject lv_constant_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:732:2: ( ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:733:2: ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:733:2: ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) ) )
            // InternalPascal.g:734:3: ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= '=' ( (lv_constant_2_0= ruleconstant ) )
            {
            // InternalPascal.g:734:3: ( (lv_ID_0_0= ruleidentifier ) )
            // InternalPascal.g:735:4: (lv_ID_0_0= ruleidentifier )
            {
            // InternalPascal.g:735:4: (lv_ID_0_0= ruleidentifier )
            // InternalPascal.g:736:5: lv_ID_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getIDIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_ID_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:757:3: ( (lv_constant_2_0= ruleconstant ) )
            // InternalPascal.g:758:4: (lv_constant_2_0= ruleconstant )
            {
            // InternalPascal.g:758:4: (lv_constant_2_0= ruleconstant )
            // InternalPascal.g:759:5: lv_constant_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstantDefinitionAccess().getConstantConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constant_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
            					}
            					set(
            						current,
            						"constant",
            						lv_constant_2_0,
            						"org.xtext.example.mydsl.Pascal.constant");
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
    // $ANTLR end "ruleconstantDefinition"


    // $ANTLR start "entryRuleconstantChr"
    // InternalPascal.g:780:1: entryRuleconstantChr returns [EObject current=null] : iv_ruleconstantChr= ruleconstantChr EOF ;
    public final EObject entryRuleconstantChr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantChr = null;


        try {
            // InternalPascal.g:780:52: (iv_ruleconstantChr= ruleconstantChr EOF )
            // InternalPascal.g:781:2: iv_ruleconstantChr= ruleconstantChr EOF
            {
             newCompositeNode(grammarAccess.getConstantChrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstantChr=ruleconstantChr();

            state._fsp--;

             current =iv_ruleconstantChr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstantChr"


    // $ANTLR start "ruleconstantChr"
    // InternalPascal.g:787:1: ruleconstantChr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstantChr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unsignedInteger_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:793:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' ) )
            // InternalPascal.g:794:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:794:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')' )
            // InternalPascal.g:795:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantChrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantChrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:803:3: ( (lv_unsignedInteger_2_0= ruleunsignedInteger ) )
            // InternalPascal.g:804:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            {
            // InternalPascal.g:804:4: (lv_unsignedInteger_2_0= ruleunsignedInteger )
            // InternalPascal.g:805:5: lv_unsignedInteger_2_0= ruleunsignedInteger
            {

            					newCompositeNode(grammarAccess.getConstantChrAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_unsignedInteger_2_0=ruleunsignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantChrRule());
            					}
            					set(
            						current,
            						"unsignedInteger",
            						lv_unsignedInteger_2_0,
            						"org.xtext.example.mydsl.Pascal.unsignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantChrAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleconstantChr"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:830:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:830:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:831:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:837:1: ruleconstant returns [EObject current=null] : ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier1_3_0= ruleidentifier ) ) | ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) ) | ( (lv_string_6_0= ruleStringStart ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | this_bool_8= rulebool ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedNumber_0_0 = null;

        EObject lv_sign1_1_0 = null;

        EObject lv_unsignedNumber_2_0 = null;

        EObject lv_identifier1_3_0 = null;

        EObject lv_sign2_4_0 = null;

        EObject lv_identifier2_5_0 = null;

        EObject lv_string_6_0 = null;

        EObject lv_constantChr_7_0 = null;

        EObject this_bool_8 = null;



        	enterRule();

        try {
            // InternalPascal.g:843:2: ( ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier1_3_0= ruleidentifier ) ) | ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) ) | ( (lv_string_6_0= ruleStringStart ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | this_bool_8= rulebool ) )
            // InternalPascal.g:844:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier1_3_0= ruleidentifier ) ) | ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) ) | ( (lv_string_6_0= ruleStringStart ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | this_bool_8= rulebool )
            {
            // InternalPascal.g:844:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier1_3_0= ruleidentifier ) ) | ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) ) | ( (lv_string_6_0= ruleStringStart ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | this_bool_8= rulebool )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:845:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:845:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    // InternalPascal.g:846:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:846:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    // InternalPascal.g:847:5: lv_unsignedNumber_0_0= ruleunsignedNumber
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_0_0=ruleunsignedNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"unsignedNumber",
                    						lv_unsignedNumber_0_0,
                    						"org.xtext.example.mydsl.Pascal.unsignedNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:865:3: ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) )
                    {
                    // InternalPascal.g:865:3: ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) )
                    // InternalPascal.g:866:4: ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:866:4: ( (lv_sign1_1_0= rulesign ) )
                    // InternalPascal.g:867:5: (lv_sign1_1_0= rulesign )
                    {
                    // InternalPascal.g:867:5: (lv_sign1_1_0= rulesign )
                    // InternalPascal.g:868:6: lv_sign1_1_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSign1SignParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sign1_1_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sign1",
                    							lv_sign1_1_0,
                    							"org.xtext.example.mydsl.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:885:4: ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) )
                    // InternalPascal.g:886:5: (lv_unsignedNumber_2_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:886:5: (lv_unsignedNumber_2_0= ruleunsignedNumber )
                    // InternalPascal.g:887:6: lv_unsignedNumber_2_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_2_0=ruleunsignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"unsignedNumber",
                    							lv_unsignedNumber_2_0,
                    							"org.xtext.example.mydsl.Pascal.unsignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:906:3: ( (lv_identifier1_3_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:906:3: ( (lv_identifier1_3_0= ruleidentifier ) )
                    // InternalPascal.g:907:4: (lv_identifier1_3_0= ruleidentifier )
                    {
                    // InternalPascal.g:907:4: (lv_identifier1_3_0= ruleidentifier )
                    // InternalPascal.g:908:5: lv_identifier1_3_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getIdentifier1IdentifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_identifier1_3_0=ruleidentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"identifier1",
                    						lv_identifier1_3_0,
                    						"org.xtext.example.mydsl.Pascal.identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:926:3: ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:926:3: ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) )
                    // InternalPascal.g:927:4: ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:927:4: ( (lv_sign2_4_0= rulesign ) )
                    // InternalPascal.g:928:5: (lv_sign2_4_0= rulesign )
                    {
                    // InternalPascal.g:928:5: (lv_sign2_4_0= rulesign )
                    // InternalPascal.g:929:6: lv_sign2_4_0= rulesign
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSign2SignParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_sign2_4_0=rulesign();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sign2",
                    							lv_sign2_4_0,
                    							"org.xtext.example.mydsl.Pascal.sign");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:946:4: ( (lv_identifier2_5_0= ruleidentifier ) )
                    // InternalPascal.g:947:5: (lv_identifier2_5_0= ruleidentifier )
                    {
                    // InternalPascal.g:947:5: (lv_identifier2_5_0= ruleidentifier )
                    // InternalPascal.g:948:6: lv_identifier2_5_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getIdentifier2IdentifierParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_identifier2_5_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"identifier2",
                    							lv_identifier2_5_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:967:3: ( (lv_string_6_0= ruleStringStart ) )
                    {
                    // InternalPascal.g:967:3: ( (lv_string_6_0= ruleStringStart ) )
                    // InternalPascal.g:968:4: (lv_string_6_0= ruleStringStart )
                    {
                    // InternalPascal.g:968:4: (lv_string_6_0= ruleStringStart )
                    // InternalPascal.g:969:5: lv_string_6_0= ruleStringStart
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getStringStringStartParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_string_6_0=ruleStringStart();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"string",
                    						lv_string_6_0,
                    						"org.xtext.example.mydsl.Pascal.StringStart");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:987:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:987:3: ( (lv_constantChr_7_0= ruleconstantChr ) )
                    // InternalPascal.g:988:4: (lv_constantChr_7_0= ruleconstantChr )
                    {
                    // InternalPascal.g:988:4: (lv_constantChr_7_0= ruleconstantChr )
                    // InternalPascal.g:989:5: lv_constantChr_7_0= ruleconstantChr
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getConstantChrConstantChrParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constantChr_7_0=ruleconstantChr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"constantChr",
                    						lv_constantChr_7_0,
                    						"org.xtext.example.mydsl.Pascal.constantChr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1007:3: this_bool_8= rulebool
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getBoolParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_bool_8=rulebool();

                    state._fsp--;


                    			current = this_bool_8;
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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleunsignedNumber"
    // InternalPascal.g:1019:1: entryRuleunsignedNumber returns [EObject current=null] : iv_ruleunsignedNumber= ruleunsignedNumber EOF ;
    public final EObject entryRuleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedNumber = null;


        try {
            // InternalPascal.g:1019:55: (iv_ruleunsignedNumber= ruleunsignedNumber EOF )
            // InternalPascal.g:1020:2: iv_ruleunsignedNumber= ruleunsignedNumber EOF
            {
             newCompositeNode(grammarAccess.getUnsignedNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedNumber=ruleunsignedNumber();

            state._fsp--;

             current =iv_ruleunsignedNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsignedNumber"


    // $ANTLR start "ruleunsignedNumber"
    // InternalPascal.g:1026:1: ruleunsignedNumber returns [EObject current=null] : ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) ;
    public final EObject ruleunsignedNumber() throws RecognitionException {
        EObject current = null;

        EObject lv_unsignedInteger_0_0 = null;

        EObject lv_unsignedReal_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1032:2: ( ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) ) )
            // InternalPascal.g:1033:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
            {
            // InternalPascal.g:1033:2: ( ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) ) | ( (lv_unsignedReal_1_0= ruleunsignedReal ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NUM_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_NUM_REAL) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1034:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    {
                    // InternalPascal.g:1034:3: ( (lv_unsignedInteger_0_0= ruleunsignedInteger ) )
                    // InternalPascal.g:1035:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    {
                    // InternalPascal.g:1035:4: (lv_unsignedInteger_0_0= ruleunsignedInteger )
                    // InternalPascal.g:1036:5: lv_unsignedInteger_0_0= ruleunsignedInteger
                    {

                    					newCompositeNode(grammarAccess.getUnsignedNumberAccess().getUnsignedIntegerUnsignedIntegerParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedInteger_0_0=ruleunsignedInteger();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedNumberRule());
                    					}
                    					set(
                    						current,
                    						"unsignedInteger",
                    						lv_unsignedInteger_0_0,
                    						"org.xtext.example.mydsl.Pascal.unsignedInteger");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1054:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    {
                    // InternalPascal.g:1054:3: ( (lv_unsignedReal_1_0= ruleunsignedReal ) )
                    // InternalPascal.g:1055:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    {
                    // InternalPascal.g:1055:4: (lv_unsignedReal_1_0= ruleunsignedReal )
                    // InternalPascal.g:1056:5: lv_unsignedReal_1_0= ruleunsignedReal
                    {

                    					newCompositeNode(grammarAccess.getUnsignedNumberAccess().getUnsignedRealUnsignedRealParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedReal_1_0=ruleunsignedReal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedNumberRule());
                    					}
                    					set(
                    						current,
                    						"unsignedReal",
                    						lv_unsignedReal_1_0,
                    						"org.xtext.example.mydsl.Pascal.unsignedReal");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleunsignedNumber"


    // $ANTLR start "entryRuleunsignedInteger"
    // InternalPascal.g:1077:1: entryRuleunsignedInteger returns [EObject current=null] : iv_ruleunsignedInteger= ruleunsignedInteger EOF ;
    public final EObject entryRuleunsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedInteger = null;


        try {
            // InternalPascal.g:1077:56: (iv_ruleunsignedInteger= ruleunsignedInteger EOF )
            // InternalPascal.g:1078:2: iv_ruleunsignedInteger= ruleunsignedInteger EOF
            {
             newCompositeNode(grammarAccess.getUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedInteger=ruleunsignedInteger();

            state._fsp--;

             current =iv_ruleunsignedInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsignedInteger"


    // $ANTLR start "ruleunsignedInteger"
    // InternalPascal.g:1084:1: ruleunsignedInteger returns [EObject current=null] : ( (lv_unsignedInteger_0_0= RULE_NUM_INT ) ) ;
    public final EObject ruleunsignedInteger() throws RecognitionException {
        EObject current = null;

        Token lv_unsignedInteger_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1090:2: ( ( (lv_unsignedInteger_0_0= RULE_NUM_INT ) ) )
            // InternalPascal.g:1091:2: ( (lv_unsignedInteger_0_0= RULE_NUM_INT ) )
            {
            // InternalPascal.g:1091:2: ( (lv_unsignedInteger_0_0= RULE_NUM_INT ) )
            // InternalPascal.g:1092:3: (lv_unsignedInteger_0_0= RULE_NUM_INT )
            {
            // InternalPascal.g:1092:3: (lv_unsignedInteger_0_0= RULE_NUM_INT )
            // InternalPascal.g:1093:4: lv_unsignedInteger_0_0= RULE_NUM_INT
            {
            lv_unsignedInteger_0_0=(Token)match(input,RULE_NUM_INT,FOLLOW_2); 

            				newLeafNode(lv_unsignedInteger_0_0, grammarAccess.getUnsignedIntegerAccess().getUnsignedIntegerNUM_INTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnsignedIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"unsignedInteger",
            					lv_unsignedInteger_0_0,
            					"org.xtext.example.mydsl.Pascal.NUM_INT");
            			

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
    // $ANTLR end "ruleunsignedInteger"


    // $ANTLR start "entryRuleunsignedReal"
    // InternalPascal.g:1112:1: entryRuleunsignedReal returns [EObject current=null] : iv_ruleunsignedReal= ruleunsignedReal EOF ;
    public final EObject entryRuleunsignedReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedReal = null;


        try {
            // InternalPascal.g:1112:53: (iv_ruleunsignedReal= ruleunsignedReal EOF )
            // InternalPascal.g:1113:2: iv_ruleunsignedReal= ruleunsignedReal EOF
            {
             newCompositeNode(grammarAccess.getUnsignedRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedReal=ruleunsignedReal();

            state._fsp--;

             current =iv_ruleunsignedReal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsignedReal"


    // $ANTLR start "ruleunsignedReal"
    // InternalPascal.g:1119:1: ruleunsignedReal returns [EObject current=null] : ( (lv_unsignedReal_0_0= RULE_NUM_REAL ) ) ;
    public final EObject ruleunsignedReal() throws RecognitionException {
        EObject current = null;

        Token lv_unsignedReal_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1125:2: ( ( (lv_unsignedReal_0_0= RULE_NUM_REAL ) ) )
            // InternalPascal.g:1126:2: ( (lv_unsignedReal_0_0= RULE_NUM_REAL ) )
            {
            // InternalPascal.g:1126:2: ( (lv_unsignedReal_0_0= RULE_NUM_REAL ) )
            // InternalPascal.g:1127:3: (lv_unsignedReal_0_0= RULE_NUM_REAL )
            {
            // InternalPascal.g:1127:3: (lv_unsignedReal_0_0= RULE_NUM_REAL )
            // InternalPascal.g:1128:4: lv_unsignedReal_0_0= RULE_NUM_REAL
            {
            lv_unsignedReal_0_0=(Token)match(input,RULE_NUM_REAL,FOLLOW_2); 

            				newLeafNode(lv_unsignedReal_0_0, grammarAccess.getUnsignedRealAccess().getUnsignedRealNUM_REALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnsignedRealRule());
            				}
            				setWithLastConsumed(
            					current,
            					"unsignedReal",
            					lv_unsignedReal_0_0,
            					"org.xtext.example.mydsl.Pascal.NUM_REAL");
            			

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
    // $ANTLR end "ruleunsignedReal"


    // $ANTLR start "entryRulesign"
    // InternalPascal.g:1147:1: entryRulesign returns [EObject current=null] : iv_rulesign= rulesign EOF ;
    public final EObject entryRulesign() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesign = null;


        try {
            // InternalPascal.g:1147:45: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:1148:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // InternalPascal.g:1154:1: rulesign returns [EObject current=null] : ( ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) ) ) ;
    public final EObject rulesign() throws RecognitionException {
        EObject current = null;

        Token lv_sign_0_1=null;
        Token lv_sign_0_2=null;


        	enterRule();

        try {
            // InternalPascal.g:1160:2: ( ( ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) ) ) )
            // InternalPascal.g:1161:2: ( ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) ) )
            {
            // InternalPascal.g:1161:2: ( ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) ) )
            // InternalPascal.g:1162:3: ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) )
            {
            // InternalPascal.g:1162:3: ( (lv_sign_0_1= '+' | lv_sign_0_2= '-' ) )
            // InternalPascal.g:1163:4: (lv_sign_0_1= '+' | lv_sign_0_2= '-' )
            {
            // InternalPascal.g:1163:4: (lv_sign_0_1= '+' | lv_sign_0_2= '-' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1164:5: lv_sign_0_1= '+'
                    {
                    lv_sign_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_sign_0_1, grammarAccess.getSignAccess().getSignPlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignRule());
                    					}
                    					setWithLastConsumed(current, "sign", lv_sign_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1175:5: lv_sign_0_2= '-'
                    {
                    lv_sign_0_2=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_sign_0_2, grammarAccess.getSignAccess().getSignHyphenMinusKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignRule());
                    					}
                    					setWithLastConsumed(current, "sign", lv_sign_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRulebool"
    // InternalPascal.g:1191:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalPascal.g:1191:45: (iv_rulebool= rulebool EOF )
            // InternalPascal.g:1192:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalPascal.g:1198:1: rulebool returns [EObject current=null] : ( ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) ) ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_1=null;
        Token lv_bool_0_2=null;


        	enterRule();

        try {
            // InternalPascal.g:1204:2: ( ( ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) ) ) )
            // InternalPascal.g:1205:2: ( ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) ) )
            {
            // InternalPascal.g:1205:2: ( ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) ) )
            // InternalPascal.g:1206:3: ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) )
            {
            // InternalPascal.g:1206:3: ( (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' ) )
            // InternalPascal.g:1207:4: (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' )
            {
            // InternalPascal.g:1207:4: (lv_bool_0_1= 'true' | lv_bool_0_2= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1208:5: lv_bool_0_1= 'true'
                    {
                    lv_bool_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_bool_0_1, grammarAccess.getBoolAccess().getBoolTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolRule());
                    					}
                    					setWithLastConsumed(current, "bool", lv_bool_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1219:5: lv_bool_0_2= 'false'
                    {
                    lv_bool_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_bool_0_2, grammarAccess.getBoolAccess().getBoolFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolRule());
                    					}
                    					setWithLastConsumed(current, "bool", lv_bool_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleStringStart"
    // InternalPascal.g:1235:1: entryRuleStringStart returns [EObject current=null] : iv_ruleStringStart= ruleStringStart EOF ;
    public final EObject entryRuleStringStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringStart = null;


        try {
            // InternalPascal.g:1235:52: (iv_ruleStringStart= ruleStringStart EOF )
            // InternalPascal.g:1236:2: iv_ruleStringStart= ruleStringStart EOF
            {
             newCompositeNode(grammarAccess.getStringStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringStart=ruleStringStart();

            state._fsp--;

             current =iv_ruleStringStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringStart"


    // $ANTLR start "ruleStringStart"
    // InternalPascal.g:1242:1: ruleStringStart returns [EObject current=null] : ( (lv_StringStart_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringStart() throws RecognitionException {
        EObject current = null;

        Token lv_StringStart_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1248:2: ( ( (lv_StringStart_0_0= RULE_STRING ) ) )
            // InternalPascal.g:1249:2: ( (lv_StringStart_0_0= RULE_STRING ) )
            {
            // InternalPascal.g:1249:2: ( (lv_StringStart_0_0= RULE_STRING ) )
            // InternalPascal.g:1250:3: (lv_StringStart_0_0= RULE_STRING )
            {
            // InternalPascal.g:1250:3: (lv_StringStart_0_0= RULE_STRING )
            // InternalPascal.g:1251:4: lv_StringStart_0_0= RULE_STRING
            {
            lv_StringStart_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_StringStart_0_0, grammarAccess.getStringStartAccess().getStringStartSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringStartRule());
            				}
            				setWithLastConsumed(
            					current,
            					"StringStart",
            					lv_StringStart_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringStart"


    // $ANTLR start "entryRuletypeDefinitionPart"
    // InternalPascal.g:1270:1: entryRuletypeDefinitionPart returns [EObject current=null] : iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF ;
    public final EObject entryRuletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinitionPart = null;


        try {
            // InternalPascal.g:1270:59: (iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF )
            // InternalPascal.g:1271:2: iv_ruletypeDefinitionPart= ruletypeDefinitionPart EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeDefinitionPart=ruletypeDefinitionPart();

            state._fsp--;

             current =iv_ruletypeDefinitionPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletypeDefinitionPart"


    // $ANTLR start "ruletypeDefinitionPart"
    // InternalPascal.g:1277:1: ruletypeDefinitionPart returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ ) ;
    public final EObject ruletypeDefinitionPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semiTerminal_2_0=null;
        EObject lv_typeDefinition_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1283:2: ( (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ ) )
            // InternalPascal.g:1284:2: (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ )
            {
            // InternalPascal.g:1284:2: (otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+ )
            // InternalPascal.g:1285:3: otherlv_0= 'type' ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionPartAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:1289:3: ( ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_IDENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:1290:4: ( (lv_typeDefinition_1_0= ruletypeDefinition ) ) ( (lv_semiTerminal_2_0= ';' ) )
            	    {
            	    // InternalPascal.g:1290:4: ( (lv_typeDefinition_1_0= ruletypeDefinition ) )
            	    // InternalPascal.g:1291:5: (lv_typeDefinition_1_0= ruletypeDefinition )
            	    {
            	    // InternalPascal.g:1291:5: (lv_typeDefinition_1_0= ruletypeDefinition )
            	    // InternalPascal.g:1292:6: lv_typeDefinition_1_0= ruletypeDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDefinitionPartAccess().getTypeDefinitionTypeDefinitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_typeDefinition_1_0=ruletypeDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeDefinitionPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeDefinition",
            	    							lv_typeDefinition_1_0,
            	    							"org.xtext.example.mydsl.Pascal.typeDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPascal.g:1309:4: ( (lv_semiTerminal_2_0= ';' ) )
            	    // InternalPascal.g:1310:5: (lv_semiTerminal_2_0= ';' )
            	    {
            	    // InternalPascal.g:1310:5: (lv_semiTerminal_2_0= ';' )
            	    // InternalPascal.g:1311:6: lv_semiTerminal_2_0= ';'
            	    {
            	    lv_semiTerminal_2_0=(Token)match(input,22,FOLLOW_11); 

            	    						newLeafNode(lv_semiTerminal_2_0, grammarAccess.getTypeDefinitionPartAccess().getSemiTerminalSemicolonKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeDefinitionPartRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal", lv_semiTerminal_2_0, ";");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruletypeDefinitionPart"


    // $ANTLR start "entryRuletypeDefinition"
    // InternalPascal.g:1328:1: entryRuletypeDefinition returns [EObject current=null] : iv_ruletypeDefinition= ruletypeDefinition EOF ;
    public final EObject entryRuletypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeDefinition = null;


        try {
            // InternalPascal.g:1328:55: (iv_ruletypeDefinition= ruletypeDefinition EOF )
            // InternalPascal.g:1329:2: iv_ruletypeDefinition= ruletypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeDefinition=ruletypeDefinition();

            state._fsp--;

             current =iv_ruletypeDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletypeDefinition"


    // $ANTLR start "ruletypeDefinition"
    // InternalPascal.g:1335:1: ruletypeDefinition returns [EObject current=null] : ( ( (lv_ID1_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) ) ) ;
    public final EObject ruletypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ID1_0_0 = null;

        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;

        EObject lv_type_2_3 = null;



        	enterRule();

        try {
            // InternalPascal.g:1341:2: ( ( ( (lv_ID1_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) ) ) )
            // InternalPascal.g:1342:2: ( ( (lv_ID1_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) ) )
            {
            // InternalPascal.g:1342:2: ( ( (lv_ID1_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) ) )
            // InternalPascal.g:1343:3: ( (lv_ID1_0_0= ruleidentifier ) ) otherlv_1= '=' ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) )
            {
            // InternalPascal.g:1343:3: ( (lv_ID1_0_0= ruleidentifier ) )
            // InternalPascal.g:1344:4: (lv_ID1_0_0= ruleidentifier )
            {
            // InternalPascal.g:1344:4: (lv_ID1_0_0= ruleidentifier )
            // InternalPascal.g:1345:5: lv_ID1_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getTypeDefinitionAccess().getID1IdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_ID1_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            					}
            					set(
            						current,
            						"ID1",
            						lv_ID1_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:1366:3: ( ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) ) )
            // InternalPascal.g:1367:4: ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) )
            {
            // InternalPascal.g:1367:4: ( (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType ) )
            // InternalPascal.g:1368:5: (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType )
            {
            // InternalPascal.g:1368:5: (lv_type_2_1= ruletypeStart | lv_type_2_2= rulefunctionType | lv_type_2_3= ruleprocedureType )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case 20:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 52:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1369:6: lv_type_2_1= ruletypeStart
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeStartParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_1=ruletypeStart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"org.xtext.example.mydsl.Pascal.typeStart");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1385:6: lv_type_2_2= rulefunctionType
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeFunctionTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_2=rulefunctionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"org.xtext.example.mydsl.Pascal.functionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1401:6: lv_type_2_3= ruleprocedureType
                    {

                    						newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeProcedureTypeParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_3=ruleprocedureType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_3,
                    							"org.xtext.example.mydsl.Pascal.procedureType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruletypeDefinition"


    // $ANTLR start "entryRulefunctionType"
    // InternalPascal.g:1423:1: entryRulefunctionType returns [EObject current=null] : iv_rulefunctionType= rulefunctionType EOF ;
    public final EObject entryRulefunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionType = null;


        try {
            // InternalPascal.g:1423:53: (iv_rulefunctionType= rulefunctionType EOF )
            // InternalPascal.g:1424:2: iv_rulefunctionType= rulefunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionType=rulefunctionType();

            state._fsp--;

             current =iv_rulefunctionType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunctionType"


    // $ANTLR start "rulefunctionType"
    // InternalPascal.g:1430:1: rulefunctionType returns [EObject current=null] : (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) ) ;
    public final EObject rulefunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_formalParameterList_1_0 = null;

        EObject lv_resultType_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1436:2: ( (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) ) )
            // InternalPascal.g:1437:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) )
            {
            // InternalPascal.g:1437:2: (otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) ) )
            // InternalPascal.g:1438:3: otherlv_0= 'function' ( (lv_formalParameterList_1_0= ruleformalParameterList ) )? otherlv_2= ':' ( (lv_resultType_3_0= ruleresultType ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1442:3: ( (lv_formalParameterList_1_0= ruleformalParameterList ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1443:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1443:4: (lv_formalParameterList_1_0= ruleformalParameterList )
                    // InternalPascal.g:1444:5: lv_formalParameterList_1_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionTypeAccess().getFormalParameterListFormalParameterListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_formalParameterList_1_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_1_0,
                    						"org.xtext.example.mydsl.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getColonKeyword_2());
            		
            // InternalPascal.g:1465:3: ( (lv_resultType_3_0= ruleresultType ) )
            // InternalPascal.g:1466:4: (lv_resultType_3_0= ruleresultType )
            {
            // InternalPascal.g:1466:4: (lv_resultType_3_0= ruleresultType )
            // InternalPascal.g:1467:5: lv_resultType_3_0= ruleresultType
            {

            					newCompositeNode(grammarAccess.getFunctionTypeAccess().getResultTypeResultTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_resultType_3_0=ruleresultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
            					}
            					set(
            						current,
            						"resultType",
            						lv_resultType_3_0,
            						"org.xtext.example.mydsl.Pascal.resultType");
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
    // $ANTLR end "rulefunctionType"


    // $ANTLR start "entryRuleprocedureType"
    // InternalPascal.g:1488:1: entryRuleprocedureType returns [EObject current=null] : iv_ruleprocedureType= ruleprocedureType EOF ;
    public final EObject entryRuleprocedureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureType = null;


        try {
            // InternalPascal.g:1488:54: (iv_ruleprocedureType= ruleprocedureType EOF )
            // InternalPascal.g:1489:2: iv_ruleprocedureType= ruleprocedureType EOF
            {
             newCompositeNode(grammarAccess.getProcedureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureType=ruleprocedureType();

            state._fsp--;

             current =iv_ruleprocedureType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedureType"


    // $ANTLR start "ruleprocedureType"
    // InternalPascal.g:1495:1: ruleprocedureType returns [EObject current=null] : ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) ;
    public final EObject ruleprocedureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formalParameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1501:2: ( ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? ) )
            // InternalPascal.g:1502:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            {
            // InternalPascal.g:1502:2: ( () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? )
            // InternalPascal.g:1503:3: () otherlv_1= 'procedure' ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            {
            // InternalPascal.g:1503:3: ()
            // InternalPascal.g:1504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedureTypeAccess().getProcedureTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureTypeAccess().getProcedureKeyword_1());
            		
            // InternalPascal.g:1514:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1515:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:1515:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:1516:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getProcedureTypeAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureTypeRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"org.xtext.example.mydsl.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleprocedureType"


    // $ANTLR start "entryRuletypeStart"
    // InternalPascal.g:1537:1: entryRuletypeStart returns [EObject current=null] : iv_ruletypeStart= ruletypeStart EOF ;
    public final EObject entryRuletypeStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeStart = null;


        try {
            // InternalPascal.g:1537:50: (iv_ruletypeStart= ruletypeStart EOF )
            // InternalPascal.g:1538:2: iv_ruletypeStart= ruletypeStart EOF
            {
             newCompositeNode(grammarAccess.getTypeStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeStart=ruletypeStart();

            state._fsp--;

             current =iv_ruletypeStart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletypeStart"


    // $ANTLR start "ruletypeStart"
    // InternalPascal.g:1544:1: ruletypeStart returns [EObject current=null] : ( ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) ) ) ;
    public final EObject ruletypeStart() throws RecognitionException {
        EObject current = null;

        EObject lv_typeStart_0_1 = null;

        EObject lv_typeStart_0_2 = null;

        EObject lv_typeStart_0_3 = null;



        	enterRule();

        try {
            // InternalPascal.g:1550:2: ( ( ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) ) ) )
            // InternalPascal.g:1551:2: ( ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) ) )
            {
            // InternalPascal.g:1551:2: ( ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) ) )
            // InternalPascal.g:1552:3: ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) )
            {
            // InternalPascal.g:1552:3: ( (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType ) )
            // InternalPascal.g:1553:4: (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType )
            {
            // InternalPascal.g:1553:4: (lv_typeStart_0_1= rulesimpleType | lv_typeStart_0_2= rulestructuredType | lv_typeStart_0_3= rulepointerType )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case 20:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt16=1;
                }
                break;
            case 45:
            case 48:
                {
                alt16=2;
                }
                break;
            case 52:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1554:5: lv_typeStart_0_1= rulesimpleType
                    {

                    					newCompositeNode(grammarAccess.getTypeStartAccess().getTypeStartSimpleTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeStart_0_1=rulesimpleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeStartRule());
                    					}
                    					set(
                    						current,
                    						"typeStart",
                    						lv_typeStart_0_1,
                    						"org.xtext.example.mydsl.Pascal.simpleType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1570:5: lv_typeStart_0_2= rulestructuredType
                    {

                    					newCompositeNode(grammarAccess.getTypeStartAccess().getTypeStartStructuredTypeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeStart_0_2=rulestructuredType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeStartRule());
                    					}
                    					set(
                    						current,
                    						"typeStart",
                    						lv_typeStart_0_2,
                    						"org.xtext.example.mydsl.Pascal.structuredType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1586:5: lv_typeStart_0_3= rulepointerType
                    {

                    					newCompositeNode(grammarAccess.getTypeStartAccess().getTypeStartPointerTypeParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeStart_0_3=rulepointerType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeStartRule());
                    					}
                    					set(
                    						current,
                    						"typeStart",
                    						lv_typeStart_0_3,
                    						"org.xtext.example.mydsl.Pascal.pointerType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruletypeStart"


    // $ANTLR start "entryRulesimpleType"
    // InternalPascal.g:1607:1: entryRulesimpleType returns [EObject current=null] : iv_rulesimpleType= rulesimpleType EOF ;
    public final EObject entryRulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleType = null;


        try {
            // InternalPascal.g:1607:51: (iv_rulesimpleType= rulesimpleType EOF )
            // InternalPascal.g:1608:2: iv_rulesimpleType= rulesimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleType=rulesimpleType();

            state._fsp--;

             current =iv_rulesimpleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimpleType"


    // $ANTLR start "rulesimpleType"
    // InternalPascal.g:1614:1: rulesimpleType returns [EObject current=null] : ( ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) ) ) ;
    public final EObject rulesimpleType() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleType_0_1 = null;

        EObject lv_simpleType_0_2 = null;

        EObject lv_simpleType_0_3 = null;

        EObject lv_simpleType_0_4 = null;



        	enterRule();

        try {
            // InternalPascal.g:1620:2: ( ( ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) ) ) )
            // InternalPascal.g:1621:2: ( ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) ) )
            {
            // InternalPascal.g:1621:2: ( ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) ) )
            // InternalPascal.g:1622:3: ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) )
            {
            // InternalPascal.g:1622:3: ( (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype ) )
            // InternalPascal.g:1623:4: (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype )
            {
            // InternalPascal.g:1623:4: (lv_simpleType_0_1= rulescalarType | lv_simpleType_0_2= rulesubrangeType | lv_simpleType_0_3= ruletypeIdentifier | lv_simpleType_0_4= rulestringtype )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt17=1;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt17=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==EOF||(LA17_3>=21 && LA17_3<=22)) ) {
                    alt17=3;
                }
                else if ( (LA17_3==39) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==39) ) {
                    alt17=2;
                }
                else if ( (LA17_4==46) ) {
                    alt17=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1624:5: lv_simpleType_0_1= rulescalarType
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getSimpleTypeScalarTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleType_0_1=rulescalarType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"simpleType",
                    						lv_simpleType_0_1,
                    						"org.xtext.example.mydsl.Pascal.scalarType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1640:5: lv_simpleType_0_2= rulesubrangeType
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getSimpleTypeSubrangeTypeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleType_0_2=rulesubrangeType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"simpleType",
                    						lv_simpleType_0_2,
                    						"org.xtext.example.mydsl.Pascal.subrangeType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1656:5: lv_simpleType_0_3= ruletypeIdentifier
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getSimpleTypeTypeIdentifierParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleType_0_3=ruletypeIdentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"simpleType",
                    						lv_simpleType_0_3,
                    						"org.xtext.example.mydsl.Pascal.typeIdentifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1672:5: lv_simpleType_0_4= rulestringtype
                    {

                    					newCompositeNode(grammarAccess.getSimpleTypeAccess().getSimpleTypeStringtypeParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simpleType_0_4=rulestringtype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    					}
                    					set(
                    						current,
                    						"simpleType",
                    						lv_simpleType_0_4,
                    						"org.xtext.example.mydsl.Pascal.stringtype");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "rulesimpleType"


    // $ANTLR start "entryRulescalarType"
    // InternalPascal.g:1693:1: entryRulescalarType returns [EObject current=null] : iv_rulescalarType= rulescalarType EOF ;
    public final EObject entryRulescalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescalarType = null;


        try {
            // InternalPascal.g:1693:51: (iv_rulescalarType= rulescalarType EOF )
            // InternalPascal.g:1694:2: iv_rulescalarType= rulescalarType EOF
            {
             newCompositeNode(grammarAccess.getScalarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulescalarType=rulescalarType();

            state._fsp--;

             current =iv_rulescalarType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulescalarType"


    // $ANTLR start "rulescalarType"
    // InternalPascal.g:1700:1: rulescalarType returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) ;
    public final EObject rulescalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifierList_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1706:2: ( (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' ) )
            // InternalPascal.g:1707:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:1707:2: (otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')' )
            // InternalPascal.g:1708:3: otherlv_0= '(' ( (lv_identifierList_1_0= ruleidentifierList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1712:3: ( (lv_identifierList_1_0= ruleidentifierList ) )
            // InternalPascal.g:1713:4: (lv_identifierList_1_0= ruleidentifierList )
            {
            // InternalPascal.g:1713:4: (lv_identifierList_1_0= ruleidentifierList )
            // InternalPascal.g:1714:5: lv_identifierList_1_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getScalarTypeAccess().getIdentifierListIdentifierListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_identifierList_1_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarTypeRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_1_0,
            						"org.xtext.example.mydsl.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getScalarTypeAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulescalarType"


    // $ANTLR start "entryRulesubrangeType"
    // InternalPascal.g:1739:1: entryRulesubrangeType returns [EObject current=null] : iv_rulesubrangeType= rulesubrangeType EOF ;
    public final EObject entryRulesubrangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrangeType = null;


        try {
            // InternalPascal.g:1739:53: (iv_rulesubrangeType= rulesubrangeType EOF )
            // InternalPascal.g:1740:2: iv_rulesubrangeType= rulesubrangeType EOF
            {
             newCompositeNode(grammarAccess.getSubrangeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrangeType=rulesubrangeType();

            state._fsp--;

             current =iv_rulesubrangeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesubrangeType"


    // $ANTLR start "rulesubrangeType"
    // InternalPascal.g:1746:1: rulesubrangeType returns [EObject current=null] : ( ( (lv_constant1_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constan2_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constant1_0_0 = null;

        EObject lv_constan2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1752:2: ( ( ( (lv_constant1_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constan2_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:1753:2: ( ( (lv_constant1_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constan2_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:1753:2: ( ( (lv_constant1_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constan2_2_0= ruleconstant ) ) )
            // InternalPascal.g:1754:3: ( (lv_constant1_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_constan2_2_0= ruleconstant ) )
            {
            // InternalPascal.g:1754:3: ( (lv_constant1_0_0= ruleconstant ) )
            // InternalPascal.g:1755:4: (lv_constant1_0_0= ruleconstant )
            {
            // InternalPascal.g:1755:4: (lv_constant1_0_0= ruleconstant )
            // InternalPascal.g:1756:5: lv_constant1_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrangeTypeAccess().getConstant1ConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_constant1_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrangeTypeRule());
            					}
            					set(
            						current,
            						"constant1",
            						lv_constant1_0_0,
            						"org.xtext.example.mydsl.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubrangeTypeAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPascal.g:1777:3: ( (lv_constan2_2_0= ruleconstant ) )
            // InternalPascal.g:1778:4: (lv_constan2_2_0= ruleconstant )
            {
            // InternalPascal.g:1778:4: (lv_constan2_2_0= ruleconstant )
            // InternalPascal.g:1779:5: lv_constan2_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrangeTypeAccess().getConstan2ConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constan2_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrangeTypeRule());
            					}
            					set(
            						current,
            						"constan2",
            						lv_constan2_2_0,
            						"org.xtext.example.mydsl.Pascal.constant");
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
    // $ANTLR end "rulesubrangeType"


    // $ANTLR start "entryRuletypeIdentifier"
    // InternalPascal.g:1800:1: entryRuletypeIdentifier returns [EObject current=null] : iv_ruletypeIdentifier= ruletypeIdentifier EOF ;
    public final EObject entryRuletypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypeIdentifier = null;


        try {
            // InternalPascal.g:1800:55: (iv_ruletypeIdentifier= ruletypeIdentifier EOF )
            // InternalPascal.g:1801:2: iv_ruletypeIdentifier= ruletypeIdentifier EOF
            {
             newCompositeNode(grammarAccess.getTypeIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletypeIdentifier=ruletypeIdentifier();

            state._fsp--;

             current =iv_ruletypeIdentifier; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletypeIdentifier"


    // $ANTLR start "ruletypeIdentifier"
    // InternalPascal.g:1807:1: ruletypeIdentifier returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) ) ) ;
    public final EObject ruletypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_type_1_5=null;
        EObject lv_identifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1813:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) ) ) )
            // InternalPascal.g:1814:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) ) )
            {
            // InternalPascal.g:1814:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) | ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENT) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=40 && LA19_0<=44)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1815:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:1815:3: ( (lv_identifier_0_0= ruleidentifier ) )
                    // InternalPascal.g:1816:4: (lv_identifier_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:1816:4: (lv_identifier_0_0= ruleidentifier )
                    // InternalPascal.g:1817:5: lv_identifier_0_0= ruleidentifier
                    {

                    					newCompositeNode(grammarAccess.getTypeIdentifierAccess().getIdentifierIdentifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_identifier_0_0=ruleidentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeIdentifierRule());
                    					}
                    					set(
                    						current,
                    						"identifier",
                    						lv_identifier_0_0,
                    						"org.xtext.example.mydsl.Pascal.identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1835:3: ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) )
                    {
                    // InternalPascal.g:1835:3: ( ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) ) )
                    // InternalPascal.g:1836:4: ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) )
                    {
                    // InternalPascal.g:1836:4: ( (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' ) )
                    // InternalPascal.g:1837:5: (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' )
                    {
                    // InternalPascal.g:1837:5: (lv_type_1_1= 'Char' | lv_type_1_2= 'Boolean' | lv_type_1_3= 'Integer' | lv_type_1_4= 'Real' | lv_type_1_5= 'String' )
                    int alt18=5;
                    switch ( input.LA(1) ) {
                    case 40:
                        {
                        alt18=1;
                        }
                        break;
                    case 41:
                        {
                        alt18=2;
                        }
                        break;
                    case 42:
                        {
                        alt18=3;
                        }
                        break;
                    case 43:
                        {
                        alt18=4;
                        }
                        break;
                    case 44:
                        {
                        alt18=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalPascal.g:1838:6: lv_type_1_1= 'Char'
                            {
                            lv_type_1_1=(Token)match(input,40,FOLLOW_2); 

                            						newLeafNode(lv_type_1_1, grammarAccess.getTypeIdentifierAccess().getTypeCharKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeIdentifierRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalPascal.g:1849:6: lv_type_1_2= 'Boolean'
                            {
                            lv_type_1_2=(Token)match(input,41,FOLLOW_2); 

                            						newLeafNode(lv_type_1_2, grammarAccess.getTypeIdentifierAccess().getTypeBooleanKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeIdentifierRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalPascal.g:1860:6: lv_type_1_3= 'Integer'
                            {
                            lv_type_1_3=(Token)match(input,42,FOLLOW_2); 

                            						newLeafNode(lv_type_1_3, grammarAccess.getTypeIdentifierAccess().getTypeIntegerKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeIdentifierRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalPascal.g:1871:6: lv_type_1_4= 'Real'
                            {
                            lv_type_1_4=(Token)match(input,43,FOLLOW_2); 

                            						newLeafNode(lv_type_1_4, grammarAccess.getTypeIdentifierAccess().getTypeRealKeyword_1_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeIdentifierRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_4, null);
                            					

                            }
                            break;
                        case 5 :
                            // InternalPascal.g:1882:6: lv_type_1_5= 'String'
                            {
                            lv_type_1_5=(Token)match(input,44,FOLLOW_2); 

                            						newLeafNode(lv_type_1_5, grammarAccess.getTypeIdentifierAccess().getTypeStringKeyword_1_0_4());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeIdentifierRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_5, null);
                            					

                            }
                            break;

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
    // $ANTLR end "ruletypeIdentifier"


    // $ANTLR start "entryRulestructuredType"
    // InternalPascal.g:1899:1: entryRulestructuredType returns [EObject current=null] : iv_rulestructuredType= rulestructuredType EOF ;
    public final EObject entryRulestructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredType = null;


        try {
            // InternalPascal.g:1899:55: (iv_rulestructuredType= rulestructuredType EOF )
            // InternalPascal.g:1900:2: iv_rulestructuredType= rulestructuredType EOF
            {
             newCompositeNode(grammarAccess.getStructuredTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructuredType=rulestructuredType();

            state._fsp--;

             current =iv_rulestructuredType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructuredType"


    // $ANTLR start "rulestructuredType"
    // InternalPascal.g:1906:1: rulestructuredType returns [EObject current=null] : ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) ) ) ;
    public final EObject rulestructuredType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unpackedStructuredType1_1_0 = null;

        EObject lv_unpackedStructuredType2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1912:2: ( ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) ) ) )
            // InternalPascal.g:1913:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) ) )
            {
            // InternalPascal.g:1913:2: ( (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) ) | ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            else if ( (LA20_0==48) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1914:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) )
                    {
                    // InternalPascal.g:1914:3: (otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) ) )
                    // InternalPascal.g:1915:4: otherlv_0= 'packed' ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getStructuredTypeAccess().getPackedKeyword_0_0());
                    			
                    // InternalPascal.g:1919:4: ( (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:1920:5: (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:1920:5: (lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType )
                    // InternalPascal.g:1921:6: lv_unpackedStructuredType1_1_0= ruleunpackedStructuredType
                    {

                    						newCompositeNode(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredType1UnpackedStructuredTypeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unpackedStructuredType1_1_0=ruleunpackedStructuredType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructuredTypeRule());
                    						}
                    						set(
                    							current,
                    							"unpackedStructuredType1",
                    							lv_unpackedStructuredType1_1_0,
                    							"org.xtext.example.mydsl.Pascal.unpackedStructuredType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1940:3: ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) )
                    {
                    // InternalPascal.g:1940:3: ( (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType ) )
                    // InternalPascal.g:1941:4: (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType )
                    {
                    // InternalPascal.g:1941:4: (lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType )
                    // InternalPascal.g:1942:5: lv_unpackedStructuredType2_2_0= ruleunpackedStructuredType
                    {

                    					newCompositeNode(grammarAccess.getStructuredTypeAccess().getUnpackedStructuredType2UnpackedStructuredTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpackedStructuredType2_2_0=ruleunpackedStructuredType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredTypeRule());
                    					}
                    					set(
                    						current,
                    						"unpackedStructuredType2",
                    						lv_unpackedStructuredType2_2_0,
                    						"org.xtext.example.mydsl.Pascal.unpackedStructuredType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulestructuredType"


    // $ANTLR start "entryRuleunpackedStructuredType"
    // InternalPascal.g:1963:1: entryRuleunpackedStructuredType returns [EObject current=null] : iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF ;
    public final EObject entryRuleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpackedStructuredType = null;


        try {
            // InternalPascal.g:1963:63: (iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF )
            // InternalPascal.g:1964:2: iv_ruleunpackedStructuredType= ruleunpackedStructuredType EOF
            {
             newCompositeNode(grammarAccess.getUnpackedStructuredTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpackedStructuredType=ruleunpackedStructuredType();

            state._fsp--;

             current =iv_ruleunpackedStructuredType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpackedStructuredType"


    // $ANTLR start "ruleunpackedStructuredType"
    // InternalPascal.g:1970:1: ruleunpackedStructuredType returns [EObject current=null] : ( (lv_unpackedStructuredType_0_0= rulerecordType ) ) ;
    public final EObject ruleunpackedStructuredType() throws RecognitionException {
        EObject current = null;

        EObject lv_unpackedStructuredType_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1976:2: ( ( (lv_unpackedStructuredType_0_0= rulerecordType ) ) )
            // InternalPascal.g:1977:2: ( (lv_unpackedStructuredType_0_0= rulerecordType ) )
            {
            // InternalPascal.g:1977:2: ( (lv_unpackedStructuredType_0_0= rulerecordType ) )
            // InternalPascal.g:1978:3: (lv_unpackedStructuredType_0_0= rulerecordType )
            {
            // InternalPascal.g:1978:3: (lv_unpackedStructuredType_0_0= rulerecordType )
            // InternalPascal.g:1979:4: lv_unpackedStructuredType_0_0= rulerecordType
            {

            				newCompositeNode(grammarAccess.getUnpackedStructuredTypeAccess().getUnpackedStructuredTypeRecordTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_unpackedStructuredType_0_0=rulerecordType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnpackedStructuredTypeRule());
            				}
            				set(
            					current,
            					"unpackedStructuredType",
            					lv_unpackedStructuredType_0_0,
            					"org.xtext.example.mydsl.Pascal.recordType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleunpackedStructuredType"


    // $ANTLR start "entryRulestringtype"
    // InternalPascal.g:1999:1: entryRulestringtype returns [EObject current=null] : iv_rulestringtype= rulestringtype EOF ;
    public final EObject entryRulestringtype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringtype = null;


        try {
            // InternalPascal.g:1999:51: (iv_rulestringtype= rulestringtype EOF )
            // InternalPascal.g:2000:2: iv_rulestringtype= rulestringtype EOF
            {
             newCompositeNode(grammarAccess.getStringtypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringtype=rulestringtype();

            state._fsp--;

             current =iv_rulestringtype; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestringtype"


    // $ANTLR start "rulestringtype"
    // InternalPascal.g:2006:1: rulestringtype returns [EObject current=null] : ( ( (lv_stringTerminal_0_0= RULE_STRING ) ) otherlv_1= '[' ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) ;
    public final EObject rulestringtype() throws RecognitionException {
        EObject current = null;

        Token lv_stringTerminal_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ID_2_0 = null;

        EObject lv_unsignedNumber_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2012:2: ( ( ( (lv_stringTerminal_0_0= RULE_STRING ) ) otherlv_1= '[' ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' ) )
            // InternalPascal.g:2013:2: ( ( (lv_stringTerminal_0_0= RULE_STRING ) ) otherlv_1= '[' ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            {
            // InternalPascal.g:2013:2: ( ( (lv_stringTerminal_0_0= RULE_STRING ) ) otherlv_1= '[' ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']' )
            // InternalPascal.g:2014:3: ( (lv_stringTerminal_0_0= RULE_STRING ) ) otherlv_1= '[' ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) ) otherlv_4= ']'
            {
            // InternalPascal.g:2014:3: ( (lv_stringTerminal_0_0= RULE_STRING ) )
            // InternalPascal.g:2015:4: (lv_stringTerminal_0_0= RULE_STRING )
            {
            // InternalPascal.g:2015:4: (lv_stringTerminal_0_0= RULE_STRING )
            // InternalPascal.g:2016:5: lv_stringTerminal_0_0= RULE_STRING
            {
            lv_stringTerminal_0_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_stringTerminal_0_0, grammarAccess.getStringtypeAccess().getStringTerminalSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringtypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stringTerminal",
            						lv_stringTerminal_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getStringtypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:2036:3: ( ( (lv_ID_2_0= ruleidentifier ) ) | ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_IDENT) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_NUM_INT && LA21_0<=RULE_NUM_REAL)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2037:4: ( (lv_ID_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:2037:4: ( (lv_ID_2_0= ruleidentifier ) )
                    // InternalPascal.g:2038:5: (lv_ID_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:2038:5: (lv_ID_2_0= ruleidentifier )
                    // InternalPascal.g:2039:6: lv_ID_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getIDIdentifierParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_ID_2_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringtypeRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_2_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2057:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:2057:4: ( (lv_unsignedNumber_3_0= ruleunsignedNumber ) )
                    // InternalPascal.g:2058:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:2058:5: (lv_unsignedNumber_3_0= ruleunsignedNumber )
                    // InternalPascal.g:2059:6: lv_unsignedNumber_3_0= ruleunsignedNumber
                    {

                    						newCompositeNode(grammarAccess.getStringtypeAccess().getUnsignedNumberUnsignedNumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_unsignedNumber_3_0=ruleunsignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringtypeRule());
                    						}
                    						set(
                    							current,
                    							"unsignedNumber",
                    							lv_unsignedNumber_3_0,
                    							"org.xtext.example.mydsl.Pascal.unsignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringtypeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "rulestringtype"


    // $ANTLR start "entryRulerecordType"
    // InternalPascal.g:2085:1: entryRulerecordType returns [EObject current=null] : iv_rulerecordType= rulerecordType EOF ;
    public final EObject entryRulerecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordType = null;


        try {
            // InternalPascal.g:2085:51: (iv_rulerecordType= rulerecordType EOF )
            // InternalPascal.g:2086:2: iv_rulerecordType= rulerecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecordType=rulerecordType();

            state._fsp--;

             current =iv_rulerecordType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecordType"


    // $ANTLR start "rulerecordType"
    // InternalPascal.g:2092:1: rulerecordType returns [EObject current=null] : ( () otherlv_1= 'record' ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )? otherlv_4= 'end' ) ;
    public final EObject rulerecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_semiTerminal_3_0=null;
        Token otherlv_4=null;
        EObject lv_fieldList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2098:2: ( ( () otherlv_1= 'record' ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )? otherlv_4= 'end' ) )
            // InternalPascal.g:2099:2: ( () otherlv_1= 'record' ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )? otherlv_4= 'end' )
            {
            // InternalPascal.g:2099:2: ( () otherlv_1= 'record' ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )? otherlv_4= 'end' )
            // InternalPascal.g:2100:3: () otherlv_1= 'record' ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )? otherlv_4= 'end'
            {
            // InternalPascal.g:2100:3: ()
            // InternalPascal.g:2101:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecordTypeAccess().getRecordTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getRecordKeyword_1());
            		
            // InternalPascal.g:2111:3: ( ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENT||LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2112:4: ( (lv_fieldList_2_0= rulefieldList ) ) ( (lv_semiTerminal_3_0= ';' ) )
                    {
                    // InternalPascal.g:2112:4: ( (lv_fieldList_2_0= rulefieldList ) )
                    // InternalPascal.g:2113:5: (lv_fieldList_2_0= rulefieldList )
                    {
                    // InternalPascal.g:2113:5: (lv_fieldList_2_0= rulefieldList )
                    // InternalPascal.g:2114:6: lv_fieldList_2_0= rulefieldList
                    {

                    						newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_fieldList_2_0=rulefieldList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    						}
                    						set(
                    							current,
                    							"fieldList",
                    							lv_fieldList_2_0,
                    							"org.xtext.example.mydsl.Pascal.fieldList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:2131:4: ( (lv_semiTerminal_3_0= ';' ) )
                    // InternalPascal.g:2132:5: (lv_semiTerminal_3_0= ';' )
                    {
                    // InternalPascal.g:2132:5: (lv_semiTerminal_3_0= ';' )
                    // InternalPascal.g:2133:6: lv_semiTerminal_3_0= ';'
                    {
                    lv_semiTerminal_3_0=(Token)match(input,22,FOLLOW_27); 

                    						newLeafNode(lv_semiTerminal_3_0, grammarAccess.getRecordTypeAccess().getSemiTerminalSemicolonKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordTypeRule());
                    						}
                    						setWithLastConsumed(current, "semiTerminal", lv_semiTerminal_3_0, ";");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "rulerecordType"


    // $ANTLR start "entryRulefieldList"
    // InternalPascal.g:2154:1: entryRulefieldList returns [EObject current=null] : iv_rulefieldList= rulefieldList EOF ;
    public final EObject entryRulefieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefieldList = null;


        try {
            // InternalPascal.g:2154:50: (iv_rulefieldList= rulefieldList EOF )
            // InternalPascal.g:2155:2: iv_rulefieldList= rulefieldList EOF
            {
             newCompositeNode(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefieldList=rulefieldList();

            state._fsp--;

             current =iv_rulefieldList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefieldList"


    // $ANTLR start "rulefieldList"
    // InternalPascal.g:2161:1: rulefieldList returns [EObject current=null] : ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart2_3_0= rulevariantPart ) ) ) ;
    public final EObject rulefieldList() throws RecognitionException {
        EObject current = null;

        Token lv_semiTerminal_1_0=null;
        EObject lv_fixedPart_0_0 = null;

        EObject lv_variantPart1_2_0 = null;

        EObject lv_variantPart2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2167:2: ( ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart2_3_0= rulevariantPart ) ) ) )
            // InternalPascal.g:2168:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart2_3_0= rulevariantPart ) ) )
            {
            // InternalPascal.g:2168:2: ( ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? ) | ( (lv_variantPart2_3_0= rulevariantPart ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2169:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? )
                    {
                    // InternalPascal.g:2169:3: ( ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )? )
                    // InternalPascal.g:2170:4: ( (lv_fixedPart_0_0= rulefixedPart ) ) ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )?
                    {
                    // InternalPascal.g:2170:4: ( (lv_fixedPart_0_0= rulefixedPart ) )
                    // InternalPascal.g:2171:5: (lv_fixedPart_0_0= rulefixedPart )
                    {
                    // InternalPascal.g:2171:5: (lv_fixedPart_0_0= rulefixedPart )
                    // InternalPascal.g:2172:6: lv_fixedPart_0_0= rulefixedPart
                    {

                    						newCompositeNode(grammarAccess.getFieldListAccess().getFixedPartFixedPartParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_fixedPart_0_0=rulefixedPart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldListRule());
                    						}
                    						set(
                    							current,
                    							"fixedPart",
                    							lv_fixedPart_0_0,
                    							"org.xtext.example.mydsl.Pascal.fixedPart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:2189:4: ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==22) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==50) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPascal.g:2190:5: ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_variantPart1_2_0= rulevariantPart ) )
                            {
                            // InternalPascal.g:2190:5: ( (lv_semiTerminal_1_0= ';' ) )
                            // InternalPascal.g:2191:6: (lv_semiTerminal_1_0= ';' )
                            {
                            // InternalPascal.g:2191:6: (lv_semiTerminal_1_0= ';' )
                            // InternalPascal.g:2192:7: lv_semiTerminal_1_0= ';'
                            {
                            lv_semiTerminal_1_0=(Token)match(input,22,FOLLOW_29); 

                            							newLeafNode(lv_semiTerminal_1_0, grammarAccess.getFieldListAccess().getSemiTerminalSemicolonKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldListRule());
                            							}
                            							setWithLastConsumed(current, "semiTerminal", lv_semiTerminal_1_0, ";");
                            						

                            }


                            }

                            // InternalPascal.g:2204:5: ( (lv_variantPart1_2_0= rulevariantPart ) )
                            // InternalPascal.g:2205:6: (lv_variantPart1_2_0= rulevariantPart )
                            {
                            // InternalPascal.g:2205:6: (lv_variantPart1_2_0= rulevariantPart )
                            // InternalPascal.g:2206:7: lv_variantPart1_2_0= rulevariantPart
                            {

                            							newCompositeNode(grammarAccess.getFieldListAccess().getVariantPart1VariantPartParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_variantPart1_2_0=rulevariantPart();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFieldListRule());
                            							}
                            							set(
                            								current,
                            								"variantPart1",
                            								lv_variantPart1_2_0,
                            								"org.xtext.example.mydsl.Pascal.variantPart");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2226:3: ( (lv_variantPart2_3_0= rulevariantPart ) )
                    {
                    // InternalPascal.g:2226:3: ( (lv_variantPart2_3_0= rulevariantPart ) )
                    // InternalPascal.g:2227:4: (lv_variantPart2_3_0= rulevariantPart )
                    {
                    // InternalPascal.g:2227:4: (lv_variantPart2_3_0= rulevariantPart )
                    // InternalPascal.g:2228:5: lv_variantPart2_3_0= rulevariantPart
                    {

                    					newCompositeNode(grammarAccess.getFieldListAccess().getVariantPart2VariantPartParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variantPart2_3_0=rulevariantPart();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldListRule());
                    					}
                    					set(
                    						current,
                    						"variantPart2",
                    						lv_variantPart2_3_0,
                    						"org.xtext.example.mydsl.Pascal.variantPart");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulefieldList"


    // $ANTLR start "entryRulefixedPart"
    // InternalPascal.g:2249:1: entryRulefixedPart returns [EObject current=null] : iv_rulefixedPart= rulefixedPart EOF ;
    public final EObject entryRulefixedPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixedPart = null;


        try {
            // InternalPascal.g:2249:50: (iv_rulefixedPart= rulefixedPart EOF )
            // InternalPascal.g:2250:2: iv_rulefixedPart= rulefixedPart EOF
            {
             newCompositeNode(grammarAccess.getFixedPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefixedPart=rulefixedPart();

            state._fsp--;

             current =iv_rulefixedPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefixedPart"


    // $ANTLR start "rulefixedPart"
    // InternalPascal.g:2256:1: rulefixedPart returns [EObject current=null] : (this_recordSection_0= rulerecordSection ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )* ) ;
    public final EObject rulefixedPart() throws RecognitionException {
        EObject current = null;

        Token lv_semiTerminal_1_0=null;
        EObject this_recordSection_0 = null;

        EObject lv_recordSection_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2262:2: ( (this_recordSection_0= rulerecordSection ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )* ) )
            // InternalPascal.g:2263:2: (this_recordSection_0= rulerecordSection ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )* )
            {
            // InternalPascal.g:2263:2: (this_recordSection_0= rulerecordSection ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )* )
            // InternalPascal.g:2264:3: this_recordSection_0= rulerecordSection ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )*
            {

            			newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSectionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_recordSection_0=rulerecordSection();

            state._fsp--;


            			current = this_recordSection_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:2272:3: ( ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_IDENT) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascal.g:2273:4: ( (lv_semiTerminal_1_0= ';' ) ) ( (lv_recordSection_2_0= rulerecordSection ) )
            	    {
            	    // InternalPascal.g:2273:4: ( (lv_semiTerminal_1_0= ';' ) )
            	    // InternalPascal.g:2274:5: (lv_semiTerminal_1_0= ';' )
            	    {
            	    // InternalPascal.g:2274:5: (lv_semiTerminal_1_0= ';' )
            	    // InternalPascal.g:2275:6: lv_semiTerminal_1_0= ';'
            	    {
            	    lv_semiTerminal_1_0=(Token)match(input,22,FOLLOW_5); 

            	    						newLeafNode(lv_semiTerminal_1_0, grammarAccess.getFixedPartAccess().getSemiTerminalSemicolonKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFixedPartRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal", lv_semiTerminal_1_0, ";");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:2287:4: ( (lv_recordSection_2_0= rulerecordSection ) )
            	    // InternalPascal.g:2288:5: (lv_recordSection_2_0= rulerecordSection )
            	    {
            	    // InternalPascal.g:2288:5: (lv_recordSection_2_0= rulerecordSection )
            	    // InternalPascal.g:2289:6: lv_recordSection_2_0= rulerecordSection
            	    {

            	    						newCompositeNode(grammarAccess.getFixedPartAccess().getRecordSectionRecordSectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_recordSection_2_0=rulerecordSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFixedPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordSection",
            	    							lv_recordSection_2_0,
            	    							"org.xtext.example.mydsl.Pascal.recordSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "rulefixedPart"


    // $ANTLR start "entryRulerecordSection"
    // InternalPascal.g:2311:1: entryRulerecordSection returns [EObject current=null] : iv_rulerecordSection= rulerecordSection EOF ;
    public final EObject entryRulerecordSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordSection = null;


        try {
            // InternalPascal.g:2311:54: (iv_rulerecordSection= rulerecordSection EOF )
            // InternalPascal.g:2312:2: iv_rulerecordSection= rulerecordSection EOF
            {
             newCompositeNode(grammarAccess.getRecordSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecordSection=rulerecordSection();

            state._fsp--;

             current =iv_rulerecordSection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecordSection"


    // $ANTLR start "rulerecordSection"
    // InternalPascal.g:2318:1: rulerecordSection returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) ) ;
    public final EObject rulerecordSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_typeStart_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2324:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) ) )
            // InternalPascal.g:2325:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) )
            {
            // InternalPascal.g:2325:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) )
            // InternalPascal.g:2326:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) )
            {
            // InternalPascal.g:2326:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2327:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2327:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2328:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getRecordSectionAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordSectionRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"org.xtext.example.mydsl.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordSectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2349:3: ( (lv_typeStart_2_0= ruletypeStart ) )
            // InternalPascal.g:2350:4: (lv_typeStart_2_0= ruletypeStart )
            {
            // InternalPascal.g:2350:4: (lv_typeStart_2_0= ruletypeStart )
            // InternalPascal.g:2351:5: lv_typeStart_2_0= ruletypeStart
            {

            					newCompositeNode(grammarAccess.getRecordSectionAccess().getTypeStartTypeStartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeStart_2_0=ruletypeStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordSectionRule());
            					}
            					set(
            						current,
            						"typeStart",
            						lv_typeStart_2_0,
            						"org.xtext.example.mydsl.Pascal.typeStart");
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
    // $ANTLR end "rulerecordSection"


    // $ANTLR start "entryRulevariantPart"
    // InternalPascal.g:2372:1: entryRulevariantPart returns [EObject current=null] : iv_rulevariantPart= rulevariantPart EOF ;
    public final EObject entryRulevariantPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariantPart = null;


        try {
            // InternalPascal.g:2372:52: (iv_rulevariantPart= rulevariantPart EOF )
            // InternalPascal.g:2373:2: iv_rulevariantPart= rulevariantPart EOF
            {
             newCompositeNode(grammarAccess.getVariantPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariantPart=rulevariantPart();

            state._fsp--;

             current =iv_rulevariantPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariantPart"


    // $ANTLR start "rulevariantPart"
    // InternalPascal.g:2379:1: rulevariantPart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant1_3_0= rulevariant ) ) ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )* ) ;
    public final EObject rulevariantPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_semiTerminal_4_0=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variant1_3_0 = null;

        EObject lv_variant2_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2385:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant1_3_0= rulevariant ) ) ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )* ) )
            // InternalPascal.g:2386:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant1_3_0= rulevariant ) ) ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:2386:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant1_3_0= rulevariant ) ) ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )* )
            // InternalPascal.g:2387:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag ) ) otherlv_2= 'of' ( (lv_variant1_3_0= rulevariant ) ) ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVariantPartAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:2391:3: ( (lv_tag_1_0= ruletag ) )
            // InternalPascal.g:2392:4: (lv_tag_1_0= ruletag )
            {
            // InternalPascal.g:2392:4: (lv_tag_1_0= ruletag )
            // InternalPascal.g:2393:5: lv_tag_1_0= ruletag
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getTagTagParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_tag_1_0=ruletag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantPartRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_1_0,
            						"org.xtext.example.mydsl.Pascal.tag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantPartAccess().getOfKeyword_2());
            		
            // InternalPascal.g:2414:3: ( (lv_variant1_3_0= rulevariant ) )
            // InternalPascal.g:2415:4: (lv_variant1_3_0= rulevariant )
            {
            // InternalPascal.g:2415:4: (lv_variant1_3_0= rulevariant )
            // InternalPascal.g:2416:5: lv_variant1_3_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariantPartAccess().getVariant1VariantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_variant1_3_0=rulevariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantPartRule());
            					}
            					set(
            						current,
            						"variant1",
            						lv_variant1_3_0,
            						"org.xtext.example.mydsl.Pascal.variant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2433:3: ( ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_IDENT && LA26_1<=RULE_STRING)||(LA26_1>=30 && LA26_1<=34)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2434:4: ( (lv_semiTerminal_4_0= ';' ) ) ( (lv_variant2_5_0= rulevariant ) )
            	    {
            	    // InternalPascal.g:2434:4: ( (lv_semiTerminal_4_0= ';' ) )
            	    // InternalPascal.g:2435:5: (lv_semiTerminal_4_0= ';' )
            	    {
            	    // InternalPascal.g:2435:5: (lv_semiTerminal_4_0= ';' )
            	    // InternalPascal.g:2436:6: lv_semiTerminal_4_0= ';'
            	    {
            	    lv_semiTerminal_4_0=(Token)match(input,22,FOLLOW_13); 

            	    						newLeafNode(lv_semiTerminal_4_0, grammarAccess.getVariantPartAccess().getSemiTerminalSemicolonKeyword_4_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariantPartRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal", lv_semiTerminal_4_0, ";");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:2448:4: ( (lv_variant2_5_0= rulevariant ) )
            	    // InternalPascal.g:2449:5: (lv_variant2_5_0= rulevariant )
            	    {
            	    // InternalPascal.g:2449:5: (lv_variant2_5_0= rulevariant )
            	    // InternalPascal.g:2450:6: lv_variant2_5_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariantPartAccess().getVariant2VariantParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_variant2_5_0=rulevariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariantPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variant2",
            	    							lv_variant2_5_0,
            	    							"org.xtext.example.mydsl.Pascal.variant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "rulevariantPart"


    // $ANTLR start "entryRuletag"
    // InternalPascal.g:2472:1: entryRuletag returns [EObject current=null] : iv_ruletag= ruletag EOF ;
    public final EObject entryRuletag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag = null;


        try {
            // InternalPascal.g:2472:44: (iv_ruletag= ruletag EOF )
            // InternalPascal.g:2473:2: iv_ruletag= ruletag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletag=ruletag();

            state._fsp--;

             current =iv_ruletag; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletag"


    // $ANTLR start "ruletag"
    // InternalPascal.g:2479:1: ruletag returns [EObject current=null] : ( ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruletag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ID_0_0 = null;

        EObject lv_typeIdentifier1_2_0 = null;

        EObject lv_typeIdentifier2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2485:2: ( ( ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:2486:2: ( ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:2486:2: ( ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) ) | ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENT) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==37) ) {
                    alt27=1;
                }
                else if ( (LA27_1==EOF||LA27_1==51) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA27_0>=40 && LA27_0<=44)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2487:3: ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) )
                    {
                    // InternalPascal.g:2487:3: ( ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) ) )
                    // InternalPascal.g:2488:4: ( (lv_ID_0_0= ruleidentifier ) ) otherlv_1= ':' ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2488:4: ( (lv_ID_0_0= ruleidentifier ) )
                    // InternalPascal.g:2489:5: (lv_ID_0_0= ruleidentifier )
                    {
                    // InternalPascal.g:2489:5: (lv_ID_0_0= ruleidentifier )
                    // InternalPascal.g:2490:6: lv_ID_0_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getIDIdentifierParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ID_0_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTagRule());
                    						}
                    						set(
                    							current,
                    							"ID",
                    							lv_ID_0_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getTagAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:2511:4: ( (lv_typeIdentifier1_2_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2512:5: (lv_typeIdentifier1_2_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2512:5: (lv_typeIdentifier1_2_0= ruletypeIdentifier )
                    // InternalPascal.g:2513:6: lv_typeIdentifier1_2_0= ruletypeIdentifier
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getTypeIdentifier1TypeIdentifierParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_typeIdentifier1_2_0=ruletypeIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTagRule());
                    						}
                    						set(
                    							current,
                    							"typeIdentifier1",
                    							lv_typeIdentifier1_2_0,
                    							"org.xtext.example.mydsl.Pascal.typeIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2532:3: ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) )
                    {
                    // InternalPascal.g:2532:3: ( (lv_typeIdentifier2_3_0= ruletypeIdentifier ) )
                    // InternalPascal.g:2533:4: (lv_typeIdentifier2_3_0= ruletypeIdentifier )
                    {
                    // InternalPascal.g:2533:4: (lv_typeIdentifier2_3_0= ruletypeIdentifier )
                    // InternalPascal.g:2534:5: lv_typeIdentifier2_3_0= ruletypeIdentifier
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getTypeIdentifier2TypeIdentifierParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeIdentifier2_3_0=ruletypeIdentifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					set(
                    						current,
                    						"typeIdentifier2",
                    						lv_typeIdentifier2_3_0,
                    						"org.xtext.example.mydsl.Pascal.typeIdentifier");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruletag"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:2555:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:2555:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:2556:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:2562:1: rulevariant returns [EObject current=null] : ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fieldList_3_0= rulefieldList ) ) otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constList_0_0 = null;

        EObject lv_fieldList_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2568:2: ( ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fieldList_3_0= rulefieldList ) ) otherlv_4= ')' ) )
            // InternalPascal.g:2569:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fieldList_3_0= rulefieldList ) ) otherlv_4= ')' )
            {
            // InternalPascal.g:2569:2: ( ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fieldList_3_0= rulefieldList ) ) otherlv_4= ')' )
            // InternalPascal.g:2570:3: ( (lv_constList_0_0= ruleconstList ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fieldList_3_0= rulefieldList ) ) otherlv_4= ')'
            {
            // InternalPascal.g:2570:3: ( (lv_constList_0_0= ruleconstList ) )
            // InternalPascal.g:2571:4: (lv_constList_0_0= ruleconstList )
            {
            // InternalPascal.g:2571:4: (lv_constList_0_0= ruleconstList )
            // InternalPascal.g:2572:5: lv_constList_0_0= ruleconstList
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getConstListConstListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_constList_0_0=ruleconstList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"constList",
            						lv_constList_0_0,
            						"org.xtext.example.mydsl.Pascal.constList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPascal.g:2597:3: ( (lv_fieldList_3_0= rulefieldList ) )
            // InternalPascal.g:2598:4: (lv_fieldList_3_0= rulefieldList )
            {
            // InternalPascal.g:2598:4: (lv_fieldList_3_0= rulefieldList )
            // InternalPascal.g:2599:5: lv_fieldList_3_0= rulefieldList
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getFieldListFieldListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_fieldList_3_0=rulefieldList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"fieldList",
            						lv_fieldList_3_0,
            						"org.xtext.example.mydsl.Pascal.fieldList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulepointerType"
    // InternalPascal.g:2624:1: entryRulepointerType returns [EObject current=null] : iv_rulepointerType= rulepointerType EOF ;
    public final EObject entryRulepointerType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointerType = null;


        try {
            // InternalPascal.g:2624:52: (iv_rulepointerType= rulepointerType EOF )
            // InternalPascal.g:2625:2: iv_rulepointerType= rulepointerType EOF
            {
             newCompositeNode(grammarAccess.getPointerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointerType=rulepointerType();

            state._fsp--;

             current =iv_rulepointerType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepointerType"


    // $ANTLR start "rulepointerType"
    // InternalPascal.g:2631:1: rulepointerType returns [EObject current=null] : (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) ;
    public final EObject rulepointerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeIdentifier_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2637:2: ( (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:2638:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:2638:2: (otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:2639:3: otherlv_0= '^' ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPointerTypeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:2643:3: ( (lv_typeIdentifier_1_0= ruletypeIdentifier ) )
            // InternalPascal.g:2644:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            {
            // InternalPascal.g:2644:4: (lv_typeIdentifier_1_0= ruletypeIdentifier )
            // InternalPascal.g:2645:5: lv_typeIdentifier_1_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getPointerTypeAccess().getTypeIdentifierTypeIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_1_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointerTypeRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_1_0,
            						"org.xtext.example.mydsl.Pascal.typeIdentifier");
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
    // $ANTLR end "rulepointerType"


    // $ANTLR start "entryRulevariableDeclarationPart"
    // InternalPascal.g:2666:1: entryRulevariableDeclarationPart returns [EObject current=null] : iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF ;
    public final EObject entryRulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclarationPart = null;


        try {
            // InternalPascal.g:2666:64: (iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF )
            // InternalPascal.g:2667:2: iv_rulevariableDeclarationPart= rulevariableDeclarationPart EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclarationPart=rulevariableDeclarationPart();

            state._fsp--;

             current =iv_rulevariableDeclarationPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariableDeclarationPart"


    // $ANTLR start "rulevariableDeclarationPart"
    // InternalPascal.g:2673:1: rulevariableDeclarationPart returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) ) ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulevariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semiTerminal_2_0=null;
        Token otherlv_4=null;
        EObject lv_variableDeclaration1_1_0 = null;

        EObject lv_variableDeclaration2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2679:2: ( (otherlv_0= 'var' ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) ) ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2680:2: (otherlv_0= 'var' ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) ) ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2680:2: (otherlv_0= 'var' ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) ) ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2681:3: otherlv_0= 'var' ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) ) ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationPartAccess().getVarKeyword_0());
            		
            // InternalPascal.g:2685:3: ( (lv_variableDeclaration1_1_0= rulevariableDeclaration ) )
            // InternalPascal.g:2686:4: (lv_variableDeclaration1_1_0= rulevariableDeclaration )
            {
            // InternalPascal.g:2686:4: (lv_variableDeclaration1_1_0= rulevariableDeclaration )
            // InternalPascal.g:2687:5: lv_variableDeclaration1_1_0= rulevariableDeclaration
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclaration1VariableDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_variableDeclaration1_1_0=rulevariableDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationPartRule());
            					}
            					set(
            						current,
            						"variableDeclaration1",
            						lv_variableDeclaration1_1_0,
            						"org.xtext.example.mydsl.Pascal.variableDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2704:3: ( ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_IDENT) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2705:4: ( (lv_semiTerminal_2_0= ';' ) ) ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) )
            	    {
            	    // InternalPascal.g:2705:4: ( (lv_semiTerminal_2_0= ';' ) )
            	    // InternalPascal.g:2706:5: (lv_semiTerminal_2_0= ';' )
            	    {
            	    // InternalPascal.g:2706:5: (lv_semiTerminal_2_0= ';' )
            	    // InternalPascal.g:2707:6: lv_semiTerminal_2_0= ';'
            	    {
            	    lv_semiTerminal_2_0=(Token)match(input,22,FOLLOW_5); 

            	    						newLeafNode(lv_semiTerminal_2_0, grammarAccess.getVariableDeclarationPartAccess().getSemiTerminalSemicolonKeyword_2_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariableDeclarationPartRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal", lv_semiTerminal_2_0, ";");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:2719:4: ( (lv_variableDeclaration2_3_0= rulevariableDeclaration ) )
            	    // InternalPascal.g:2720:5: (lv_variableDeclaration2_3_0= rulevariableDeclaration )
            	    {
            	    // InternalPascal.g:2720:5: (lv_variableDeclaration2_3_0= rulevariableDeclaration )
            	    // InternalPascal.g:2721:6: lv_variableDeclaration2_3_0= rulevariableDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVariableDeclarationPartAccess().getVariableDeclaration2VariableDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_variableDeclaration2_3_0=rulevariableDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableDeclarationPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDeclaration2",
            	    							lv_variableDeclaration2_3_0,
            	    							"org.xtext.example.mydsl.Pascal.variableDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationPartAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulevariableDeclarationPart"


    // $ANTLR start "entryRulevariableDeclaration"
    // InternalPascal.g:2747:1: entryRulevariableDeclaration returns [EObject current=null] : iv_rulevariableDeclaration= rulevariableDeclaration EOF ;
    public final EObject entryRulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariableDeclaration = null;


        try {
            // InternalPascal.g:2747:60: (iv_rulevariableDeclaration= rulevariableDeclaration EOF )
            // InternalPascal.g:2748:2: iv_rulevariableDeclaration= rulevariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableDeclaration=rulevariableDeclaration();

            state._fsp--;

             current =iv_rulevariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariableDeclaration"


    // $ANTLR start "rulevariableDeclaration"
    // InternalPascal.g:2754:1: rulevariableDeclaration returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) ) ;
    public final EObject rulevariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_typeStart_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2760:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) ) )
            // InternalPascal.g:2761:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) )
            {
            // InternalPascal.g:2761:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) ) )
            // InternalPascal.g:2762:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeStart_2_0= ruletypeStart ) )
            {
            // InternalPascal.g:2762:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:2763:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:2763:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:2764:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"org.xtext.example.mydsl.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2785:3: ( (lv_typeStart_2_0= ruletypeStart ) )
            // InternalPascal.g:2786:4: (lv_typeStart_2_0= ruletypeStart )
            {
            // InternalPascal.g:2786:4: (lv_typeStart_2_0= ruletypeStart )
            // InternalPascal.g:2787:5: lv_typeStart_2_0= ruletypeStart
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeStartTypeStartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeStart_2_0=ruletypeStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"typeStart",
            						lv_typeStart_2_0,
            						"org.xtext.example.mydsl.Pascal.typeStart");
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
    // $ANTLR end "rulevariableDeclaration"


    // $ANTLR start "entryRuleprocedureAndFunctionDeclarationPart"
    // InternalPascal.g:2808:1: entryRuleprocedureAndFunctionDeclarationPart returns [EObject current=null] : iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF ;
    public final EObject entryRuleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureAndFunctionDeclarationPart = null;


        try {
            // InternalPascal.g:2808:76: (iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF )
            // InternalPascal.g:2809:2: iv_ruleprocedureAndFunctionDeclarationPart= ruleprocedureAndFunctionDeclarationPart EOF
            {
             newCompositeNode(grammarAccess.getProcedureAndFunctionDeclarationPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureAndFunctionDeclarationPart=ruleprocedureAndFunctionDeclarationPart();

            state._fsp--;

             current =iv_ruleprocedureAndFunctionDeclarationPart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedureAndFunctionDeclarationPart"


    // $ANTLR start "ruleprocedureAndFunctionDeclarationPart"
    // InternalPascal.g:2815:1: ruleprocedureAndFunctionDeclarationPart returns [EObject current=null] : ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) ;
    public final EObject ruleprocedureAndFunctionDeclarationPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_procedureOrFunctionDeclaration_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2821:2: ( ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' ) )
            // InternalPascal.g:2822:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            {
            // InternalPascal.g:2822:2: ( ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';' )
            // InternalPascal.g:2823:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) ) otherlv_1= ';'
            {
            // InternalPascal.g:2823:3: ( (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration ) )
            // InternalPascal.g:2824:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            {
            // InternalPascal.g:2824:4: (lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration )
            // InternalPascal.g:2825:5: lv_procedureOrFunctionDeclaration_0_0= ruleprocedureOrFunctionDeclaration
            {

            					newCompositeNode(grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getProcedureOrFunctionDeclarationProcedureOrFunctionDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_procedureOrFunctionDeclaration_0_0=ruleprocedureOrFunctionDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureAndFunctionDeclarationPartRule());
            					}
            					set(
            						current,
            						"procedureOrFunctionDeclaration",
            						lv_procedureOrFunctionDeclaration_0_0,
            						"org.xtext.example.mydsl.Pascal.procedureOrFunctionDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedureAndFunctionDeclarationPartAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleprocedureAndFunctionDeclarationPart"


    // $ANTLR start "entryRuleprocedureOrFunctionDeclaration"
    // InternalPascal.g:2850:1: entryRuleprocedureOrFunctionDeclaration returns [EObject current=null] : iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF ;
    public final EObject entryRuleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureOrFunctionDeclaration = null;


        try {
            // InternalPascal.g:2850:71: (iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF )
            // InternalPascal.g:2851:2: iv_ruleprocedureOrFunctionDeclaration= ruleprocedureOrFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureOrFunctionDeclaration=ruleprocedureOrFunctionDeclaration();

            state._fsp--;

             current =iv_ruleprocedureOrFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedureOrFunctionDeclaration"


    // $ANTLR start "ruleprocedureOrFunctionDeclaration"
    // InternalPascal.g:2857:1: ruleprocedureOrFunctionDeclaration returns [EObject current=null] : ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) ;
    public final EObject ruleprocedureOrFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_procedureDeclaration_0_0 = null;

        EObject lv_functionDeclaration_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2863:2: ( ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) ) )
            // InternalPascal.g:2864:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
            {
            // InternalPascal.g:2864:2: ( ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) ) | ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            else if ( (LA29_0==36) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2865:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    {
                    // InternalPascal.g:2865:3: ( (lv_procedureDeclaration_0_0= ruleprocedureDeclaration ) )
                    // InternalPascal.g:2866:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    {
                    // InternalPascal.g:2866:4: (lv_procedureDeclaration_0_0= ruleprocedureDeclaration )
                    // InternalPascal.g:2867:5: lv_procedureDeclaration_0_0= ruleprocedureDeclaration
                    {

                    					newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationAccess().getProcedureDeclarationProcedureDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedureDeclaration_0_0=ruleprocedureDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureOrFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"procedureDeclaration",
                    						lv_procedureDeclaration_0_0,
                    						"org.xtext.example.mydsl.Pascal.procedureDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2885:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    {
                    // InternalPascal.g:2885:3: ( (lv_functionDeclaration_1_0= rulefunctionDeclaration ) )
                    // InternalPascal.g:2886:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    {
                    // InternalPascal.g:2886:4: (lv_functionDeclaration_1_0= rulefunctionDeclaration )
                    // InternalPascal.g:2887:5: lv_functionDeclaration_1_0= rulefunctionDeclaration
                    {

                    					newCompositeNode(grammarAccess.getProcedureOrFunctionDeclarationAccess().getFunctionDeclarationFunctionDeclarationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionDeclaration_1_0=rulefunctionDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureOrFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"functionDeclaration",
                    						lv_functionDeclaration_1_0,
                    						"org.xtext.example.mydsl.Pascal.functionDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleprocedureOrFunctionDeclaration"


    // $ANTLR start "entryRuleprocedureDeclaration"
    // InternalPascal.g:2908:1: entryRuleprocedureDeclaration returns [EObject current=null] : iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF ;
    public final EObject entryRuleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureDeclaration = null;


        try {
            // InternalPascal.g:2908:61: (iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF )
            // InternalPascal.g:2909:2: iv_ruleprocedureDeclaration= ruleprocedureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcedureDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureDeclaration=ruleprocedureDeclaration();

            state._fsp--;

             current =iv_ruleprocedureDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedureDeclaration"


    // $ANTLR start "ruleprocedureDeclaration"
    // InternalPascal.g:2915:1: ruleprocedureDeclaration returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2921:2: ( (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) )
            // InternalPascal.g:2922:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            {
            // InternalPascal.g:2922:2: (otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            // InternalPascal.g:2923:3: otherlv_0= 'procedure' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureDeclarationAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:2927:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:2928:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:2928:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:2929:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2946:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2947:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:2947:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:2948:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"org.xtext.example.mydsl.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedureDeclarationAccess().getSemicolonKeyword_3());
            		
            // InternalPascal.g:2969:3: ( (lv_block_4_0= ruleblock ) )
            // InternalPascal.g:2970:4: (lv_block_4_0= ruleblock )
            {
            // InternalPascal.g:2970:4: (lv_block_4_0= ruleblock )
            // InternalPascal.g:2971:5: lv_block_4_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProcedureDeclarationAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureDeclarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"org.xtext.example.mydsl.Pascal.block");
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
    // $ANTLR end "ruleprocedureDeclaration"


    // $ANTLR start "entryRuleformalParameterList"
    // InternalPascal.g:2992:1: entryRuleformalParameterList returns [EObject current=null] : iv_ruleformalParameterList= ruleformalParameterList EOF ;
    public final EObject entryRuleformalParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterList = null;


        try {
            // InternalPascal.g:2992:60: (iv_ruleformalParameterList= ruleformalParameterList EOF )
            // InternalPascal.g:2993:2: iv_ruleformalParameterList= ruleformalParameterList EOF
            {
             newCompositeNode(grammarAccess.getFormalParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformalParameterList=ruleformalParameterList();

            state._fsp--;

             current =iv_ruleformalParameterList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformalParameterList"


    // $ANTLR start "ruleformalParameterList"
    // InternalPascal.g:2999:1: ruleformalParameterList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) ) ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformalParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semiterminal_2_0=null;
        Token otherlv_4=null;
        EObject lv_formalParameterSection1_1_0 = null;

        EObject lv_formalParameterSection2_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3005:2: ( (otherlv_0= '(' ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) ) ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:3006:2: (otherlv_0= '(' ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) ) ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:3006:2: (otherlv_0= '(' ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) ) ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')' )
            // InternalPascal.g:3007:3: otherlv_0= '(' ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) ) ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFormalParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:3011:3: ( (lv_formalParameterSection1_1_0= ruleformalParameterSection ) )
            // InternalPascal.g:3012:4: (lv_formalParameterSection1_1_0= ruleformalParameterSection )
            {
            // InternalPascal.g:3012:4: (lv_formalParameterSection1_1_0= ruleformalParameterSection )
            // InternalPascal.g:3013:5: lv_formalParameterSection1_1_0= ruleformalParameterSection
            {

            					newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSection1FormalParameterSectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_formalParameterSection1_1_0=ruleformalParameterSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
            					}
            					set(
            						current,
            						"formalParameterSection1",
            						lv_formalParameterSection1_1_0,
            						"org.xtext.example.mydsl.Pascal.formalParameterSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3030:3: ( ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:3031:4: ( (lv_semiterminal_2_0= ';' ) ) ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    {
            	    // InternalPascal.g:3031:4: ( (lv_semiterminal_2_0= ';' ) )
            	    // InternalPascal.g:3032:5: (lv_semiterminal_2_0= ';' )
            	    {
            	    // InternalPascal.g:3032:5: (lv_semiterminal_2_0= ';' )
            	    // InternalPascal.g:3033:6: lv_semiterminal_2_0= ';'
            	    {
            	    lv_semiterminal_2_0=(Token)match(input,22,FOLLOW_32); 

            	    						newLeafNode(lv_semiterminal_2_0, grammarAccess.getFormalParameterListAccess().getSemiterminalSemicolonKeyword_2_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFormalParameterListRule());
            	    						}
            	    						addWithLastConsumed(current, "semiterminal", lv_semiterminal_2_0, ";");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:3045:4: ( (lv_formalParameterSection2_3_0= ruleformalParameterSection ) )
            	    // InternalPascal.g:3046:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    {
            	    // InternalPascal.g:3046:5: (lv_formalParameterSection2_3_0= ruleformalParameterSection )
            	    // InternalPascal.g:3047:6: lv_formalParameterSection2_3_0= ruleformalParameterSection
            	    {

            	    						newCompositeNode(grammarAccess.getFormalParameterListAccess().getFormalParameterSection2FormalParameterSectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_formalParameterSection2_3_0=ruleformalParameterSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formalParameterSection2",
            	    							lv_formalParameterSection2_3_0,
            	    							"org.xtext.example.mydsl.Pascal.formalParameterSection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormalParameterListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleformalParameterList"


    // $ANTLR start "entryRuleformalParameterSection"
    // InternalPascal.g:3073:1: entryRuleformalParameterSection returns [EObject current=null] : iv_ruleformalParameterSection= ruleformalParameterSection EOF ;
    public final EObject entryRuleformalParameterSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParameterSection = null;


        try {
            // InternalPascal.g:3073:63: (iv_ruleformalParameterSection= ruleformalParameterSection EOF )
            // InternalPascal.g:3074:2: iv_ruleformalParameterSection= ruleformalParameterSection EOF
            {
             newCompositeNode(grammarAccess.getFormalParameterSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformalParameterSection=ruleformalParameterSection();

            state._fsp--;

             current =iv_ruleformalParameterSection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformalParameterSection"


    // $ANTLR start "ruleformalParameterSection"
    // InternalPascal.g:3080:1: ruleformalParameterSection returns [EObject current=null] : ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) ) ) ;
    public final EObject ruleformalParameterSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterGroup_0_0 = null;

        EObject lv_parameterGroup_2_0 = null;

        EObject lv_parameterGroup_4_0 = null;

        EObject lv_parameterGroup_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3086:2: ( ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) ) ) )
            // InternalPascal.g:3087:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) ) )
            {
            // InternalPascal.g:3087:2: ( ( (lv_parameterGroup_0_0= ruleparameterGroup ) ) | (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) ) | (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) ) | (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt32=1;
                }
                break;
            case 53:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            case 38:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPascal.g:3088:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    {
                    // InternalPascal.g:3088:3: ( (lv_parameterGroup_0_0= ruleparameterGroup ) )
                    // InternalPascal.g:3089:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:3089:4: (lv_parameterGroup_0_0= ruleparameterGroup )
                    // InternalPascal.g:3090:5: lv_parameterGroup_0_0= ruleparameterGroup
                    {

                    					newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroupParameterGroupParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup_0_0=ruleparameterGroup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    					}
                    					set(
                    						current,
                    						"parameterGroup",
                    						lv_parameterGroup_0_0,
                    						"org.xtext.example.mydsl.Pascal.parameterGroup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3108:3: (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:3108:3: (otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:3109:4: otherlv_1= 'var' ( (lv_parameterGroup_2_0= ruleparameterGroup ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormalParameterSectionAccess().getVarKeyword_1_0());
                    			
                    // InternalPascal.g:3113:4: ( (lv_parameterGroup_2_0= ruleparameterGroup ) )
                    // InternalPascal.g:3114:5: (lv_parameterGroup_2_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:3114:5: (lv_parameterGroup_2_0= ruleparameterGroup )
                    // InternalPascal.g:3115:6: lv_parameterGroup_2_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroupParameterGroupParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup_2_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						set(
                    							current,
                    							"parameterGroup",
                    							lv_parameterGroup_2_0,
                    							"org.xtext.example.mydsl.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3134:3: (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:3134:3: (otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:3135:4: otherlv_3= 'function' ( (lv_parameterGroup_4_0= ruleparameterGroup ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormalParameterSectionAccess().getFunctionKeyword_2_0());
                    			
                    // InternalPascal.g:3139:4: ( (lv_parameterGroup_4_0= ruleparameterGroup ) )
                    // InternalPascal.g:3140:5: (lv_parameterGroup_4_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:3140:5: (lv_parameterGroup_4_0= ruleparameterGroup )
                    // InternalPascal.g:3141:6: lv_parameterGroup_4_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroupParameterGroupParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup_4_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						set(
                    							current,
                    							"parameterGroup",
                    							lv_parameterGroup_4_0,
                    							"org.xtext.example.mydsl.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:3160:3: (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) )
                    {
                    // InternalPascal.g:3160:3: (otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) ) )
                    // InternalPascal.g:3161:4: otherlv_5= 'procedure' ( (lv_parameterGroup_6_0= ruleparameterGroup ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormalParameterSectionAccess().getProcedureKeyword_3_0());
                    			
                    // InternalPascal.g:3165:4: ( (lv_parameterGroup_6_0= ruleparameterGroup ) )
                    // InternalPascal.g:3166:5: (lv_parameterGroup_6_0= ruleparameterGroup )
                    {
                    // InternalPascal.g:3166:5: (lv_parameterGroup_6_0= ruleparameterGroup )
                    // InternalPascal.g:3167:6: lv_parameterGroup_6_0= ruleparameterGroup
                    {

                    						newCompositeNode(grammarAccess.getFormalParameterSectionAccess().getParameterGroupParameterGroupParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameterGroup_6_0=ruleparameterGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormalParameterSectionRule());
                    						}
                    						set(
                    							current,
                    							"parameterGroup",
                    							lv_parameterGroup_6_0,
                    							"org.xtext.example.mydsl.Pascal.parameterGroup");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleformalParameterSection"


    // $ANTLR start "entryRuleparameterGroup"
    // InternalPascal.g:3189:1: entryRuleparameterGroup returns [EObject current=null] : iv_ruleparameterGroup= ruleparameterGroup EOF ;
    public final EObject entryRuleparameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterGroup = null;


        try {
            // InternalPascal.g:3189:55: (iv_ruleparameterGroup= ruleparameterGroup EOF )
            // InternalPascal.g:3190:2: iv_ruleparameterGroup= ruleparameterGroup EOF
            {
             newCompositeNode(grammarAccess.getParameterGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterGroup=ruleparameterGroup();

            state._fsp--;

             current =iv_ruleparameterGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleparameterGroup"


    // $ANTLR start "ruleparameterGroup"
    // InternalPascal.g:3196:1: ruleparameterGroup returns [EObject current=null] : ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) ;
    public final EObject ruleparameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifierList_0_0 = null;

        EObject lv_typeIdentifier_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3202:2: ( ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) ) )
            // InternalPascal.g:3203:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            {
            // InternalPascal.g:3203:2: ( ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:3204:3: ( (lv_identifierList_0_0= ruleidentifierList ) ) otherlv_1= ':' ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            {
            // InternalPascal.g:3204:3: ( (lv_identifierList_0_0= ruleidentifierList ) )
            // InternalPascal.g:3205:4: (lv_identifierList_0_0= ruleidentifierList )
            {
            // InternalPascal.g:3205:4: (lv_identifierList_0_0= ruleidentifierList )
            // InternalPascal.g:3206:5: lv_identifierList_0_0= ruleidentifierList
            {

            					newCompositeNode(grammarAccess.getParameterGroupAccess().getIdentifierListIdentifierListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_identifierList_0_0=ruleidentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            					}
            					set(
            						current,
            						"identifierList",
            						lv_identifierList_0_0,
            						"org.xtext.example.mydsl.Pascal.identifierList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterGroupAccess().getColonKeyword_1());
            		
            // InternalPascal.g:3227:3: ( (lv_typeIdentifier_2_0= ruletypeIdentifier ) )
            // InternalPascal.g:3228:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            {
            // InternalPascal.g:3228:4: (lv_typeIdentifier_2_0= ruletypeIdentifier )
            // InternalPascal.g:3229:5: lv_typeIdentifier_2_0= ruletypeIdentifier
            {

            					newCompositeNode(grammarAccess.getParameterGroupAccess().getTypeIdentifierTypeIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_2_0=ruletypeIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            					}
            					set(
            						current,
            						"typeIdentifier",
            						lv_typeIdentifier_2_0,
            						"org.xtext.example.mydsl.Pascal.typeIdentifier");
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
    // $ANTLR end "ruleparameterGroup"


    // $ANTLR start "entryRuleidentifierList"
    // InternalPascal.g:3250:1: entryRuleidentifierList returns [EObject current=null] : iv_ruleidentifierList= ruleidentifierList EOF ;
    public final EObject entryRuleidentifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifierList = null;


        try {
            // InternalPascal.g:3250:55: (iv_ruleidentifierList= ruleidentifierList EOF )
            // InternalPascal.g:3251:2: iv_ruleidentifierList= ruleidentifierList EOF
            {
             newCompositeNode(grammarAccess.getIdentifierListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifierList=ruleidentifierList();

            state._fsp--;

             current =iv_ruleidentifierList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleidentifierList"


    // $ANTLR start "ruleidentifierList"
    // InternalPascal.g:3257:1: ruleidentifierList returns [EObject current=null] : ( ( (lv_identifier1_0_0= ruleidentifier ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )* ) ;
    public final EObject ruleidentifierList() throws RecognitionException {
        EObject current = null;

        Token lv_commaTerminal_1_0=null;
        EObject lv_identifier1_0_0 = null;

        EObject lv_identifier2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3263:2: ( ( ( (lv_identifier1_0_0= ruleidentifier ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )* ) )
            // InternalPascal.g:3264:2: ( ( (lv_identifier1_0_0= ruleidentifier ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )* )
            {
            // InternalPascal.g:3264:2: ( ( (lv_identifier1_0_0= ruleidentifier ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )* )
            // InternalPascal.g:3265:3: ( (lv_identifier1_0_0= ruleidentifier ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )*
            {
            // InternalPascal.g:3265:3: ( (lv_identifier1_0_0= ruleidentifier ) )
            // InternalPascal.g:3266:4: (lv_identifier1_0_0= ruleidentifier )
            {
            // InternalPascal.g:3266:4: (lv_identifier1_0_0= ruleidentifier )
            // InternalPascal.g:3267:5: lv_identifier1_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifier1IdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_identifier1_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            					}
            					set(
            						current,
            						"identifier1",
            						lv_identifier1_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3284:3: ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3285:4: ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_identifier2_2_0= ruleidentifier ) )
            	    {
            	    // InternalPascal.g:3285:4: ( (lv_commaTerminal_1_0= ',' ) )
            	    // InternalPascal.g:3286:5: (lv_commaTerminal_1_0= ',' )
            	    {
            	    // InternalPascal.g:3286:5: (lv_commaTerminal_1_0= ',' )
            	    // InternalPascal.g:3287:6: lv_commaTerminal_1_0= ','
            	    {
            	    lv_commaTerminal_1_0=(Token)match(input,27,FOLLOW_5); 

            	    						newLeafNode(lv_commaTerminal_1_0, grammarAccess.getIdentifierListAccess().getCommaTerminalCommaKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifierListRule());
            	    						}
            	    						addWithLastConsumed(current, "commaTerminal", lv_commaTerminal_1_0, ",");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:3299:4: ( (lv_identifier2_2_0= ruleidentifier ) )
            	    // InternalPascal.g:3300:5: (lv_identifier2_2_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:3300:5: (lv_identifier2_2_0= ruleidentifier )
            	    // InternalPascal.g:3301:6: lv_identifier2_2_0= ruleidentifier
            	    {

            	    						newCompositeNode(grammarAccess.getIdentifierListAccess().getIdentifier2IdentifierParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_identifier2_2_0=ruleidentifier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIdentifierListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"identifier2",
            	    							lv_identifier2_2_0,
            	    							"org.xtext.example.mydsl.Pascal.identifier");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleidentifierList"


    // $ANTLR start "entryRuleconstList"
    // InternalPascal.g:3323:1: entryRuleconstList returns [EObject current=null] : iv_ruleconstList= ruleconstList EOF ;
    public final EObject entryRuleconstList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstList = null;


        try {
            // InternalPascal.g:3323:50: (iv_ruleconstList= ruleconstList EOF )
            // InternalPascal.g:3324:2: iv_ruleconstList= ruleconstList EOF
            {
             newCompositeNode(grammarAccess.getConstListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstList=ruleconstList();

            state._fsp--;

             current =iv_ruleconstList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstList"


    // $ANTLR start "ruleconstList"
    // InternalPascal.g:3330:1: ruleconstList returns [EObject current=null] : ( ( (lv_constant1_0_0= ruleconstant ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )* ) ;
    public final EObject ruleconstList() throws RecognitionException {
        EObject current = null;

        Token lv_commaTerminal_1_0=null;
        EObject lv_constant1_0_0 = null;

        EObject lv_constant2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3336:2: ( ( ( (lv_constant1_0_0= ruleconstant ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:3337:2: ( ( (lv_constant1_0_0= ruleconstant ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:3337:2: ( ( (lv_constant1_0_0= ruleconstant ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:3338:3: ( (lv_constant1_0_0= ruleconstant ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:3338:3: ( (lv_constant1_0_0= ruleconstant ) )
            // InternalPascal.g:3339:4: (lv_constant1_0_0= ruleconstant )
            {
            // InternalPascal.g:3339:4: (lv_constant1_0_0= ruleconstant )
            // InternalPascal.g:3340:5: lv_constant1_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstListAccess().getConstant1ConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_constant1_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstListRule());
            					}
            					set(
            						current,
            						"constant1",
            						lv_constant1_0_0,
            						"org.xtext.example.mydsl.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3357:3: ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:3358:4: ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_constant2_2_0= ruleconstant ) )
            	    {
            	    // InternalPascal.g:3358:4: ( (lv_commaTerminal_1_0= ',' ) )
            	    // InternalPascal.g:3359:5: (lv_commaTerminal_1_0= ',' )
            	    {
            	    // InternalPascal.g:3359:5: (lv_commaTerminal_1_0= ',' )
            	    // InternalPascal.g:3360:6: lv_commaTerminal_1_0= ','
            	    {
            	    lv_commaTerminal_1_0=(Token)match(input,27,FOLLOW_13); 

            	    						newLeafNode(lv_commaTerminal_1_0, grammarAccess.getConstListAccess().getCommaTerminalCommaKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConstListRule());
            	    						}
            	    						addWithLastConsumed(current, "commaTerminal", lv_commaTerminal_1_0, ",");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:3372:4: ( (lv_constant2_2_0= ruleconstant ) )
            	    // InternalPascal.g:3373:5: (lv_constant2_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:3373:5: (lv_constant2_2_0= ruleconstant )
            	    // InternalPascal.g:3374:6: lv_constant2_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getConstListAccess().getConstant2ConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_constant2_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constant2",
            	    							lv_constant2_2_0,
            	    							"org.xtext.example.mydsl.Pascal.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleconstList"


    // $ANTLR start "entryRulefunctionDeclaration"
    // InternalPascal.g:3396:1: entryRulefunctionDeclaration returns [EObject current=null] : iv_rulefunctionDeclaration= rulefunctionDeclaration EOF ;
    public final EObject entryRulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDeclaration = null;


        try {
            // InternalPascal.g:3396:60: (iv_rulefunctionDeclaration= rulefunctionDeclaration EOF )
            // InternalPascal.g:3397:2: iv_rulefunctionDeclaration= rulefunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionDeclaration=rulefunctionDeclaration();

            state._fsp--;

             current =iv_rulefunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunctionDeclaration"


    // $ANTLR start "rulefunctionDeclaration"
    // InternalPascal.g:3403:1: rulefunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_identifier_1_0 = null;

        EObject lv_formalParameterList_2_0 = null;

        EObject lv_resultType_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3409:2: ( (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) )
            // InternalPascal.g:3410:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            {
            // InternalPascal.g:3410:2: (otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            // InternalPascal.g:3411:3: otherlv_0= 'function' ( (lv_identifier_1_0= ruleidentifier ) ) ( (lv_formalParameterList_2_0= ruleformalParameterList ) )? otherlv_3= ':' ( (lv_resultType_4_0= ruleresultType ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:3415:3: ( (lv_identifier_1_0= ruleidentifier ) )
            // InternalPascal.g:3416:4: (lv_identifier_1_0= ruleidentifier )
            {
            // InternalPascal.g:3416:4: (lv_identifier_1_0= ruleidentifier )
            // InternalPascal.g:3417:5: lv_identifier_1_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getIdentifierIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_identifier_1_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3434:3: ( (lv_formalParameterList_2_0= ruleformalParameterList ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3435:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    {
                    // InternalPascal.g:3435:4: (lv_formalParameterList_2_0= ruleformalParameterList )
                    // InternalPascal.g:3436:5: lv_formalParameterList_2_0= ruleformalParameterList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFormalParameterListFormalParameterListParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_formalParameterList_2_0=ruleformalParameterList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"formalParameterList",
                    						lv_formalParameterList_2_0,
                    						"org.xtext.example.mydsl.Pascal.formalParameterList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:3457:3: ( (lv_resultType_4_0= ruleresultType ) )
            // InternalPascal.g:3458:4: (lv_resultType_4_0= ruleresultType )
            {
            // InternalPascal.g:3458:4: (lv_resultType_4_0= ruleresultType )
            // InternalPascal.g:3459:5: lv_resultType_4_0= ruleresultType
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getResultTypeResultTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_resultType_4_0=ruleresultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"resultType",
            						lv_resultType_4_0,
            						"org.xtext.example.mydsl.Pascal.resultType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_5());
            		
            // InternalPascal.g:3480:3: ( (lv_block_6_0= ruleblock ) )
            // InternalPascal.g:3481:4: (lv_block_6_0= ruleblock )
            {
            // InternalPascal.g:3481:4: (lv_block_6_0= ruleblock )
            // InternalPascal.g:3482:5: lv_block_6_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBlockBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_6_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_6_0,
            						"org.xtext.example.mydsl.Pascal.block");
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
    // $ANTLR end "rulefunctionDeclaration"


    // $ANTLR start "entryRuleresultType"
    // InternalPascal.g:3503:1: entryRuleresultType returns [EObject current=null] : iv_ruleresultType= ruleresultType EOF ;
    public final EObject entryRuleresultType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresultType = null;


        try {
            // InternalPascal.g:3503:51: (iv_ruleresultType= ruleresultType EOF )
            // InternalPascal.g:3504:2: iv_ruleresultType= ruleresultType EOF
            {
             newCompositeNode(grammarAccess.getResultTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleresultType=ruleresultType();

            state._fsp--;

             current =iv_ruleresultType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleresultType"


    // $ANTLR start "ruleresultType"
    // InternalPascal.g:3510:1: ruleresultType returns [EObject current=null] : ( (lv_typeIdentifier_0_0= ruletypeIdentifier ) ) ;
    public final EObject ruleresultType() throws RecognitionException {
        EObject current = null;

        EObject lv_typeIdentifier_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3516:2: ( ( (lv_typeIdentifier_0_0= ruletypeIdentifier ) ) )
            // InternalPascal.g:3517:2: ( (lv_typeIdentifier_0_0= ruletypeIdentifier ) )
            {
            // InternalPascal.g:3517:2: ( (lv_typeIdentifier_0_0= ruletypeIdentifier ) )
            // InternalPascal.g:3518:3: (lv_typeIdentifier_0_0= ruletypeIdentifier )
            {
            // InternalPascal.g:3518:3: (lv_typeIdentifier_0_0= ruletypeIdentifier )
            // InternalPascal.g:3519:4: lv_typeIdentifier_0_0= ruletypeIdentifier
            {

            				newCompositeNode(grammarAccess.getResultTypeAccess().getTypeIdentifierTypeIdentifierParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_typeIdentifier_0_0=ruletypeIdentifier();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getResultTypeRule());
            				}
            				set(
            					current,
            					"typeIdentifier",
            					lv_typeIdentifier_0_0,
            					"org.xtext.example.mydsl.Pascal.typeIdentifier");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleresultType"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:3539:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:3539:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:3540:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:3546:1: rulestatement returns [EObject current=null] : ( ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_labelStart_0_0 = null;

        EObject lv_unlabelledStatement_2_0 = null;

        EObject lv_unlabelledStatement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3552:2: ( ( ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) ) )
            // InternalPascal.g:3553:2: ( ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
            {
            // InternalPascal.g:3553:2: ( ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) ) | ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_NUM_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_IDENT||LA36_0==55||(LA36_0>=68 && LA36_0<=70)||LA36_0==72) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:3554:3: ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    {
                    // InternalPascal.g:3554:3: ( ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) ) )
                    // InternalPascal.g:3555:4: ( (lv_labelStart_0_0= rulelabelStart ) ) otherlv_1= ':' ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    {
                    // InternalPascal.g:3555:4: ( (lv_labelStart_0_0= rulelabelStart ) )
                    // InternalPascal.g:3556:5: (lv_labelStart_0_0= rulelabelStart )
                    {
                    // InternalPascal.g:3556:5: (lv_labelStart_0_0= rulelabelStart )
                    // InternalPascal.g:3557:6: lv_labelStart_0_0= rulelabelStart
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelStartLabelStartParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_labelStart_0_0=rulelabelStart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"labelStart",
                    							lv_labelStart_0_0,
                    							"org.xtext.example.mydsl.Pascal.labelStart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:3578:4: ( (lv_unlabelledStatement_2_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3579:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3579:5: (lv_unlabelledStatement_2_0= ruleunlabelledStatement )
                    // InternalPascal.g:3580:6: lv_unlabelledStatement_2_0= ruleunlabelledStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getUnlabelledStatementUnlabelledStatementParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unlabelledStatement_2_0=ruleunlabelledStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"unlabelledStatement",
                    							lv_unlabelledStatement_2_0,
                    							"org.xtext.example.mydsl.Pascal.unlabelledStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3599:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    {
                    // InternalPascal.g:3599:3: ( (lv_unlabelledStatement_3_0= ruleunlabelledStatement ) )
                    // InternalPascal.g:3600:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    {
                    // InternalPascal.g:3600:4: (lv_unlabelledStatement_3_0= ruleunlabelledStatement )
                    // InternalPascal.g:3601:5: lv_unlabelledStatement_3_0= ruleunlabelledStatement
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getUnlabelledStatementUnlabelledStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unlabelledStatement_3_0=ruleunlabelledStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"unlabelledStatement",
                    						lv_unlabelledStatement_3_0,
                    						"org.xtext.example.mydsl.Pascal.unlabelledStatement");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleunlabelledStatement"
    // InternalPascal.g:3622:1: entryRuleunlabelledStatement returns [EObject current=null] : iv_ruleunlabelledStatement= ruleunlabelledStatement EOF ;
    public final EObject entryRuleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelledStatement = null;


        try {
            // InternalPascal.g:3622:60: (iv_ruleunlabelledStatement= ruleunlabelledStatement EOF )
            // InternalPascal.g:3623:2: iv_ruleunlabelledStatement= ruleunlabelledStatement EOF
            {
             newCompositeNode(grammarAccess.getUnlabelledStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunlabelledStatement=ruleunlabelledStatement();

            state._fsp--;

             current =iv_ruleunlabelledStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunlabelledStatement"


    // $ANTLR start "ruleunlabelledStatement"
    // InternalPascal.g:3629:1: ruleunlabelledStatement returns [EObject current=null] : ( ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) ) | ( (lv_structuredStatement_2_0= rulestructuredStatement ) ) ) ;
    public final EObject ruleunlabelledStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleStatement_1_0 = null;

        EObject lv_structuredStatement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3635:2: ( ( ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) ) | ( (lv_structuredStatement_2_0= rulestructuredStatement ) ) ) )
            // InternalPascal.g:3636:2: ( ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) ) | ( (lv_structuredStatement_2_0= rulestructuredStatement ) ) )
            {
            // InternalPascal.g:3636:2: ( ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) ) | ( (lv_structuredStatement_2_0= rulestructuredStatement ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_IDENT||LA37_0==55||LA37_0==68) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=69 && LA37_0<=70)||LA37_0==72) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:3637:3: ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) )
                    {
                    // InternalPascal.g:3637:3: ( () ( (lv_simpleStatement_1_0= rulesimpleStatement ) ) )
                    // InternalPascal.g:3638:4: () ( (lv_simpleStatement_1_0= rulesimpleStatement ) )
                    {
                    // InternalPascal.g:3638:4: ()
                    // InternalPascal.g:3639:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlabelledStatementAccess().getUnlabelledStatementAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPascal.g:3645:4: ( (lv_simpleStatement_1_0= rulesimpleStatement ) )
                    // InternalPascal.g:3646:5: (lv_simpleStatement_1_0= rulesimpleStatement )
                    {
                    // InternalPascal.g:3646:5: (lv_simpleStatement_1_0= rulesimpleStatement )
                    // InternalPascal.g:3647:6: lv_simpleStatement_1_0= rulesimpleStatement
                    {

                    						newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getSimpleStatementSimpleStatementParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simpleStatement_1_0=rulesimpleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                    						}
                    						set(
                    							current,
                    							"simpleStatement",
                    							lv_simpleStatement_1_0,
                    							"org.xtext.example.mydsl.Pascal.simpleStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3666:3: ( (lv_structuredStatement_2_0= rulestructuredStatement ) )
                    {
                    // InternalPascal.g:3666:3: ( (lv_structuredStatement_2_0= rulestructuredStatement ) )
                    // InternalPascal.g:3667:4: (lv_structuredStatement_2_0= rulestructuredStatement )
                    {
                    // InternalPascal.g:3667:4: (lv_structuredStatement_2_0= rulestructuredStatement )
                    // InternalPascal.g:3668:5: lv_structuredStatement_2_0= rulestructuredStatement
                    {

                    					newCompositeNode(grammarAccess.getUnlabelledStatementAccess().getStructuredStatementStructuredStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structuredStatement_2_0=rulestructuredStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnlabelledStatementRule());
                    					}
                    					set(
                    						current,
                    						"structuredStatement",
                    						lv_structuredStatement_2_0,
                    						"org.xtext.example.mydsl.Pascal.structuredStatement");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleunlabelledStatement"


    // $ANTLR start "entryRulesimpleStatement"
    // InternalPascal.g:3689:1: entryRulesimpleStatement returns [EObject current=null] : iv_rulesimpleStatement= rulesimpleStatement EOF ;
    public final EObject entryRulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleStatement = null;


        try {
            // InternalPascal.g:3689:56: (iv_rulesimpleStatement= rulesimpleStatement EOF )
            // InternalPascal.g:3690:2: iv_rulesimpleStatement= rulesimpleStatement EOF
            {
             newCompositeNode(grammarAccess.getSimpleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleStatement=rulesimpleStatement();

            state._fsp--;

             current =iv_rulesimpleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimpleStatement"


    // $ANTLR start "rulesimpleStatement"
    // InternalPascal.g:3696:1: rulesimpleStatement returns [EObject current=null] : ( ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) ) | ( (lv_procedureStatement_1_0= ruleprocedureStatement ) ) | ( (lv_gotoStatement_2_0= rulegotoStatement ) ) ) ;
    public final EObject rulesimpleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignmentStatement_0_0 = null;

        EObject lv_procedureStatement_1_0 = null;

        EObject lv_gotoStatement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3702:2: ( ( ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) ) | ( (lv_procedureStatement_1_0= ruleprocedureStatement ) ) | ( (lv_gotoStatement_2_0= rulegotoStatement ) ) ) )
            // InternalPascal.g:3703:2: ( ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) ) | ( (lv_procedureStatement_1_0= ruleprocedureStatement ) ) | ( (lv_gotoStatement_2_0= rulegotoStatement ) ) )
            {
            // InternalPascal.g:3703:2: ( ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) ) | ( (lv_procedureStatement_1_0= ruleprocedureStatement ) ) | ( (lv_gotoStatement_2_0= rulegotoStatement ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt38=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==EOF||LA38_2==20||LA38_2==22) ) {
                    alt38=2;
                }
                else if ( (LA38_2==18||LA38_2==46||LA38_2==52||LA38_2==54||LA38_2==56) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3704:3: ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) )
                    {
                    // InternalPascal.g:3704:3: ( (lv_assignmentStatement_0_0= ruleassignmentStatement ) )
                    // InternalPascal.g:3705:4: (lv_assignmentStatement_0_0= ruleassignmentStatement )
                    {
                    // InternalPascal.g:3705:4: (lv_assignmentStatement_0_0= ruleassignmentStatement )
                    // InternalPascal.g:3706:5: lv_assignmentStatement_0_0= ruleassignmentStatement
                    {

                    					newCompositeNode(grammarAccess.getSimpleStatementAccess().getAssignmentStatementAssignmentStatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignmentStatement_0_0=ruleassignmentStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    					}
                    					set(
                    						current,
                    						"assignmentStatement",
                    						lv_assignmentStatement_0_0,
                    						"org.xtext.example.mydsl.Pascal.assignmentStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3724:3: ( (lv_procedureStatement_1_0= ruleprocedureStatement ) )
                    {
                    // InternalPascal.g:3724:3: ( (lv_procedureStatement_1_0= ruleprocedureStatement ) )
                    // InternalPascal.g:3725:4: (lv_procedureStatement_1_0= ruleprocedureStatement )
                    {
                    // InternalPascal.g:3725:4: (lv_procedureStatement_1_0= ruleprocedureStatement )
                    // InternalPascal.g:3726:5: lv_procedureStatement_1_0= ruleprocedureStatement
                    {

                    					newCompositeNode(grammarAccess.getSimpleStatementAccess().getProcedureStatementProcedureStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedureStatement_1_0=ruleprocedureStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    					}
                    					set(
                    						current,
                    						"procedureStatement",
                    						lv_procedureStatement_1_0,
                    						"org.xtext.example.mydsl.Pascal.procedureStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3744:3: ( (lv_gotoStatement_2_0= rulegotoStatement ) )
                    {
                    // InternalPascal.g:3744:3: ( (lv_gotoStatement_2_0= rulegotoStatement ) )
                    // InternalPascal.g:3745:4: (lv_gotoStatement_2_0= rulegotoStatement )
                    {
                    // InternalPascal.g:3745:4: (lv_gotoStatement_2_0= rulegotoStatement )
                    // InternalPascal.g:3746:5: lv_gotoStatement_2_0= rulegotoStatement
                    {

                    					newCompositeNode(grammarAccess.getSimpleStatementAccess().getGotoStatementGotoStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_gotoStatement_2_0=rulegotoStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimpleStatementRule());
                    					}
                    					set(
                    						current,
                    						"gotoStatement",
                    						lv_gotoStatement_2_0,
                    						"org.xtext.example.mydsl.Pascal.gotoStatement");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulesimpleStatement"


    // $ANTLR start "entryRuleassignmentStatement"
    // InternalPascal.g:3767:1: entryRuleassignmentStatement returns [EObject current=null] : iv_ruleassignmentStatement= ruleassignmentStatement EOF ;
    public final EObject entryRuleassignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignmentStatement = null;


        try {
            // InternalPascal.g:3767:60: (iv_ruleassignmentStatement= ruleassignmentStatement EOF )
            // InternalPascal.g:3768:2: iv_ruleassignmentStatement= ruleassignmentStatement EOF
            {
             newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignmentStatement=ruleassignmentStatement();

            state._fsp--;

             current =iv_ruleassignmentStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleassignmentStatement"


    // $ANTLR start "ruleassignmentStatement"
    // InternalPascal.g:3774:1: ruleassignmentStatement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3780:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:3781:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:3781:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:3782:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:3782:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:3783:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:3783:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:3784:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.example.mydsl.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:3805:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:3806:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:3806:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:3807:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.mydsl.Pascal.expression");
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
    // $ANTLR end "ruleassignmentStatement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:3828:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:3828:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:3829:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:3835:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_identifier1_1_0 = null;

        EObject lv_identifier2_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_expression_11_0 = null;

        EObject lv_identifier3_14_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3841:2: ( ( ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* ) )
            // InternalPascal.g:3842:2: ( ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* )
            {
            // InternalPascal.g:3842:2: ( ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )* )
            // InternalPascal.g:3843:3: ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )*
            {
            // InternalPascal.g:3843:3: ( (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) ) | ( (lv_identifier2_2_0= ruleidentifier ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_IDENT) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3844:4: (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) )
                    {
                    // InternalPascal.g:3844:4: (otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) ) )
                    // InternalPascal.g:3845:5: otherlv_0= '@' ( (lv_identifier1_1_0= ruleidentifier ) )
                    {
                    otherlv_0=(Token)match(input,55,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascal.g:3849:5: ( (lv_identifier1_1_0= ruleidentifier ) )
                    // InternalPascal.g:3850:6: (lv_identifier1_1_0= ruleidentifier )
                    {
                    // InternalPascal.g:3850:6: (lv_identifier1_1_0= ruleidentifier )
                    // InternalPascal.g:3851:7: lv_identifier1_1_0= ruleidentifier
                    {

                    							newCompositeNode(grammarAccess.getVariableAccess().getIdentifier1IdentifierParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_identifier1_1_0=ruleidentifier();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    							}
                    							set(
                    								current,
                    								"identifier1",
                    								lv_identifier1_1_0,
                    								"org.xtext.example.mydsl.Pascal.identifier");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3870:4: ( (lv_identifier2_2_0= ruleidentifier ) )
                    {
                    // InternalPascal.g:3870:4: ( (lv_identifier2_2_0= ruleidentifier ) )
                    // InternalPascal.g:3871:5: (lv_identifier2_2_0= ruleidentifier )
                    {
                    // InternalPascal.g:3871:5: (lv_identifier2_2_0= ruleidentifier )
                    // InternalPascal.g:3872:6: lv_identifier2_2_0= ruleidentifier
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getIdentifier2IdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_identifier2_2_0=ruleidentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"identifier2",
                    							lv_identifier2_2_0,
                    							"org.xtext.example.mydsl.Pascal.identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:3890:3: ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) ) | otherlv_15= '^' )*
            loop42:
            do {
                int alt42=5;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt42=1;
                    }
                    break;
                case 56:
                    {
                    alt42=2;
                    }
                    break;
                case 18:
                    {
                    alt42=3;
                    }
                    break;
                case 52:
                    {
                    alt42=4;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3891:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    {
            	    // InternalPascal.g:3891:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    // InternalPascal.g:3892:5: otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']'
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_37); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascal.g:3896:5: ( (lv_expression_4_0= ruleexpression ) )
            	    // InternalPascal.g:3897:6: (lv_expression_4_0= ruleexpression )
            	    {
            	    // InternalPascal.g:3897:6: (lv_expression_4_0= ruleexpression )
            	    // InternalPascal.g:3898:7: lv_expression_4_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_39);
            	    lv_expression_4_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression",
            	    								lv_expression_4_0,
            	    								"org.xtext.example.mydsl.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:3915:5: (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==27) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalPascal.g:3916:6: otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_37); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascal.g:3920:6: ( (lv_expression_6_0= ruleexpression ) )
            	    	    // InternalPascal.g:3921:7: (lv_expression_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:3921:7: (lv_expression_6_0= ruleexpression )
            	    	    // InternalPascal.g:3922:8: lv_expression_6_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_39);
            	    	    lv_expression_6_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression",
            	    	    									lv_expression_6_0,
            	    	    									"org.xtext.example.mydsl.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,47,FOLLOW_38); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:3946:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    {
            	    // InternalPascal.g:3946:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    // InternalPascal.g:3947:5: otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)'
            	    {
            	    otherlv_8=(Token)match(input,56,FOLLOW_37); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascal.g:3951:5: ( (lv_expression_9_0= ruleexpression ) )
            	    // InternalPascal.g:3952:6: (lv_expression_9_0= ruleexpression )
            	    {
            	    // InternalPascal.g:3952:6: (lv_expression_9_0= ruleexpression )
            	    // InternalPascal.g:3953:7: lv_expression_9_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_40);
            	    lv_expression_9_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression",
            	    								lv_expression_9_0,
            	    								"org.xtext.example.mydsl.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:3970:5: (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==27) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalPascal.g:3971:6: otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,27,FOLLOW_37); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascal.g:3975:6: ( (lv_expression_11_0= ruleexpression ) )
            	    	    // InternalPascal.g:3976:7: (lv_expression_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:3976:7: (lv_expression_11_0= ruleexpression )
            	    	    // InternalPascal.g:3977:8: lv_expression_11_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_expression_11_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression",
            	    	    									lv_expression_11_0,
            	    	    									"org.xtext.example.mydsl.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,57,FOLLOW_38); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:4001:4: (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) )
            	    {
            	    // InternalPascal.g:4001:4: (otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) ) )
            	    // InternalPascal.g:4002:5: otherlv_13= '.' ( (lv_identifier3_14_0= ruleidentifier ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascal.g:4006:5: ( (lv_identifier3_14_0= ruleidentifier ) )
            	    // InternalPascal.g:4007:6: (lv_identifier3_14_0= ruleidentifier )
            	    {
            	    // InternalPascal.g:4007:6: (lv_identifier3_14_0= ruleidentifier )
            	    // InternalPascal.g:4008:7: lv_identifier3_14_0= ruleidentifier
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getIdentifier3IdentifierParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_38);
            	    lv_identifier3_14_0=ruleidentifier();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"identifier3",
            	    								lv_identifier3_14_0,
            	    								"org.xtext.example.mydsl.Pascal.identifier");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:4027:4: otherlv_15= '^'
            	    {
            	    otherlv_15=(Token)match(input,52,FOLLOW_38); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:4036:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:4036:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:4037:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:4043:1: ruleexpression returns [EObject current=null] : ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4049:2: ( ( (lv_simpleExpression_0_0= rulesimpleExpression ) ) )
            // InternalPascal.g:4050:2: ( (lv_simpleExpression_0_0= rulesimpleExpression ) )
            {
            // InternalPascal.g:4050:2: ( (lv_simpleExpression_0_0= rulesimpleExpression ) )
            // InternalPascal.g:4051:3: (lv_simpleExpression_0_0= rulesimpleExpression )
            {
            // InternalPascal.g:4051:3: (lv_simpleExpression_0_0= rulesimpleExpression )
            // InternalPascal.g:4052:4: lv_simpleExpression_0_0= rulesimpleExpression
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_simpleExpression_0_0=rulesimpleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
            				}
            				set(
            					current,
            					"simpleExpression",
            					lv_simpleExpression_0_0,
            					"org.xtext.example.mydsl.Pascal.simpleExpression");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimpleExpression"
    // InternalPascal.g:4072:1: entryRulesimpleExpression returns [EObject current=null] : iv_rulesimpleExpression= rulesimpleExpression EOF ;
    public final EObject entryRulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleExpression = null;


        try {
            // InternalPascal.g:4072:57: (iv_rulesimpleExpression= rulesimpleExpression EOF )
            // InternalPascal.g:4073:2: iv_rulesimpleExpression= rulesimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleExpression=rulesimpleExpression();

            state._fsp--;

             current =iv_rulesimpleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimpleExpression"


    // $ANTLR start "rulesimpleExpression"
    // InternalPascal.g:4079:1: rulesimpleExpression returns [EObject current=null] : ( ( (lv_term_0_0= ruleterm ) ) ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) ;
    public final EObject rulesimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        EObject lv_simpleExpression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4085:2: ( ( ( (lv_term_0_0= ruleterm ) ) ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? ) )
            // InternalPascal.g:4086:2: ( ( (lv_term_0_0= ruleterm ) ) ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            {
            // InternalPascal.g:4086:2: ( ( (lv_term_0_0= ruleterm ) ) ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )? )
            // InternalPascal.g:4087:3: ( (lv_term_0_0= ruleterm ) ) ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            {
            // InternalPascal.g:4087:3: ( (lv_term_0_0= ruleterm ) )
            // InternalPascal.g:4088:4: (lv_term_0_0= ruleterm )
            {
            // InternalPascal.g:4088:4: (lv_term_0_0= ruleterm )
            // InternalPascal.g:4089:5: lv_term_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getTermTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_term_0_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_0_0,
            						"org.xtext.example.mydsl.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4106:3: ( ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=31 && LA43_0<=32)||(LA43_0>=58 && LA43_0<=59)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:4107:4: ruleadditiveoperator ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    {

                    				newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAdditiveoperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_37);
                    ruleadditiveoperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:4114:4: ( (lv_simpleExpression_2_0= rulesimpleExpression ) )
                    // InternalPascal.g:4115:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    {
                    // InternalPascal.g:4115:5: (lv_simpleExpression_2_0= rulesimpleExpression )
                    // InternalPascal.g:4116:6: lv_simpleExpression_2_0= rulesimpleExpression
                    {

                    						newCompositeNode(grammarAccess.getSimpleExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simpleExpression_2_0=rulesimpleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    						}
                    						set(
                    							current,
                    							"simpleExpression",
                    							lv_simpleExpression_2_0,
                    							"org.xtext.example.mydsl.Pascal.simpleExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulesimpleExpression"


    // $ANTLR start "entryRuleadditiveoperator"
    // InternalPascal.g:4138:1: entryRuleadditiveoperator returns [String current=null] : iv_ruleadditiveoperator= ruleadditiveoperator EOF ;
    public final String entryRuleadditiveoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditiveoperator = null;


        try {
            // InternalPascal.g:4138:56: (iv_ruleadditiveoperator= ruleadditiveoperator EOF )
            // InternalPascal.g:4139:2: iv_ruleadditiveoperator= ruleadditiveoperator EOF
            {
             newCompositeNode(grammarAccess.getAdditiveoperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleadditiveoperator=ruleadditiveoperator();

            state._fsp--;

             current =iv_ruleadditiveoperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleadditiveoperator"


    // $ANTLR start "ruleadditiveoperator"
    // InternalPascal.g:4145:1: ruleadditiveoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleadditiveoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:4151:2: ( (kw= '+' | kw= '-' | kw= 'or' | kw= 'xor' ) )
            // InternalPascal.g:4152:2: (kw= '+' | kw= '-' | kw= 'or' | kw= 'xor' )
            {
            // InternalPascal.g:4152:2: (kw= '+' | kw= '-' | kw= 'or' | kw= 'xor' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt44=1;
                }
                break;
            case 32:
                {
                alt44=2;
                }
                break;
            case 58:
                {
                alt44=3;
                }
                break;
            case 59:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalPascal.g:4153:3: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4159:3: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:4165:3: kw= 'or'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getOrKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:4171:3: kw= 'xor'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveoperatorAccess().getXorKeyword_3());
                    		

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
    // $ANTLR end "ruleadditiveoperator"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:4180:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:4180:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:4181:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:4187:1: ruleterm returns [EObject current=null] : ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_signedFactor_0_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4193:2: ( ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:4194:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:4194:2: ( ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )? )
            // InternalPascal.g:4195:3: ( (lv_signedFactor_0_0= rulesignedFactor ) ) ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:4195:3: ( (lv_signedFactor_0_0= rulesignedFactor ) )
            // InternalPascal.g:4196:4: (lv_signedFactor_0_0= rulesignedFactor )
            {
            // InternalPascal.g:4196:4: (lv_signedFactor_0_0= rulesignedFactor )
            // InternalPascal.g:4197:5: lv_signedFactor_0_0= rulesignedFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getSignedFactorSignedFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_signedFactor_0_0=rulesignedFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					set(
            						current,
            						"signedFactor",
            						lv_signedFactor_0_0,
            						"org.xtext.example.mydsl.Pascal.signedFactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4214:3: ( rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29||(LA45_0>=60 && LA45_0<=65)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:4215:4: rulemultiplicativeoperator ( (lv_term_2_0= ruleterm ) )
                    {

                    				newCompositeNode(grammarAccess.getTermAccess().getMultiplicativeoperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_37);
                    rulemultiplicativeoperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:4222:4: ( (lv_term_2_0= ruleterm ) )
                    // InternalPascal.g:4223:5: (lv_term_2_0= ruleterm )
                    {
                    // InternalPascal.g:4223:5: (lv_term_2_0= ruleterm )
                    // InternalPascal.g:4224:6: lv_term_2_0= ruleterm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getTermTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term_2_0=ruleterm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"term",
                    							lv_term_2_0,
                    							"org.xtext.example.mydsl.Pascal.term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulemultiplicativeoperator"
    // InternalPascal.g:4246:1: entryRulemultiplicativeoperator returns [String current=null] : iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF ;
    public final String entryRulemultiplicativeoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicativeoperator = null;


        try {
            // InternalPascal.g:4246:62: (iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF )
            // InternalPascal.g:4247:2: iv_rulemultiplicativeoperator= rulemultiplicativeoperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeoperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiplicativeoperator=rulemultiplicativeoperator();

            state._fsp--;

             current =iv_rulemultiplicativeoperator.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulemultiplicativeoperator"


    // $ANTLR start "rulemultiplicativeoperator"
    // InternalPascal.g:4253:1: rulemultiplicativeoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' | kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken rulemultiplicativeoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:4259:2: ( (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' | kw= '=' | kw= '<>' ) )
            // InternalPascal.g:4260:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' | kw= '=' | kw= '<>' )
            {
            // InternalPascal.g:4260:2: (kw= '*' | kw= '/' | kw= 'div' | kw= 'mod' | kw= 'and' | kw= '=' | kw= '<>' )
            int alt46=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt46=1;
                }
                break;
            case 61:
                {
                alt46=2;
                }
                break;
            case 62:
                {
                alt46=3;
                }
                break;
            case 63:
                {
                alt46=4;
                }
                break;
            case 64:
                {
                alt46=5;
                }
                break;
            case 29:
                {
                alt46=6;
                }
                break;
            case 65:
                {
                alt46=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalPascal.g:4261:3: kw= '*'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4267:3: kw= '/'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:4273:3: kw= 'div'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getDivKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:4279:3: kw= 'mod'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getModKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:4285:3: kw= 'and'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:4291:3: kw= '='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:4297:3: kw= '<>'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeoperatorAccess().getLessThanSignGreaterThanSignKeyword_6());
                    		

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
    // $ANTLR end "rulemultiplicativeoperator"


    // $ANTLR start "entryRulesignedFactor"
    // InternalPascal.g:4306:1: entryRulesignedFactor returns [EObject current=null] : iv_rulesignedFactor= rulesignedFactor EOF ;
    public final EObject entryRulesignedFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignedFactor = null;


        try {
            // InternalPascal.g:4306:53: (iv_rulesignedFactor= rulesignedFactor EOF )
            // InternalPascal.g:4307:2: iv_rulesignedFactor= rulesignedFactor EOF
            {
             newCompositeNode(grammarAccess.getSignedFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesignedFactor=rulesignedFactor();

            state._fsp--;

             current =iv_rulesignedFactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesignedFactor"


    // $ANTLR start "rulesignedFactor"
    // InternalPascal.g:4313:1: rulesignedFactor returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) ;
    public final EObject rulesignedFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4319:2: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) ) )
            // InternalPascal.g:4320:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:4320:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) ) )
            // InternalPascal.g:4321:3: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_factor_2_0= rulefactor ) )
            {
            // InternalPascal.g:4321:3: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            else if ( (LA47_0==32) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:4322:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_0, grammarAccess.getSignedFactorAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4327:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getSignedFactorAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:4332:3: ( (lv_factor_2_0= rulefactor ) )
            // InternalPascal.g:4333:4: (lv_factor_2_0= rulefactor )
            {
            // InternalPascal.g:4333:4: (lv_factor_2_0= rulefactor )
            // InternalPascal.g:4334:5: lv_factor_2_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getSignedFactorAccess().getFactorFactorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_2_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignedFactorRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_2_0,
            						"org.xtext.example.mydsl.Pascal.factor");
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
    // $ANTLR end "rulesignedFactor"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:4355:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:4355:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:4356:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:4362:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_functionDesignator_4_0= rulefunctionDesignator ) ) | ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) ) | ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_bool_8_0= rulebool ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_not_6_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_functionDesignator_4_0 = null;

        EObject lv_unsignedConstant_5_0 = null;

        EObject lv_factor_7_0 = null;

        EObject lv_bool_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4368:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_functionDesignator_4_0= rulefunctionDesignator ) ) | ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) ) | ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_bool_8_0= rulebool ) ) ) )
            // InternalPascal.g:4369:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_functionDesignator_4_0= rulefunctionDesignator ) ) | ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) ) | ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_bool_8_0= rulebool ) ) )
            {
            // InternalPascal.g:4369:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_functionDesignator_4_0= rulefunctionDesignator ) ) | ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) ) | ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_bool_8_0= rulebool ) ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt48=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==20) ) {
                    alt48=3;
                }
                else if ( (LA48_2==EOF||LA48_2==18||(LA48_2>=21 && LA48_2<=22)||LA48_2==27||LA48_2==29||(LA48_2>=31 && LA48_2<=32)||(LA48_2>=46 && LA48_2<=47)||LA48_2==52||(LA48_2>=56 && LA48_2<=65)) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt48=2;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case 30:
            case 67:
                {
                alt48=4;
                }
                break;
            case 66:
                {
                alt48=5;
                }
                break;
            case 33:
            case 34:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPascal.g:4370:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:4370:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:4371:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:4371:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:4372:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.example.mydsl.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4390:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    {
                    // InternalPascal.g:4390:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    // InternalPascal.g:4391:4: otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascal.g:4395:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:4396:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:4396:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:4397:6: lv_expression_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.example.mydsl.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4420:3: ( (lv_functionDesignator_4_0= rulefunctionDesignator ) )
                    {
                    // InternalPascal.g:4420:3: ( (lv_functionDesignator_4_0= rulefunctionDesignator ) )
                    // InternalPascal.g:4421:4: (lv_functionDesignator_4_0= rulefunctionDesignator )
                    {
                    // InternalPascal.g:4421:4: (lv_functionDesignator_4_0= rulefunctionDesignator )
                    // InternalPascal.g:4422:5: lv_functionDesignator_4_0= rulefunctionDesignator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionDesignatorFunctionDesignatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionDesignator_4_0=rulefunctionDesignator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"functionDesignator",
                    						lv_functionDesignator_4_0,
                    						"org.xtext.example.mydsl.Pascal.functionDesignator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4440:3: ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) )
                    {
                    // InternalPascal.g:4440:3: ( (lv_unsignedConstant_5_0= ruleunsignedConstant ) )
                    // InternalPascal.g:4441:4: (lv_unsignedConstant_5_0= ruleunsignedConstant )
                    {
                    // InternalPascal.g:4441:4: (lv_unsignedConstant_5_0= ruleunsignedConstant )
                    // InternalPascal.g:4442:5: lv_unsignedConstant_5_0= ruleunsignedConstant
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getUnsignedConstantUnsignedConstantParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedConstant_5_0=ruleunsignedConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"unsignedConstant",
                    						lv_unsignedConstant_5_0,
                    						"org.xtext.example.mydsl.Pascal.unsignedConstant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:4460:3: ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:4460:3: ( ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) ) )
                    // InternalPascal.g:4461:4: ( (lv_not_6_0= 'not' ) ) ( (lv_factor_7_0= rulefactor ) )
                    {
                    // InternalPascal.g:4461:4: ( (lv_not_6_0= 'not' ) )
                    // InternalPascal.g:4462:5: (lv_not_6_0= 'not' )
                    {
                    // InternalPascal.g:4462:5: (lv_not_6_0= 'not' )
                    // InternalPascal.g:4463:6: lv_not_6_0= 'not'
                    {
                    lv_not_6_0=(Token)match(input,66,FOLLOW_37); 

                    						newLeafNode(lv_not_6_0, grammarAccess.getFactorAccess().getNotNotKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFactorRule());
                    						}
                    						setWithLastConsumed(current, "not", lv_not_6_0, "not");
                    					

                    }


                    }

                    // InternalPascal.g:4475:4: ( (lv_factor_7_0= rulefactor ) )
                    // InternalPascal.g:4476:5: (lv_factor_7_0= rulefactor )
                    {
                    // InternalPascal.g:4476:5: (lv_factor_7_0= rulefactor )
                    // InternalPascal.g:4477:6: lv_factor_7_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factor_7_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"factor",
                    							lv_factor_7_0,
                    							"org.xtext.example.mydsl.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:4496:3: ( (lv_bool_8_0= rulebool ) )
                    {
                    // InternalPascal.g:4496:3: ( (lv_bool_8_0= rulebool ) )
                    // InternalPascal.g:4497:4: (lv_bool_8_0= rulebool )
                    {
                    // InternalPascal.g:4497:4: (lv_bool_8_0= rulebool )
                    // InternalPascal.g:4498:5: lv_bool_8_0= rulebool
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getBoolBoolParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bool_8_0=rulebool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"bool",
                    						lv_bool_8_0,
                    						"org.xtext.example.mydsl.Pascal.bool");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRuleunsignedConstant"
    // InternalPascal.g:4519:1: entryRuleunsignedConstant returns [EObject current=null] : iv_ruleunsignedConstant= ruleunsignedConstant EOF ;
    public final EObject entryRuleunsignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsignedConstant = null;


        try {
            // InternalPascal.g:4519:57: (iv_ruleunsignedConstant= ruleunsignedConstant EOF )
            // InternalPascal.g:4520:2: iv_ruleunsignedConstant= ruleunsignedConstant EOF
            {
             newCompositeNode(grammarAccess.getUnsignedConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsignedConstant=ruleunsignedConstant();

            state._fsp--;

             current =iv_ruleunsignedConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsignedConstant"


    // $ANTLR start "ruleunsignedConstant"
    // InternalPascal.g:4526:1: ruleunsignedConstant returns [EObject current=null] : ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_constantChr_1_0= ruleconstantChr ) ) | ( (lv_StringStart_2_0= ruleStringStart ) ) | ( (lv_nil_3_0= 'nil' ) ) ) ;
    public final EObject ruleunsignedConstant() throws RecognitionException {
        EObject current = null;

        Token lv_nil_3_0=null;
        EObject lv_unsignedNumber_0_0 = null;

        EObject lv_constantChr_1_0 = null;

        EObject lv_StringStart_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4532:2: ( ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_constantChr_1_0= ruleconstantChr ) ) | ( (lv_StringStart_2_0= ruleStringStart ) ) | ( (lv_nil_3_0= 'nil' ) ) ) )
            // InternalPascal.g:4533:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_constantChr_1_0= ruleconstantChr ) ) | ( (lv_StringStart_2_0= ruleStringStart ) ) | ( (lv_nil_3_0= 'nil' ) ) )
            {
            // InternalPascal.g:4533:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( (lv_constantChr_1_0= ruleconstantChr ) ) | ( (lv_StringStart_2_0= ruleStringStart ) ) | ( (lv_nil_3_0= 'nil' ) ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt49=1;
                }
                break;
            case 30:
                {
                alt49=2;
                }
                break;
            case RULE_STRING:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalPascal.g:4534:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    {
                    // InternalPascal.g:4534:3: ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) )
                    // InternalPascal.g:4535:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    {
                    // InternalPascal.g:4535:4: (lv_unsignedNumber_0_0= ruleunsignedNumber )
                    // InternalPascal.g:4536:5: lv_unsignedNumber_0_0= ruleunsignedNumber
                    {

                    					newCompositeNode(grammarAccess.getUnsignedConstantAccess().getUnsignedNumberUnsignedNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unsignedNumber_0_0=ruleunsignedNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedConstantRule());
                    					}
                    					set(
                    						current,
                    						"unsignedNumber",
                    						lv_unsignedNumber_0_0,
                    						"org.xtext.example.mydsl.Pascal.unsignedNumber");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4554:3: ( (lv_constantChr_1_0= ruleconstantChr ) )
                    {
                    // InternalPascal.g:4554:3: ( (lv_constantChr_1_0= ruleconstantChr ) )
                    // InternalPascal.g:4555:4: (lv_constantChr_1_0= ruleconstantChr )
                    {
                    // InternalPascal.g:4555:4: (lv_constantChr_1_0= ruleconstantChr )
                    // InternalPascal.g:4556:5: lv_constantChr_1_0= ruleconstantChr
                    {

                    					newCompositeNode(grammarAccess.getUnsignedConstantAccess().getConstantChrConstantChrParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constantChr_1_0=ruleconstantChr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedConstantRule());
                    					}
                    					set(
                    						current,
                    						"constantChr",
                    						lv_constantChr_1_0,
                    						"org.xtext.example.mydsl.Pascal.constantChr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4574:3: ( (lv_StringStart_2_0= ruleStringStart ) )
                    {
                    // InternalPascal.g:4574:3: ( (lv_StringStart_2_0= ruleStringStart ) )
                    // InternalPascal.g:4575:4: (lv_StringStart_2_0= ruleStringStart )
                    {
                    // InternalPascal.g:4575:4: (lv_StringStart_2_0= ruleStringStart )
                    // InternalPascal.g:4576:5: lv_StringStart_2_0= ruleStringStart
                    {

                    					newCompositeNode(grammarAccess.getUnsignedConstantAccess().getStringStartStringStartParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_StringStart_2_0=ruleStringStart();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsignedConstantRule());
                    					}
                    					set(
                    						current,
                    						"StringStart",
                    						lv_StringStart_2_0,
                    						"org.xtext.example.mydsl.Pascal.StringStart");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4594:3: ( (lv_nil_3_0= 'nil' ) )
                    {
                    // InternalPascal.g:4594:3: ( (lv_nil_3_0= 'nil' ) )
                    // InternalPascal.g:4595:4: (lv_nil_3_0= 'nil' )
                    {
                    // InternalPascal.g:4595:4: (lv_nil_3_0= 'nil' )
                    // InternalPascal.g:4596:5: lv_nil_3_0= 'nil'
                    {
                    lv_nil_3_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_nil_3_0, grammarAccess.getUnsignedConstantAccess().getNilNilKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsignedConstantRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_3_0, "nil");
                    				

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
    // $ANTLR end "ruleunsignedConstant"


    // $ANTLR start "entryRulefunctionDesignator"
    // InternalPascal.g:4612:1: entryRulefunctionDesignator returns [EObject current=null] : iv_rulefunctionDesignator= rulefunctionDesignator EOF ;
    public final EObject entryRulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDesignator = null;


        try {
            // InternalPascal.g:4612:59: (iv_rulefunctionDesignator= rulefunctionDesignator EOF )
            // InternalPascal.g:4613:2: iv_rulefunctionDesignator= rulefunctionDesignator EOF
            {
             newCompositeNode(grammarAccess.getFunctionDesignatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunctionDesignator=rulefunctionDesignator();

            state._fsp--;

             current =iv_rulefunctionDesignator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunctionDesignator"


    // $ANTLR start "rulefunctionDesignator"
    // InternalPascal.g:4619:1: rulefunctionDesignator returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) ;
    public final EObject rulefunctionDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4625:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' ) )
            // InternalPascal.g:4626:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:4626:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )
            // InternalPascal.g:4627:3: ( (lv_identifier_0_0= ruleidentifier ) ) otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')'
            {
            // InternalPascal.g:4627:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4628:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4628:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4629:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getFunctionDesignatorAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDesignatorRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDesignatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:4650:3: ( (lv_parameterList_2_0= ruleparameterList ) )
            // InternalPascal.g:4651:4: (lv_parameterList_2_0= ruleparameterList )
            {
            // InternalPascal.g:4651:4: (lv_parameterList_2_0= ruleparameterList )
            // InternalPascal.g:4652:5: lv_parameterList_2_0= ruleparameterList
            {

            					newCompositeNode(grammarAccess.getFunctionDesignatorAccess().getParameterListParameterListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameterList_2_0=ruleparameterList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDesignatorRule());
            					}
            					set(
            						current,
            						"parameterList",
            						lv_parameterList_2_0,
            						"org.xtext.example.mydsl.Pascal.parameterList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDesignatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulefunctionDesignator"


    // $ANTLR start "entryRuleparameterList"
    // InternalPascal.g:4677:1: entryRuleparameterList returns [EObject current=null] : iv_ruleparameterList= ruleparameterList EOF ;
    public final EObject entryRuleparameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterList = null;


        try {
            // InternalPascal.g:4677:54: (iv_ruleparameterList= ruleparameterList EOF )
            // InternalPascal.g:4678:2: iv_ruleparameterList= ruleparameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterList=ruleparameterList();

            state._fsp--;

             current =iv_ruleparameterList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleparameterList"


    // $ANTLR start "ruleparameterList"
    // InternalPascal.g:4684:1: ruleparameterList returns [EObject current=null] : ( ( (lv_actualParameter1_0_0= ruleactualParameter ) ) (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )* ) ;
    public final EObject ruleparameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actualParameter1_0_0 = null;

        EObject lv_actualParameter2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4690:2: ( ( ( (lv_actualParameter1_0_0= ruleactualParameter ) ) (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )* ) )
            // InternalPascal.g:4691:2: ( ( (lv_actualParameter1_0_0= ruleactualParameter ) ) (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )* )
            {
            // InternalPascal.g:4691:2: ( ( (lv_actualParameter1_0_0= ruleactualParameter ) ) (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )* )
            // InternalPascal.g:4692:3: ( (lv_actualParameter1_0_0= ruleactualParameter ) ) (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )*
            {
            // InternalPascal.g:4692:3: ( (lv_actualParameter1_0_0= ruleactualParameter ) )
            // InternalPascal.g:4693:4: (lv_actualParameter1_0_0= ruleactualParameter )
            {
            // InternalPascal.g:4693:4: (lv_actualParameter1_0_0= ruleactualParameter )
            // InternalPascal.g:4694:5: lv_actualParameter1_0_0= ruleactualParameter
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getActualParameter1ActualParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_actualParameter1_0_0=ruleactualParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					set(
            						current,
            						"actualParameter1",
            						lv_actualParameter1_0_0,
            						"org.xtext.example.mydsl.Pascal.actualParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4711:3: (otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPascal.g:4712:4: otherlv_1= ',' ( (lv_actualParameter2_2_0= ruleactualParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_37); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:4716:4: ( (lv_actualParameter2_2_0= ruleactualParameter ) )
            	    // InternalPascal.g:4717:5: (lv_actualParameter2_2_0= ruleactualParameter )
            	    {
            	    // InternalPascal.g:4717:5: (lv_actualParameter2_2_0= ruleactualParameter )
            	    // InternalPascal.g:4718:6: lv_actualParameter2_2_0= ruleactualParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getActualParameter2ActualParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_actualParameter2_2_0=ruleactualParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actualParameter2",
            	    							lv_actualParameter2_2_0,
            	    							"org.xtext.example.mydsl.Pascal.actualParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleparameterList"


    // $ANTLR start "entryRuleprocedureStatement"
    // InternalPascal.g:4740:1: entryRuleprocedureStatement returns [EObject current=null] : iv_ruleprocedureStatement= ruleprocedureStatement EOF ;
    public final EObject entryRuleprocedureStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedureStatement = null;


        try {
            // InternalPascal.g:4740:59: (iv_ruleprocedureStatement= ruleprocedureStatement EOF )
            // InternalPascal.g:4741:2: iv_ruleprocedureStatement= ruleprocedureStatement EOF
            {
             newCompositeNode(grammarAccess.getProcedureStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedureStatement=ruleprocedureStatement();

            state._fsp--;

             current =iv_ruleprocedureStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedureStatement"


    // $ANTLR start "ruleprocedureStatement"
    // InternalPascal.g:4747:1: ruleprocedureStatement returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleprocedureStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4753:2: ( ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )? ) )
            // InternalPascal.g:4754:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )? )
            {
            // InternalPascal.g:4754:2: ( ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )? )
            // InternalPascal.g:4755:3: ( (lv_identifier_0_0= ruleidentifier ) ) (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )?
            {
            // InternalPascal.g:4755:3: ( (lv_identifier_0_0= ruleidentifier ) )
            // InternalPascal.g:4756:4: (lv_identifier_0_0= ruleidentifier )
            {
            // InternalPascal.g:4756:4: (lv_identifier_0_0= ruleidentifier )
            // InternalPascal.g:4757:5: lv_identifier_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getProcedureStatementAccess().getIdentifierIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_identifier_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureStatementRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4774:3: (otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPascal.g:4775:4: otherlv_1= '(' ( (lv_parameterList_2_0= ruleparameterList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getProcedureStatementAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascal.g:4779:4: ( (lv_parameterList_2_0= ruleparameterList ) )
                    // InternalPascal.g:4780:5: (lv_parameterList_2_0= ruleparameterList )
                    {
                    // InternalPascal.g:4780:5: (lv_parameterList_2_0= ruleparameterList )
                    // InternalPascal.g:4781:6: lv_parameterList_2_0= ruleparameterList
                    {

                    						newCompositeNode(grammarAccess.getProcedureStatementAccess().getParameterListParameterListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameterList_2_0=ruleparameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureStatementRule());
                    						}
                    						set(
                    							current,
                    							"parameterList",
                    							lv_parameterList_2_0,
                    							"org.xtext.example.mydsl.Pascal.parameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedureStatementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleprocedureStatement"


    // $ANTLR start "entryRuleactualParameter"
    // InternalPascal.g:4807:1: entryRuleactualParameter returns [EObject current=null] : iv_ruleactualParameter= ruleactualParameter EOF ;
    public final EObject entryRuleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactualParameter = null;


        try {
            // InternalPascal.g:4807:56: (iv_ruleactualParameter= ruleactualParameter EOF )
            // InternalPascal.g:4808:2: iv_ruleactualParameter= ruleactualParameter EOF
            {
             newCompositeNode(grammarAccess.getActualParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleactualParameter=ruleactualParameter();

            state._fsp--;

             current =iv_ruleactualParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleactualParameter"


    // $ANTLR start "ruleactualParameter"
    // InternalPascal.g:4814:1: ruleactualParameter returns [EObject current=null] : ( (lv_expression_0_0= ruleexpression ) ) ;
    public final EObject ruleactualParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4820:2: ( ( (lv_expression_0_0= ruleexpression ) ) )
            // InternalPascal.g:4821:2: ( (lv_expression_0_0= ruleexpression ) )
            {
            // InternalPascal.g:4821:2: ( (lv_expression_0_0= ruleexpression ) )
            // InternalPascal.g:4822:3: (lv_expression_0_0= ruleexpression )
            {
            // InternalPascal.g:4822:3: (lv_expression_0_0= ruleexpression )
            // InternalPascal.g:4823:4: lv_expression_0_0= ruleexpression
            {

            				newCompositeNode(grammarAccess.getActualParameterAccess().getExpressionExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleexpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActualParameterRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.xtext.example.mydsl.Pascal.expression");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleactualParameter"


    // $ANTLR start "entryRulegotoStatement"
    // InternalPascal.g:4843:1: entryRulegotoStatement returns [EObject current=null] : iv_rulegotoStatement= rulegotoStatement EOF ;
    public final EObject entryRulegotoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegotoStatement = null;


        try {
            // InternalPascal.g:4843:54: (iv_rulegotoStatement= rulegotoStatement EOF )
            // InternalPascal.g:4844:2: iv_rulegotoStatement= rulegotoStatement EOF
            {
             newCompositeNode(grammarAccess.getGotoStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegotoStatement=rulegotoStatement();

            state._fsp--;

             current =iv_rulegotoStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulegotoStatement"


    // $ANTLR start "rulegotoStatement"
    // InternalPascal.g:4850:1: rulegotoStatement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_labelStart_1_0= rulelabelStart ) ) ) ;
    public final EObject rulegotoStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_labelStart_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4856:2: ( (otherlv_0= 'goto' ( (lv_labelStart_1_0= rulelabelStart ) ) ) )
            // InternalPascal.g:4857:2: (otherlv_0= 'goto' ( (lv_labelStart_1_0= rulelabelStart ) ) )
            {
            // InternalPascal.g:4857:2: (otherlv_0= 'goto' ( (lv_labelStart_1_0= rulelabelStart ) ) )
            // InternalPascal.g:4858:3: otherlv_0= 'goto' ( (lv_labelStart_1_0= rulelabelStart ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGotoStatementAccess().getGotoKeyword_0());
            		
            // InternalPascal.g:4862:3: ( (lv_labelStart_1_0= rulelabelStart ) )
            // InternalPascal.g:4863:4: (lv_labelStart_1_0= rulelabelStart )
            {
            // InternalPascal.g:4863:4: (lv_labelStart_1_0= rulelabelStart )
            // InternalPascal.g:4864:5: lv_labelStart_1_0= rulelabelStart
            {

            					newCompositeNode(grammarAccess.getGotoStatementAccess().getLabelStartLabelStartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_labelStart_1_0=rulelabelStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGotoStatementRule());
            					}
            					set(
            						current,
            						"labelStart",
            						lv_labelStart_1_0,
            						"org.xtext.example.mydsl.Pascal.labelStart");
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
    // $ANTLR end "rulegotoStatement"


    // $ANTLR start "entryRulestructuredStatement"
    // InternalPascal.g:4885:1: entryRulestructuredStatement returns [EObject current=null] : iv_rulestructuredStatement= rulestructuredStatement EOF ;
    public final EObject entryRulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructuredStatement = null;


        try {
            // InternalPascal.g:4885:60: (iv_rulestructuredStatement= rulestructuredStatement EOF )
            // InternalPascal.g:4886:2: iv_rulestructuredStatement= rulestructuredStatement EOF
            {
             newCompositeNode(grammarAccess.getStructuredStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructuredStatement=rulestructuredStatement();

            state._fsp--;

             current =iv_rulestructuredStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructuredStatement"


    // $ANTLR start "rulestructuredStatement"
    // InternalPascal.g:4892:1: rulestructuredStatement returns [EObject current=null] : ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) ) | ( (lv_withStatement_2_0= rulewithStatement ) ) ) ;
    public final EObject rulestructuredStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_compoundStatement_0_0 = null;

        EObject lv_repetetiveStatement_1_0 = null;

        EObject lv_withStatement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4898:2: ( ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) ) | ( (lv_withStatement_2_0= rulewithStatement ) ) ) )
            // InternalPascal.g:4899:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) ) | ( (lv_withStatement_2_0= rulewithStatement ) ) )
            {
            // InternalPascal.g:4899:2: ( ( (lv_compoundStatement_0_0= rulecompoundStatement ) ) | ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) ) | ( (lv_withStatement_2_0= rulewithStatement ) ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt52=1;
                }
                break;
            case 70:
                {
                alt52=2;
                }
                break;
            case 72:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalPascal.g:4900:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    {
                    // InternalPascal.g:4900:3: ( (lv_compoundStatement_0_0= rulecompoundStatement ) )
                    // InternalPascal.g:4901:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    {
                    // InternalPascal.g:4901:4: (lv_compoundStatement_0_0= rulecompoundStatement )
                    // InternalPascal.g:4902:5: lv_compoundStatement_0_0= rulecompoundStatement
                    {

                    					newCompositeNode(grammarAccess.getStructuredStatementAccess().getCompoundStatementCompoundStatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compoundStatement_0_0=rulecompoundStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredStatementRule());
                    					}
                    					set(
                    						current,
                    						"compoundStatement",
                    						lv_compoundStatement_0_0,
                    						"org.xtext.example.mydsl.Pascal.compoundStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4920:3: ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) )
                    {
                    // InternalPascal.g:4920:3: ( (lv_repetetiveStatement_1_0= rulerepetetiveStatement ) )
                    // InternalPascal.g:4921:4: (lv_repetetiveStatement_1_0= rulerepetetiveStatement )
                    {
                    // InternalPascal.g:4921:4: (lv_repetetiveStatement_1_0= rulerepetetiveStatement )
                    // InternalPascal.g:4922:5: lv_repetetiveStatement_1_0= rulerepetetiveStatement
                    {

                    					newCompositeNode(grammarAccess.getStructuredStatementAccess().getRepetetiveStatementRepetetiveStatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repetetiveStatement_1_0=rulerepetetiveStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredStatementRule());
                    					}
                    					set(
                    						current,
                    						"repetetiveStatement",
                    						lv_repetetiveStatement_1_0,
                    						"org.xtext.example.mydsl.Pascal.repetetiveStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4940:3: ( (lv_withStatement_2_0= rulewithStatement ) )
                    {
                    // InternalPascal.g:4940:3: ( (lv_withStatement_2_0= rulewithStatement ) )
                    // InternalPascal.g:4941:4: (lv_withStatement_2_0= rulewithStatement )
                    {
                    // InternalPascal.g:4941:4: (lv_withStatement_2_0= rulewithStatement )
                    // InternalPascal.g:4942:5: lv_withStatement_2_0= rulewithStatement
                    {

                    					newCompositeNode(grammarAccess.getStructuredStatementAccess().getWithStatementWithStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_withStatement_2_0=rulewithStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructuredStatementRule());
                    					}
                    					set(
                    						current,
                    						"withStatement",
                    						lv_withStatement_2_0,
                    						"org.xtext.example.mydsl.Pascal.withStatement");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulestructuredStatement"


    // $ANTLR start "entryRulecompoundStatement"
    // InternalPascal.g:4963:1: entryRulecompoundStatement returns [EObject current=null] : iv_rulecompoundStatement= rulecompoundStatement EOF ;
    public final EObject entryRulecompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompoundStatement = null;


        try {
            // InternalPascal.g:4963:58: (iv_rulecompoundStatement= rulecompoundStatement EOF )
            // InternalPascal.g:4964:2: iv_rulecompoundStatement= rulecompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompoundStatement=rulecompoundStatement();

            state._fsp--;

             current =iv_rulecompoundStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecompoundStatement"


    // $ANTLR start "rulecompoundStatement"
    // InternalPascal.g:4970:1: rulecompoundStatement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4976:2: ( (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:4977:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:4977:2: (otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end' )
            // InternalPascal.g:4978:3: otherlv_0= 'begin' ( (lv_statements_1_0= rulestatements ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundStatementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:4982:3: ( (lv_statements_1_0= rulestatements ) )
            // InternalPascal.g:4983:4: (lv_statements_1_0= rulestatements )
            {
            // InternalPascal.g:4983:4: (lv_statements_1_0= rulestatements )
            // InternalPascal.g:4984:5: lv_statements_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getCompoundStatementAccess().getStatementsStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_statements_1_0=rulestatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundStatementRule());
            					}
            					set(
            						current,
            						"statements",
            						lv_statements_1_0,
            						"org.xtext.example.mydsl.Pascal.statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundStatementAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "rulecompoundStatement"


    // $ANTLR start "entryRulestatements"
    // InternalPascal.g:5009:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:5009:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:5010:2: iv_rulestatements= rulestatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatements=rulestatements();

            state._fsp--;

             current =iv_rulestatements; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatements"


    // $ANTLR start "rulestatements"
    // InternalPascal.g:5016:1: rulestatements returns [EObject current=null] : ( ( (lv_statement1_0_0= rulestatement ) ) ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )* ( (lv_semiTerminal2_3_0= ';' ) ) ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token lv_semiTerminal1_1_0=null;
        Token lv_semiTerminal2_3_0=null;
        EObject lv_statement1_0_0 = null;

        EObject lv_statement2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5022:2: ( ( ( (lv_statement1_0_0= rulestatement ) ) ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )* ( (lv_semiTerminal2_3_0= ';' ) ) ) )
            // InternalPascal.g:5023:2: ( ( (lv_statement1_0_0= rulestatement ) ) ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )* ( (lv_semiTerminal2_3_0= ';' ) ) )
            {
            // InternalPascal.g:5023:2: ( ( (lv_statement1_0_0= rulestatement ) ) ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )* ( (lv_semiTerminal2_3_0= ';' ) ) )
            // InternalPascal.g:5024:3: ( (lv_statement1_0_0= rulestatement ) ) ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )* ( (lv_semiTerminal2_3_0= ';' ) )
            {
            // InternalPascal.g:5024:3: ( (lv_statement1_0_0= rulestatement ) )
            // InternalPascal.g:5025:4: (lv_statement1_0_0= rulestatement )
            {
            // InternalPascal.g:5025:4: (lv_statement1_0_0= rulestatement )
            // InternalPascal.g:5026:5: lv_statement1_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatement1StatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_statement1_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					add(
            						current,
            						"statement1",
            						lv_statement1_0_0,
            						"org.xtext.example.mydsl.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:5043:3: ( ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==22) ) {
                    int LA53_1 = input.LA(2);

                    if ( ((LA53_1>=RULE_IDENT && LA53_1<=RULE_NUM_INT)||LA53_1==55||(LA53_1>=68 && LA53_1<=70)||LA53_1==72) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:5044:4: ( (lv_semiTerminal1_1_0= ';' ) ) ( (lv_statement2_2_0= rulestatement ) )
            	    {
            	    // InternalPascal.g:5044:4: ( (lv_semiTerminal1_1_0= ';' ) )
            	    // InternalPascal.g:5045:5: (lv_semiTerminal1_1_0= ';' )
            	    {
            	    // InternalPascal.g:5045:5: (lv_semiTerminal1_1_0= ';' )
            	    // InternalPascal.g:5046:6: lv_semiTerminal1_1_0= ';'
            	    {
            	    lv_semiTerminal1_1_0=(Token)match(input,22,FOLLOW_43); 

            	    						newLeafNode(lv_semiTerminal1_1_0, grammarAccess.getStatementsAccess().getSemiTerminal1SemicolonKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStatementsRule());
            	    						}
            	    						addWithLastConsumed(current, "semiTerminal1", lv_semiTerminal1_1_0, ";");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:5058:4: ( (lv_statement2_2_0= rulestatement ) )
            	    // InternalPascal.g:5059:5: (lv_statement2_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:5059:5: (lv_statement2_2_0= rulestatement )
            	    // InternalPascal.g:5060:6: lv_statement2_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatement2StatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_statement2_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statement2",
            	    							lv_statement2_2_0,
            	    							"org.xtext.example.mydsl.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalPascal.g:5078:3: ( (lv_semiTerminal2_3_0= ';' ) )
            // InternalPascal.g:5079:4: (lv_semiTerminal2_3_0= ';' )
            {
            // InternalPascal.g:5079:4: (lv_semiTerminal2_3_0= ';' )
            // InternalPascal.g:5080:5: lv_semiTerminal2_3_0= ';'
            {
            lv_semiTerminal2_3_0=(Token)match(input,22,FOLLOW_2); 

            					newLeafNode(lv_semiTerminal2_3_0, grammarAccess.getStatementsAccess().getSemiTerminal2SemicolonKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementsRule());
            					}
            					setWithLastConsumed(current, "semiTerminal2", lv_semiTerminal2_3_0, ";");
            				

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
    // $ANTLR end "rulestatements"


    // $ANTLR start "entryRulerepetetiveStatement"
    // InternalPascal.g:5096:1: entryRulerepetetiveStatement returns [EObject current=null] : iv_rulerepetetiveStatement= rulerepetetiveStatement EOF ;
    public final EObject entryRulerepetetiveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetetiveStatement = null;


        try {
            // InternalPascal.g:5096:60: (iv_rulerepetetiveStatement= rulerepetetiveStatement EOF )
            // InternalPascal.g:5097:2: iv_rulerepetetiveStatement= rulerepetetiveStatement EOF
            {
             newCompositeNode(grammarAccess.getRepetetiveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetetiveStatement=rulerepetetiveStatement();

            state._fsp--;

             current =iv_rulerepetetiveStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepetetiveStatement"


    // $ANTLR start "rulerepetetiveStatement"
    // InternalPascal.g:5103:1: rulerepetetiveStatement returns [EObject current=null] : this_repeatStatement_0= rulerepeatStatement ;
    public final EObject rulerepetetiveStatement() throws RecognitionException {
        EObject current = null;

        EObject this_repeatStatement_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5109:2: (this_repeatStatement_0= rulerepeatStatement )
            // InternalPascal.g:5110:2: this_repeatStatement_0= rulerepeatStatement
            {

            		newCompositeNode(grammarAccess.getRepetetiveStatementAccess().getRepeatStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_repeatStatement_0=rulerepeatStatement();

            state._fsp--;


            		current = this_repeatStatement_0;
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
    // $ANTLR end "rulerepetetiveStatement"


    // $ANTLR start "entryRulerepeatStatement"
    // InternalPascal.g:5121:1: entryRulerepeatStatement returns [EObject current=null] : iv_rulerepeatStatement= rulerepeatStatement EOF ;
    public final EObject entryRulerepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeatStatement = null;


        try {
            // InternalPascal.g:5121:56: (iv_rulerepeatStatement= rulerepeatStatement EOF )
            // InternalPascal.g:5122:2: iv_rulerepeatStatement= rulerepeatStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepeatStatement=rulerepeatStatement();

            state._fsp--;

             current =iv_rulerepeatStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepeatStatement"


    // $ANTLR start "rulerepeatStatement"
    // InternalPascal.g:5128:1: rulerepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_statement_1_0= rulestatements ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5134:2: ( (otherlv_0= 'repeat' ( (lv_statement_1_0= rulestatements ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:5135:2: (otherlv_0= 'repeat' ( (lv_statement_1_0= rulestatements ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:5135:2: (otherlv_0= 'repeat' ( (lv_statement_1_0= rulestatements ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:5136:3: otherlv_0= 'repeat' ( (lv_statement_1_0= rulestatements ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalPascal.g:5140:3: ( (lv_statement_1_0= rulestatements ) )
            // InternalPascal.g:5141:4: (lv_statement_1_0= rulestatements )
            {
            // InternalPascal.g:5141:4: (lv_statement_1_0= rulestatements )
            // InternalPascal.g:5142:5: lv_statement_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getStatementStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_statement_1_0=rulestatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
            						"org.xtext.example.mydsl.Pascal.statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getUntilKeyword_2());
            		
            // InternalPascal.g:5163:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:5164:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:5164:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:5165:5: lv_expression_3_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.example.mydsl.Pascal.expression");
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
    // $ANTLR end "rulerepeatStatement"


    // $ANTLR start "entryRulewithStatement"
    // InternalPascal.g:5186:1: entryRulewithStatement returns [EObject current=null] : iv_rulewithStatement= rulewithStatement EOF ;
    public final EObject entryRulewithStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewithStatement = null;


        try {
            // InternalPascal.g:5186:54: (iv_rulewithStatement= rulewithStatement EOF )
            // InternalPascal.g:5187:2: iv_rulewithStatement= rulewithStatement EOF
            {
             newCompositeNode(grammarAccess.getWithStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewithStatement=rulewithStatement();

            state._fsp--;

             current =iv_rulewithStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewithStatement"


    // $ANTLR start "rulewithStatement"
    // InternalPascal.g:5193:1: rulewithStatement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_recordVariableList_1_0= rulerecordVariableList ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewithStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_recordVariableList_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5199:2: ( (otherlv_0= 'with' ( (lv_recordVariableList_1_0= rulerecordVariableList ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:5200:2: (otherlv_0= 'with' ( (lv_recordVariableList_1_0= rulerecordVariableList ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:5200:2: (otherlv_0= 'with' ( (lv_recordVariableList_1_0= rulerecordVariableList ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:5201:3: otherlv_0= 'with' ( (lv_recordVariableList_1_0= rulerecordVariableList ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getWithStatementAccess().getWithKeyword_0());
            		
            // InternalPascal.g:5205:3: ( (lv_recordVariableList_1_0= rulerecordVariableList ) )
            // InternalPascal.g:5206:4: (lv_recordVariableList_1_0= rulerecordVariableList )
            {
            // InternalPascal.g:5206:4: (lv_recordVariableList_1_0= rulerecordVariableList )
            // InternalPascal.g:5207:5: lv_recordVariableList_1_0= rulerecordVariableList
            {

            					newCompositeNode(grammarAccess.getWithStatementAccess().getRecordVariableListRecordVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_recordVariableList_1_0=rulerecordVariableList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithStatementRule());
            					}
            					set(
            						current,
            						"recordVariableList",
            						lv_recordVariableList_1_0,
            						"org.xtext.example.mydsl.Pascal.recordVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,73,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getWithStatementAccess().getDoKeyword_2());
            		
            // InternalPascal.g:5228:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:5229:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:5229:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:5230:5: lv_statement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWithStatementAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"org.xtext.example.mydsl.Pascal.statement");
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
    // $ANTLR end "rulewithStatement"


    // $ANTLR start "entryRulerecordVariableList"
    // InternalPascal.g:5251:1: entryRulerecordVariableList returns [EObject current=null] : iv_rulerecordVariableList= rulerecordVariableList EOF ;
    public final EObject entryRulerecordVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecordVariableList = null;


        try {
            // InternalPascal.g:5251:59: (iv_rulerecordVariableList= rulerecordVariableList EOF )
            // InternalPascal.g:5252:2: iv_rulerecordVariableList= rulerecordVariableList EOF
            {
             newCompositeNode(grammarAccess.getRecordVariableListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecordVariableList=rulerecordVariableList();

            state._fsp--;

             current =iv_rulerecordVariableList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecordVariableList"


    // $ANTLR start "rulerecordVariableList"
    // InternalPascal.g:5258:1: rulerecordVariableList returns [EObject current=null] : ( ( (lv_variable1_0_0= rulevariable ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )* ) ;
    public final EObject rulerecordVariableList() throws RecognitionException {
        EObject current = null;

        Token lv_commaTerminal_1_0=null;
        EObject lv_variable1_0_0 = null;

        EObject lv_variable2_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5264:2: ( ( ( (lv_variable1_0_0= rulevariable ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )* ) )
            // InternalPascal.g:5265:2: ( ( (lv_variable1_0_0= rulevariable ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )* )
            {
            // InternalPascal.g:5265:2: ( ( (lv_variable1_0_0= rulevariable ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )* )
            // InternalPascal.g:5266:3: ( (lv_variable1_0_0= rulevariable ) ) ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )*
            {
            // InternalPascal.g:5266:3: ( (lv_variable1_0_0= rulevariable ) )
            // InternalPascal.g:5267:4: (lv_variable1_0_0= rulevariable )
            {
            // InternalPascal.g:5267:4: (lv_variable1_0_0= rulevariable )
            // InternalPascal.g:5268:5: lv_variable1_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getRecordVariableListAccess().getVariable1VariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_variable1_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordVariableListRule());
            					}
            					set(
            						current,
            						"variable1",
            						lv_variable1_0_0,
            						"org.xtext.example.mydsl.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:5285:3: ( ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==27) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPascal.g:5286:4: ( (lv_commaTerminal_1_0= ',' ) ) ( (lv_variable2_2_0= rulevariable ) )
            	    {
            	    // InternalPascal.g:5286:4: ( (lv_commaTerminal_1_0= ',' ) )
            	    // InternalPascal.g:5287:5: (lv_commaTerminal_1_0= ',' )
            	    {
            	    // InternalPascal.g:5287:5: (lv_commaTerminal_1_0= ',' )
            	    // InternalPascal.g:5288:6: lv_commaTerminal_1_0= ','
            	    {
            	    lv_commaTerminal_1_0=(Token)match(input,27,FOLLOW_45); 

            	    						newLeafNode(lv_commaTerminal_1_0, grammarAccess.getRecordVariableListAccess().getCommaTerminalCommaKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRecordVariableListRule());
            	    						}
            	    						addWithLastConsumed(current, "commaTerminal", lv_commaTerminal_1_0, ",");
            	    					

            	    }


            	    }

            	    // InternalPascal.g:5300:4: ( (lv_variable2_2_0= rulevariable ) )
            	    // InternalPascal.g:5301:5: (lv_variable2_2_0= rulevariable )
            	    {
            	    // InternalPascal.g:5301:5: (lv_variable2_2_0= rulevariable )
            	    // InternalPascal.g:5302:6: lv_variable2_2_0= rulevariable
            	    {

            	    						newCompositeNode(grammarAccess.getRecordVariableListAccess().getVariable2VariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_variable2_2_0=rulevariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordVariableListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable2",
            	    							lv_variable2_2_0,
            	    							"org.xtext.example.mydsl.Pascal.variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "rulerecordVariableList"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\2\4\6\uffff";
    static final String dfa_3s = "\1\42\1\uffff\2\6\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\3\1\5\1\6\1\7\1\4\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\1\1\5\26\uffff\1\6\1\2\1\3\2\7",
            "",
            "\1\10\2\11",
            "\1\10\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "844:2: ( ( (lv_unsignedNumber_0_0= ruleunsignedNumber ) ) | ( ( (lv_sign1_1_0= rulesign ) ) ( (lv_unsignedNumber_2_0= ruleunsignedNumber ) ) ) | ( (lv_identifier1_3_0= ruleidentifier ) ) | ( ( (lv_sign2_4_0= rulesign ) ) ( (lv_identifier2_5_0= ruleidentifier ) ) ) | ( (lv_string_6_0= ruleStringStart ) ) | ( (lv_constantChr_7_0= ruleconstantChr ) ) | this_bool_8= rulebool )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020005817020000L,0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000007C00000F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00113F57C01000F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001F0000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0006000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00113F07C01000F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020005000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00A0005817020010L,0x0000000000000170L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00800007C01000F0L,0x000000000000000CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0110400000040002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000008000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C00000180000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xF000000020000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00A0005817020030L,0x0000000000000170L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}