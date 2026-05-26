import java.util.*;
class Except{
	public static void main(String[] ar){
		Scanner s = new Scanner(System.in);
		try{
			int a = s.nextInt();
			int b = s.nextInt();
			int r = a/b;
			System.out.print("Result : "+r);
		}catch(ArithmeticException i){
			System.out.println("Error: /0 is not possible");
		}catch(InputMismatchException e){
			System.out.println("Error: Invalid input. Please enter an integer.");
		}
	}
}