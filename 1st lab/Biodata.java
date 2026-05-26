import java.util.Scanner;
public class Biodata{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = r.nextLine();
        
        System.out.print("Enter your dob : ");
        String dob = r.nextLine();
System.out.print("Enter your Age : ");
        int age = r.nextInt();
System.out.print("Your details : ");
System.out.print("Name : "+name+"\n");
System.out.print("Age : "+age+"\n");
System.out.print("dob : "+dob+"\n");
    }
}