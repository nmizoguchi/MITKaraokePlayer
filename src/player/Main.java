package player;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import musicRepresentation.ABCMusic;
import musicRepresentation.MidiNoteRepresentation;
import musicRepresentation.SequencerInformation;
import musicRepresentation.Syllable;
import sound.LyricListener;
import sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {
    /**
     * Plays the input file using Java MIDI API and displays header information
     * to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file
     *            the name of input abc file
     */
    public static void play(String file) {

        ABCMusic myTune;
        try {
            myTune = new ABCMusic(file);
        } catch (IOException e) {
            System.out.println("File " + file + " not found!");
            return;
        }

        List<SequencerInformation> sequencerTracks = myTune
                .constructSequencerInformation();

        // Create a new player, with 120 beats per minute, 2 ticks per beat
        // and a LyricListener that prints each lyric that it sees.
        LyricListener listener = new LyricListener() {
            private int counter = 0;
            private int lyricsPerLine = 12;

            public void processLyricEvent(String text) {
                counter = (counter + 1) % lyricsPerLine;
                if (counter == 0)
                    System.out.println("");
                System.out.print(text);
            }
        };

        SequencePlayer player;
        try {
            player = new SequencePlayer(myTune.getBeatsPerMinute(),
                    myTune.getTicksPerBeat(), listener);
        } catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        } catch (InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }

        /*
         * Adding all midiNoteRepresentation as MidiNotes. For that, we need to
         * get each MidiNoteRepresentation from each voice, represented as an
         * element of SequencerInformation in sequencerTracks.
         */

        Iterator<SequencerInformation> seqIterator = sequencerTracks.iterator();
        
        while(seqIterator.hasNext()){
            SequencerInformation sequencerInfo = seqIterator.next();
            
            // Adding all MidiNoteRepresentations as MidiNotes
            for (MidiNoteRepresentation n : sequencerInfo.getMidiNotes())
                player.addNote(n.getPitch().toMidiNote(), n.getStartTick(),
                        n.getNumTicks());
        
            // Adding all Syllables
            for (Syllable s : sequencerInfo.getSyllables())
                player.addLyricEvent(s.getSyllable(), s.getStartTick());
        
            player.addLyricEvent(myTune.getTitle().concat("\n"), 0);
            player.addLyricEvent(myTune.getComposer().concat("\n"), 0);
        }
        
        try {
            player.play();
        } catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }

    }

    public static void main(String[] args) {
        play("sample_abc/piece3.abc");
    }
}
