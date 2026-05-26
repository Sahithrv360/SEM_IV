import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = r.nextInt();
        System.out.print("Enter b : ");
        int b = r.nextInt();

        System.out.print("Enter s : ");
        int s = r.nextInt();
        System.out.print("Enter l : ");
        int l = r.nextInt();


        System.out.print("Enter r : ");
        int ra = r.nextInt();


	System.out.print("Area of Square =  " + (s*s) +"\n");
	System.out.print("Area of Circle = " + (3.14*ra*ra) +"\n");
	System.out.print("Area of Triangle = " + (0.5*a*b) +"\n");
	System.out.print("Area of Rectangle = " + (a*b) +"\n");
	


    }
}