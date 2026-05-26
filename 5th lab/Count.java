import java.util.Scanner;
import java.lang.String;
public class Count{
public static void main(String[] a){
Scanner r = new Scanner(System.in);
System.out.println("enter string : ");
String s = r.nextLine();
int n = s.length();
int v=0,c=0,d=0,w=0;
for(int i =0;i <n;i++){
if(s.charAt(i) == ' ') w++;
else if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u') ++v;
else if(s.charAt(i) == '0'|| s.charAt(i) == '1'|| s.charAt(i) == '2'|| s.charAt(i) == '3'|| s.charAt(i) == '4'|| s.charAt(i) == '5'|| s.charAt(i) == '6'|| s.charAt(i) == '7'|| s.charAt(i) == '8'|| s.charAt(i) == '9') ++d;
else ++c;
}
System.out.println("Vowels : "+v);
System.out.println("Consonants : " + c);
System.out.println("Digits : "+d);
System.out.println("Whitespaces : "+w);
}
}