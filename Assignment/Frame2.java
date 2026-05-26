import java.awt.event.*;
import javax.swing.*;
public class Frame2{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Nptel");
        JButton jb = new JButton("Welcome");
        jb.setBounds(50, 100, 100, 40);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Anish");
            }
        });
        jf.add(jb);
        jf.setSize(300, 200);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}