/**
 * @Author: QAlexBall
 * @Date: 2017/923
 * @Content: this Jpanel class is for SimpleGui3C change color.
 */
package unit12;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {


    public void paintComponent(Graphics g) {

       // super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);


        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(100, 70, 80, 80);
//
//        g.setColor(Color.orange);
//
//        g.fillRect(20, 50, 100, 100);
    }
}

