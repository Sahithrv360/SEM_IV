class Student_info{
	String name ;int  roll_no;
	void display(){
		System.out.println("Name = "+name);
		System.out.println("Roll Number = "+ roll_no);

	}
}
public class Student{
	public static void main(String[] a){
		Student_info b1 = new Student_info();
		b1.name = "dfgrg";
		b1.roll_no = 632;
		b1.display();
		Student_info b2 = new Student_info();
		b2.name = "abcdef";
		b2.roll_no = 6;
		b2.display();
		
	}
}
