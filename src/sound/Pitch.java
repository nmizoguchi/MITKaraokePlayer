package sound;

/**
 * Pitch represents the frequency of a musical note.
 * Standard music notation represents pitches by letters: A, B, C, ..., G.
 * Pitches can be sharp or flat, or whole octaves up or down from these
 * primitive generators.
 *
 * For example:
 *   new Pitch('C') makes middle C.
 *   new Pitch('C').transpose(1) makes C-sharp.
 *   new Pitch('F').transpose(-2) makes E-flat.
 *   new Pitch('C').transpose(OCTAVE) makes high C.
 *   new Pitch('C').transpose(-OCTAVE) makes low C.
 */
public class Pitch {
	private final int value;
    private final int accidental;
    private final int octave;
    private final boolean hasAccidental;

    /*
     * Rep invariant:
     *   value in {0, 2, 4, 5, 7, 9, 11}
     *
     * Abstraction function AF(value, accidental, octave):
     *   AF(scale[C], 0, 0), AF(scale[D], 0, 0), ..., AF(scale[B], 0, 0)
     *     map to middle C, D, E, F, G, A, B respectively
     *   AF(x, y, 0) maps to y sharps applied to A(x, 0, 0)
     *   AF(x, -y, 0) maps to y flats applied to A(x, 0, 0)
     *   AF(x, y, n) maps to n octaves above middle AF(x, y, 0)
     *   AF(x, y, -n) maps to n octaves below AF(x, y, 0)
     */

    private static final int[] scale = {
        9,  // A
        11, // B
        0,  // C
        2,  // D
        4,  // E
        5,  // F
        7   // G
    };

    // NOTE: This visibility of this constructor was changed from private to public by Eric.
    public Pitch(int value, int accidental, int octave, boolean hasAccidental) {
        this.value = value;
        this.accidental = accidental;
        this.octave = octave;
        this.hasAccidental = hasAccidental;
        checkRep();
    }

    /**
     * Make a Pitch.
     * @param c a note in {'A',...,'G'}
     * @return Pitch named c in the middle octave of the piano keyboard.
     * For example, new Pitch('C') constructs middle C.
     */
    public Pitch(char c) {
        int index = c - 'A';
        if (index < 0 || index >= scale.length)
            throw new IllegalArgumentException(c + " must be in the range A-G");

        this.value = scale[index];
        this.accidental = 0;
        this.octave = 0;
        this.hasAccidental = false;
        checkRep();
    }
    
    /**
     * Make a Pitch, but receiving more parameters. 
     * @param c a note in {'A',...,'G'}
     * @param accidental
     * @param octave
     * @param hasAccidental
     * @return Pitch named c in the middle octave of the piano keyboard.
     */
    public Pitch(char c, int accidental, int octave, boolean hasAccidental) {
        int index = c - 'A';
        if (index < 0 || index >= scale.length)
            throw new IllegalArgumentException(c + " must be in the range A-G");

        this.value = scale[index];
        this.accidental = accidental;
        this.octave = octave;
        this.hasAccidental = hasAccidental;
        checkRep();
    }

    /**
     * Number of pitches in an octave.
     */
    public static final int OCTAVE = 12;

    /**
     * Transposes the accidental of the Pitch and turns hasAccidental to true.
     * @return pitch made by adding semitonesUp sharps to this pitch,
     * if the argument is positive, or -semitonesUp flats, if the
     * argument is negative.  For example, E transposed by -1
     * semitone is E flat; E transposed by 1 semitone is E sharp.
     */
    public Pitch accidentalTranspose(int semitonesUp) {
        return new Pitch(value, accidental + semitonesUp, octave, this.hasAccidental);
    }

    /**
     * @return pitch made by transposing this pitch by octavesUp
     * octaves up.  For example, transposing E up by 1 octave produces
     * E' ; transposing E down by 1 octave produces E, .
     */
    public Pitch octaveTranspose(int octavesUp) {
        return new Pitch(value, accidental, octave + octavesUp, false);
    }

    /**
     * @return pitch made by transposing this pitch up by semitonesUp
     * semitones, as if on a minor scale starting at this pitch. For
     * example, transposing E up by 3 semitones will produce G;
     * transposing F up by 5 semitones will produce B flat.
     */
    public Pitch transpose(int semitonesUp) {
        int newValue = value + semitonesUp;
        int newOctave = octave;
        int newAccidental = accidental;
        boolean newHasAccidental = hasAccidental;

        while (newValue >= OCTAVE) {
            newValue -= OCTAVE;
            newOctave++;
        }

        while (newValue < 0) {
            newValue += OCTAVE;
            newOctave--;
        }

        if (!isValid(newValue)) {
            int interval = semitonesUp % OCTAVE;
            if (interval == 3
                    || interval == 5
                    || interval == 8
                    || interval == 10) {
                newValue++;
                newAccidental--;
            } else {
                newValue--;
                newAccidental++;
            }
        }

        return new Pitch(newValue, newAccidental, newOctave, newHasAccidental);
    }

    /**
     * @return number of semitones between this and that; i.e., n such
     * that that.transpose(n).toMidiNote() == this.toMidiNote().
     */
    public int difference(Pitch that) {
        return this.toMidiNote() - that.toMidiNote();
    }

    /**
     *
     * @return the midi note of this pitch
     */
    public int toMidiNote() {
        return this.value + this.accidental + (OCTAVE * this.octave) + 60;
    }


    /**
     * @return true iff this pitch is lower than that pitch
     */
    public boolean lessThan(Pitch that) {
        return this.difference(that) < 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Pitch that = (Pitch) obj;
        return this.value == that.value
            && this.accidental == that.accidental
            && this.octave == that.octave
            && this.hasAccidental == that.hasAccidental;
    }

    @Override
    public int hashCode() {
    	if (hasAccidental) {
    		return -1*(value + accidental);
    	}
    	else {
    		return value + accidental;
    	}
    }

    /**
     * @return this pitch in abc music notation
     *   (see http://www.walshaw.plus.com/abc/examples/)
     */
    @Override
    public String toString() {
        String suffix = "";
        String prefix = "";
        int oct = octave;
        int acc = accidental;
        int v = value;

        while (oct < 0) {
            suffix += ",";
            oct++;
        }

        while (oct > 1) {
            suffix += "'";
            oct--;
        }

        while (acc < 0) {
            prefix += "_";
            acc++;
        }

        while (acc > 0) {
            prefix += "^";
            acc--;
        }
        
        if (hasAccidental && accidental == 0) {
        	prefix += "=";
        }

        String name = valToString[v];
        if (oct == 1) name = name.toLowerCase();

        return prefix + name + suffix;
    }

    private void checkRep() {
        assert isValid(value) : "value should be valid";
    }

    private static final String[] valToString = {
        "C", null, "D", null, "E", "F", null, "G", null, "A", null, "B"
    };

    private static final boolean isValid(int value) {
        return value == 0 || value == 2 || value == 4 || value == 5
            || value == 7 || value == 9 || value == 11;
    }
    
    public int getValue() {
		return value;
	}

	public int getAccidental() {
		return accidental;
	}

	public int getOctave() {
		return octave;
	}

	public boolean isHasAccidental() {
		return hasAccidental;
	}
}
