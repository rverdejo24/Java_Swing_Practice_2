package borderlayout;

import javax.swing.*;

public class BorderLayoutDemo {
    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.show();
            }
        });
    }
}
