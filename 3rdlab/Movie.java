
class Movie_info{
	double r;
	String m;
 	public static final float PI = 3.14159f;
	void display(){
		System.out.println("Movie = "+m);
		System.out.println(" Rating = "+ r);

	}
}
public class Movie {
	public static void main(String[] a){
		Movie_info b1 = new Movie_info();
		b1.m = "Kingdom";
		b1.r = 9.3;
		b1.display();
}
}
