// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "TABS_CRETURNS", "'b'", "'m'", "'z'", "'C'", "A_THROUGH_G", 
		"OTHER_LETTER", "'~'", "'%'", "'X:'", "'T:'", "'C:'", "'Q:'", "'K:'", 
		"'L:'", "'M:'", "'V:'", "'w:'", "NUMBER", "'\n'", "' '", "'/'", "'='", 
		"NTH_REPEAT", "BARLINE", "'*'", "'-'", "'#'", "'_'", "','", "'^'", "'''", 
		"'(2'", "'(3'", "'(4'", "'('", "')'", "'['", "']'", "'-'"
	};
	public static final int
		RULE_line = 0, RULE_abc_tune = 1, RULE_abc_header = 2, RULE_field_number = 3, 
		RULE_field_title = 4, RULE_other_fields = 5, RULE_field_composer = 6, 
		RULE_field_default_length = 7, RULE_field_meter = 8, RULE_field_tempo = 9, 
		RULE_field_voice = 10, RULE_field_key = 11, RULE_key = 12, RULE_keynote = 13, 
		RULE_key_accidental = 14, RULE_mode_minor = 15, RULE_meter = 16, RULE_tempo = 17, 
		RULE_abc_music = 18, RULE_abc_line = 19, RULE_element = 20, RULE_note_element = 21, 
		RULE_note = 22, RULE_note_or_rest = 23, RULE_pitch = 24, RULE_octave = 25, 
		RULE_note_length = 26, RULE_note_length_strict = 27, RULE_basenote = 28, 
		RULE_rest = 29, RULE_tuplet_element = 30, RULE_multi_note = 31, RULE_mid_tune_field = 32, 
		RULE_comment = 33, RULE_end_of_line = 34, RULE_lyric = 35, RULE_lyrical_element = 36, 
		RULE_lyric_text = 37, RULE_valid_text_with_number = 38, RULE_valid_letter = 39, 
		RULE_valid_note = 40, RULE_accidental = 41;
	public static final String[] ruleNames = {
		"line", "abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "key", "keynote", "key_accidental", "mode_minor", 
		"meter", "tempo", "abc_music", "abc_line", "element", "note_element", 
		"note", "note_or_rest", "pitch", "octave", "note_length", "note_length_strict", 
		"basenote", "rest", "tuplet_element", "multi_note", "mid_tune_field", 
		"comment", "end_of_line", "lyric", "lyrical_element", "lyric_text", "valid_text_with_number", 
		"valid_letter", "valid_note", "accidental"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public Abc_tuneContext abc_tune() {
			return getRuleContext(Abc_tuneContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); abc_tune();
			setState(85); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); abc_header();
			setState(88); abc_music();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); field_number();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_BEGIN) {
				{
				{
				setState(91); comment();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); field_title();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT_BEGIN) | (1L << FIELD_C) | (1L << FIELD_Q) | (1L << FIELD_L) | (1L << FIELD_M) | (1L << FIELD_V))) != 0)) {
				{
				{
				setState(98); other_fields();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_numberContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_X() { return getToken(ABCMusicParser.FIELD_X, 0); }
		public TerminalNode NUMBER() { return getToken(ABCMusicParser.NUMBER, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(FIELD_X);
			setState(107); match(NUMBER);
			setState(108); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_titleContext extends ParserRuleContext {
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_T() { return getToken(ABCMusicParser.FIELD_T, 0); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(FIELD_T);
			setState(111); valid_text_with_number();
			setState(112); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_other_fields);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case FIELD_C:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); field_composer();
				}
				break;
			case FIELD_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); field_default_length();
				}
				break;
			case FIELD_M:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); field_meter();
				}
				break;
			case FIELD_Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); field_tempo();
				}
				break;
			case FIELD_V:
				enterOuterAlt(_localctx, 5);
				{
				setState(118); field_voice();
				}
				break;
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(119); comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_composerContext extends ParserRuleContext {
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_C() { return getToken(ABCMusicParser.FIELD_C, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(FIELD_C);
			setState(123); valid_text_with_number();
			setState(124); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_default_lengthContext extends ParserRuleContext {
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public TerminalNode FIELD_L() { return getToken(ABCMusicParser.FIELD_L, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(FIELD_L);
			setState(127); note_length_strict();
			setState(128); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_meterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_M() { return getToken(ABCMusicParser.FIELD_M, 0); }
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(FIELD_M);
			setState(131); meter();
			setState(132); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_tempoContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public TerminalNode FIELD_Q() { return getToken(ABCMusicParser.FIELD_Q, 0); }
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(FIELD_Q);
			setState(135); tempo();
			setState(136); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_voiceContext extends ParserRuleContext {
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public TerminalNode FIELD_V() { return getToken(ABCMusicParser.FIELD_V, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(FIELD_V);
			setState(139); valid_text_with_number();
			setState(140); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode FIELD_K() { return getToken(ABCMusicParser.FIELD_K, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(FIELD_K);
			setState(143); key();
			setState(144); end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public Mode_minorContext mode_minor() {
			return getRuleContext(Mode_minorContext.class,0);
		}
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); keynote();
			setState(148);
			_la = _input.LA(1);
			if (_la==LOWERCASE_M) {
				{
				setState(147); mode_minor();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeynoteContext extends ParserRuleContext {
		public Key_accidentalContext key_accidental() {
			return getRuleContext(Key_accidentalContext.class,0);
		}
		public TerminalNode A_THROUGH_G() { return getToken(ABCMusicParser.A_THROUGH_G, 0); }
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(A_THROUGH_G);
			setState(152);
			_la = _input.LA(1);
			if (_la==LOWERCASE_B || _la==HASHTAG) {
				{
				setState(151); key_accidental();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_accidentalContext extends ParserRuleContext {
		public TerminalNode HASHTAG() { return getToken(ABCMusicParser.HASHTAG, 0); }
		public TerminalNode LOWERCASE_B() { return getToken(ABCMusicParser.LOWERCASE_B, 0); }
		public Key_accidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey_accidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey_accidental(this);
		}
	}

	public final Key_accidentalContext key_accidental() throws RecognitionException {
		Key_accidentalContext _localctx = new Key_accidentalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_key_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==LOWERCASE_B || _la==HASHTAG) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mode_minorContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_M() { return getToken(ABCMusicParser.LOWERCASE_M, 0); }
		public Mode_minorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_minor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMode_minor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMode_minor(this);
		}
	}

	public final Mode_minorContext mode_minor() throws RecognitionException {
		Mode_minorContext _localctx = new Mode_minorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mode_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(LOWERCASE_M);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public TerminalNode CAPITAL_C() { return getToken(ABCMusicParser.CAPITAL_C, 0); }
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_meter);
		int _la;
		try {
			setState(163);
			switch (_input.LA(1)) {
			case CAPITAL_C:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(158); match(CAPITAL_C);
				setState(160);
				_la = _input.LA(1);
				if (_la==BARLINE) {
					{
					setState(159); match(BARLINE);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); note_length_strict();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ABCMusicParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(ABCMusicParser.NUMBER, 0); }
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); note_length_strict();
			setState(166); match(EQUALS);
			setState(167); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169); abc_line();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << COMMENT_BEGIN) | (1L << FIELD_V) | (1L << SPACE) | (1L << EQUALS) | (1L << NTH_REPEAT) | (1L << BARLINE) | (1L << UNDERSCORE) | (1L << CARET) | (1L << TUPLET_BEGIN_2) | (1L << TUPLET_BEGIN_3) | (1L << TUPLET_BEGIN_4) | (1L << SQ_BRACKET_OPEN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_abc_line);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case LOWERCASE_B:
			case LOWERCASE_Z:
			case CAPITAL_C:
			case A_THROUGH_G:
			case SPACE:
			case EQUALS:
			case NTH_REPEAT:
			case BARLINE:
			case UNDERSCORE:
			case CARET:
			case TUPLET_BEGIN_2:
			case TUPLET_BEGIN_3:
			case TUPLET_BEGIN_4:
			case SQ_BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174); element();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << SPACE) | (1L << EQUALS) | (1L << NTH_REPEAT) | (1L << BARLINE) | (1L << UNDERSCORE) | (1L << CARET) | (1L << TUPLET_BEGIN_2) | (1L << TUPLET_BEGIN_3) | (1L << TUPLET_BEGIN_4) | (1L << SQ_BRACKET_OPEN))) != 0) );
				setState(179); match(NEWLINE);
				setState(183);
				_la = _input.LA(1);
				if (_la==FIELD_W) {
					{
					setState(180); lyric();
					setState(181); match(NEWLINE);
					}
				}

				}
				break;
			case FIELD_V:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); mid_tune_field();
				}
				break;
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicParser.NTH_REPEAT, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicParser.SPACE, 0); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_element);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case LOWERCASE_B:
			case LOWERCASE_Z:
			case CAPITAL_C:
			case A_THROUGH_G:
			case EQUALS:
			case UNDERSCORE:
			case CARET:
			case SQ_BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); note_element();
				}
				break;
			case TUPLET_BEGIN_2:
			case TUPLET_BEGIN_3:
			case TUPLET_BEGIN_4:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); tuplet_element();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(BARLINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(193); match(SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_elementContext extends ParserRuleContext {
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_note_element);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case LOWERCASE_B:
			case LOWERCASE_Z:
			case CAPITAL_C:
			case A_THROUGH_G:
			case EQUALS:
			case UNDERSCORE:
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(196); note();
				}
				break;
			case SQ_BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); multi_note();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); note_or_rest();
			setState(202);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==SLASH) {
				{
				setState(201); note_length();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_or_restContext extends ParserRuleContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_note_or_rest);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case LOWERCASE_B:
			case CAPITAL_C:
			case A_THROUGH_G:
			case EQUALS:
			case UNDERSCORE:
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); pitch();
				}
				break;
			case LOWERCASE_Z:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); rest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PitchContext extends ParserRuleContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << UNDERSCORE) | (1L << CARET))) != 0)) {
				{
				setState(208); accidental();
				}
			}

			setState(211); basenote();
			setState(213);
			_la = _input.LA(1);
			if (_la==COMMA || _la==APOSTROPHE) {
				{
				setState(212); octave();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OctaveContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(ABCMusicParser.COMMA, i);
		}
		public List<TerminalNode> APOSTROPHE() { return getTokens(ABCMusicParser.APOSTROPHE); }
		public List<TerminalNode> COMMA() { return getTokens(ABCMusicParser.COMMA); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(ABCMusicParser.APOSTROPHE, i);
		}
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOctave(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_octave);
		int _la;
		try {
			setState(225);
			switch (_input.LA(1)) {
			case APOSTROPHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215); match(APOSTROPHE);
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==APOSTROPHE );
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220); match(COMMA);
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_note_length);
		int _la;
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(227); match(NUMBER);
					}
				}

				setState(230); match(SLASH);
				setState(232);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(231); match(NUMBER);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_length_strictContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length_strict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length_strict(this);
		}
	}

	public final Note_length_strictContext note_length_strict() throws RecognitionException {
		Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_note_length_strict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(NUMBER);
			setState(238); match(SLASH);
			setState(239); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasenoteContext extends ParserRuleContext {
		public Valid_noteContext valid_note() {
			return getRuleContext(Valid_noteContext.class,0);
		}
		public BasenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basenote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBasenote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBasenote(this);
		}
	}

	public final BasenoteContext basenote() throws RecognitionException {
		BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_basenote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); valid_note();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_Z() { return getToken(ABCMusicParser.LOWERCASE_Z, 0); }
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(LOWERCASE_Z);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public TerminalNode TUPLET_BEGIN_2() { return getToken(ABCMusicParser.TUPLET_BEGIN_2, 0); }
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public TerminalNode TUPLET_BEGIN_4() { return getToken(ABCMusicParser.TUPLET_BEGIN_4, 0); }
		public TerminalNode TUPLET_BEGIN_3() { return getToken(ABCMusicParser.TUPLET_BEGIN_3, 0); }
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tuplet_element);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case TUPLET_BEGIN_2:
				enterOuterAlt(_localctx, 1);
				{
				setState(245); match(TUPLET_BEGIN_2);
				setState(246); note_element();
				setState(247); note_element();
				}
				break;
			case TUPLET_BEGIN_3:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(TUPLET_BEGIN_3);
				setState(250); note_element();
				setState(251); note_element();
				setState(252); note_element();
				}
				break;
			case TUPLET_BEGIN_4:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); match(TUPLET_BEGIN_4);
				setState(255); note_element();
				setState(256); note_element();
				setState(257); note_element();
				setState(258); note_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_noteContext extends ParserRuleContext {
		public TerminalNode SQ_BRACKET_CLOSE() { return getToken(ABCMusicParser.SQ_BRACKET_CLOSE, 0); }
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode SQ_BRACKET_OPEN() { return getToken(ABCMusicParser.SQ_BRACKET_OPEN, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(SQ_BRACKET_OPEN);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263); note();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << EQUALS) | (1L << UNDERSCORE) | (1L << CARET))) != 0) );
			setState(268); match(SQ_BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); field_voice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public TerminalNode COMMENT_BEGIN() { return getToken(ABCMusicParser.COMMENT_BEGIN, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(COMMENT_BEGIN);
			setState(273); valid_text_with_number();
			setState(274); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_of_lineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public End_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEnd_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEnd_of_line(this);
		}
	}

	public final End_of_lineContext end_of_line() throws RecognitionException {
		End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_end_of_line);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(276); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricContext extends ParserRuleContext {
		public List<Lyrical_elementContext> lyrical_element() {
			return getRuleContexts(Lyrical_elementContext.class);
		}
		public TerminalNode FIELD_W() { return getToken(ABCMusicParser.FIELD_W, 0); }
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(FIELD_W);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_M) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << OTHER_LETTER) | (1L << TILDE) | (1L << NUMBER) | (1L << SPACE) | (1L << BARLINE) | (1L << STAR) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << COMMA) | (1L << SLASH_HYPHEN))) != 0)) {
				{
				{
				setState(281); lyrical_element();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lyrical_elementContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(ABCMusicParser.UNDERSCORE, 0); }
		public TerminalNode STAR() { return getToken(ABCMusicParser.STAR, 0); }
		public TerminalNode SLASH_HYPHEN() { return getToken(ABCMusicParser.SLASH_HYPHEN, 0); }
		public Lyric_textContext lyric_text() {
			return getRuleContext(Lyric_textContext.class,0);
		}
		public TerminalNode HYPHEN() { return getToken(ABCMusicParser.HYPHEN, 0); }
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
		public TerminalNode TILDE() { return getToken(ABCMusicParser.TILDE, 0); }
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lyrical_element);
		try {
			int _alt;
			setState(299);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(287); match(SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(HYPHEN);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); match(UNDERSCORE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(294); match(STAR);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(295); match(TILDE);
				}
				break;
			case SLASH_HYPHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(296); match(SLASH_HYPHEN);
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(297); match(BARLINE);
				}
				break;
			case LOWERCASE_B:
			case LOWERCASE_M:
			case LOWERCASE_Z:
			case CAPITAL_C:
			case A_THROUGH_G:
			case OTHER_LETTER:
			case NUMBER:
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(298); lyric_text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lyric_textContext extends ParserRuleContext {
		public Valid_letterContext valid_letter(int i) {
			return getRuleContext(Valid_letterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ABCMusicParser.COMMA, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ABCMusicParser.COMMA); }
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public List<Valid_letterContext> valid_letter() {
			return getRuleContexts(Valid_letterContext.class);
		}
		public Lyric_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric_text(this);
		}
	}

	public final Lyric_textContext lyric_text() throws RecognitionException {
		Lyric_textContext _localctx = new Lyric_textContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lyric_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(304);
					switch (_input.LA(1)) {
					case LOWERCASE_B:
					case LOWERCASE_M:
					case LOWERCASE_Z:
					case CAPITAL_C:
					case A_THROUGH_G:
					case OTHER_LETTER:
						{
						setState(301); valid_letter();
						}
						break;
					case NUMBER:
						{
						setState(302); match(NUMBER);
						}
						break;
					case COMMA:
						{
						setState(303); match(COMMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(306); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valid_text_with_numberContext extends ParserRuleContext {
		public TerminalNode HYPHEN(int i) {
			return getToken(ABCMusicParser.HYPHEN, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(ABCMusicParser.HYPHEN); }
		public List<TerminalNode> COMMA() { return getTokens(ABCMusicParser.COMMA); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(ABCMusicParser.APOSTROPHE, i);
		}
		public TerminalNode PARENTHESIS_CLOSE(int i) {
			return getToken(ABCMusicParser.PARENTHESIS_CLOSE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public Valid_letterContext valid_letter(int i) {
			return getRuleContext(Valid_letterContext.class,i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(ABCMusicParser.UNDERSCORE); }
		public TerminalNode COMMA(int i) {
			return getToken(ABCMusicParser.COMMA, i);
		}
		public TerminalNode UNDERSCORE(int i) {
			return getToken(ABCMusicParser.UNDERSCORE, i);
		}
		public List<TerminalNode> APOSTROPHE() { return getTokens(ABCMusicParser.APOSTROPHE); }
		public List<TerminalNode> PARENTHESIS_CLOSE() { return getTokens(ABCMusicParser.PARENTHESIS_CLOSE); }
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
		public List<TerminalNode> PARENTHESIS_OPEN() { return getTokens(ABCMusicParser.PARENTHESIS_OPEN); }
		public TerminalNode PARENTHESIS_OPEN(int i) {
			return getToken(ABCMusicParser.PARENTHESIS_OPEN, i);
		}
		public List<Valid_letterContext> valid_letter() {
			return getRuleContexts(Valid_letterContext.class);
		}
		public Valid_text_with_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid_text_with_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterValid_text_with_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitValid_text_with_number(this);
		}
	}

	public final Valid_text_with_numberContext valid_text_with_number() throws RecognitionException {
		Valid_text_with_numberContext _localctx = new Valid_text_with_numberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_valid_text_with_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(317);
				switch (_input.LA(1)) {
				case LOWERCASE_B:
				case LOWERCASE_M:
				case LOWERCASE_Z:
				case CAPITAL_C:
				case A_THROUGH_G:
				case OTHER_LETTER:
					{
					setState(308); valid_letter();
					}
					break;
				case APOSTROPHE:
					{
					setState(309); match(APOSTROPHE);
					}
					break;
				case COMMA:
					{
					setState(310); match(COMMA);
					}
					break;
				case HYPHEN:
					{
					setState(311); match(HYPHEN);
					}
					break;
				case UNDERSCORE:
					{
					setState(312); match(UNDERSCORE);
					}
					break;
				case PARENTHESIS_OPEN:
					{
					setState(313); match(PARENTHESIS_OPEN);
					}
					break;
				case PARENTHESIS_CLOSE:
					{
					setState(314); match(PARENTHESIS_CLOSE);
					}
					break;
				case NUMBER:
					{
					setState(315); match(NUMBER);
					}
					break;
				case SPACE:
					{
					setState(316); match(SPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_M) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << OTHER_LETTER) | (1L << NUMBER) | (1L << SPACE) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << COMMA) | (1L << APOSTROPHE) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valid_letterContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_B() { return getToken(ABCMusicParser.LOWERCASE_B, 0); }
		public TerminalNode CAPITAL_C() { return getToken(ABCMusicParser.CAPITAL_C, 0); }
		public TerminalNode OTHER_LETTER() { return getToken(ABCMusicParser.OTHER_LETTER, 0); }
		public TerminalNode A_THROUGH_G() { return getToken(ABCMusicParser.A_THROUGH_G, 0); }
		public TerminalNode LOWERCASE_Z() { return getToken(ABCMusicParser.LOWERCASE_Z, 0); }
		public TerminalNode LOWERCASE_M() { return getToken(ABCMusicParser.LOWERCASE_M, 0); }
		public Valid_letterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterValid_letter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitValid_letter(this);
		}
	}

	public final Valid_letterContext valid_letter() throws RecognitionException {
		Valid_letterContext _localctx = new Valid_letterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_valid_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_M) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << OTHER_LETTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valid_noteContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_B() { return getToken(ABCMusicParser.LOWERCASE_B, 0); }
		public TerminalNode CAPITAL_C() { return getToken(ABCMusicParser.CAPITAL_C, 0); }
		public TerminalNode A_THROUGH_G() { return getToken(ABCMusicParser.A_THROUGH_G, 0); }
		public Valid_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterValid_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitValid_note(this);
		}
	}

	public final Valid_noteContext valid_note() throws RecognitionException {
		Valid_noteContext _localctx = new Valid_noteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valid_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << CAPITAL_C) | (1L << A_THROUGH_G))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccidentalContext extends ParserRuleContext {
		public List<TerminalNode> UNDERSCORE() { return getTokens(ABCMusicParser.UNDERSCORE); }
		public TerminalNode EQUALS() { return getToken(ABCMusicParser.EQUALS, 0); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(ABCMusicParser.UNDERSCORE, i);
		}
		public TerminalNode CARET(int i) {
			return getToken(ABCMusicParser.CARET, i);
		}
		public List<TerminalNode> CARET() { return getTokens(ABCMusicParser.CARET); }
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_accidental);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); match(CARET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(CARET);
				setState(327); match(CARET);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(UNDERSCORE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); match(UNDERSCORE);
				setState(330); match(UNDERSCORE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); match(EQUALS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3*\u0151\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4_\n\4\f\4\16\4b\13"+
		"\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\5\16\u0097\n\16\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\5\22\u00a3\n\22\3\22\5\22\u00a6\n\22\3\23\3\23\3\23\3\23\3"+
		"\24\6\24\u00ad\n\24\r\24\16\24\u00ae\3\25\6\25\u00b2\n\25\r\25\16\25\u00b3"+
		"\3\25\3\25\3\25\3\25\5\25\u00ba\n\25\3\25\3\25\5\25\u00be\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00c5\n\26\3\27\3\27\5\27\u00c9\n\27\3\30\3\30"+
		"\5\30\u00cd\n\30\3\31\3\31\5\31\u00d1\n\31\3\32\5\32\u00d4\n\32\3\32\3"+
		"\32\5\32\u00d8\n\32\3\33\6\33\u00db\n\33\r\33\16\33\u00dc\3\33\6\33\u00e0"+
		"\n\33\r\33\16\33\u00e1\5\33\u00e4\n\33\3\34\5\34\u00e7\n\34\3\34\3\34"+
		"\5\34\u00eb\n\34\3\34\5\34\u00ee\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0107\n \3!\3"+
		"!\6!\u010b\n!\r!\16!\u010c\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\5$\u0119\n"+
		"$\3%\3%\7%\u011d\n%\f%\16%\u0120\13%\3&\6&\u0123\n&\r&\16&\u0124\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u012e\n&\3\'\3\'\3\'\6\'\u0133\n\'\r\'\16\'\u0134"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u0140\n(\r(\16(\u0141\3)\3)\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u014f\n+\3+\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\5\4\4\4\36\36\3\4\t\4\4\4\7"+
		"\b\u0162\2V\3\2\2\2\4Y\3\2\2\2\6\\\3\2\2\2\bl\3\2\2\2\np\3\2\2\2\fz\3"+
		"\2\2\2\16|\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2"+
		"\26\u008c\3\2\2\2\30\u0090\3\2\2\2\32\u0094\3\2\2\2\34\u0098\3\2\2\2\36"+
		"\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\u00ac\3"+
		"\2\2\2(\u00bd\3\2\2\2*\u00c4\3\2\2\2,\u00c8\3\2\2\2.\u00ca\3\2\2\2\60"+
		"\u00d0\3\2\2\2\62\u00d3\3\2\2\2\64\u00e3\3\2\2\2\66\u00ed\3\2\2\28\u00ef"+
		"\3\2\2\2:\u00f3\3\2\2\2<\u00f5\3\2\2\2>\u0106\3\2\2\2@\u0108\3\2\2\2B"+
		"\u0110\3\2\2\2D\u0112\3\2\2\2F\u0118\3\2\2\2H\u011a\3\2\2\2J\u012d\3\2"+
		"\2\2L\u0132\3\2\2\2N\u013f\3\2\2\2P\u0143\3\2\2\2R\u0145\3\2\2\2T\u014e"+
		"\3\2\2\2VW\5\4\3\2WX\7\1\2\2X\3\3\2\2\2YZ\5\6\4\2Z[\5&\24\2[\5\3\2\2\2"+
		"\\`\5\b\5\2]_\5D#\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cg\5\n\6\2df\5\f\7\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jk\5\30\r\2k\7\3\2\2\2lm\7\f\2\2mn\7\25\2\2no\5F$"+
		"\2o\t\3\2\2\2pq\7\r\2\2qr\5N(\2rs\5F$\2s\13\3\2\2\2t{\5\16\b\2u{\5\20"+
		"\t\2v{\5\22\n\2w{\5\24\13\2x{\5\26\f\2y{\5D#\2zt\3\2\2\2zu\3\2\2\2zv\3"+
		"\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|}\7\16\2\2}~\5N(\2~\177"+
		"\5F$\2\177\17\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082\58\35\2\u0082\u0083"+
		"\5F$\2\u0083\21\3\2\2\2\u0084\u0085\7\22\2\2\u0085\u0086\5\"\22\2\u0086"+
		"\u0087\5F$\2\u0087\23\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u008a\5$\23\2"+
		"\u008a\u008b\5F$\2\u008b\25\3\2\2\2\u008c\u008d\7\23\2\2\u008d\u008e\5"+
		"N(\2\u008e\u008f\5F$\2\u008f\27\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092"+
		"\5\32\16\2\u0092\u0093\5F$\2\u0093\31\3\2\2\2\u0094\u0096\5\34\17\2\u0095"+
		"\u0097\5 \21\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2"+
		"\2\u0098\u009a\7\b\2\2\u0099\u009b\5\36\20\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\t\2\2\2\u009d\37\3\2\2\2\u009e"+
		"\u009f\7\5\2\2\u009f!\3\2\2\2\u00a0\u00a2\7\7\2\2\u00a1\u00a3\7\33\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6"+
		"\58\35\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6#\3\2\2\2\u00a7"+
		"\u00a8\58\35\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\7\25\2\2\u00aa%\3\2\2"+
		"\2\u00ab\u00ad\5(\25\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00b2\5*\26\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\7\26\2\2\u00b6\u00b7\5H%\2\u00b7"+
		"\u00b8\7\26\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00be\5B\"\2\u00bc\u00be\5D#\2\u00bd"+
		"\u00b1\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be)\3\2\2\2"+
		"\u00bf\u00c5\5,\27\2\u00c0\u00c5\5> \2\u00c1\u00c5\7\33\2\2\u00c2\u00c5"+
		"\7\32\2\2\u00c3\u00c5\7\27\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2"+
		"\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5+\3"+
		"\2\2\2\u00c6\u00c9\5.\30\2\u00c7\u00c9\5@!\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9-\3\2\2\2\u00ca\u00cc\5\60\31\2\u00cb\u00cd\5\66\34"+
		"\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd/\3\2\2\2\u00ce\u00d1"+
		"\5\62\32\2\u00cf\u00d1\5<\37\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\61\3\2\2\2\u00d2\u00d4\5T+\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5:\36\2\u00d6\u00d8\5\64\33\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\63\3\2\2\2\u00d9\u00db\7\"\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00e4\3\2\2\2\u00de\u00e0\7 \2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00da\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\65\3\2\2\2\u00e5\u00e7"+
		"\7\25\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00ea\7\30\2\2\u00e9\u00eb\7\25\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\7\25\2\2\u00ed\u00e6\3\2\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\67\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1"+
		"\7\30\2\2\u00f1\u00f2\7\25\2\2\u00f29\3\2\2\2\u00f3\u00f4\5R*\2\u00f4"+
		";\3\2\2\2\u00f5\u00f6\7\6\2\2\u00f6=\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8"+
		"\u00f9\5,\27\2\u00f9\u00fa\5,\27\2\u00fa\u0107\3\2\2\2\u00fb\u00fc\7$"+
		"\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\5,\27\2\u00ff"+
		"\u0107\3\2\2\2\u0100\u0101\7%\2\2\u0101\u0102\5,\27\2\u0102\u0103\5,\27"+
		"\2\u0103\u0104\5,\27\2\u0104\u0105\5,\27\2\u0105\u0107\3\2\2\2\u0106\u00f7"+
		"\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u0100\3\2\2\2\u0107?\3\2\2\2\u0108"+
		"\u010a\7(\2\2\u0109\u010b\5.\30\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7)\2\2\u010fA\3\2\2\2\u0110\u0111\5\26\f\2\u0111C\3\2\2\2\u0112"+
		"\u0113\7\13\2\2\u0113\u0114\5N(\2\u0114\u0115\7\26\2\2\u0115E\3\2\2\2"+
		"\u0116\u0119\5D#\2\u0117\u0119\7\26\2\2\u0118\u0116\3\2\2\2\u0118\u0117"+
		"\3\2\2\2\u0119G\3\2\2\2\u011a\u011e\7\24\2\2\u011b\u011d\5J&\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"I\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\27\2\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012e"+
		"\3\2\2\2\u0126\u012e\7\35\2\2\u0127\u012e\7\37\2\2\u0128\u012e\7\34\2"+
		"\2\u0129\u012e\7\n\2\2\u012a\u012e\7*\2\2\u012b\u012e\7\33\2\2\u012c\u012e"+
		"\5L\'\2\u012d\u0122\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u0127\3\2\2\2\u012d"+
		"\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012c\3\2\2\2\u012eK\3\2\2\2\u012f\u0133\5P)\2\u0130\u0133"+
		"\7\25\2\2\u0131\u0133\7 \2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135M\3\2\2\2\u0136\u0140\5P)\2\u0137\u0140\7\"\2\2\u0138\u0140"+
		"\7 \2\2\u0139\u0140\7\35\2\2\u013a\u0140\7\37\2\2\u013b\u0140\7&\2\2\u013c"+
		"\u0140\7\'\2\2\u013d\u0140\7\25\2\2\u013e\u0140\7\27\2\2\u013f\u0136\3"+
		"\2\2\2\u013f\u0137\3\2\2\2\u013f\u0138\3\2\2\2\u013f\u0139\3\2\2\2\u013f"+
		"\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142O\3\2\2\2\u0143\u0144\t\3\2\2\u0144Q\3\2\2\2\u0145"+
		"\u0146\t\4\2\2\u0146S\3\2\2\2\u0147\u014f\7!\2\2\u0148\u0149\7!\2\2\u0149"+
		"\u014f\7!\2\2\u014a\u014f\7\37\2\2\u014b\u014c\7\37\2\2\u014c\u014f\7"+
		"\37\2\2\u014d\u014f\7\31\2\2\u014e\u0147\3\2\2\2\u014e\u0148\3\2\2\2\u014e"+
		"\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014d\3\2\2\2\u014fU\3\2\2\2"+
		"$`gz\u0096\u009a\u00a2\u00a5\u00ae\u00b3\u00b9\u00bd\u00c4\u00c8\u00cc"+
		"\u00d0\u00d3\u00d7\u00dc\u00e1\u00e3\u00e6\u00ea\u00ed\u0106\u010c\u0118"+
		"\u011e\u0124\u012d\u0132\u0134\u013f\u0141\u014e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}