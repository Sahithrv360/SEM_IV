import geometry.Circle;
import geometry.Rectangle;
class Calculate{
	public static void main(String[] ar){
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(15,5);
		System.out.println(c.AreaCircle());
		System.out.println(c.PerimeterCircle());
		System.out.println(r.AreaRectangle());
		System.out.println(r.PerimeterRectangle());
	}
}