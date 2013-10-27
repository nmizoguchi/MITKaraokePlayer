package musicRepresentation;

import java.util.List;

public class Voice {
    String voiceName;
    private List<Measure> listOfMeasures;

    /**
     * @param voiceName
     *            String representing the name (label) of the voice
     * @param listOfMeasures
     *            List containing measures that will belong to this voice (can be empty).
     */
    Voice(String voiceName, List<Measure> listOfMeasures) {
        this.voiceName = voiceName;
    }

    /**
     * Gets the list of Measures from the Voice
     * 
     * @return a reference to the list of Measures
     */
    List<Measure> getListOfMeasures() {
        return listOfMeasures;
    }

    /**
     * @return the Voice Object with its listOfMeasures corrected such that repeats are handled
     *         correctly
     */
    Voice fixRepeats() {
        // TODO: correct the listOfMeasures by handling the repeats!!
        return this;
    }
}
