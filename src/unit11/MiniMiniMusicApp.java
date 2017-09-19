/**
 *Author: QAlexBall
 *Date: 2017/9/19
 *Content: create a miniminiMusicapp
 */
package unit11;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String [] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }// close main

    private void play() {
        try {

            /**
             * step 1
             * get sequencer and turn it on
             */
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            /**
             * step 2
             */
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            /**
             * step 3
             * request to track
             */
            Track track = seq.createTrack();

            /**
             * step 4
             * add some MidiEvent to Track
             */
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
