// import java.awt.*;
// import javax.swing.*;

// public class Calci {
//     public static void main(String[] args) {
//         JFrame jf = new JFrame("Calculator");
//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         jf.setLayout(new BorderLayout(10,10));
//         jf.setSize(300, 350);
//         JTextPane jt = new JTextPane();
//         jt.setPreferredSize(new Dimension(300, 50));
//         jf.add(jt,BorderLayout.NORTH);
//         JPanel jp = new JPanel();
//         String[] buttonLabels = {
//             "9", "8", "7",
//             "6", "5", "4",
//             "3", "2", "1",
//             "0", "+", "-", "*", "/", "="
//         };

//         jp.setLayout(new GridLayout(4,3,10,10));
//         for (String label : buttonLabels) {
//             JButton button = new JButton(label);
//             button.addActionListener(e -> jt.setText(jt.getText() + label));
//             jp.add(button);
//         }

//         jf.add(jp,BorderLayout.CENTER);
        
//         jf.setVisible(true);
//     }
// }
import java.awt.*;
import javax.swing.*;

public class Calci {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 400);
        jf.setLayout(new BorderLayout(10, 10));

        JTextPane jt = new JTextPane();
        jt.setPreferredSize(new Dimension(300, 50));
        jf.add(jt, BorderLayout.NORTH);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        final String[] num1 = {""};
        final String[] operator = {""};

        for (String label : buttons) {
            JButton button = new JButton(label);
            button.addActionListener(e -> {
                String text = button.getText();

                switch (text) {
                    case "+": case "-": case "*": case "/":
                        num1[0] = jt.getText(); // store first number
                        operator[0] = text;      // store operator
                        jt.setText("");          // clear display for second number
                        break;
                    case "=":
                        double n1 = Double.parseDouble(num1[0]);
                        double n2 = Double.parseDouble(jt.getText());
                        double result = 0;
                        switch (operator[0]) {
                            case "+": result = n1 + n2; break;
                            case "-": result = n1 - n2; break;
                            case "*": result = n1 * n2; break;
                            case "/": result = n1 / n2; break;
                        }
                        jt.setText(String.valueOf(result));
                        num1[0] = ""; operator[0] = "";
                        break;
                    case "C":
                        jt.setText(""); num1[0] = ""; operator[0] = "";
                        break;
                    default: // number button
                        jt.setText(jt.getText() + text);
                }
            });
            jp.add(button);
        }

        jf.add(jp, BorderLayout.CENTER);
        jf.setVisible(true);
    }
}