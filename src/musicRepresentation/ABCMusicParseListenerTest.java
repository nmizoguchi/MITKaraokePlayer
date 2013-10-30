package musicRepresentation;

import static org.junit.Assert.assertEquals;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * Test suite for the ABCMusic parser.
 * @author Victor and Nicholas.
 *
 */
public class ABCMusicParseListenerTest {
    private static Map<String, Voice> voiceMap;
    private static ABCHeader header;
    
    @Test
    public void testParser_headerFields(){
        String input = "X:1\nT:Alphabet Song\nC:Traditional Kid's Song\nM:4/4\nL:1/4\nQ:1/4=100\nK:D\n";
        
        parse(input);  
        
        String expectedTitle ="Alphabet Song";
        String expectedComposer ="Traditional Kid's Song";
        int expectedBeatsPerMeasure = 1;
        int expectedBeatsPerMinute = 9999;
        double expectedBpmNoteLength = 9999;
        double expectedDefaultNoteLength = 9999;
        String expectedKeyName = "D";
        int expectedTicksPerBeat = 9999;
        double expectedWhatNoteGetsTheBeat = 9999;
        
        assertEquals(true, ABCMusicParseListenerTest.header.getTitle().equals(expectedTitle));
        assertEquals(true, ABCMusicParseListenerTest.header.getComposer().equals(expectedComposer));
        assertEquals(expectedBeatsPerMeasure, ABCMusicParseListenerTest.header.getBeatsPerMeasure());
        assertEquals(expectedBeatsPerMinute, ABCMusicParseListenerTest.header.getBeatsPerMinute());
        assertEquals(expectedBpmNoteLength, ABCMusicParseListenerTest.header.getBpmNoteLength(), 0.001);
        assertEquals(expectedDefaultNoteLength, ABCMusicParseListenerTest.header.getDefaultNoteLength(), 0.001);
        assertEquals(true, ABCMusicParseListenerTest.header.getKeySignature().getKeyName().equals(expectedKeyName));
        assertEquals(expectedTicksPerBeat, ABCMusicParseListenerTest.header.getTicksPerBeat());
        assertEquals(expectedWhatNoteGetsTheBeat, ABCMusicParseListenerTest.header.getWhatNoteGetsTheBeat(), 0.001);
    }
    
    
    /**
     * Helper method. Modifies the static 'voiceMap' and 'header' fields of the test suite, without
     * needing to create a single abc file only for that. Must be called in order to mutate the
     * static values from the class, so that they can be compared with the expected values.
     * 
     * @param input
     *            String corresponding to the input to be tested. Every line-break inside the
     *            'input' String corresponds to a line-break of a hypothetical abc file.
     */
    public static void parse(String input) {
        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);

        // Feed the tokens into the parser.
        ABCMusicParser parser = new ABCMusicParser(tokens);
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.line(); // "line" is the starter rule.

        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ABCMusicParseListener();
        walker.walk(listener, tree);
        ABCMusicParseListenerTest.voiceMap = ((ABCMusicParseListener) listener).getVoiceMap();
        ABCMusicParseListenerTest.header = ((ABCMusicParseListener) listener).getHeader();
        return;
    }

}
