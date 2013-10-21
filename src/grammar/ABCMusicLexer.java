// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABS_CRETURNS=1, LOWERCASE_B=2, LOWERCASE_M=3, LOWERCASE_Z=4, CAPITAL_C=5, 
		A_THROUGH_G=6, OTHER_LETTER=7, TILDE=8, COMMENT_BEGIN=9, FIELD_X=10, FIELD_T=11, 
		FIELD_C=12, FIELD_Q=13, FIELD_K=14, FIELD_L=15, FIELD_M=16, FIELD_V=17, 
		FIELD_W=18, NUMBER=19, NEWLINE=20, SPACE=21, SLASH=22, EQUALS=23, NTH_REPEAT=24, 
		BARLINE=25, STAR=26, HYPHEN=27, HASHTAG=28, UNDERSCORE=29, COMMA=30, CARET=31, 
		APOSTROPHE=32, TUPLET_BEGIN_2=33, TUPLET_BEGIN_3=34, TUPLET_BEGIN_4=35, 
		PARENTHESIS_OPEN=36, PARENTHESIS_CLOSE=37, SQ_BRACKET_OPEN=38, SQ_BRACKET_CLOSE=39, 
		SLASH_HYPHEN=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TABS_CRETURNS", "'b'", "'m'", "'z'", "'C'", "A_THROUGH_G", "OTHER_LETTER", 
		"'~'", "'%'", "'X:'", "'T:'", "'C:'", "'Q:'", "'K:'", "'L:'", "'M:'", 
		"'V:'", "'w:'", "NUMBER", "'\n'", "' '", "'/'", "'='", "NTH_REPEAT", "BARLINE", 
		"'*'", "'-'", "'#'", "'_'", "','", "'^'", "'''", "'(2'", "'(3'", "'(4'", 
		"'('", "')'", "'['", "']'", "'-'"
	};
	public static final String[] ruleNames = {
		"TABS_CRETURNS", "LOWERCASE_B", "LOWERCASE_M", "LOWERCASE_Z", "CAPITAL_C", 
		"A_THROUGH_G", "OTHER_LETTER", "TILDE", "COMMENT_BEGIN", "FIELD_X", "FIELD_T", 
		"FIELD_C", "FIELD_Q", "FIELD_K", "FIELD_L", "FIELD_M", "FIELD_V", "FIELD_W", 
		"NUMBER", "NEWLINE", "SPACE", "SLASH", "EQUALS", "NTH_REPEAT", "BARLINE", 
		"STAR", "HYPHEN", "HASHTAG", "UNDERSCORE", "COMMA", "CARET", "APOSTROPHE", 
		"TUPLET_BEGIN_2", "TUPLET_BEGIN_3", "TUPLET_BEGIN_4", "PARENTHESIS_OPEN", 
		"PARENTHESIS_CLOSE", "SQ_BRACKET_OPEN", "SQ_BRACKET_CLOSE", "SLASH_HYPHEN"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: TABS_CRETURNS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void TABS_CRETURNS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4*\u00c7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\3\2\6\2U\n\2\r\2\16\2V\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\6\24\u0087\n\24\r\24\16\24\u0088\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0097\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00a4\n\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\2*\3\3\2\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1\3\2\6\4\13\13\17\17\4CIci\6##\60\60J\\j{\3"+
		"\62;\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3T"+
		"\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3\2\2\2\17d"+
		"\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27m\3\2\2\2\31p\3\2\2\2\33"+
		"s\3\2\2\2\35v\3\2\2\2\37y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2"+
		"\2\'\u0086\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0096\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5\3\2\2\2\67\u00a7\3"+
		"\2\2\29\u00a9\3\2\2\2;\u00ab\3\2\2\2=\u00ad\3\2\2\2?\u00af\3\2\2\2A\u00b1"+
		"\3\2\2\2C\u00b3\3\2\2\2E\u00b6\3\2\2\2G\u00b9\3\2\2\2I\u00bc\3\2\2\2K"+
		"\u00be\3\2\2\2M\u00c0\3\2\2\2O\u00c2\3\2\2\2Q\u00c4\3\2\2\2SU\t\2\2\2"+
		"TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\2\2\2Y\4\3\2\2"+
		"\2Z[\7d\2\2[\6\3\2\2\2\\]\7o\2\2]\b\3\2\2\2^_\7|\2\2_\n\3\2\2\2`a\7E\2"+
		"\2a\f\3\2\2\2bc\t\3\2\2c\16\3\2\2\2de\t\4\2\2e\20\3\2\2\2fg\7\u0080\2"+
		"\2g\22\3\2\2\2hi\7\'\2\2i\24\3\2\2\2jk\7Z\2\2kl\7<\2\2l\26\3\2\2\2mn\7"+
		"V\2\2no\7<\2\2o\30\3\2\2\2pq\7E\2\2qr\7<\2\2r\32\3\2\2\2st\7S\2\2tu\7"+
		"<\2\2u\34\3\2\2\2vw\7M\2\2wx\7<\2\2x\36\3\2\2\2yz\7N\2\2z{\7<\2\2{ \3"+
		"\2\2\2|}\7O\2\2}~\7<\2\2~\"\3\2\2\2\177\u0080\7X\2\2\u0080\u0081\7<\2"+
		"\2\u0081$\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7<\2\2\u0084&\3\2\2\2"+
		"\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089(\3\2\2\2\u008a\u008b\7\f\2\2\u008b"+
		"*\3\2\2\2\u008c\u008d\7\"\2\2\u008d,\3\2\2\2\u008e\u008f\7\61\2\2\u008f"+
		".\3\2\2\2\u0090\u0091\7?\2\2\u0091\60\3\2\2\2\u0092\u0093\7]\2\2\u0093"+
		"\u0097\7\63\2\2\u0094\u0095\7]\2\2\u0095\u0097\7\64\2\2\u0096\u0092\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0097\62\3\2\2\2\u0098\u00a4\7~\2\2\u0099\u009a"+
		"\7~\2\2\u009a\u00a4\7~\2\2\u009b\u009c\7]\2\2\u009c\u00a4\7~\2\2\u009d"+
		"\u009e\7~\2\2\u009e\u00a4\7_\2\2\u009f\u00a0\7<\2\2\u00a0\u00a4\7~\2\2"+
		"\u00a1\u00a2\7~\2\2\u00a2\u00a4\7<\2\2\u00a3\u0098\3\2\2\2\u00a3\u0099"+
		"\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\66\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a88\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa:\3\2\2\2\u00ab\u00ac"+
		"\7a\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7.\2\2\u00ae>\3\2\2\2\u00af\u00b0\7"+
		"`\2\2\u00b0@\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2B\3\2\2\2\u00b3\u00b4\7*"+
		"\2\2\u00b4\u00b5\7\64\2\2\u00b5D\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b8"+
		"\7\65\2\2\u00b8F\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb\7\66\2\2\u00bb"+
		"H\3\2\2\2\u00bc\u00bd\7*\2\2\u00bdJ\3\2\2\2\u00be\u00bf\7+\2\2\u00bfL"+
		"\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1N\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3P\3"+
		"\2\2\2\u00c4\u00c5\7^\2\2\u00c5\u00c6\7/\2\2\u00c6R\3\2\2\2\7\2V\u0088"+
		"\u0096\u00a3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}