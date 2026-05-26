import java.util.Scanner;
public class Array_in{
	public static void main(String[] ar){
		Scanner r = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n = r.nextInt();
		int[] a = new int[n];

		for(int i = 0;i < n; i++){
			System.out.print("A["+i+"] = ");
			a[i] = r.nextInt();
		}
		System.out.println("Array = " );
		for(int i = 0;i < n; i++){
			System.out.print(a[i]+",");
		}
	}
}
