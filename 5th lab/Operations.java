import java.util.Scanner;
import java.lang.String;
public class Operations{
public static void main(String[] a){
Scanner r = new Scanner(System.in);
System.out.println("enter string : ");
String str = r.nextLine();
System.out.println("String length : "+str.length());
System.out.println("To upper case : "+str.toUpperCase());
System.out.println("To lower case : "+str.toLowerCase());
String s = "";
for(int i = str.length()-1;i >=0;i--){
s += str.charAt(i);
}

System.out.println("Reverse String : "+s);
if(str == s){
System.out.println("equal");
}else{
System.out.println("not equal");
}
}
}
