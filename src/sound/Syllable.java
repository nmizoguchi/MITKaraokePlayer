package sound;

public class Syllable {
    private int startTick;
    private String syllable;
    
    public Syllable(String syllable, int startTick) {
        this.startTick = startTick;
        this.syllable = syllable;
    }
    
    public int getStartTick() {
        return this.startTick;
    }
    
    public String getSyllable() {
        return this.syllable;
    }
}
