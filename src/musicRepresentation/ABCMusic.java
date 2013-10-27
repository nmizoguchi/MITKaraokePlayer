package musicRepresentation;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * 
 * @author Nicholas M. Mizoguchi
 *
 */

public class ABCMusic {
    private ABCHeader header;
    private Map<String,Voice> voiceMap;
    
    /**
     * Creates a representation of an ABC file as an ABCMusic Object.
     * @param path the .abc file to be interpreted.
     * @throws IOException in case the path is invalid.
     */
    public ABCMusic(String path) throws IOException {
        // Opens file in path and get all the chars in the file
        String input = readFile(path);
        
        /* Runs the parser in the stream of bytes received  *
         * from the file in path.                           */
        
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
        
//        // DRAW THE THREE
//        ((RuleContext)tree).inspect(parser);
        
        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ABCMusicParseListener();
        walker.walk(listener, tree);
        
        // ABCMusicParseListener() has methods to get all information from the AST
        // have to initialize all  variables
        this.voiceMap = ((ABCMusicParseListener)listener).getVoiceMap();
        this.header = ((ABCMusicParseListener)listener).getHeader();
    }
    
    /**
     * Transform the representation of the .abc file into information to be passed
     * to a SequencePlayer. It goes through all voices, returning the representation
     * of each note as a MidiNoteRepresentation in the list.
     * @return an instance of SequencerInformation
     */
    public SequencerInformation constructSequencerInformation() {
        List<Voice> voices = (ArrayList<Voice>) voiceMap.values();
        List<SoundUnit> allRawSoundUnits = new ArrayList<SoundUnit>();
        
        
        //getSeqOfPreMidiNotes(): @returns List<PreMidiNote>
        List<MidiNoteRepresentation> preMidiNotesCorrectTempo = new ArrayList<MidiNoteRepresentation>();
        
        for (Voice v : voices) {
            for (Measure m : v.getListOfMeasures()) {
                allRawSoundUnits.addAll(m.getListOfSoundUnits());
            }
        }
        return null;
    }
    
    
    /**
     * Gives the Title of the piece of music ABCHeader represents
     * @return the title String itself.
     */
    public String getTitle() {
        return header.getTitle();
    }
    

    /**
     * Gives the Composer of the piece of music ABCHeader represents
     * @return the composer String itself.
     */
    public String getComposer() {
        return header.getComposer();
    }
    
    
    /**
     * Opens a file in <code>path</code>, giving a String of the file.
     * @param path The path where the file to be read is located.
     * @return A string with all the bytes in the file located in <code>path</code>.
     * @throws IOException if file not found, or any other issue with the file.
     */
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
