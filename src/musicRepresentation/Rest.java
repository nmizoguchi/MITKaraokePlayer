package musicRepresentation;

/**
 * The Rest class implements SoundUnit along with the Chord class. A Rest
 * indicates a period of silence in a voice.
 * 
 * @author Eric
 * 
 */
public class Rest implements SoundUnit{
	double durationMultiplier;
	
	/**
	 * The first constructor of the Rest class. durationMultiplier defaults to
	 * 1.
	 */
	public Rest() {
		this.durationMultiplier = 1;
	}
	
	/**
	 * The second constructor of the Rest class.
	 * 
	 * @param durationMultiplier
	 *            the durationMultiplier the Rest should have
	 */
	public Rest(double durationMultiplier) {
		this.durationMultiplier = durationMultiplier;
	}
	
	/* (non-Javadoc)
	 * @see musicRepresentation.SoundUnit#getDurationMultiplier()
	 */
	@Override
	public double getDurationMultiplier() {
		return durationMultiplier;
	}
}
