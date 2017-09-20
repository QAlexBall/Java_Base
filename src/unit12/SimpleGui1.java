package unit12;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String [] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(100, 100);

        frame.setVisible(true);
    }
}
