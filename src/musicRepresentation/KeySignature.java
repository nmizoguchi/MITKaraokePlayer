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
     * keyName defines the mapping of pitchMap. Considered
     * valid key signatures are the ones in the circle of
     * fifths (also enharmonics).
     * @param keyName a valid key signature for the music.
     */
    public KeySignature(String keyName) {
        this.keyName = keyName;
        pitchMap = new HashMap<Pitch,Pitch>();
        int numSupportedOctaves = 5;
        
        Pitch accidentalPitch;

        /***************************
         * For Sharp accidentals
         ***************************/
        // C Major / A minor -> There is no need to change the mapping for these keys
        if( keyName.equals("C") || keyName.equals("Am")) {
            return;
        }
        
        // ** G Major / E minor -> F#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('F');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("G") || keyName.equals("Em")) {
            return;
        }

        // ** D Major / B minor -> F#, C#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('C');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("D") || keyName.equals("Bm")) {
            return;
        }
        
        // ** A Major / F# minor -> F#, C#, G#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('G');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("A") || keyName.equals("F#m")) {
            return;
        }
        
        // ** E Major / C# minor -> F#, C#, G#, D#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('D');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("E") || keyName.equals("C#m")) {
            return;
        }
        
        
        // ** B Major / G# minor -> F#, C#, G#, D#, A#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('A');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("B") || keyName.equals("G#m")) {
             return;
        }
        
        
        //** F# Major / D# minor -> F#, C#, G#, D#, A#, E#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('E');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("F#") || keyName.equals("D#m")) {
            return;
        }
        
        
        //** C# Major / A# minor -> F#, C#, G#, D#, A#, E#, B#
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('B');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(1));
        }
        if( keyName.equals("C#") || keyName.equals("A#m")) {
            return;
        }
        
        /***************************
         * For Flat accidentals
         ***************************/
        pitchMap = new HashMap<Pitch,Pitch>();
 
        // F Major / D minor -> Bb
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('B');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        
        
        // Bb Major / G minor -> Bb, Eb
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('E');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        
        
        // Eb Major / C minor -> Bb, Eb, Ab
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('A');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        
        
        // Ab Major / F minor -> Bb, Eb, Ab, Db
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('D');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        
        
        // Db Major / Bb minor -> Bb, Eb, Ab, Db, Gb
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('G');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        

        // Gb Major / Eb minor -> Bb, Eb, Ab, Db, Gb, Cb
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('C');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        
        
        // Cb Major / Ab minor -> Bb, Eb, Ab, Db, Gb, Cb, Fb
        // Create next accidental to be put in the map
        accidentalPitch = new Pitch('F');
        // Map the octaves, up to 5 octaves up and down
        for(int i = -numSupportedOctaves; i < numSupportedOctaves; i++){
            pitchMap.put(accidentalPitch.octaveTranspose(i),
                        accidentalPitch.octaveTranspose(i).accidentalTranspose(-1));
        }
        if( keyName.equals("F") || keyName.equals("D")) {
            return;
        }
        // More enharmonics? http://hymns.reactor-core.org/keysignatures.html
    }
    
    /**
     * Gives a Map that matches each pitch correctly to its shift, that is
     * represented by an integer. It represents up to 5 octaves for each key.
     * @return Copy of pitchMap
     */
    public Map<Pitch,Pitch> getPitchMap() {
        Map<Pitch,Pitch> newMap = new HashMap<Pitch,Pitch>();
        newMap.putAll(this.pitchMap);
        return newMap;
    }
}