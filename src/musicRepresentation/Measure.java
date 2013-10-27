package musicRepresentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import sound.Pitch;

/**
 * Represents a Measure.
 * 
 * @author Victor
 * 
 */
public class Measure {
    private List<SoundUnit> listOfSoundUnits;
    private final String endingBarLine;

    /**
     * Creates a new Measure and applies the key signature to its chords.
     * 
     * @param keySignature
     *            the corresponding key signature for the measure
     * @param chordsAndRestsInMeasure
     *            a list of the sound units (chords and rests) that compose the measure. Must be
     *            non-empty.
     * @param endingBarLine
     *            a String representing the ending bar line. Requires a valid bar line (can be “|”,
     *            “||”, “|]”, “[|”, “:|”, “|:”).
     */
    Measure(KeySignature keySignature, List<SoundUnit> chordsAndRestsInMeasure, String endingBarLine) {
        // Assigning the endingBarLine.
        this.endingBarLine = endingBarLine;
        
        // Firstly, we need a copy of Pitch map from keySignature.
        Map<Pitch, Pitch> measureSignature = keySignature.getPitchMap();

        this.listOfSoundUnits = new ArrayList<SoundUnit>(chordsAndRestsInMeasure);
        // Secondly, we need to iterate over all SoundUnits of the measure
        for (SoundUnit sUnit : listOfSoundUnits) {
            // If we are dealing with a Chord instance, we need to work on it (not on a Rest!)
            if (sUnit instanceof Chord) {
                // Then, we iterate over all notes inside our Chord.
                for (Note note : ((Chord) sUnit).getListOfNotesInChord()) {
                    if (note.getPitch().isHasAccidental()) {
                        // If the actual note being iterated has an Accidental, we need to update
                        // the
                        // measureSignature map!
                        measureSignature.put(new Pitch(note.getPitch().getValue(), 0, note
                                .getPitch().getOctave(), false), note.getPitch());
                        // By putting the key onto the Map, we override the previous value, updating
                        // the measure temp map.
                    } else {
                        // Otherwise, we need to update the note from the measure, applying the
                        // keySignature value if it is being mapped there.
                        if (measureSignature.containsKey(note.getPitch())) {
                            note.setPitch(measureSignature.get(note.getPitch()));
                        }
                    }
                }
            }
        }

        // original pseudocode:
        // measureSignature = keysignature.getPitchMap():@returns copy of map
        // for su in List<SU>:
        // if soundunit instanceof chord:
        // for note in listOfNoteinchord:
        // if note.pitch.hasAccidental:
        // //if it has an accidental
        // measuresignature.put(new Pitch(note.pitchvalue,0,note.pitch.octave, false),
        // note.getPitch)
        // else:
        // if measureSignature.containsKey(note.getPitch)
        // note.pitch = measureSignature.get(note.getPitch)

    }

    /**
     * Returns the list of sound units from this measure.
     * 
     * @return the listOfSoundUnits
     */
    List<SoundUnit> getListOfSoundUnits() {
        return listOfSoundUnits;
    }

    /**
     * Returns the list of sound units from this measure.
     * 
     * @return the listOfSoundUnits
     */
    String getEndingBarLine() {
        return endingBarLine;
    }

    /**
     * Takes a List<String> and matches it to the correspondent Chord. If it encounters a “|” then
     * it makes the rest of the Chords in the measure have the “*” for its syllable.
     * Measure.applyLyrics() returns the input List<String> without the Strings that weren't
     * matched.
     * 
     * @param originalListOfStrings
     * @return a list of Strings excluding the Strings that weren’t matched.
     */
    List<String> applyLyrics(List<String> originalListOfStrings) {
        return null;
    }

}
