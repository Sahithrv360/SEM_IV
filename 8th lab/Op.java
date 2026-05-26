import java.io.*;
public class Op{
    public static void main(String[] args) {
        try {
            // Reader r = new FileReader("output.txt");
            // BufferedReader br = new BufferedReader(r);
            // br.mark(21);
            RandomAccessFile br = new RandomAccessFile("final.txt", "r");

            int c;
            while((c = br.read()) != -1){
                System.err.print((char)c);
                    
            }
            
            // while((c = br.read()) != -1){
            //     System.err.print((char)c);   
            // }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}