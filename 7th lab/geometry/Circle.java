package geometry;

public class Circle{
	public double r;
	public Circle(double r){ this.r = r;}
	public double AreaCircle(){
		return Math.PI*r*r;
	}
	public double PerimeterCircle(){
		return Math.PI*r*2;
	}
}