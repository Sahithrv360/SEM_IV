import java.io.*;
import java.util.Scanner;
public class BRW{
    public static void main(String[] args) {
        try(var  bw = new BufferedWriter(new FileWriter("Hello.py")))
        {
            Scanner sc = new Scanner(System.in);
            while(true){
                var  data = sc.nextLine();
                if(data.isEmpty()) break;
                bw.write(data);
                bw.newLine();
            }
            bw.close();
            int c;
            Reader fr = new FileReader("target.txt");
            BufferedReader br = new BufferedReader(fr);
            while((c = br.read()) != -1){
                System.err.print((char)c);
            }
            br.close();
            //need to compulsory close buffer file
            //no need to close Writer File
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}