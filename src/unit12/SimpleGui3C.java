/**
 * @Author: QAlexBAll
 * @Date: 2017/9/23
 * @Content: this program is change color.
 */
package unit12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C extends JFrame implements ActionListener {


    public static void main(String [] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {

        JButton button = new JButton("change color");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        this.add(drawPanel);

        this.getContentPane().add(BorderLayout.SOUTH, button);
        //frame.getContentPane().add(BorderLayout.CENTER, button);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
}
