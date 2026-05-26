import java.util.Scanner;
public class Factors{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	
	for(int i = 1;i < n;i++){
		if(n%i==0){
			System.out.print(i + " ");}}
	    }
}