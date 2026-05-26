class Car_info{
	String brand ;int speed;
	void display(){
		System.out.println("Brand = "+brand);
		System.out.println(" Top-speed = "+ speed);

	}
}
public class Car{
	public static void main(String[] a){
		Car_info b1 = new Car_info();
		b1.brand = "Lamborghini";
		b1.speed = 220;
		b1.display();
		Car_info b2 = new Car_info();
		b2.brand = "F1";
		b2.speed = 300;
		b2.display();
		
	}
}