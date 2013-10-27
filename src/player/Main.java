package player;

import java.io.IOException;

import org.antlr.v4.codegen.model.ListenerDispatchMethod;

import sound.LyricListener;
import sound.SequencePlayer;
import musicRepresentation.ABCMusic;
import musicRepresentation.MidiNoteRepresentation;
import musicRepresentation.SequencerInformation;
import musicRepresentation.Syllable;


/**
 * Main entry point of your application.
 */
public class Main {
    /**
     * Plays the input file using Java MIDI API and displays header information to the standard
     * output stream.
     * 
     * (Your code should not exit the application abnormally using System.exit().)
     * 
     * @param file
     *            the name of input abc file
     */
    public static void play(String file) {
        
        ABCMusic myTune;
        try {
            myTune = new ABCMusic(file);
        } catch (IOException e) {
            System.out.println("File "+ file +" not found!");
        }
        
        SequencerInformation myInfo = myTune.constructSequencerInformation();

        //TODO: figure out what kind of listener do we put in here!
        SequencePlayer player = new SequencePlayer(myInfo.getBeatsPerMinute(), myInfo.getTicksPerBeat(), new Listener() );
        
        // Adding all MidiNoteRepresentations as MidiNotes
        for(MidiNoteRepresentation n : myInfo.getMidiNotes())
            player.addNote(n.getPitch().toMidiNote(), n.getStartTick(), n.getNumTicks());
        
        // Adding all Syllables
        for(Syllable s : myInfo.getSyllables())
            player.addLyricEvent(s.getSyllable(), s.getStartTick());
        
        player.addLyricEvent(myTune.getTitle(), 0);
        player.addLyricEvent(myTune.getComposer(), 0);
        player.play();
        
    }

    public static void main(String[] args) {
        try{
            play("sample_abc/sample3.abc");
        }
    
        catch(RuntimeException e) {
            System.out.println("Invalid file.");
            System.out.println(e.toString());
        }
    }
}
