/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
DIGIT : [0-9];
NOTE: [A-Ga-g];
DURATION_MULTIPLIER : DIGIT* ['/' DIGIT*] ;
DURATION_MULTIPLIER_STRICT : DIGIT+ '/' DIGIT+ ;
WHITESPACE : [ \t]+ -> skip ;
ENDOFLINE : \r;
LINEFEED : \n;
REPEAT_1 : '[1';
REPEAT_2 : '[2';
REST :  'z';
LYRIC_TEXT : 'w:' [A-Za-z';
ACCIDENTAL : '^^' | '^' | '_' | '__' | '=';
OCTAVE : [',];
EQUALS: '=';
FIELD: ('X:' | 'T:' | 'C:' | 'K:' | 'L:' | 'M:' | 'Q:' )  TEXT;

SQ_BRACKET_OPEN: '[';
SQ_BRACKET_CLOSE: ']';
LYRICAL_ELEMENT: ("+" | "-" | "_" | "*" | "~" | "\-" | "|" | TEXT);

BARLINE: "|" | "||" | "[|" | "|]" | ":|" | "|:";

KEYACCIDENTAL: [#b=];
MODEMINOR: 'm';
METER_C: ('C' | 'C|');
TEXT: [A-Z a-z0-9./=']+;


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
line     : PLUS EOF;
