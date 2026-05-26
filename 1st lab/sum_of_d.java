import java.util.Scanner;
public class sum_of_d{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	int sum = 0;
int d;
	while(n>0){
d = n % 10;
sum+= d;
n/=10;
}		
			System.out.print(sum );
}
	    
}