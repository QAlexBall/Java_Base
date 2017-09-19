/**
 * Author: QAlexBall
 * Date: 2017/9/19
 * Content: MiniMusicCmdLine
 */
package unit11;
import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String [] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }// close main

    private void play(int instrument, int note) {

        try {
            /**
             * get Sequencer and turn it on
             * create new Sequence
             * create new Track from Sequence
             */
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            /**
             * create three ShortMessage first, a and b
             * create three MidiEvent changeInstrument, noteOn and notOff
             * three content for create Messge setMessage create MidiEvent and add MidiEvent to Track
             */
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note ,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    } // close play
}
