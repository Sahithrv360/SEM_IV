import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a no. : ");
		char n = r.nextChar();
		
		if(n  == 'a'||n  == 'e'||n  == 'i'||n  == 'o'||n  == 'u') 
			System.out.print("Vowel");
		else
			System.out.print("Consonant");
}
}