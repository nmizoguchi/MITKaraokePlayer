package musicRepresentation;

import java.util.Iterator;
import java.util.List;

/**
 * Immutable class that has music information for the SequencePlayer.
 * @author Nicholas M. Mizoguchi
 *
 */
public class SequencerInformation {
    private int beatsPerMinute;
    private int ticksPerBeat;
    private List<MidiNoteRepresentation> midiNotes;
    private List<Syllable> syllables;
    
    SequencerInformation(List<MidiNoteRepresentation> midiNotes, List<Syllable> syllables,
            int beatsPerMinute, int ticksPerBeat) {
        this.midiNotes = midiNotes;
        this.syllables = syllables;
        this.beatsPerMinute = beatsPerMinute;
        this.ticksPerBeat = ticksPerBeat;
    }
    
    /**
     * Gives a list of MidiNoteRepresentation.
     * @return List of MidiNoteRepresentation
     */
    public List<MidiNoteRepresentation> getMidiNotes() {
        return midiNotes;
    }
    
    /**
     * Gives a list of Syllables to be shown on screen.
     * @return List of Syllables
     */
    public List<Syllable> getSyllables() {
        return syllables;
    }

    /**
     * @return The number of beats per minute.
     */
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * @return The number of ticks per beat.
     */
    public int getTicksPerBeat() {
        return ticksPerBeat;
    }
    
    @Override
    public String toString() {
        String s = "Beats per minute: "+beatsPerMinute+"\n";
        s = s.concat("Ticks per beat: "+getTicksPerBeat()+"\n");
        s = s.concat("Notes:\n");
        
        Iterator<MidiNoteRepresentation> it = this.midiNotes.iterator();
        while(it.hasNext()){
            MidiNoteRepresentation note = it.next();
            s = s.concat(note.toString()+" ");
        }
        return s;
    }
}
