import java.io.*;
public class Mark{
    public static void main(String[] args) {
        try{
            Reader r = new FileReader("final.txt");
            BufferedReader br = new BufferedReader(r);
            int c;
            br.mark(15);
            while((c = br.read()) != -1){
                System.err.print((char)c);
            }
            br.reset();
            System.err.println("");
            while((c = br.read()) != -1){
                System.err.print((char)c);
            }
            br.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}