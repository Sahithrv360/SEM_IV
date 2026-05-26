import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OPSW{
    public static void main(String[] args) {
        try {
            OutputStream op = new FileOutputStream("output.txt");
            Scanner sc = new Scanner(System.in);
            var data = sc.nextLine();
            byte []arr = data.getBytes();
            op.write(arr);
            op.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}