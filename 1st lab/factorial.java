import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	int f = 1;
	for(int i = n;i >= 1;i--) f *= i;
		
			System.out.print(f );
}
	    
}