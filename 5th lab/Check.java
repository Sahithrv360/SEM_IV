import java.util.Scanner;
import java.lang.String;
public class Check{
public static void main(String[] a){
Scanner r = new Scanner(System.in);
System.out.println("enter string : ");
String str = r.nextLine();
String s = "";
for(int i = str.length()-1;i >=0;i--){
s += str.charAt(i);
}
boolean x =true;
for(int i=0;i < str.length();i++){
if(str.charAt(i) != s.charAt(i)) x = false;
}
if(x) System.out.println("palindrome");
else System.out.println("not palindrome");
}
}