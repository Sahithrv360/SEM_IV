import java.util.Scanner;
public class Arithematic{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = r.nextInt();
        System.out.print("Enter b : ");
        int b = r.nextInt();
	System.out.print("a + b = " + (a+b) +"\n");
	System.out.print("a - b = " + (a-b) +"\n");
	System.out.print("a * b = " + (a*b) +"\n");
	System.out.print("a / b = " + (a/b) +"\n");
	System.out.print("a % b = " + (a%b) +"\n");


    }
}