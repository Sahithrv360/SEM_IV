import java.io.*;
public class IPSR{
    public static void main(String[] args) {
        try{
            InputStream ip = new FileInputStream("Hello.py");
            System.err.println("Available bytes : "+ip.available());
            byte []a = new byte[100];
            // Bytes array store ASCII CODES OF EACH CAHRACTER
            ip.read(a);
            String s = new String(a);
            //for(var i : a) System.out.println(i);
            System.err.println();
            System.err.println(s);
            ip.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}