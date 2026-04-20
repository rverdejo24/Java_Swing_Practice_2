package jpanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("JPanelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,5));
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        panel.setBackground(Color.CYAN);

        Button button = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.setPreferredSize(new Dimension(250, 100));

        frame.add(panel, BorderLayout.WEST);

        frame.setVisible(true);
    }
}
