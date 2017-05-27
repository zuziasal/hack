package GUI;

import GUI.components.panels.LoginPanel;

import javax.swing.*;


public class MainFrame extends JFrame {
    public MainFrame() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
        LoginPanel loginPanel = new LoginPanel(350, 450, 10, 10);
        this.add(loginPanel);
    }
}
