package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSwrtjLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=5;
    public static final int T74=74;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=79;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalSwrtjLexer() {;} 
    public InternalSwrtjLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:10:5: ( '+' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:10:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:11:5: ( '-' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:11:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:12:5: ( '*' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:12:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:13:5: ( '/' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:13:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14:5: ( '%' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:15:5: ( 'import' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:15:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:16:5: ( '{' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:16:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:17:5: ( '}' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:17:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:18:5: ( 'extends' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:18:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:19:5: ( ',' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:19:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:20:5: ( 'is' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:20:7: 'is'
            {
            match("is"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:21:5: ( 'implements' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:21:7: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:22:5: ( 'by' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:22:7: 'by'
            {
            match("by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:23:5: ( 'and' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:23:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:24:5: ( '[' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:24:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:25:5: ( ']' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:26:5: ( '(' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:26:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:27:5: ( ')' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:27:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:28:5: ( 'exclude' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:28:7: 'exclude'
            {
            match("exclude"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:29:5: ( 'renameTo' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:29:7: 'renameTo'
            {
            match("renameTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:30:5: ( 'renameF' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:30:7: 'renameF'
            {
            match("renameF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:31:5: ( 'aliasAs' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:31:7: 'aliasAs'
            {
            match("aliasAs"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:32:5: ( 'renameM' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:32:7: 'renameM'
            {
            match("renameM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:33:5: ( 'renameFieldTo' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:33:7: 'renameFieldTo'
            {
            match("renameFieldTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:34:5: ( ';' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:34:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:35:5: ( 'return' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:35:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:36:5: ( 'if' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:36:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:37:5: ( 'else' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:37:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:38:5: ( 'while' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:38:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:39:5: ( '=' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:39:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:40:5: ( '.' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:40:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:41:5: ( 'new' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:41:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:42:5: ( 'interface' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:42:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:43:5: ( 'record' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:43:7: 'record'
            {
            match("record"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:44:5: ( 'trait' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:44:7: 'trait'
            {
            match("trait"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:45:5: ( 'class' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:45:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:46:5: ( 'program' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:46:7: 'program'
            {
            match("program"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:47:5: ( 'transient' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:47:7: 'transient'
            {
            match("transient"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:48:5: ( 'volatile' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:48:7: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:49:5: ( 'synchronized' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:49:7: 'synchronized'
            {
            match("synchronized"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:50:5: ( 'byte' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:50:7: 'byte'
            {
            match("byte"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:51:5: ( 'char' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:51:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:52:5: ( 'boolean' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:52:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:53:5: ( 'short' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:53:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:54:5: ( 'int' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:54:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:55:5: ( 'long' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:55:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:56:5: ( 'float' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:56:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:57:5: ( 'double' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:57:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:58:5: ( 'void' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:58:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:59:5: ( '&' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:59:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:60:5: ( '&&' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:60:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:61:5: ( '|' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:61:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:62:5: ( '||' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:62:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:63:5: ( '^' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:63:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:64:5: ( '!' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:64:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:65:5: ( '<' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:65:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:66:5: ( '<=' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:66:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:67:5: ( '==' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:67:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:68:5: ( '!=' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:68:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:69:5: ( '>' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:69:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:70:5: ( '>=' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:70:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:71:5: ( 'null' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:71:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:72:5: ( 'in' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:72:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:73:5: ( 'args' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:73:7: 'args'
            {
            match("args"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:74:5: ( 'out' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:74:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:75:5: ( 'true' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:75:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:76:5: ( 'false' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:76:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:77:5: ( 'this' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:77:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14947:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14947:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14947:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14947:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14947:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14949:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14949:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14949:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14949:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("14951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14951:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14953:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14953:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14953:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14953:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14955:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14957:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14959:16: ( . )
            // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:14959:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=75;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='+') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='-') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='*') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='%') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='e') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='b') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='[') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0==']') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='r') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='w') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='=') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='.') ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper026();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper027();
        }
        else if ( (LA12_0=='l') ) {
            alt12 = mTokensHelper028();
        }
        else if ( (LA12_0=='f') ) {
            alt12 = mTokensHelper029();
        }
        else if ( (LA12_0=='d') ) {
            alt12 = mTokensHelper030();
        }
        else if ( (LA12_0=='&') ) {
            alt12 = mTokensHelper031();
        }
        else if ( (LA12_0=='|') ) {
            alt12 = mTokensHelper032();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper033();
        }
        else if ( (LA12_0=='!') ) {
            alt12 = mTokensHelper034();
        }
        else if ( (LA12_0=='<') ) {
            alt12 = mTokensHelper035();
        }
        else if ( (LA12_0=='>') ) {
            alt12 = mTokensHelper036();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper037();
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='q'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12 = mTokensHelper038();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper039();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper040();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper041();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper042();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0==':'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper043();
        }
        else {
            alt12 = mTokensHelper044();
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:282: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:290: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:299: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:311: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:327: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:343: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // ../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g:1:351: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        return 1;
    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        return 3;
    }

    private int mTokensHelper004() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 73;
            }
        case '*':
            {
            return 72;
            }
        default:
            return 4;}

    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'f':
            {
            int LA12_51 = input.LA(3);

            if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                return 69;
            }
            else {
                return 27;}
            }
        case 'n':
            {
            switch ( input.LA(3) ) {
            case 't':
                {
                switch ( input.LA(4) ) {
                case 'e':
                    {
                    int LA12_140 = input.LA(5);

                    if ( (LA12_140=='r') ) {
                        int LA12_174 = input.LA(6);

                        if ( (LA12_174=='f') ) {
                            int LA12_204 = input.LA(7);

                            if ( (LA12_204=='a') ) {
                                int LA12_225 = input.LA(8);

                                if ( (LA12_225=='c') ) {
                                    int LA12_242 = input.LA(9);

                                    if ( (LA12_242=='e') ) {
                                        int LA12_256 = input.LA(10);

                                        if ( ((LA12_256>='0' && LA12_256<='9')||(LA12_256>='A' && LA12_256<='Z')||LA12_256=='_'||(LA12_256>='a' && LA12_256<='z')) ) {
                                            return 69;
                                        }
                                        else {
                                            return 33;}
                                    }
                                    else {
                                        return 69;}
                                }
                                else {
                                    return 69;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                    }
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    return 69;
                    }
                default:
                    return 45;}

                }
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                return 69;
                }
            default:
                return 63;}

            }
        case 's':
            {
            int LA12_53 = input.LA(3);

            if ( ((LA12_53>='0' && LA12_53<='9')||(LA12_53>='A' && LA12_53<='Z')||LA12_53=='_'||(LA12_53>='a' && LA12_53<='z')) ) {
                return 69;
            }
            else {
                return 11;}
            }
        case 'm':
            {
            int LA12_54 = input.LA(3);

            if ( (LA12_54=='p') ) {
                switch ( input.LA(4) ) {
                case 'l':
                    {
                    int LA12_142 = input.LA(5);

                    if ( (LA12_142=='e') ) {
                        int LA12_175 = input.LA(6);

                        if ( (LA12_175=='m') ) {
                            int LA12_205 = input.LA(7);

                            if ( (LA12_205=='e') ) {
                                int LA12_226 = input.LA(8);

                                if ( (LA12_226=='n') ) {
                                    int LA12_243 = input.LA(9);

                                    if ( (LA12_243=='t') ) {
                                        int LA12_257 = input.LA(10);

                                        if ( (LA12_257=='s') ) {
                                            int LA12_264 = input.LA(11);

                                            if ( ((LA12_264>='0' && LA12_264<='9')||(LA12_264>='A' && LA12_264<='Z')||LA12_264=='_'||(LA12_264>='a' && LA12_264<='z')) ) {
                                                return 69;
                                            }
                                            else {
                                                return 12;}
                                        }
                                        else {
                                            return 69;}
                                    }
                                    else {
                                        return 69;}
                                }
                                else {
                                    return 69;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                    }
                case 'o':
                    {
                    int LA12_143 = input.LA(5);

                    if ( (LA12_143=='r') ) {
                        int LA12_176 = input.LA(6);

                        if ( (LA12_176=='t') ) {
                            int LA12_206 = input.LA(7);

                            if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                return 69;
                            }
                            else {
                                return 6;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                    }
                default:
                    return 69;}

            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper007() throws RecognitionException {
        return 7;
    }

    private int mTokensHelper008() throws RecognitionException {
        return 8;
    }

    private int mTokensHelper009() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA12_58 = input.LA(3);

            if ( (LA12_58=='s') ) {
                int LA12_110 = input.LA(4);

                if ( (LA12_110=='e') ) {
                    int LA12_144 = input.LA(5);

                    if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
                        return 69;
                    }
                    else {
                        return 28;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        case 'x':
            {
            switch ( input.LA(3) ) {
            case 'c':
                {
                int LA12_111 = input.LA(4);

                if ( (LA12_111=='l') ) {
                    int LA12_145 = input.LA(5);

                    if ( (LA12_145=='u') ) {
                        int LA12_178 = input.LA(6);

                        if ( (LA12_178=='d') ) {
                            int LA12_207 = input.LA(7);

                            if ( (LA12_207=='e') ) {
                                int LA12_228 = input.LA(8);

                                if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 19;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            case 't':
                {
                int LA12_112 = input.LA(4);

                if ( (LA12_112=='e') ) {
                    int LA12_146 = input.LA(5);

                    if ( (LA12_146=='n') ) {
                        int LA12_179 = input.LA(6);

                        if ( (LA12_179=='d') ) {
                            int LA12_208 = input.LA(7);

                            if ( (LA12_208=='s') ) {
                                int LA12_229 = input.LA(8);

                                if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 9;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            default:
                return 69;}

            }
        default:
            return 69;}

    }

    private int mTokensHelper010() throws RecognitionException {
        return 10;
    }

    private int mTokensHelper011() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'y':
            {
            switch ( input.LA(3) ) {
            case 't':
                {
                int LA12_113 = input.LA(4);

                if ( (LA12_113=='e') ) {
                    int LA12_147 = input.LA(5);

                    if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                        return 69;
                    }
                    else {
                        return 41;}
                }
                else {
                    return 69;}
                }
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                return 69;
                }
            default:
                return 13;}

            }
        case 'o':
            {
            int LA12_62 = input.LA(3);

            if ( (LA12_62=='o') ) {
                int LA12_115 = input.LA(4);

                if ( (LA12_115=='l') ) {
                    int LA12_148 = input.LA(5);

                    if ( (LA12_148=='e') ) {
                        int LA12_181 = input.LA(6);

                        if ( (LA12_181=='a') ) {
                            int LA12_209 = input.LA(7);

                            if ( (LA12_209=='n') ) {
                                int LA12_230 = input.LA(8);

                                if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 43;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_63 = input.LA(3);

            if ( (LA12_63=='g') ) {
                int LA12_116 = input.LA(4);

                if ( (LA12_116=='s') ) {
                    int LA12_149 = input.LA(5);

                    if ( ((LA12_149>='0' && LA12_149<='9')||(LA12_149>='A' && LA12_149<='Z')||LA12_149=='_'||(LA12_149>='a' && LA12_149<='z')) ) {
                        return 69;
                    }
                    else {
                        return 64;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        case 'n':
            {
            int LA12_64 = input.LA(3);

            if ( (LA12_64=='d') ) {
                int LA12_117 = input.LA(4);

                if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                    return 69;
                }
                else {
                    return 14;}
            }
            else {
                return 69;}
            }
        case 'l':
            {
            int LA12_65 = input.LA(3);

            if ( (LA12_65=='i') ) {
                int LA12_118 = input.LA(4);

                if ( (LA12_118=='a') ) {
                    int LA12_151 = input.LA(5);

                    if ( (LA12_151=='s') ) {
                        int LA12_183 = input.LA(6);

                        if ( (LA12_183=='A') ) {
                            int LA12_210 = input.LA(7);

                            if ( (LA12_210=='s') ) {
                                int LA12_231 = input.LA(8);

                                if ( ((LA12_231>='0' && LA12_231<='9')||(LA12_231>='A' && LA12_231<='Z')||LA12_231=='_'||(LA12_231>='a' && LA12_231<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 22;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper013() throws RecognitionException {
        return 15;
    }

    private int mTokensHelper014() throws RecognitionException {
        return 16;
    }

    private int mTokensHelper015() throws RecognitionException {
        return 17;
    }

    private int mTokensHelper016() throws RecognitionException {
        return 18;
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='e') ) {
            switch ( input.LA(3) ) {
            case 'c':
                {
                int LA12_119 = input.LA(4);

                if ( (LA12_119=='o') ) {
                    int LA12_152 = input.LA(5);

                    if ( (LA12_152=='r') ) {
                        int LA12_184 = input.LA(6);

                        if ( (LA12_184=='d') ) {
                            int LA12_211 = input.LA(7);

                            if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                return 69;
                            }
                            else {
                                return 34;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            case 'n':
                {
                int LA12_120 = input.LA(4);

                if ( (LA12_120=='a') ) {
                    int LA12_153 = input.LA(5);

                    if ( (LA12_153=='m') ) {
                        int LA12_185 = input.LA(6);

                        if ( (LA12_185=='e') ) {
                            switch ( input.LA(7) ) {
                            case 'F':
                                {
                                switch ( input.LA(8) ) {
                                case 'i':
                                    {
                                    int LA12_248 = input.LA(9);

                                    if ( (LA12_248=='e') ) {
                                        int LA12_258 = input.LA(10);

                                        if ( (LA12_258=='l') ) {
                                            int LA12_265 = input.LA(11);

                                            if ( (LA12_265=='d') ) {
                                                int LA12_269 = input.LA(12);

                                                if ( (LA12_269=='T') ) {
                                                    int LA12_271 = input.LA(13);

                                                    if ( (LA12_271=='o') ) {
                                                        int LA12_273 = input.LA(14);

                                                        if ( ((LA12_273>='0' && LA12_273<='9')||(LA12_273>='A' && LA12_273<='Z')||LA12_273=='_'||(LA12_273>='a' && LA12_273<='z')) ) {
                                                            return 69;
                                                        }
                                                        else {
                                                            return 24;}
                                                    }
                                                    else {
                                                        return 69;}
                                                }
                                                else {
                                                    return 69;}
                                            }
                                            else {
                                                return 69;}
                                        }
                                        else {
                                            return 69;}
                                    }
                                    else {
                                        return 69;}
                                    }
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    return 69;
                                    }
                                default:
                                    return 21;}

                                }
                            case 'T':
                                {
                                int LA12_234 = input.LA(8);

                                if ( (LA12_234=='o') ) {
                                    int LA12_250 = input.LA(9);

                                    if ( ((LA12_250>='0' && LA12_250<='9')||(LA12_250>='A' && LA12_250<='Z')||LA12_250=='_'||(LA12_250>='a' && LA12_250<='z')) ) {
                                        return 69;
                                    }
                                    else {
                                        return 20;}
                                }
                                else {
                                    return 69;}
                                }
                            case 'M':
                                {
                                int LA12_235 = input.LA(8);

                                if ( ((LA12_235>='0' && LA12_235<='9')||(LA12_235>='A' && LA12_235<='Z')||LA12_235=='_'||(LA12_235>='a' && LA12_235<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 23;}
                                }
                            default:
                                return 69;}

                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            case 't':
                {
                int LA12_121 = input.LA(4);

                if ( (LA12_121=='u') ) {
                    int LA12_154 = input.LA(5);

                    if ( (LA12_154=='r') ) {
                        int LA12_186 = input.LA(6);

                        if ( (LA12_186=='n') ) {
                            int LA12_213 = input.LA(7);

                            if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                return 69;
                            }
                            else {
                                return 26;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            default:
                return 69;}

        }
        else {
            return 69;}
    }

    private int mTokensHelper018() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( (LA12_19=='h') ) {
            int LA12_72 = input.LA(3);

            if ( (LA12_72=='i') ) {
                int LA12_122 = input.LA(4);

                if ( (LA12_122=='l') ) {
                    int LA12_155 = input.LA(5);

                    if ( (LA12_155=='e') ) {
                        int LA12_187 = input.LA(6);

                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                            return 69;
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
        }
        else {
            return 69;}
    }

    private int mTokensHelper020() throws RecognitionException {
        int LA12_20 = input.LA(2);

        if ( (LA12_20=='=') ) {
            return 58;
        }
        else {
            return 30;}
    }

    private int mTokensHelper021() throws RecognitionException {
        return 31;
    }

    private int mTokensHelper022() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_76 = input.LA(3);

            if ( (LA12_76=='w') ) {
                int LA12_123 = input.LA(4);

                if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                    return 69;
                }
                else {
                    return 32;}
            }
            else {
                return 69;}
            }
        case 'u':
            {
            int LA12_77 = input.LA(3);

            if ( (LA12_77=='l') ) {
                int LA12_124 = input.LA(4);

                if ( (LA12_124=='l') ) {
                    int LA12_157 = input.LA(5);

                    if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                        return 69;
                    }
                    else {
                        return 62;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper023() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            switch ( input.LA(3) ) {
            case 'a':
                {
                switch ( input.LA(4) ) {
                case 'i':
                    {
                    int LA12_158 = input.LA(5);

                    if ( (LA12_158=='t') ) {
                        int LA12_189 = input.LA(6);

                        if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                            return 69;
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 69;}
                    }
                case 'n':
                    {
                    int LA12_159 = input.LA(5);

                    if ( (LA12_159=='s') ) {
                        int LA12_190 = input.LA(6);

                        if ( (LA12_190=='i') ) {
                            int LA12_216 = input.LA(7);

                            if ( (LA12_216=='e') ) {
                                int LA12_237 = input.LA(8);

                                if ( (LA12_237=='n') ) {
                                    int LA12_252 = input.LA(9);

                                    if ( (LA12_252=='t') ) {
                                        int LA12_260 = input.LA(10);

                                        if ( ((LA12_260>='0' && LA12_260<='9')||(LA12_260>='A' && LA12_260<='Z')||LA12_260=='_'||(LA12_260>='a' && LA12_260<='z')) ) {
                                            return 69;
                                        }
                                        else {
                                            return 38;}
                                    }
                                    else {
                                        return 69;}
                                }
                                else {
                                    return 69;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                    }
                default:
                    return 69;}

                }
            case 'u':
                {
                int LA12_126 = input.LA(4);

                if ( (LA12_126=='e') ) {
                    int LA12_160 = input.LA(5);

                    if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                        return 69;
                    }
                    else {
                        return 66;}
                }
                else {
                    return 69;}
                }
            default:
                return 69;}

            }
        case 'h':
            {
            int LA12_79 = input.LA(3);

            if ( (LA12_79=='i') ) {
                int LA12_127 = input.LA(4);

                if ( (LA12_127=='s') ) {
                    int LA12_161 = input.LA(5);

                    if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                        return 69;
                    }
                    else {
                        return 68;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper024() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA12_80 = input.LA(3);

            if ( (LA12_80=='a') ) {
                int LA12_128 = input.LA(4);

                if ( (LA12_128=='s') ) {
                    int LA12_162 = input.LA(5);

                    if ( (LA12_162=='s') ) {
                        int LA12_193 = input.LA(6);

                        if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                            return 69;
                        }
                        else {
                            return 36;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        case 'h':
            {
            int LA12_81 = input.LA(3);

            if ( (LA12_81=='a') ) {
                int LA12_129 = input.LA(4);

                if ( (LA12_129=='r') ) {
                    int LA12_163 = input.LA(5);

                    if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                        return 69;
                    }
                    else {
                        return 42;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper025() throws RecognitionException {
        int LA12_25 = input.LA(2);

        if ( (LA12_25=='r') ) {
            int LA12_82 = input.LA(3);

            if ( (LA12_82=='o') ) {
                int LA12_130 = input.LA(4);

                if ( (LA12_130=='g') ) {
                    int LA12_164 = input.LA(5);

                    if ( (LA12_164=='r') ) {
                        int LA12_195 = input.LA(6);

                        if ( (LA12_195=='a') ) {
                            int LA12_218 = input.LA(7);

                            if ( (LA12_218=='m') ) {
                                int LA12_238 = input.LA(8);

                                if ( ((LA12_238>='0' && LA12_238<='9')||(LA12_238>='A' && LA12_238<='Z')||LA12_238=='_'||(LA12_238>='a' && LA12_238<='z')) ) {
                                    return 69;
                                }
                                else {
                                    return 37;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
        }
        else {
            return 69;}
    }

    private int mTokensHelper026() throws RecognitionException {
        int LA12_26 = input.LA(2);

        if ( (LA12_26=='o') ) {
            switch ( input.LA(3) ) {
            case 'l':
                {
                int LA12_131 = input.LA(4);

                if ( (LA12_131=='a') ) {
                    int LA12_165 = input.LA(5);

                    if ( (LA12_165=='t') ) {
                        int LA12_196 = input.LA(6);

                        if ( (LA12_196=='i') ) {
                            int LA12_219 = input.LA(7);

                            if ( (LA12_219=='l') ) {
                                int LA12_239 = input.LA(8);

                                if ( (LA12_239=='e') ) {
                                    int LA12_254 = input.LA(9);

                                    if ( ((LA12_254>='0' && LA12_254<='9')||(LA12_254>='A' && LA12_254<='Z')||LA12_254=='_'||(LA12_254>='a' && LA12_254<='z')) ) {
                                        return 69;
                                    }
                                    else {
                                        return 39;}
                                }
                                else {
                                    return 69;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
                }
            case 'i':
                {
                int LA12_132 = input.LA(4);

                if ( (LA12_132=='d') ) {
                    int LA12_166 = input.LA(5);

                    if ( ((LA12_166>='0' && LA12_166<='9')||(LA12_166>='A' && LA12_166<='Z')||LA12_166=='_'||(LA12_166>='a' && LA12_166<='z')) ) {
                        return 69;
                    }
                    else {
                        return 49;}
                }
                else {
                    return 69;}
                }
            default:
                return 69;}

        }
        else {
            return 69;}
    }

    private int mTokensHelper027() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'h':
            {
            int LA12_84 = input.LA(3);

            if ( (LA12_84=='o') ) {
                int LA12_133 = input.LA(4);

                if ( (LA12_133=='r') ) {
                    int LA12_167 = input.LA(5);

                    if ( (LA12_167=='t') ) {
                        int LA12_198 = input.LA(6);

                        if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                            return 69;
                        }
                        else {
                            return 44;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        case 'y':
            {
            int LA12_85 = input.LA(3);

            if ( (LA12_85=='n') ) {
                int LA12_134 = input.LA(4);

                if ( (LA12_134=='c') ) {
                    int LA12_168 = input.LA(5);

                    if ( (LA12_168=='h') ) {
                        int LA12_199 = input.LA(6);

                        if ( (LA12_199=='r') ) {
                            int LA12_221 = input.LA(7);

                            if ( (LA12_221=='o') ) {
                                int LA12_240 = input.LA(8);

                                if ( (LA12_240=='n') ) {
                                    int LA12_255 = input.LA(9);

                                    if ( (LA12_255=='i') ) {
                                        int LA12_262 = input.LA(10);

                                        if ( (LA12_262=='z') ) {
                                            int LA12_267 = input.LA(11);

                                            if ( (LA12_267=='e') ) {
                                                int LA12_270 = input.LA(12);

                                                if ( (LA12_270=='d') ) {
                                                    int LA12_272 = input.LA(13);

                                                    if ( ((LA12_272>='0' && LA12_272<='9')||(LA12_272>='A' && LA12_272<='Z')||LA12_272=='_'||(LA12_272>='a' && LA12_272<='z')) ) {
                                                        return 69;
                                                    }
                                                    else {
                                                        return 40;}
                                                }
                                                else {
                                                    return 69;}
                                            }
                                            else {
                                                return 69;}
                                        }
                                        else {
                                            return 69;}
                                    }
                                    else {
                                        return 69;}
                                }
                                else {
                                    return 69;}
                            }
                            else {
                                return 69;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper028() throws RecognitionException {
        int LA12_28 = input.LA(2);

        if ( (LA12_28=='o') ) {
            int LA12_86 = input.LA(3);

            if ( (LA12_86=='n') ) {
                int LA12_135 = input.LA(4);

                if ( (LA12_135=='g') ) {
                    int LA12_169 = input.LA(5);

                    if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                        return 69;
                    }
                    else {
                        return 46;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
        }
        else {
            return 69;}
    }

    private int mTokensHelper029() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA12_87 = input.LA(3);

            if ( (LA12_87=='o') ) {
                int LA12_136 = input.LA(4);

                if ( (LA12_136=='a') ) {
                    int LA12_170 = input.LA(5);

                    if ( (LA12_170=='t') ) {
                        int LA12_201 = input.LA(6);

                        if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                            return 69;
                        }
                        else {
                            return 47;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        case 'a':
            {
            int LA12_88 = input.LA(3);

            if ( (LA12_88=='l') ) {
                int LA12_137 = input.LA(4);

                if ( (LA12_137=='s') ) {
                    int LA12_171 = input.LA(5);

                    if ( (LA12_171=='e') ) {
                        int LA12_202 = input.LA(6);

                        if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                            return 69;
                        }
                        else {
                            return 67;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
            }
        default:
            return 69;}

    }

    private int mTokensHelper030() throws RecognitionException {
        int LA12_30 = input.LA(2);

        if ( (LA12_30=='o') ) {
            int LA12_89 = input.LA(3);

            if ( (LA12_89=='u') ) {
                int LA12_138 = input.LA(4);

                if ( (LA12_138=='b') ) {
                    int LA12_172 = input.LA(5);

                    if ( (LA12_172=='l') ) {
                        int LA12_203 = input.LA(6);

                        if ( (LA12_203=='e') ) {
                            int LA12_224 = input.LA(7);

                            if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                return 69;
                            }
                            else {
                                return 48;}
                        }
                        else {
                            return 69;}
                    }
                    else {
                        return 69;}
                }
                else {
                    return 69;}
            }
            else {
                return 69;}
        }
        else {
            return 69;}
    }

    private int mTokensHelper031() throws RecognitionException {
        int LA12_31 = input.LA(2);

        if ( (LA12_31=='&') ) {
            return 51;
        }
        else {
            return 50;}
    }

    private int mTokensHelper032() throws RecognitionException {
        int LA12_32 = input.LA(2);

        if ( (LA12_32=='|') ) {
            return 53;
        }
        else {
            return 52;}
    }

    private int mTokensHelper033() throws RecognitionException {
        int LA12_33 = input.LA(2);

        if ( ((LA12_33>='A' && LA12_33<='Z')||LA12_33=='_'||(LA12_33>='a' && LA12_33<='z')) ) {
            return 69;
        }
        else {
            return 54;}
    }

    private int mTokensHelper034() throws RecognitionException {
        int LA12_34 = input.LA(2);

        if ( (LA12_34=='=') ) {
            return 59;
        }
        else {
            return 55;}
    }

    private int mTokensHelper035() throws RecognitionException {
        int LA12_35 = input.LA(2);

        if ( (LA12_35=='=') ) {
            return 57;
        }
        else {
            return 56;}
    }

    private int mTokensHelper036() throws RecognitionException {
        int LA12_36 = input.LA(2);

        if ( (LA12_36=='=') ) {
            return 61;
        }
        else {
            return 60;}
    }

    private int mTokensHelper037() throws RecognitionException {
        int LA12_37 = input.LA(2);

        if ( (LA12_37=='u') ) {
            int LA12_101 = input.LA(3);

            if ( (LA12_101=='t') ) {
                int LA12_139 = input.LA(4);

                if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                    return 69;
                }
                else {
                    return 65;}
            }
            else {
                return 69;}
        }
        else {
            return 69;}
    }

    private int mTokensHelper038() throws RecognitionException {
        return 69;
    }

    private int mTokensHelper039() throws RecognitionException {
        return 70;
    }

    private int mTokensHelper040() throws RecognitionException {
        int LA12_40 = input.LA(2);

        if ( ((LA12_40>='\u0000' && LA12_40<='\uFFFE')) ) {
            return 71;
        }
        else {
            return 75;}
    }

    private int mTokensHelper041() throws RecognitionException {
        int LA12_41 = input.LA(2);

        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFE')) ) {
            return 71;
        }
        else {
            return 75;}
    }

    private int mTokensHelper042() throws RecognitionException {
        return 74;
    }

    private int mTokensHelper043() throws RecognitionException {
        return 75;
    }

    private int mTokensHelper044() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}