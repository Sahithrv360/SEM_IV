package student.info;
import java.util.*;
public class Student{
	public String name;
	public int n;
	public class InvalidMarksException extends Exception{
		public InvalidMarksException(String m){
			super(m);
		}
	}
	public class Marks{
		Scanner s = new Scanner(System.in);
		public int []M = new int[n];
		public void Details()throws InvalidMarksException{
			System.out.println("Student Name : " + name);
			System.out.println("Enter "+n+" Subject marks : ");
			for(int i=0;i<n;i++){
				System.out.print((i+1)+". ");
				M[i] = s.nextInt();
				if(M[i]<0||M[i]>100){
					throw new InvalidMarksException("Marks are out of range ");
				}
			}
		}
		public void display(){
			int k = 0;
			for(int i : M){
				System.out.println("Subject "+(k+1)+" = "+i);
				k++;
			}
		}
	}
}