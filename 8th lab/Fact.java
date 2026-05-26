import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fact{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("number.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
            String n = br.readLine();
            long f =1;
            int k = Integer.parseInt(n.trim());
            for (int i = 1; i <= k; i++) f*=i;
            bw.write("Result is "+f);
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}