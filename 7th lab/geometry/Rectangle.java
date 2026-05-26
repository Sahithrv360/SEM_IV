package geometry;

public class Rectangle{
	public double l,b;
	public Rectangle(double l,double b){ this.l = l;this.b=b;}
	public double AreaRectangle(){
		return l*b;
	}
	public double PerimeterRectangle(){
		return (l+b)*2;
	}
}