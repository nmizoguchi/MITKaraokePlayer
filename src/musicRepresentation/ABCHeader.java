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
    
    public ABCHeader(int beatsPerMinute, int ticksPerBeat, double whatNoteGetsTheBeat,
                        double defaultNoteLength, String keySignature) {
        this.beatsPerMinute = beatsPerMinute;
        this.ticksPerBeat = ticksPerBeat;
        this.whatNoteGetsTheBeat = whatNoteGetsTheBeat;
        this.defaultNoteLength = defaultNoteLength;
        this.keySignature = new KeySignature(keySignature);
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

}
