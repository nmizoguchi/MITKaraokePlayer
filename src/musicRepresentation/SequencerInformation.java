package musicRepresentation;

import java.util.List;

public class SequencerInformation {
    private List<MidiNoteRepresentation> midiNotes;
    private List<Syllable> syllables;
    
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
    
    
}
