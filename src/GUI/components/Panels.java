package GUI.components;

import javax.swing.*;

/**
 * Created by oogway on 27.05.17.
 */
public class Panels extends JPanel {

    public Panels() {
    }

    ;

    public Panels(int width, int height, int x, int y) {
        this.setSize(width, height);
        this.setLocation(x, y);
        this.setLayout(null);
        this.setVisible(true);
        this.repaint();
    }
}
