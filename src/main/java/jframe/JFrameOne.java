package jframe;

import javax.swing.*;

// Creating JFrame via inheritance
public class JFrameOne extends JFrame {
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrameOne");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
        setLocationRelativeTo(null); // Centers JFrame on the screen
        setResizable(false);
    }
}
