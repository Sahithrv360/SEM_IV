
class Measure{
	int r = 5;
 	public static final float PI = 3.14159f;
	void calArea() {System.out.println("Area of Circle = "+(PI*r*r));}
	void calCircum() {System.out.println("Circumference of Circle = "+(PI*r*2));}
}
public class Circle {
	public static void main(String[] a){
		Measure b1 = new Measure();
		b1.calArea();
		b1.calCircum();
}
}

