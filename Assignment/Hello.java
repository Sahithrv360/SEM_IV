import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Hello extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World", 150, 150);
    }
    // public static void main(String[] args) {
    //     Graphics g = new Graphics();
    //     Hello.paint();
    // }
}