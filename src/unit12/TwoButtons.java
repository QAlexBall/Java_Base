package unit12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    JFrame frame;
    JLabel label;

    public static void main(String [] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }// close main;

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("CHGLable");
        labelButton.addActionListener(new JLabelListener());

        JButton colorButton = new JButton("CHGCircle");
        colorButton.addActionListener((new ColorListener()));

        label = new JLabel("iamalabel");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }// close function go;

    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }// close inner class ColorListener;

    private class JLabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch");
        }
    }// close inner class JLabelListener;
}
