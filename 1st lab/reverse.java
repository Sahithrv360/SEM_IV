
import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	int nd = 0;
int d;
	while(n>0){
d = n % 10;
nd=(nd+ d)*10;
n/=10;
}		
			System.out.print(nd/10 );
}
	    
}