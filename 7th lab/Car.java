class Car{
	String b;
	void brand(){
		System.out.println("brand "+b);
		}
	class Engine{
		void turnOn(){
			System.out.println("Engine On");
		}
		void turnOff(){
			System.out.println("Engine Off");
		}
	}
	class Gps{
		String loc;
		void displayloc(){
			System.out.println("Location "+loc);
		}
	}
	public static void main(String[] ar){
		Car c = new Car();
		Car.Engine e = new Car().new Engine();
		Car.Gps g = new Car().new Gps();
		c.b = "Audi";
		c.brand();
		e.turnOn();
		g.loc = "gandipet";
		g.displayloc();
		e.turnOff();
	}
}