import java.io.*;
public class ReadWrite{
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("abc.txt");
            Writer w = new FileWriter("final.txt");
            int c;
            while((c = r.read()) != -1){
                w.write((char) c);
            }
            r.close();
            w.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}