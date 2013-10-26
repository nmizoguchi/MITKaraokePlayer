package musicRepresentation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import sound.Pitch;

public class KeySignatureTest {

    @Test
    public void testGetPitchMap() {
        
        Map<Pitch,Pitch> map;
        KeySignature key = new KeySignature("C");
        map = new HashMap<Pitch,Pitch>();
        
        // C Major / A minor
        // G Major / E minor -> F#
        // D Major / B minor -> F#, C#
        // A Major / F# minor -> F#, C#, G#
        // E Major / C# minor -> F#, C#, G#, D#
        // B Major / G# minor -> F#, C#, G#, D#, A#
        // F# Major / D# minor -> F#, C#, G#, D#, A#, E#
        // C# Major / A# minor -> F#, C#, G#, D#, A#, E#, B#
        // F Major / D minor -> Bb
        // Bb Major / G minor -> Bb, Eb
        // Eb Major / C minor -> Bb, Eb, Ab
        // Ab Major / F minor -> Bb, Eb, Ab, Db
        // Db Major / Bb minor -> Bb, Eb, Ab, Db, Gb
        // Gb Major / Eb minor -> Bb, Eb, Ab, Db, Gb, Cb
        // Cb Major / Ab minor -> Bb, Eb, Ab, Db, Gb, Cb, Fb
    }
}
