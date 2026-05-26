class Rectangle{
	int len,wid;
	void calArea(){
		System.out.println("Area of Rectangle = "+(len*wid));
	}
}
public class Area_Rec{
	public static void main(String[] a){
		Rectangle b1 = new Rectangle();
		b1.len = 5;
		b1.wid = 6;
		b1.calArea();
		Rectangle b2 = new Rectangle();
		b2.len = 23;
		b2.wid = 6;
		b2.calArea();
		
	}
}
