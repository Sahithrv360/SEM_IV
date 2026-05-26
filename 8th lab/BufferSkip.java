import java.io.*;
public class BufferSkip{
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(r);
            br.skip(21);
            int c;
            
            while((c = br.read()) != -1){
                System.err.print((char)c);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}