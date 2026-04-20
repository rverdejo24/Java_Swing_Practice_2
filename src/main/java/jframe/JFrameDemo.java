package jframe;

import javax.swing.*;

public class JFrameDemo {
    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameOne frame1 = new JFrameOne(); // Can access many methods from JFrame
                JFrameTwo frame2 = new JFrameTwo(); // Can only access methods from JFrameTwo class
            }
        });
    }
}
