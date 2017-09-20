package unit12;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void PaintComponent(Graphics g) {

        g.setColor(Color.orange);

        g.fillRect(20, 50, 100, 100);
    }
}

