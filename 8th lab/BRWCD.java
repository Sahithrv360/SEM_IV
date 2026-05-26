import java.io.*;
public class BRWCD{
    public static void main(String[] args) {
        try{
            Reader fr = new FileReader("abc.txt");
            BufferedReader br = new BufferedReader(fr);
            Writer fw = new FileWriter("target.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int c;
            while((c = br.read()) != -1)
            bw.write((char) c);
            br.close();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}