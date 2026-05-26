
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BRD{
    public static void main(String[] args) {
        try{
            Reader r = new FileReader("abc.txt");
            BufferedReader br = new BufferedReader(r);
            int c;
            while((c = br.read()) != -1)
                System.err.println(c);
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}