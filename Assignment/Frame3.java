import javax.swing.*;
public class Frame3{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Nptel");
        String []color = {"Red","Green","Blue"};
        JComboBox<String> c = new JComboBox<>(color);
        // c.setBounds(50, 50, 90, 20);
        jf.add(c);
        jf.setSize(300, 200);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}