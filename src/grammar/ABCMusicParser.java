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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_X() { return getToken(ABCMusicParser.FIELD_X, 0); }
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(FIELD_X);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(107); match(SPACE);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); match(NUMBER);
			setState(114); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(FIELD_T);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(117); match(SPACE);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
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
			setState(132);
			switch (_input.LA(1)) {
			case FIELD_C:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); field_composer();
				}
				break;
			case FIELD_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); field_default_length();
				}
				break;
			case FIELD_M:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); field_meter();
				}
				break;
			case FIELD_Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); field_tempo();
				}
				break;
			case FIELD_V:
				enterOuterAlt(_localctx, 5);
				{
				setState(130); field_voice();
				}
				break;
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(131); comment();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode FIELD_C() { return getToken(ABCMusicParser.FIELD_C, 0); }
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(FIELD_C);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); match(SPACE);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(141); valid_text_with_number();
			setState(142); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public TerminalNode FIELD_L() { return getToken(ABCMusicParser.FIELD_L, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(FIELD_L);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(145); match(SPACE);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); note_length_strict();
			setState(152); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(FIELD_M);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(155); match(SPACE);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); meter();
			setState(162); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(FIELD_Q);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(165); match(SPACE);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); tempo();
			setState(172); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public Valid_text_with_numberContext valid_text_with_number() {
			return getRuleContext(Valid_text_with_numberContext.class,0);
		}
		public TerminalNode FIELD_V() { return getToken(ABCMusicParser.FIELD_V, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(FIELD_V);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(175); match(SPACE);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(181); valid_text_with_number();
			setState(182); end_of_line();
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
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicParser.SPACE, i);
		}
		public TerminalNode FIELD_K() { return getToken(ABCMusicParser.FIELD_K, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicParser.SPACE); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(FIELD_K);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(185); match(SPACE);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191); key();
			setState(192); end_of_line();
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
			setState(194); keynote();
			setState(196);
			_la = _input.LA(1);
			if (_la==LOWERCASE_M) {
				{
				setState(195); mode_minor();
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
		public TerminalNode CAPITAL_C() { return getToken(ABCMusicParser.CAPITAL_C, 0); }
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
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==CAPITAL_C || _la==A_THROUGH_G) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(200);
			_la = _input.LA(1);
			if (_la==LOWERCASE_B || _la==HASHTAG) {
				{
				setState(199); key_accidental();
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
			setState(202);
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
			setState(204); match(LOWERCASE_M);
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
			setState(211);
			switch (_input.LA(1)) {
			case CAPITAL_C:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(206); match(CAPITAL_C);
				setState(208);
				_la = _input.LA(1);
				if (_la==BARLINE) {
					{
					setState(207); match(BARLINE);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); note_length_strict();
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
			setState(213); note_length_strict();
			setState(214); match(EQUALS);
			setState(215); match(NUMBER);
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
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217); abc_line();
				}
				}
				setState(220); 
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
			setState(235);
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
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222); element();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << SPACE) | (1L << EQUALS) | (1L << NTH_REPEAT) | (1L << BARLINE) | (1L << UNDERSCORE) | (1L << CARET) | (1L << TUPLET_BEGIN_2) | (1L << TUPLET_BEGIN_3) | (1L << TUPLET_BEGIN_4) | (1L << SQ_BRACKET_OPEN))) != 0) );
				setState(227); match(NEWLINE);
				setState(231);
				_la = _input.LA(1);
				if (_la==FIELD_W) {
					{
					setState(228); lyric();
					setState(229); match(NEWLINE);
					}
				}

				}
				break;
			case FIELD_V:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); mid_tune_field();
				}
				break;
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(234); comment();
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
			setState(242);
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
				setState(237); note_element();
				}
				break;
			case TUPLET_BEGIN_2:
			case TUPLET_BEGIN_3:
			case TUPLET_BEGIN_4:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); tuplet_element();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); match(BARLINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(241); match(SPACE);
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
			setState(246);
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
				setState(244); note();
				}
				break;
			case SQ_BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); multi_note();
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
			setState(248); note_or_rest();
			setState(250);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==SLASH) {
				{
				setState(249); note_length();
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
			setState(254);
			switch (_input.LA(1)) {
			case LOWERCASE_B:
			case CAPITAL_C:
			case A_THROUGH_G:
			case EQUALS:
			case UNDERSCORE:
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); pitch();
				}
				break;
			case LOWERCASE_Z:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); rest();
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
			setState(257);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << UNDERSCORE) | (1L << CARET))) != 0)) {
				{
				setState(256); accidental();
				}
			}

			setState(259); basenote();
			setState(261);
			_la = _input.LA(1);
			if (_la==COMMA || _la==APOSTROPHE) {
				{
				setState(260); octave();
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
			setState(273);
			switch (_input.LA(1)) {
			case APOSTROPHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(263); match(APOSTROPHE);
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==APOSTROPHE );
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268); match(COMMA);
					}
					}
					setState(271); 
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
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(275); match(NUMBER);
					}
				}

				setState(278); match(SLASH);
				setState(280);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(279); match(NUMBER);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(NUMBER);
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
			setState(285); match(NUMBER);
			setState(286); match(SLASH);
			setState(287); match(NUMBER);
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
			setState(289); valid_note();
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
			setState(291); match(LOWERCASE_Z);
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
			setState(308);
			switch (_input.LA(1)) {
			case TUPLET_BEGIN_2:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(TUPLET_BEGIN_2);
				setState(294); note_element();
				setState(295); note_element();
				}
				break;
			case TUPLET_BEGIN_3:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); match(TUPLET_BEGIN_3);
				setState(298); note_element();
				setState(299); note_element();
				setState(300); note_element();
				}
				break;
			case TUPLET_BEGIN_4:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); match(TUPLET_BEGIN_4);
				setState(303); note_element();
				setState(304); note_element();
				setState(305); note_element();
				setState(306); note_element();
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
			setState(310); match(SQ_BRACKET_OPEN);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311); note();
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << EQUALS) | (1L << UNDERSCORE) | (1L << CARET))) != 0) );
			setState(316); match(SQ_BRACKET_CLOSE);
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
			setState(318); field_voice();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(COMMENT_BEGIN);
			setState(322);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_M) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << OTHER_LETTER) | (1L << NUMBER) | (1L << SPACE) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << COMMA) | (1L << APOSTROPHE) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0)) {
				{
				setState(321); valid_text_with_number();
				}
			}

			setState(324); match(NEWLINE);
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
			setState(328);
			switch (_input.LA(1)) {
			case COMMENT_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(NEWLINE);
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
			setState(330); match(FIELD_W);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWERCASE_B) | (1L << LOWERCASE_M) | (1L << LOWERCASE_Z) | (1L << CAPITAL_C) | (1L << A_THROUGH_G) | (1L << OTHER_LETTER) | (1L << TILDE) | (1L << NUMBER) | (1L << SPACE) | (1L << BARLINE) | (1L << STAR) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << COMMA) | (1L << APOSTROPHE) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE) | (1L << SLASH_HYPHEN))) != 0)) {
				{
				{
				setState(331); lyrical_element();
				}
				}
				setState(336);
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
			setState(349);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(337); match(SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(340); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); match(HYPHEN);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(343); match(UNDERSCORE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(344); match(STAR);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(345); match(TILDE);
				}
				break;
			case SLASH_HYPHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(346); match(SLASH_HYPHEN);
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(347); match(BARLINE);
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
			case APOSTROPHE:
			case PARENTHESIS_OPEN:
			case PARENTHESIS_CLOSE:
				enterOuterAlt(_localctx, 8);
				{
				setState(348); lyric_text();
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
		public List<TerminalNode> APOSTROPHE() { return getTokens(ABCMusicParser.APOSTROPHE); }
		public List<TerminalNode> PARENTHESIS_CLOSE() { return getTokens(ABCMusicParser.PARENTHESIS_CLOSE); }
		public List<TerminalNode> PARENTHESIS_OPEN() { return getTokens(ABCMusicParser.PARENTHESIS_OPEN); }
		public List<TerminalNode> COMMA() { return getTokens(ABCMusicParser.COMMA); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(ABCMusicParser.APOSTROPHE, i);
		}
		public TerminalNode PARENTHESIS_OPEN(int i) {
			return getToken(ABCMusicParser.PARENTHESIS_OPEN, i);
		}
		public TerminalNode PARENTHESIS_CLOSE(int i) {
			return getToken(ABCMusicParser.PARENTHESIS_CLOSE, i);
		}
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
			setState(357); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(357);
					switch (_input.LA(1)) {
					case LOWERCASE_B:
					case LOWERCASE_M:
					case LOWERCASE_Z:
					case CAPITAL_C:
					case A_THROUGH_G:
					case OTHER_LETTER:
						{
						setState(351); valid_letter();
						}
						break;
					case NUMBER:
						{
						setState(352); match(NUMBER);
						}
						break;
					case COMMA:
						{
						setState(353); match(COMMA);
						}
						break;
					case APOSTROPHE:
						{
						setState(354); match(APOSTROPHE);
						}
						break;
					case PARENTHESIS_OPEN:
						{
						setState(355); match(PARENTHESIS_OPEN);
						}
						break;
					case PARENTHESIS_CLOSE:
						{
						setState(356); match(PARENTHESIS_CLOSE);
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
				setState(359); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(370);
				switch (_input.LA(1)) {
				case LOWERCASE_B:
				case LOWERCASE_M:
				case LOWERCASE_Z:
				case CAPITAL_C:
				case A_THROUGH_G:
				case OTHER_LETTER:
					{
					setState(361); valid_letter();
					}
					break;
				case APOSTROPHE:
					{
					setState(362); match(APOSTROPHE);
					}
					break;
				case COMMA:
					{
					setState(363); match(COMMA);
					}
					break;
				case HYPHEN:
					{
					setState(364); match(HYPHEN);
					}
					break;
				case UNDERSCORE:
					{
					setState(365); match(UNDERSCORE);
					}
					break;
				case PARENTHESIS_OPEN:
					{
					setState(366); match(PARENTHESIS_OPEN);
					}
					break;
				case PARENTHESIS_CLOSE:
					{
					setState(367); match(PARENTHESIS_CLOSE);
					}
					break;
				case NUMBER:
					{
					setState(368); match(NUMBER);
					}
					break;
				case SPACE:
					{
					setState(369); match(SPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(372); 
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
			setState(374);
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
			setState(376);
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
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); match(CARET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); match(CARET);
				setState(380); match(CARET);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381); match(UNDERSCORE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382); match(UNDERSCORE);
				setState(383); match(UNDERSCORE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(384); match(EQUALS);
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
		"\2\3*\u0186\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4_\n\4\f\4\16\4b\13"+
		"\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\7\5o\n\5\f\5\16\5r"+
		"\13\5\3\5\3\5\3\5\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0087\n\7\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13"+
		"\b\3\b\3\b\3\b\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\3\t\3\t\3"+
		"\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\3\n\3\n\3\13\3\13\7\13\u00a9"+
		"\n\13\f\13\16\13\u00ac\13\13\3\13\3\13\3\13\3\f\3\f\7\f\u00b3\n\f\f\f"+
		"\16\f\u00b6\13\f\3\f\3\f\3\f\3\r\3\r\7\r\u00bd\n\r\f\r\16\r\u00c0\13\r"+
		"\3\r\3\r\3\r\3\16\3\16\5\16\u00c7\n\16\3\17\3\17\5\17\u00cb\n\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\5\22\u00d3\n\22\3\22\5\22\u00d6\n\22\3\23\3"+
		"\23\3\23\3\23\3\24\6\24\u00dd\n\24\r\24\16\24\u00de\3\25\6\25\u00e2\n"+
		"\25\r\25\16\25\u00e3\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\3\25\3\25\5\25"+
		"\u00ee\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00f5\n\26\3\27\3\27\5\27\u00f9"+
		"\n\27\3\30\3\30\5\30\u00fd\n\30\3\31\3\31\5\31\u0101\n\31\3\32\5\32\u0104"+
		"\n\32\3\32\3\32\5\32\u0108\n\32\3\33\6\33\u010b\n\33\r\33\16\33\u010c"+
		"\3\33\6\33\u0110\n\33\r\33\16\33\u0111\5\33\u0114\n\33\3\34\5\34\u0117"+
		"\n\34\3\34\3\34\5\34\u011b\n\34\3\34\5\34\u011e\n\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u0137\n \3!\3!\6!\u013b\n!\r!\16!\u013c\3!\3!\3\"\3\"\3#\3#\5#\u0145"+
		"\n#\3#\3#\3$\3$\5$\u014b\n$\3%\3%\7%\u014f\n%\f%\16%\u0152\13%\3&\6&\u0155"+
		"\n&\r&\16&\u0156\3&\3&\3&\3&\3&\3&\3&\5&\u0160\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\6\'\u0168\n\'\r\'\16\'\u0169\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u0175"+
		"\n(\r(\16(\u0176\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u0184\n+\3+\2,\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRT\2\6\3\7\b\4\4\4\36\36\3\4\t\4\4\4\7\b\u01a3\2V\3\2\2\2\4Y\3\2\2\2"+
		"\6\\\3\2\2\2\bl\3\2\2\2\nv\3\2\2\2\f\u0086\3\2\2\2\16\u0088\3\2\2\2\20"+
		"\u0092\3\2\2\2\22\u009c\3\2\2\2\24\u00a6\3\2\2\2\26\u00b0\3\2\2\2\30\u00ba"+
		"\3\2\2\2\32\u00c4\3\2\2\2\34\u00c8\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2"+
		"\2\2\"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00dc\3\2\2\2(\u00ed\3\2\2\2*\u00f4"+
		"\3\2\2\2,\u00f8\3\2\2\2.\u00fa\3\2\2\2\60\u0100\3\2\2\2\62\u0103\3\2\2"+
		"\2\64\u0113\3\2\2\2\66\u011d\3\2\2\28\u011f\3\2\2\2:\u0123\3\2\2\2<\u0125"+
		"\3\2\2\2>\u0136\3\2\2\2@\u0138\3\2\2\2B\u0140\3\2\2\2D\u0142\3\2\2\2F"+
		"\u014a\3\2\2\2H\u014c\3\2\2\2J\u015f\3\2\2\2L\u0167\3\2\2\2N\u0174\3\2"+
		"\2\2P\u0178\3\2\2\2R\u017a\3\2\2\2T\u0183\3\2\2\2VW\5\4\3\2WX\7\1\2\2"+
		"X\3\3\2\2\2YZ\5\6\4\2Z[\5&\24\2[\5\3\2\2\2\\`\5\b\5\2]_\5D#\2^]\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cg\5\n\6\2df\5\f\7"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\30"+
		"\r\2k\7\3\2\2\2lp\7\f\2\2mo\7\27\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\25\2\2tu\5F$\2u\t\3\2\2\2vz\7\r\2\2wy\7"+
		"\27\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~"+
		"\5N(\2~\177\5F$\2\177\13\3\2\2\2\u0080\u0087\5\16\b\2\u0081\u0087\5\20"+
		"\t\2\u0082\u0087\5\22\n\2\u0083\u0087\5\24\13\2\u0084\u0087\5\26\f\2\u0085"+
		"\u0087\5D#\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\r"+
		"\3\2\2\2\u0088\u008c\7\16\2\2\u0089\u008b\7\27\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5N(\2\u0090\u0091\5F$\2\u0091"+
		"\17\3\2\2\2\u0092\u0096\7\21\2\2\u0093\u0095\7\27\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\58\35\2\u009a\u009b\5F"+
		"$\2\u009b\21\3\2\2\2\u009c\u00a0\7\22\2\2\u009d\u009f\7\27\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\5"+
		"F$\2\u00a5\23\3\2\2\2\u00a6\u00aa\7\17\2\2\u00a7\u00a9\7\27\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5$\23\2\u00ae"+
		"\u00af\5F$\2\u00af\25\3\2\2\2\u00b0\u00b4\7\23\2\2\u00b1\u00b3\7\27\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5N(\2\u00b8"+
		"\u00b9\5F$\2\u00b9\27\3\2\2\2\u00ba\u00be\7\20\2\2\u00bb\u00bd\7\27\2"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5\32\16\2"+
		"\u00c2\u00c3\5F$\2\u00c3\31\3\2\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c7"+
		"\5 \21\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\33\3\2\2\2\u00c8"+
		"\u00ca\t\2\2\2\u00c9\u00cb\5\36\20\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\37\3\2\2\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf!\3\2\2\2\u00d0\u00d2\7\7\2\2\u00d1\u00d3\7\33\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\58"+
		"\35\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00d8"+
		"\58\35\2\u00d8\u00d9\7\31\2\2\u00d9\u00da\7\25\2\2\u00da%\3\2\2\2\u00db"+
		"\u00dd\5(\25\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e2\5*\26\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e9\7\26\2\2\u00e6\u00e7\5H%\2\u00e7\u00e8\7\26"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ee\3\2\2\2\u00eb\u00ee\5B\"\2\u00ec\u00ee\5D#\2\u00ed\u00e1\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee)\3\2\2\2\u00ef\u00f5"+
		"\5,\27\2\u00f0\u00f5\5> \2\u00f1\u00f5\7\33\2\2\u00f2\u00f5\7\32\2\2\u00f3"+
		"\u00f5\7\27\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5+\3\2\2\2\u00f6\u00f9"+
		"\5.\30\2\u00f7\u00f9\5@!\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"-\3\2\2\2\u00fa\u00fc\5\60\31\2\u00fb\u00fd\5\66\34\2\u00fc\u00fb\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd/\3\2\2\2\u00fe\u0101\5\62\32\2\u00ff\u0101"+
		"\5<\37\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102"+
		"\u0104\5T+\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2"+
		"\2\u0105\u0107\5:\36\2\u0106\u0108\5\64\33\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\63\3\2\2\2\u0109\u010b\7\"\2\2\u010a\u0109\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0114"+
		"\3\2\2\2\u010e\u0110\7 \2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010a\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0114\65\3\2\2\2\u0115\u0117\7\25\2\2\u0116\u0115"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\7\30\2\2"+
		"\u0119\u011b\7\25\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011e\7\25\2\2\u011d\u0116\3\2\2\2\u011d\u011c\3\2\2\2"+
		"\u011e\67\3\2\2\2\u011f\u0120\7\25\2\2\u0120\u0121\7\30\2\2\u0121\u0122"+
		"\7\25\2\2\u01229\3\2\2\2\u0123\u0124\5R*\2\u0124;\3\2\2\2\u0125\u0126"+
		"\7\6\2\2\u0126=\3\2\2\2\u0127\u0128\7#\2\2\u0128\u0129\5,\27\2\u0129\u012a"+
		"\5,\27\2\u012a\u0137\3\2\2\2\u012b\u012c\7$\2\2\u012c\u012d\5,\27\2\u012d"+
		"\u012e\5,\27\2\u012e\u012f\5,\27\2\u012f\u0137\3\2\2\2\u0130\u0131\7%"+
		"\2\2\u0131\u0132\5,\27\2\u0132\u0133\5,\27\2\u0133\u0134\5,\27\2\u0134"+
		"\u0135\5,\27\2\u0135\u0137\3\2\2\2\u0136\u0127\3\2\2\2\u0136\u012b\3\2"+
		"\2\2\u0136\u0130\3\2\2\2\u0137?\3\2\2\2\u0138\u013a\7(\2\2\u0139\u013b"+
		"\5.\30\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7)\2\2\u013fA\3\2\2\2\u0140"+
		"\u0141\5\26\f\2\u0141C\3\2\2\2\u0142\u0144\7\13\2\2\u0143\u0145\5N(\2"+
		"\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147"+
		"\7\26\2\2\u0147E\3\2\2\2\u0148\u014b\5D#\2\u0149\u014b\7\26\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bG\3\2\2\2\u014c\u0150\7\24\2\2"+
		"\u014d\u014f\5J&\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151I\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0155\7\27\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0160\3\2\2\2\u0158\u0160\7\35\2\2\u0159"+
		"\u0160\7\37\2\2\u015a\u0160\7\34\2\2\u015b\u0160\7\n\2\2\u015c\u0160\7"+
		"*\2\2\u015d\u0160\7\33\2\2\u015e\u0160\5L\'\2\u015f\u0154\3\2\2\2\u015f"+
		"\u0158\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"K\3\2\2\2\u0161\u0168\5P)\2\u0162\u0168\7\25\2\2\u0163\u0168\7 \2\2\u0164"+
		"\u0168\7\"\2\2\u0165\u0168\7&\2\2\u0166\u0168\7\'\2\2\u0167\u0161\3\2"+
		"\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016aM\3\2\2\2\u016b\u0175\5P)\2\u016c\u0175"+
		"\7\"\2\2\u016d\u0175\7 \2\2\u016e\u0175\7\35\2\2\u016f\u0175\7\37\2\2"+
		"\u0170\u0175\7&\2\2\u0171\u0175\7\'\2\2\u0172\u0175\7\25\2\2\u0173\u0175"+
		"\7\27\2\2\u0174\u016b\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u016d\3\2\2\2"+
		"\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0171"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177O\3\2\2\2\u0178\u0179\t\4\2\2"+
		"\u0179Q\3\2\2\2\u017a\u017b\t\5\2\2\u017bS\3\2\2\2\u017c\u0184\7!\2\2"+
		"\u017d\u017e\7!\2\2\u017e\u0184\7!\2\2\u017f\u0184\7\37\2\2\u0180\u0181"+
		"\7\37\2\2\u0181\u0184\7\37\2\2\u0182\u0184\7\31\2\2\u0183\u017c\3\2\2"+
		"\2\u0183\u017d\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184U\3\2\2\2-`gpz\u0086\u008c\u0096\u00a0\u00aa\u00b4\u00be"+
		"\u00c6\u00ca\u00d2\u00d5\u00de\u00e3\u00e9\u00ed\u00f4\u00f8\u00fc\u0100"+
		"\u0103\u0107\u010c\u0111\u0113\u0116\u011a\u011d\u0136\u013c\u0144\u014a"+
		"\u0150\u0156\u015f\u0167\u0169\u0174\u0176\u0183";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}