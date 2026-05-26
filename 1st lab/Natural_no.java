import java.util.Scanner;
public class Natural_no{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= r.nextInt();
	for(int i = 1;i <= n;i++)
		System.out.print(i + " ");
    }
}