import java.io.*;
public class Count{
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(r);
            InputStream ir = new FileInputStream("output.txt");
            String s;
            int c;
            int k;
            int word = 0,line = 0,ch = 0;
            System.err.println(ir.available());
            // while((s = br.readLine()) != null){
            //     line++;
            //     ch += s.length();
            //     String []w = s.split("\\s+");
            //     if(!s.trim().isEmpty())
            //     word += w.length;
            // }
            // br.reset();
            while((c = br.read()) != -1){
                if( String.valueOf(c) == " ") continue;
                else ch++;
            }
            System.err.println("No. of line : "+line);
            System.err.println("No. of words : "+word);
            System.err.println("No. of characters : "+ch);
            br.reset();

        } catch (Exception e) {
            e.getMessage();
        }
    }
}