package musicRepresentation;

import static org.junit.Assert.*;

import org.junit.Test;

import sound.Pitch;

public class MidiNoteRepresentationTest {

    @Test
    public void test_getMethods() {
        int numTicks = 10000;
        int startTick = 0;
        Pitch pitch = new Pitch('A');
    
        MidiNoteRepresentation midiNote =
                new MidiNoteRepresentation(pitch, startTick, numTicks);
        
        assertEquals(numTicks,midiNote.getNumTicks());
        assertEquals(startTick,midiNote.getStartTick());
        assertEquals(true,pitch.equals(midiNote.getPitch()));

        numTicks = 0;
        startTick = 10000;
        pitch = new Pitch('A').octaveTranspose(3).accidentalTranspose(4);
        
        midiNote = new MidiNoteRepresentation(pitch, startTick, numTicks);
        
        assertEquals(numTicks,midiNote.getNumTicks());
        assertEquals(startTick,midiNote.getStartTick());
        assertEquals(true,pitch.equals(midiNote.getPitch()));        
    }

}
