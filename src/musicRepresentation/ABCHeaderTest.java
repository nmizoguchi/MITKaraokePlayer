package musicRepresentation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABCHeaderTest {
    /*
     * Tests ABCHeader methods, and also checks for the ABCHeader invariant
     * 
     */
    @Test
    public void testGetBeatsPerMinute_immutability() {
        ABCHeader header = new ABCHeader(200,12,0.5,0.25,"G");
        int beatsPerMinuteOld = header.getBeatsPerMinute();
        int beatsPerMinuteModified = header.getBeatsPerMinute();
        
        beatsPerMinuteModified = 1000;
        
        assertEquals(header.getBeatsPerMinute(),beatsPerMinuteOld);
    }

}
