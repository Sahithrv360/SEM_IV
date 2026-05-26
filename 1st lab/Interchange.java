import java.util.Scanner;
public class Interchange{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = r.nextInt();
        System.out.print("Enter b : ");
        int b = r.nextInt();
	int temp = a;
	a = b;
	b = temp;
System.out.print("a = " + a+"\n");
System.out.print("b = " + b);

    }
}