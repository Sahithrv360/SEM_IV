import java.util.Scanner;
public class Sum_of_n{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	int sum = 0;
	for(int i = 1;i <= n;i++)
		sum += i;
	System.out.print(sum + " ");
    }
}