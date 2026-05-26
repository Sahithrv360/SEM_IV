import java.io.FileReader;
import java.io.Reader;
public class FRD{
    public static void main(String[] args) {
        try {
            Reader fr = new FileReader("def.txt");
            int c;
            while((c = fr.read()) != -1)
                System.err.println((char) c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}