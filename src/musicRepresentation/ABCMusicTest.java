package musicRepresentation;

import java.io.IOException;

import org.junit.Test;

/**
 * Test suite for the ABCMusic class.
 * 
 * Here, we will test if the ABCMusic class is correctly handling well-formed abc files, as well as
 * detecting semantic errors in malformed abc files. More specific tests (such as the checking the
 * correctness of the parser) are being handled on the ABCMusicParseListenerTest class. Lyrics tests
 * are being handled at the ABCMusicParseListenerTest classes and also at the the MeasureTest .
 * 
 * 
 * Test strategy:
 * 
 * .Malformed files
 *  - Missing required header fields
 *  - Wrong header info given 
 *  - Invalid notes as inputs 
 *  - Malformed repetition (without corresponding barlines) 
 *  - Voice and lyrics on non-standard positions
 * 
 * .Well-formed files 
 *  - Accepts optional header fields 
 *  - Accepts multiple voices 
 *  - Accepts repeats
 * 
 * 
 * @author Victor and Nicholas
 * 
 */
public class ABCMusicTest {

    @Test
    public void testConstructSequencerInformation_BPMTransformation() throws IOException {
        ABCMusic music = new ABCMusic("sample_abc/fur_elise.abc");
    }
}
