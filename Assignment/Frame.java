import javax.swing.*;
public class Frame extends JFrame{
    JButton button;
    public Frame() {
        button = new JButton("Hello");
        add(button);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Frame();
    }
    
}