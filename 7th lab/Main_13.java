import student.info.Student;
import java.util.Scanner;
public class Main_13{
    public static void main(String[] args){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        s.name = sc.nextLine();
        System.out.print("Enter number of subjects : ");
        s.n = sc.nextInt();
        Student.Marks m = s.new Marks();
        try{
            m.Details();
        }catch(Student.InvalidMarksException e){
            System.out.println("Error : "+e.getMessage());
        }finally{
            m.display();
        }
        System.out.println("Program came to end ...");   
    }
}