package player;

import java.io.IOException;

import sound.ABCMusic;

/**
 * Main entry point of your application.
 */
public class Main {
    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        ABCMusic music;
        try{
            music = new ABCMusic(file);
        } catch(IOException e){
            System.out.println("File not found!");
        }
        
//        SequencePlayer player = new SequencePlayer(music.getBeatsPerMinute(),
//                                                   music.getTicksPerBeat,
//                                                   listener);
    }

    public static void main(String[] args) {
        try{
            play("sample_abc/sample3.abc");
        }
    
        catch(RuntimeException e) {
            System.out.println("Invalid file.");
            System.out.println(e.toString());
        }
    }
}
