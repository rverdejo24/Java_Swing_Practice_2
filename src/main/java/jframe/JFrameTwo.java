package jframe;

import javax.swing.*;

// Creating JFrame via composition
public class JFrameTwo {
    private JFrame frame;

    public JFrameTwo() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null); // Centers JFrame on the screen
        this.frame.setResizable(false);
    }
}
