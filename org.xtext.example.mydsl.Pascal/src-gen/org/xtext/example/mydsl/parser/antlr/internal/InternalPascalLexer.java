package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( 'interface' )
            // InternalPascal.g:11:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( '.' )
            // InternalPascal.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( 'program' )
            // InternalPascal.g:13:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( '(' )
            // InternalPascal.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:15:7: ( ')' )
            // InternalPascal.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:16:7: ( ';' )
            // InternalPascal.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:17:7: ( 'unit' )
            // InternalPascal.g:17:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( 'implementation' )
            // InternalPascal.g:18:9: 'implementation'
            {
            match("implementation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:19:7: ( 'uses' )
            // InternalPascal.g:19:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:20:7: ( 'label' )
            // InternalPascal.g:20:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:21:7: ( ',' )
            // InternalPascal.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:22:7: ( 'const' )
            // InternalPascal.g:22:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:23:7: ( '=' )
            // InternalPascal.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:24:7: ( 'chr' )
            // InternalPascal.g:24:9: 'chr'
            {
            match("chr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:25:7: ( '+' )
            // InternalPascal.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:26:7: ( '-' )
            // InternalPascal.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:27:7: ( 'true' )
            // InternalPascal.g:27:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:28:7: ( 'false' )
            // InternalPascal.g:28:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( 'type' )
            // InternalPascal.g:29:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( 'function' )
            // InternalPascal.g:30:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( ':' )
            // InternalPascal.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( 'procedure' )
            // InternalPascal.g:32:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( '..' )
            // InternalPascal.g:33:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'Char' )
            // InternalPascal.g:34:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:35:7: ( 'Boolean' )
            // InternalPascal.g:35:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:36:7: ( 'Integer' )
            // InternalPascal.g:36:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:37:7: ( 'Real' )
            // InternalPascal.g:37:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:38:7: ( 'String' )
            // InternalPascal.g:38:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:39:7: ( 'packed' )
            // InternalPascal.g:39:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:40:7: ( '[' )
            // InternalPascal.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:41:7: ( ']' )
            // InternalPascal.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:42:7: ( 'record' )
            // InternalPascal.g:42:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:43:7: ( 'end' )
            // InternalPascal.g:43:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:44:7: ( 'case' )
            // InternalPascal.g:44:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:45:7: ( 'of' )
            // InternalPascal.g:45:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:46:7: ( '^' )
            // InternalPascal.g:46:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:47:7: ( 'var' )
            // InternalPascal.g:47:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:48:7: ( ':=' )
            // InternalPascal.g:48:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:49:7: ( '@' )
            // InternalPascal.g:49:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:50:7: ( '(.' )
            // InternalPascal.g:50:9: '(.'
            {
            match("(."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:51:7: ( '.)' )
            // InternalPascal.g:51:9: '.)'
            {
            match(".)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:52:7: ( 'or' )
            // InternalPascal.g:52:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:53:7: ( 'xor' )
            // InternalPascal.g:53:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:54:7: ( '*' )
            // InternalPascal.g:54:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:55:7: ( '/' )
            // InternalPascal.g:55:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:56:7: ( 'div' )
            // InternalPascal.g:56:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:57:7: ( 'mod' )
            // InternalPascal.g:57:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:58:7: ( 'and' )
            // InternalPascal.g:58:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:59:7: ( '<>' )
            // InternalPascal.g:59:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:60:7: ( 'not' )
            // InternalPascal.g:60:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:61:7: ( 'nil' )
            // InternalPascal.g:61:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:62:7: ( 'goto' )
            // InternalPascal.g:62:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:63:7: ( 'begin' )
            // InternalPascal.g:63:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:64:7: ( 'repeat' )
            // InternalPascal.g:64:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:65:7: ( 'until' )
            // InternalPascal.g:65:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:66:7: ( 'with' )
            // InternalPascal.g:66:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:67:7: ( 'do' )
            // InternalPascal.g:67:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "RULE_COMMENT_1"
    public final void mRULE_COMMENT_1() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5323:16: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalPascal.g:5323:18: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalPascal.g:5323:23: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==')') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='(')||(LA1_1>='*' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascal.g:5323:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_1"

    // $ANTLR start "RULE_COMMENT_2"
    public final void mRULE_COMMENT_2() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5325:16: ( '{' ( options {greedy=false; } : . )* '}' )
            // InternalPascal.g:5325:18: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalPascal.g:5325:22: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:5325:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_2"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5327:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // InternalPascal.g:5327:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:5327:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_NUM_INT"
    public final void mRULE_NUM_INT() throws RecognitionException {
        try {
            int _type = RULE_NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5329:14: ( RULE_INT )
            // InternalPascal.g:5329:16: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM_INT"

    // $ANTLR start "RULE_NUM_REAL"
    public final void mRULE_NUM_REAL() throws RecognitionException {
        try {
            int _type = RULE_NUM_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5331:15: ( ( RULE_NUM_INT )+ ( ( '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT ) )
            // InternalPascal.g:5331:17: ( RULE_NUM_INT )+ ( ( '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT )
            {
            // InternalPascal.g:5331:17: ( RULE_NUM_INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:5331:17: RULE_NUM_INT
            	    {
            	    mRULE_NUM_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalPascal.g:5331:31: ( ( '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )? )? | RULE_EXPONENT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='e') ) {
                alt8=2;
            }
            else {
                alt8=1;}
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:5331:32: ( '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )? )?
                    {
                    // InternalPascal.g:5331:32: ( '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPascal.g:5331:33: '.' ( RULE_NUM_INT )+ ( RULE_EXPONENT )?
                            {
                            match('.'); 
                            // InternalPascal.g:5331:37: ( RULE_NUM_INT )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalPascal.g:5331:37: RULE_NUM_INT
                            	    {
                            	    mRULE_NUM_INT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);

                            // InternalPascal.g:5331:51: ( RULE_EXPONENT )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='e') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalPascal.g:5331:51: RULE_EXPONENT
                                    {
                                    mRULE_EXPONENT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5331:68: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM_REAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalPascal.g:5333:24: ( 'e' ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalPascal.g:5333:26: 'e' ( '+' | '-' )? ( '0' .. '9' )+
            {
            match('e'); 
            // InternalPascal.g:5333:30: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalPascal.g:5333:41: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:5333:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5335:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:5335:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:5335:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:5335:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:5335:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalPascal.g:5337:19: ( ( '0' .. '9' )+ )
            // InternalPascal.g:5337:21: ( '0' .. '9' )+
            {
            // InternalPascal.g:5337:21: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:5337:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5339:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:5339:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:5339:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:5339:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:5339:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPascal.g:5339:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5339:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:5339:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:5339:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPascal.g:5339:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:5339:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5341:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:5341:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:5341:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:5341:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5343:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:5343:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:5343:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:5343:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalPascal.g:5343:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:5343:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:5343:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalPascal.g:5343:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5345:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:5345:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:5345:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:5347:16: ( . )
            // InternalPascal.g:5347:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_COMMENT_1 | RULE_COMMENT_2 | RULE_IDENT | RULE_NUM_INT | RULE_NUM_REAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=68;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalPascal.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalPascal.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalPascal.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalPascal.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalPascal.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalPascal.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalPascal.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalPascal.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalPascal.g:1:352: RULE_COMMENT_1
                {
                mRULE_COMMENT_1(); 

                }
                break;
            case 59 :
                // InternalPascal.g:1:367: RULE_COMMENT_2
                {
                mRULE_COMMENT_2(); 

                }
                break;
            case 60 :
                // InternalPascal.g:1:382: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 61 :
                // InternalPascal.g:1:393: RULE_NUM_INT
                {
                mRULE_NUM_INT(); 

                }
                break;
            case 62 :
                // InternalPascal.g:1:406: RULE_NUM_REAL
                {
                mRULE_NUM_REAL(); 

                }
                break;
            case 63 :
                // InternalPascal.g:1:420: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // InternalPascal.g:1:428: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // InternalPascal.g:1:440: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // InternalPascal.g:1:456: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // InternalPascal.g:1:472: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // InternalPascal.g:1:480: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\63\1\67\1\63\1\74\2\uffff\2\63\1\uffff\1\63\3\uffff\2\63\1\116\5\63\2\uffff\3\63\1\132\1\63\1\uffff\1\63\1\uffff\1\142\3\63\1\60\4\63\1\60\1\63\1\156\1\uffff\2\60\2\uffff\2\63\1\uffff\1\63\3\uffff\2\63\5\uffff\3\63\1\uffff\3\63\3\uffff\4\63\2\uffff\5\63\2\uffff\2\63\1\u008a\1\u008b\2\uffff\1\63\1\uffff\1\63\4\uffff\1\63\1\u008f\2\63\1\uffff\5\63\3\uffff\1\156\2\uffff\11\63\1\u00a1\14\63\1\u00ae\2\uffff\1\u00af\1\u00b0\1\u00b1\1\uffff\1\u00b2\1\u00b3\1\u00b4\1\u00b5\10\63\1\u00be\1\63\1\u00c0\2\63\1\uffff\1\u00c3\1\u00c4\1\u00c5\2\63\1\u00c8\2\63\1\u00cb\3\63\10\uffff\1\u00cf\1\63\1\u00d1\5\63\1\uffff\1\u00d7\1\uffff\1\u00d8\1\u00d9\3\uffff\1\u00da\1\63\1\uffff\2\63\1\uffff\3\63\1\uffff\1\u00e1\1\uffff\4\63\1\u00e6\4\uffff\3\63\1\u00ea\1\u00eb\1\u00ec\1\uffff\2\63\1\u00ef\1\63\1\uffff\1\63\1\u00f2\1\u00f3\3\uffff\2\63\1\uffff\1\63\1\u00f7\2\uffff\1\u00f8\1\63\1\u00fa\2\uffff\1\63\1\uffff\3\63\1\u00ff\1\uffff";
    static final String DFA22_eofS =
        "\u0100\uffff";
    static final String DFA22_minS =
        "\1\0\1\60\1\51\1\60\1\52\2\uffff\2\60\1\uffff\1\60\3\uffff\2\60\1\75\5\60\2\uffff\3\60\1\101\1\60\1\uffff\1\60\1\uffff\1\52\3\60\1\76\4\60\1\0\1\60\1\56\1\uffff\2\0\2\uffff\2\60\1\uffff\1\60\3\uffff\2\60\5\uffff\3\60\1\uffff\3\60\3\uffff\4\60\2\uffff\5\60\2\uffff\4\60\2\uffff\1\60\1\uffff\1\60\4\uffff\4\60\1\uffff\5\60\3\uffff\1\56\2\uffff\27\60\2\uffff\3\60\1\uffff\21\60\1\uffff\14\60\10\uffff\10\60\1\uffff\1\60\1\uffff\2\60\3\uffff\2\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60\1\uffff\5\60\4\uffff\6\60\1\uffff\4\60\1\uffff\3\60\3\uffff\2\60\1\uffff\2\60\2\uffff\3\60\2\uffff\1\60\1\uffff\4\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\172\1\56\1\172\1\56\2\uffff\2\172\1\uffff\1\172\3\uffff\2\172\1\75\5\172\2\uffff\5\172\1\uffff\1\172\1\uffff\1\57\3\172\1\76\4\172\1\uffff\1\172\1\145\1\uffff\2\uffff\2\uffff\2\172\1\uffff\1\172\3\uffff\2\172\5\uffff\3\172\1\uffff\3\172\3\uffff\4\172\2\uffff\5\172\2\uffff\4\172\2\uffff\1\172\1\uffff\1\172\4\uffff\4\172\1\uffff\5\172\3\uffff\1\145\2\uffff\27\172\2\uffff\3\172\1\uffff\21\172\1\uffff\14\172\10\uffff\10\172\1\uffff\1\172\1\uffff\2\172\3\uffff\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\5\172\4\uffff\6\172\1\uffff\4\172\1\uffff\3\172\3\uffff\2\172\1\uffff\2\172\2\uffff\3\172\2\uffff\1\172\1\uffff\4\172\1\uffff";
    static final String DFA22_acceptS =
        "\5\uffff\1\5\1\6\2\uffff\1\13\1\uffff\1\15\1\17\1\20\10\uffff\1\36\1\37\5\uffff\1\47\1\uffff\1\54\14\uffff\1\77\2\uffff\1\103\1\104\2\uffff\1\74\1\uffff\1\27\1\51\1\2\2\uffff\1\50\1\72\1\4\1\5\1\6\3\uffff\1\13\3\uffff\1\15\1\17\1\20\4\uffff\1\46\1\25\5\uffff\1\36\1\37\4\uffff\1\44\1\77\1\uffff\1\47\1\uffff\1\54\1\101\1\102\1\55\4\uffff\1\61\5\uffff\1\73\1\75\1\76\1\uffff\1\100\1\103\27\uffff\1\43\1\52\3\uffff\1\71\21\uffff\1\16\14\uffff\1\41\1\45\1\53\1\56\1\57\1\60\1\62\1\63\10\uffff\1\7\1\uffff\1\11\2\uffff\1\42\1\21\1\23\2\uffff\1\30\2\uffff\1\33\3\uffff\1\64\1\uffff\1\70\5\uffff\1\67\1\12\1\14\1\22\6\uffff\1\65\4\uffff\1\35\3\uffff\1\34\1\40\1\66\2\uffff\1\3\2\uffff\1\31\1\32\3\uffff\1\24\1\1\1\uffff\1\26\4\uffff\1\10";
    static final String DFA22_specialS =
        "\1\0\50\uffff\1\3\3\uffff\1\1\1\2\u00d1\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\60\1\55\4\60\1\56\1\4\1\5\1\37\1\14\1\11\1\15\1\2\1\40\12\53\1\20\1\6\1\44\1\13\2\60\1\35\1\52\1\22\1\21\5\52\1\23\10\52\1\24\1\25\7\52\1\26\1\60\1\27\1\33\1\54\1\60\1\43\1\47\1\12\1\41\1\31\1\17\1\46\1\52\1\1\2\52\1\10\1\42\1\45\1\32\1\3\1\52\1\30\1\52\1\16\1\7\1\34\1\50\1\36\2\52\1\51\uff84\60",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\62\1\61\14\64",
            "\1\66\4\uffff\1\65",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\71\20\64\1\70\10\64",
            "\1\73\3\uffff\1\72",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\77\4\64\1\100\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\101\31\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\105\6\64\1\104\6\64\1\103\13\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\111\6\64\1\112\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\113\23\64\1\114\5\64",
            "\1\115",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\117\22\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\120\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\121\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\122\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\123\6\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\126\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\127\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\130\13\64\1\131\10\64",
            "\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\134\31\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\136\13\64",
            "",
            "\1\140\4\uffff\1\141",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\143\5\64\1\144\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\145\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\146\14\64",
            "\1\147",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\151\5\64\1\150\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\152\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\153\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\154\21\64",
            "\0\155",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\157\1\uffff\12\160\53\uffff\1\157",
            "",
            "\0\161",
            "\0\161",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\163\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\164\12\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\165\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\166\27\64",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\167\12\64\1\170\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\171\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\172\30\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\173\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\174\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\175\7\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\176\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\177\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0080\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0081\14\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0082\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0083\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0084\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0085\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0086\10\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0087\14\64\1\u0088\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0089\26\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u008c\10\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u008d\10\64",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\25\64\1\u008e\4\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0090\26\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0091\26\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0092\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0093\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0094\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u0095\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0096\6\64",
            "",
            "",
            "",
            "\1\157\1\uffff\12\160\53\uffff\1\157",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0097\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0098\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u009a\3\64\1\u0099\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u009b\17\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u009c\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u009d\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u009e\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u009f\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u00a0\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a2\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a3\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a4\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u00a5\7\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00a6\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a7\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00a8\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a9\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00aa\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00ab\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00ac\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00ad\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00b6\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00b7\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u00b8\22\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00b9\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00ba\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00bb\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00bc\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00bd\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00bf\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00c1\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00c2\6\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00c6\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00c7\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00c9\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u00ca\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00cc\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00cd\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00ce\31\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00d0\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u00d2\24\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u00d3\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00d4\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00d5\26\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00d6\26\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00db\21\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00dc\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00dd\25\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u00de\23\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00df\26\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00e0\6\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00e2\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00e3\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u00e4\15\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u00e5\5\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00e7\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00e8\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00e9\10\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00ed\27\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00ee\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00f0\10\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00f1\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00f4\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00f5\6\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00f6\25\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00f9\31\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00fb\6\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00fc\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00fd\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00fe\14\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_COMMENT_1 | RULE_COMMENT_2 | RULE_IDENT | RULE_NUM_INT | RULE_NUM_REAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='i') ) {s = 1;}

                        else if ( (LA22_0=='.') ) {s = 2;}

                        else if ( (LA22_0=='p') ) {s = 3;}

                        else if ( (LA22_0=='(') ) {s = 4;}

                        else if ( (LA22_0==')') ) {s = 5;}

                        else if ( (LA22_0==';') ) {s = 6;}

                        else if ( (LA22_0=='u') ) {s = 7;}

                        else if ( (LA22_0=='l') ) {s = 8;}

                        else if ( (LA22_0==',') ) {s = 9;}

                        else if ( (LA22_0=='c') ) {s = 10;}

                        else if ( (LA22_0=='=') ) {s = 11;}

                        else if ( (LA22_0=='+') ) {s = 12;}

                        else if ( (LA22_0=='-') ) {s = 13;}

                        else if ( (LA22_0=='t') ) {s = 14;}

                        else if ( (LA22_0=='f') ) {s = 15;}

                        else if ( (LA22_0==':') ) {s = 16;}

                        else if ( (LA22_0=='C') ) {s = 17;}

                        else if ( (LA22_0=='B') ) {s = 18;}

                        else if ( (LA22_0=='I') ) {s = 19;}

                        else if ( (LA22_0=='R') ) {s = 20;}

                        else if ( (LA22_0=='S') ) {s = 21;}

                        else if ( (LA22_0=='[') ) {s = 22;}

                        else if ( (LA22_0==']') ) {s = 23;}

                        else if ( (LA22_0=='r') ) {s = 24;}

                        else if ( (LA22_0=='e') ) {s = 25;}

                        else if ( (LA22_0=='o') ) {s = 26;}

                        else if ( (LA22_0=='^') ) {s = 27;}

                        else if ( (LA22_0=='v') ) {s = 28;}

                        else if ( (LA22_0=='@') ) {s = 29;}

                        else if ( (LA22_0=='x') ) {s = 30;}

                        else if ( (LA22_0=='*') ) {s = 31;}

                        else if ( (LA22_0=='/') ) {s = 32;}

                        else if ( (LA22_0=='d') ) {s = 33;}

                        else if ( (LA22_0=='m') ) {s = 34;}

                        else if ( (LA22_0=='a') ) {s = 35;}

                        else if ( (LA22_0=='<') ) {s = 36;}

                        else if ( (LA22_0=='n') ) {s = 37;}

                        else if ( (LA22_0=='g') ) {s = 38;}

                        else if ( (LA22_0=='b') ) {s = 39;}

                        else if ( (LA22_0=='w') ) {s = 40;}

                        else if ( (LA22_0=='{') ) {s = 41;}

                        else if ( (LA22_0=='A'||(LA22_0>='D' && LA22_0<='H')||(LA22_0>='J' && LA22_0<='Q')||(LA22_0>='T' && LA22_0<='Z')||LA22_0=='h'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='q'||LA22_0=='s'||(LA22_0>='y' && LA22_0<='z')) ) {s = 42;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 43;}

                        else if ( (LA22_0=='_') ) {s = 44;}

                        else if ( (LA22_0=='\"') ) {s = 45;}

                        else if ( (LA22_0=='\'') ) {s = 46;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 47;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='>' && LA22_0<='?')||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='|' && LA22_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_45 = input.LA(1);

                        s = -1;
                        if ( ((LA22_45>='\u0000' && LA22_45<='\uFFFF')) ) {s = 113;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_46 = input.LA(1);

                        s = -1;
                        if ( ((LA22_46>='\u0000' && LA22_46<='\uFFFF')) ) {s = 113;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_41 = input.LA(1);

                        s = -1;
                        if ( ((LA22_41>='\u0000' && LA22_41<='\uFFFF')) ) {s = 109;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}