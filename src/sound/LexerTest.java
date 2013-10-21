package sound;

import static org.junit.Assert.assertEquals;
import grammar.ABCMusicLexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
/**
 * This is the test suite for Lexer. You should expand this file with more
 * unit tests to make sure your Lexer works correctly.
 */
public class LexerTest {

//    @Test
//    public void testOneToken() {
//        String input = readFile("sample_abc/sample1.abc");
//
//        // Test lexer
//        verifyLexer(input, new String[] {"+"});
//    }
    @Test
    public void testEachToken() {
        //verifyLexer("X: 1", new String[] {"X: 1"});
        verifyLexer("C",new String[] {"C"});
        verifyLexer("a", new String[] {"a"});
        verifyLexer("1",new String[] {"1"});
        verifyLexer("[A]", new String[] {"[","A", "]"});
        verifyLexer("Nicholas Mizoguchi", new String[] {"Nicholas Mizoguchi"});
        verifyLexer("w: A-ma-zing Grace", new String[] {"w: ", "A", "-", "ma", "-", "zing Grace"});
//        verifyLexer("'B", new String[] {"'", "B"});
//        verifyLexer("ABC",new String[] {"A", "B", "C"});
//        verifyLexer("A B C",new String[] {"A", "B", "C"});
    }


    public void verifyLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());

        for(int i = 0; i < actualTokens.size(); i++) {
            String actualToken = actualTokens.get(i).getText();
            String expectedToken = expectedTokens[i];
            assertEquals(actualToken, expectedToken);
        }
    }   

    public String readFile(String path) {
        try {
            // Read file
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String stringLine = br.readLine();
            String buffer = "";

            while(stringLine != null){
                buffer = buffer.concat(stringLine.concat("\n"));
                stringLine = br.readLine();
            }

            return buffer;
        }
        catch (IOException e) {
            return e.toString();
        }
    }
}