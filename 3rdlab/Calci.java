class Operation{
	int x = 4,y = 2;
	void add(){
		System.out.println("Addition : " + (x+y));
	}
	void subtract(){
		System.out.println("Subtract : " + (x-y));
	}
	void multiply(){
		System.out.println("Multiply : " + (x*y));
	}
	void divide(){
		System.out.println("Divide : " + (x/y));
	}
	void modulus(){
		System.out.println("Percentile : " + (x%y));
	}
}
public class Calci{
	public static void main(String[] a){
	Operation o = new Operation();
	o.add();
	o.subtract();
	o.multiply();
	o.divide();
	o.modulus();
}
}

