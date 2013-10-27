package musicRepresentation;

/**
 * 
 * @author Nicholas M. Mizoguchi
 *
 */
public class ABCHeader {
    private String title;
    private String composer;
    private int beatsPerMinute;
    private int ticksPerBeat;
    private double whatNoteGetsTheBeat;
    private double defaultNoteLength;
    private KeySignature keySignature;
    
    public ABCHeader(String title, String composer,int beatsPerMinute,
                        int ticksPerBeat, double whatNoteGetsTheBeat,
                        double defaultNoteLength, String key) {
        this.title = title;
        this.composer = composer;
        this.beatsPerMinute = beatsPerMinute;
        this.ticksPerBeat = ticksPerBeat;
        this.whatNoteGetsTheBeat = whatNoteGetsTheBeat;
        this.defaultNoteLength = defaultNoteLength;
        this.keySignature = new KeySignature(key);
    }
    
    /**
     * Gives the information of how many beats per minute of
     * the music that Header represents.
     * @return beatsPerMinute which is always an integer.
     */
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }
    
    /**
     * Gives the information of how many ticks per beat of
     * the music that Header represents.
     * @return beatsPerMinute which is always an integer.
     */
    public int getTicksPerBeat() {
        return ticksPerBeat;
    }

    /**
     * Gives the Title of the piece of music ABCHeader represents
     * @return the title String itself.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gives the Composer of the piece of music ABCHeader represents
     * @return the composer String itself.
     */
    public String getComposer() {
        return composer;
    }
    
    /**
     * Gives the fraction that represents what note gets the time of a beat.
     * For instance, a quarter note is represented by 0.25
     * @return a double that represents the fraction.
     */
    public double getWhatNoteGetsTheBeat() {
        return whatNoteGetsTheBeat;
    }

    /**
     * Gives the default note length of the piece. It is represented as a double.
     * For instance, a quarter note is represented by 0.25
     * @return a double that represents the default note length.
     */
    public double getDefaultNoteLength() {
        return defaultNoteLength;
    }

    /**
     * Gives an object that represents the key signature.
     * @return KeySignature object that represents the signature of the piece.
     */
    public KeySignature getKeySignature() {
        // KeySignature is immutable. OK to give the pointer.
        return keySignature;
    }

}