import java.io.*;
import java.util.Scanner;

public class WS{
    public static void main(String[] args) {
        try(Writer w = new FileWriter("abc.txt")){
            Scanner s = new Scanner(System.in);
            System.err.println("Enter String : ");
            w.write(s.nextLine());
        }catch(Exception e){
            e.getMessage();
        }
    }
}