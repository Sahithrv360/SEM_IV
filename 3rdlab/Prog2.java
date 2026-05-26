
class Main{
	int num = 12;
	
 static int play(){
	 int x = 3422;
	 return x;
	}
int sum(int y){
	return y+5;
}
}
public class Prog2{
public static int k = 23;
	public static void main(String[] a){
		Main p = new Main();
		System.out.println("Instance Variable : "+p.num);
		System.out.println("Static Variable : "+k);
		
		System.out.println("Static Method : "+p.sum(p.play()));
}
}


