public class Rectangle{
	int l,b;
	Rectangle(){
		l = 1;b = 1;
	}
	Rectangle(int l,int b){
		this.l = l;
		this.b = b;
	}
	Rectangle(int l){
		this.l = l;
		this.b = l;
	}
	void display(){
	System.out.println("Area = "+(l*b));
	}

public static void main(String[] a){
	Rectangle b1 = new Rectangle();
	Rectangle b2 = new Rectangle(2,3);
	Rectangle b3 = new Rectangle(2);

	System.out.println("under Default = ");
	b1.display();
	System.out.println("under 2 values = ");
	b2.display();
	System.out.println("under 1 values = ");
	b3.display();
	}
}