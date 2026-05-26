import java.util.Scanner;
public class Add3{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = r.nextInt();
        System.out.print("Enter b : ");
        int b = r.nextInt();
	System.out.print("Enter c : ");
        int c = r.nextInt();
	System.out.print("Sum of all 3 = " + (a+b+c));

    }
}