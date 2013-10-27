package musicRepresentation;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import sound.Pitch;

public class KeySignatureTest {

    @Test
    public void testGetPitchMap_SharpKeySignatures() {
        /* The strategy for this test batch is to build a map
         * using Pitches that are affected by a key signature.
         * Since tests are ordered by number of sharps, and the
         * sharps are the same for the next key signature, in
         * addition to another accidental, we reuse the hash
         * to test all key signatures involving sharps
         */
        
        Map<Pitch,Pitch> map = new HashMap<Pitch,Pitch>();
        KeySignature key;
        
        // C Major / A minor
        key = new KeySignature("C");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // G Major / E minor -> F#
        map.put( new Pitch('F'), new Pitch('F').accidentalTranspose(1));
        key = new KeySignature("G");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Em");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        
        // D Major / B minor -> F#, C#
        map.put( new Pitch('C'), new Pitch('C').accidentalTranspose(1));
        key = new KeySignature("D");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Bm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // A Major / F# minor -> F#, C#, G#
        map.put( new Pitch('G'), new Pitch('G').accidentalTranspose(1));
        key = new KeySignature("A");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("F#m");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // E Major / C# minor -> F#, C#, G#, D#
        map.put( new Pitch('D'), new Pitch('D').accidentalTranspose(1));
        key = new KeySignature("E");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("C#m");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // B Major / G# minor -> F#, C#, G#, D#, A#
        map.put( new Pitch('A'), new Pitch('A').accidentalTranspose(1));
        key = new KeySignature("B");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("G#m");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // F# Major / D# minor -> F#, C#, G#, D#, A#, E#
        map.put( new Pitch('E'), new Pitch('E').accidentalTranspose(1));
        key = new KeySignature("F#");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("D#m");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // C# Major / A# minor -> F#, C#, G#, D#, A#, E#, B#
        map.put( new Pitch('B'), new Pitch('B').accidentalTranspose(1));
        key = new KeySignature("C#");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("A#m");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
    }
    
    @Test
    public void testGetPitchMap_FlatKeySignatures() {
        /* The strategy for this test batch is to build a map
         * using Pitches that are affected by a key signature.
         * Since tests are ordered by number of flats, and the
         * sharps are the same for the next key signature, in
         * addition to another accidental, we reuse the hash
         * to test all key signatures involving flats.
         */

        Map<Pitch,Pitch> map = new HashMap<Pitch,Pitch>();
        KeySignature key;

        // F Major / D minor -> Bb
        map.put( new Pitch('B'), new Pitch('B').accidentalTranspose(-1));
        key = new KeySignature("F");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Dm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Bb Major / G minor -> Bb, Eb
        map.put( new Pitch('E'), new Pitch('E').accidentalTranspose(-1));
        key = new KeySignature("Bb");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Gm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Eb Major / C minor -> Bb, Eb, Ab
        map.put( new Pitch('A'), new Pitch('A').accidentalTranspose(-1));
        key = new KeySignature("Eb");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Cm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Ab Major / F minor -> Bb, Eb, Ab, Db
        map.put( new Pitch('D'), new Pitch('D').accidentalTranspose(-1));
        key = new KeySignature("Ab");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Fm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Db Major / Bb minor -> Bb, Eb, Ab, Db, Gb
        map.put( new Pitch('G'), new Pitch('G').accidentalTranspose(-1));
        key = new KeySignature("Db");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Bbm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Gb Major / Eb minor -> Bb, Eb, Ab, Db, Gb, Cb
        map.put( new Pitch('C'), new Pitch('C').accidentalTranspose(-1));
        key = new KeySignature("Gb");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Ebm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);

        // Cb Major / Ab minor -> Bb, Eb, Ab, Db, Gb, Cb, Fb
        map.put( new Pitch('F'), new Pitch('F').accidentalTranspose(-1));
        key = new KeySignature("Cb");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
        key = new KeySignature("Abm");
        assertEquals( key.getPitchMap().entrySet().containsAll(map.entrySet()), true);
    }
    
    @Test
    public void testGetPitchMap_immutability() {
        KeySignature key = new KeySignature("G");
        Map<Pitch, Pitch> map = key.getPitchMap();
        
        // Checks equality for copies
        assertEquals(map.equals(key.getPitchMap()), true);
        
        // Change map
        map.put(new Pitch('B').octaveTranspose(20), new Pitch('C'));
        
        // Verify if they are different maps
        assertEquals(map.equals(key.getPitchMap()), false);
    }
}
