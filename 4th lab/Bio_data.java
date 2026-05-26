public class Bio_data{
	String name,roll_number;
	Bio_data(String name){
		this.name = name;
	}
	Bio_data(String name,String roll_number){
		this.name = name;
		this.roll_number = roll_number;
	}
	void display(){
	System.out.println("Name = "+name);
	System.out.println("Roll number = "+roll_number);
	}

public static void main(String[] a){
	Bio_data b1 = new Bio_data("ABC");
	Bio_data b2 = new Bio_data("AdsfBC","123");
	b1.display();
	b2.display();
	}
}