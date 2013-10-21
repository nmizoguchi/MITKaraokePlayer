package sound;

public class Note {
    private Pitch pitch;
    private int duration;
    private int startTick;
    
    public Note(Pitch pitch, int duration, int startTick) {
        // COPY PITCH!
        this.pitch = pitch;
        this.duration = duration;
        this.startTick = startTick;
    }
    
    public int getMidiNote() {
        // NOT IMPLEMENTED!
        return 0;
    }
    
    public int getDuration() {
        return duration;
    }
    public int getStartTick() {
        return startTick;
    }
    
}
