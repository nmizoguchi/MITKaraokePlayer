package player;

import java.io.IOException;

import sound.ABCMusic;

/**
 * Main entry point of your application.
 */
public class Main {
    /**
     * Plays the input file using Java MIDI API and displays header information to the standard
     * output stream.
     * 
     * (Your code should not exit the application abnormally using System.exit().)
     * 
     * @param file
     *            the name of input abc file
     */
    public static void play(String file) {
        ABCMusic music;
        try {
            music = new ABCMusic(file);
        } catch (IOException e) {
            System.out.println("File "+ file +" not found!");
        }

        // SequencePlayer player = new SequencePlayer(music.getBeatsPerMinute(),
        // music.getTicksPerBeat,
        // listener);
    }

    public static void main(String[] args) {
        String[] files = { "abc_song.abc", "fur_elise.abc", "invention.abc",
                "little_night_music.abc",

                "paddy.abc", "prelude.abc", "sample1.abc", "sample2.abc", "sample3.abc",

                "scale.abc", "waxies_dargle.abc" };

        for (int i = 0; i < files.length; i++) {
            try {
                play("sample_abc/" + files[i]);
            }

            catch (RuntimeException e) {
                System.out.println("Invalid file: " + files[i]);
                System.out.println(e.toString());
            }
        }
    }
}