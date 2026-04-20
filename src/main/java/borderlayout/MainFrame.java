package borderlayout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("BorderPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        BorderLayout borderlayout = new BorderLayout();
        borderlayout.setHgap(10);
        borderlayout.setVgap(10);
        frame.setLayout(borderlayout);
//        frame.setLayout(new BorderLayout(10, 10));

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }
}
