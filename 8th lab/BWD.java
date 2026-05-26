import java.io.*;

public class BWD{
    public static void main(String[] args) {
        try{
            Writer w = new FileWriter("def.txt",true);
            BufferedWriter bw = new BufferedWriter(w);
            // Scanner sc = new Scanner(System.in);
            // System.err.println("Enter txt : ");
            String s = "Locnow()efjwijfpq;";
            //bw.write(sc.nextLine());
            bw.newLine();
            for(int i=0;i<s.length();i++){
                bw.append(s.charAt(i));
            }
            
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}