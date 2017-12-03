/**
 * Author: QAlexBall
 * Date: 2017/9/20
 * Content: using JFrame click the button then show something else.
 *          get the ActionEvent of button.
 */
package unit12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String [] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();

        /*
        MyDrawPanel mydrawpanel = new MyDrawPanel();

        mydrawpanel.setVisible(true);
        */

        button = new JButton("click");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("i've been clicked");
    }
}
