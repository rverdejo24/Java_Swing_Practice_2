package flowlayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("FlowLayout Demo");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.LIGHT_GRAY);

        for (int i = 1; i <= 5; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
