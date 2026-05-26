
import java.awt.BorderLayout;
import java.awt.Button;

public class Lay extends Frame{
    public static void main(String[] args) {
        Lay l = new Lay();
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        l.add(b3);
        l.add(b2);
        l.add(b1);
        l.add(b4);
        l.add(b5);
        // l.setLayout(new FlowLayout());
        // l.setLayout(new CardLayout());
        l.setLayout(new BorderLayout());
        l.setSize(300, 200);
        l.setVisible(true);
    }
}