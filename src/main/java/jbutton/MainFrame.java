package jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MainFrame() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        button = createButton();
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false);
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/printer.png")));

        Image scaled = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        icon = new ImageIcon(scaled);
        button.setIcon(icon);
        button.setIconTextGap(10);

        button.setToolTipText("Some awesome text for the print button");

        button.setFont(new Font("Arial", Font.PLAIN, 16));

        button.setMargin(new Insets(10, 10, 10, 10)); // add spaces around the text similar to css padding in html

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Print button has been clicked");
            }
        });

        button.setVerticalTextPosition(SwingConstants.CENTER); // set the text at the center of the button
        button.setHorizontalTextPosition(SwingConstants.LEFT); // set the text at the Left of the button horizontally

        button.setPreferredSize(new Dimension(200, 75));

        button.setMnemonic(KeyEvent.VK_P); // add a shortcut key to the button

        return button;
    }

    public void show() {
        frame.setVisible(true);
    }
}
