package musicRepresentation;

import java.util.HashMap;
import java.util.Map;

import sound.Pitch;

/**
 * Represents accidentals as a Map in a key signature.
 * It is an immutable class.
 * @author Nicholas M. Mizoguchi
 *
 */
public class KeySignature {
    private final String keyName;
    private Map<Pitch,Pitch> pitchMap;
    
    /**
     * Creates a new KeySignature object with the keyName.
     * keyName defines the mapping of pitchMap.
     * @param keyName
     */
    public KeySignature(String keyName) {
        this.keyName = keyName;
        this.pitchMap = new HashMap<Pitch,Pitch>();
        // Depending on keyName, define the mapping of pitchMap
        
//      C Major / A minor
//        if( keyName.equals("C") || keyName.equals("Am")) {
//            
//        }
        // G Major / E minor -> F#
        if( keyName.equals("G") || keyName.equals("Em")) {
            
        }
        
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

        // More enharmonics? http://hymns.reactor-core.org/keysignatures.html
    }
    
    /**
     * Gives a Map that matches each pitch correctly to its shift, that is
     * represented by an integer. It represents up to 5 octaves for each key.
     * @return
     */
    public Map<Pitch,Pitch> getPitchMap() {
        Map<Pitch,Pitch> newMap = new HashMap<Pitch,Pitch>();
        return newMap;
    }
}