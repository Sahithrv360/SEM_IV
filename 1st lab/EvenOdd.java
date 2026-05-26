import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int n = r.nextInt();
		
		if(n % 2 == 0) 
			System.out.print(n + "is Even");
		else
			System.out.print(n + "is Odd");
}
}