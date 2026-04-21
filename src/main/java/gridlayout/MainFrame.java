package gridlayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(4, 0, 10, 10));

        for (int i = 1; i <=20; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
