package musicRepresentation;

import java.util.Iterator;
import java.util.List;

/**
 * Immutable class that has music information for the SequencePlayer.
 * @author Nicholas M. Mizoguchi
 *
 */
public class SequencerInformation {
    private String voice;
    private List<MidiNoteRepresentation> midiNotes;
    private List<Syllable> syllables;
    
    SequencerInformation(String voice, List<MidiNoteRepresentation> midiNotes,
            List<Syllable> syllables) {
        this.voice = voice;
        this.midiNotes = midiNotes;
        this.syllables = syllables;
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
    
    @Override
    public String toString() {
        String s = "Voice: "+voice+"\n";
        s = s.concat("Notes:\n");
        
        Iterator<MidiNoteRepresentation> it = this.midiNotes.iterator();
        while(it.hasNext()){
            MidiNoteRepresentation note = it.next();
            s = s.concat(note.toString()+" ");
        }
        return s;
    }
}
