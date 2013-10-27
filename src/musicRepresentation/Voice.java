package musicRepresentation;

import java.util.List;

import sound.Pitch;

/**
 * The Voice class represents a Voice in an abc music file. Voice is composed of
 * List<Measure> and is identified with by a voiceName. A Voice is in charge of
 * handling the repeats that occur within its measures.
 * 
 * @author Eric
 * 
 */
public class Voice {
    String voiceName;
    private List<Measure> listOfMeasures;

	/**
	 * @param voiceName
	 *            String representing the name (label) of the voice. Can be
	 *            empty.
	 * @param listOfMeasures
	 *            List containing measures that will belong to this voice (can
	 *            be empty).
	 */
    Voice(String voiceName, List<Measure> listOfMeasures) {
        this.voiceName = voiceName;
        this.listOfMeasures = listOfMeasures;
    }

	/**
	 * Gets the list of Measures from the Voice
	 * 
	 * @return a reference to the list of Measures
	 */
    List<Measure> getListOfMeasures() {
        return listOfMeasures;
    }
    
    String getVoiceName() {
    	return voiceName;
    }
    
	/**
	 * Extends this voice with thatVoice by concatenating this.listOfMeasures
	 * and thatVoice.listOfMeasures
	 * 
	 * @param thatVoice
	 *            the voice that we want to extend this voice Object with
	 */
    void extend(Voice thatVoice) {
    	this.listOfMeasures.addAll(thatVoice.getListOfMeasures());
    }
    
	/**
	 * @return the Voice Object with its listOfMeasures corrected such that
	 *         repeats are handled correctly
	 */
    Voice fixRepeats() {
        // TODO: correct the listOfMeasures by handling the repeats!!
        return this;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Voice that = (Voice) obj;
        return this.voiceName == that.voiceName
        		&& this.getListOfMeasures().equals(that.getListOfMeasures());
    }
}
