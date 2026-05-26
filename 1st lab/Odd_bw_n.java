import java.util.Scanner;
public class Odd_bw_n{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	int sum = 0;
	for(int i = 1;i <= n;i++){
		if(i%2!=0){
			sum += i;
			System.out.print(i + " ");}}
	System.out.print("\n"+"Sum = " +sum + " ");
    }
}