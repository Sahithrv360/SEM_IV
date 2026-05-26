
import java.awt.*;
import javax.swing.*;

public class DemoFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton p = new JButton(new ImageIcon(""));
        f.setBackground(Color.RED);
        p.setSize(200, 100);
        
        f.add(p);
        f.setTitle("Demo Frame");
        f.setSize(400, 400);
        p.setBackground(Color.yellow);
        f.show();
        f.setVisible(true);
    }
}