import java.io.*;
public class CountVowel{
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(r);
            Writer fw = new FileWriter("vowel.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int c,count = 0;

            while((c = br.read()) != -1){
                char h = (char) c;
                if(h == 'a'||h == 'e'||h == 'i'||h == 'o'||h == 'u'){
                    count++;
                    fw.write(h);
                }
            }
            System.err.println(count);
            
            br.close();
            bw.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}