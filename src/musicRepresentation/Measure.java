package musicRepresentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import sound.Pitch;

/**
 * Represents a Measure. Measure is mutable.
 * 
 * @author Victor
 * 
 */
public class Measure {
    private List<SoundUnit> listOfSoundUnits;
    private String beginningBarLine;
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
        this.beginningBarLine = "";
        
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
    
    Measure(KeySignature keySignature, List<SoundUnit> chordsAndRestsInMeasure, String beginningBarLine, String endingBarLine) {
        this(keySignature, chordsAndRestsInMeasure, endingBarLine);
        this.beginningBarLine = beginningBarLine;
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
     * Sets the endingBarLine to 
     * 
     * @param newEndingBarLine
     */
    void setEndingBarLine(String newEndingBarLine) {
    	endingBarLine = newEndingBarLine;
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
        
        // First, we need to figure out the index of the chords from listOfSoundUnits
        List<Integer> chordIndexes = new ArrayList<Integer>();
        for (int i = 0; i < listOfSoundUnits.size(); i++) {
            if (listOfSoundUnits.get(i) instanceof Chord) {
                chordIndexes.add(i);
            }
        }

        // Then, we need to make sure that they are ordered.
        Collections.sort(chordIndexes);

        // After that, we need to iterate over both lists together, assigning Strings if needed, and
        // popping them if it is the case.
        List<String> stringsToBeInserted = new ArrayList<String>(originalListOfStrings);

        for (int i = 0; i < Math.min(stringsToBeInserted.size(), chordIndexes.size()); i++) {
            // 'i' will iterate until the shortest list ends

            // this will happen when we meet the barline!
            if (stringsToBeInserted.get(i).equals("|")) {
                // 1) get rid of that bar!
                stringsToBeInserted.remove(i);

                // 2) we need to fill the rest of the Chords in the measure with the ""
                for (int j = i; j < chordIndexes.size(); j++) {
                    ((Chord) listOfSoundUnits.get(chordIndexes.get(j))).setSyllable("");
                }
                return stringsToBeInserted;
            }
            
            // This is the case where we remove the bar. It needs to be the last one to be treated.
            // Only happens when we are at the last chord position and the next position is
            // accessible on strings, and that position has a bar. If so, we need to remove that bar
            // and return.
            if(i == chordIndexes.size() - 1){
                if((i+1) < stringsToBeInserted.size() && stringsToBeInserted.get(i+1).equals("|")){
                    stringsToBeInserted.remove(i+1);
                }
            }            
        }
        return stringsToBeInserted;
    }

}
