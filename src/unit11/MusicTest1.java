/*
Author: QAlexBall
Date: 2017/9/19
Content: throw Exception and use duck ducking function and main;
 */

package unit11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

import static java.lang.System.out;

public class MusicTest1 {
    public void play () {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
        out.println("successfully got sequencer.");
    }// close play

    public static void main(String [] args) {

        MusicTest1 mt = new MusicTest1();
        mt.play();
        /*

        try {
            mt.play();
        } catch (MidiUnavailableException e) {
            out.println("Aaargh!");
            e.printStackTrace();
        }
        */
    }// close main
}
