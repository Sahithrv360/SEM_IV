
import java.util.Scanner;
public class Local{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       s.next();
       int i = 10;
       int n = i++%2;
       System.err.println(n+" "+i);
       int m = ++i%7;
       System.err.println(m+" "+i);
       System.err.println(i+n+m);
       System.err.println(args[0]);
    }
}