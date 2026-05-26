import java.awt.*;
import java.awt.event.*;

public class DemoCheck {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Demo Frame");
        f.setSize(300, 300);
        f.setLayout(null);

        // Black background panel
        Panel p = new Panel();
        p.setBackground(Color.black);
        p.setBounds(0, 0, 300, 300);
        p.setLayout(null);

        // Checkbox with white text
        Checkbox c = new Checkbox("Java", true);
        c.setForeground(Color.WHITE);   // make text visible
        c.setBackground(Color.BLACK);   // match background for clean look
        c.setBounds(120, 120, 100, 40);

        p.add(c);
        f.add(p);

        // Proper window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }
}
