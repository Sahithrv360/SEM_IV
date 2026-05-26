import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens{
public static void main(String[] a){
Scanner r = new Scanner(System.in);
System.out.println("enter string : ");
String str = r.nextLine();
StringTokenizer t = new StringTokenizer(str);
int c=0;
while(t.hasMoreTokens()){
	System.out.println(t.nextToken());
	c+=1;
}
System.out.println("Tokens : "+c);
}
}