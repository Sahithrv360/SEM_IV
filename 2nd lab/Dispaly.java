
public class Dispaly{

	public String clg = "CBIT";
	public String name = "";
	public int age ;
	public void display(){
		System.out.println("Student Name : " +name);
		System.out.println("Student College : " +clg);
		System.out.println("Student age : " +age);
		}

	public static void main(String[] arg){
		Dispaly s1 = new Dispaly();
		Dispaly s2 = new Dispaly();
		Dispaly s3 = new Dispaly();
		
		s1.name = "Sahith";
		s1.age = 18;
		s2.name = "Sai Kumar";
		s2.clg = "Vasavi";
		s2.age = 18;
		s3.name = "Prajeeth";
		s3.age = 18;
		System.out.println("Student 1 Details : ");
		s1.display();
		s2.display();
		s3.display();
}
}

		
