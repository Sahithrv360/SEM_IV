import java.util.*;
class UnderAgeException extends Exception{
	public UnderAgeException(String m){
		super(m);
	}
}
class Custom{
	void check(int a) throws UnderAgeException{
		if(a<18){
			throw new UnderAgeException("Not eligible to vote");
		}else{
			System.out.print("Eligible");
		}
	}
	public static void main(String[] ar){
		Scanner s = new Scanner(System.in);
		Custom c = new Custom();
		System.out.println("Enter Age : ");
		int a = s.nextInt();
		try{
			c.check(a);
		}catch(UnderAgeException e){
			System.out.println(e.getMessage());
		}
		System.out.print("Running without stop ...");
	}
}