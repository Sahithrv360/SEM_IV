
import java.util.Scanner;

public class eligible {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter age : ");
		int n = r.nextInt();
		
		if(n>=18) 
			System.out.print("Eligible to vote");
		else
			System.out.print("Not Eligible to vote");
}
}