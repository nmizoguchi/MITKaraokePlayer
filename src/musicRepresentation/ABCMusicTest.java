package musicRepresentation;

import java.io.IOException;

import org.junit.Test;

public class ABCMusicTest {

    @Test
    public void testConstructSequencerInformation_BPMTransformation() throws IOException {
        ABCMusic music = new ABCMusic("sample_abc/fur_elise.abc");
    }
}
