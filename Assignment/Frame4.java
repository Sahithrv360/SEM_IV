import javax.swing.*;
public class Frame4{
    public static void main(String[] args) {
        JFrame j = new JFrame("Hello");
        JLabel l = new JLabel("hi");
        j.add(l);
        // j.add(new JButton("cancel"));
        // j.add(new JButton("ok"));
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(200, 200);
        j.setVisible(true);
    }
}