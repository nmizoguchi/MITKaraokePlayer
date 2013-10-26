package musicRepresentation;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sound.ABCMusicParseListener;
import sound.Note;
import sound.Syllable;

public class ABCMusic {
    private  String title;
    private  String composer;
    private  String key;
    private  List<Note> notes;
    private  List<Syllable> lyrics;
    private  int ticksPerBeat;
    private  int beatsPerMinute;
    
    public ABCMusic(String path) throws IOException {
        // Opens file in path and get all the chars in the file
        String input = readFile(path);
        
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
        
        // DRAW THE THREE
        ((RuleContext)tree).inspect(parser);
        
        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ABCMusicParseListener();
        walker.walk(listener, tree);
        
        // ABCMusicParseListener() has methods to get all information from the AST
        // have to initialize all  variables
    }
    
    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public int getTicksPerBeat() {
        return ticksPerBeat;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }
    
    public List<Note> getNotes() {
        // Should be creating a copy!
        return notes;
    }
    
    public List<Syllable> getLyrics() {
        return lyrics;
    }
    
    
    private String readFile(String path) throws IOException {
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
}
