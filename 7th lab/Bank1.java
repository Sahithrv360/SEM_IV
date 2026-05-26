import java.util.*;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String m){
		super(m);
	}
}
class Bank1{
	int b;
	Bank1(int b){this.b=b;}
	void display(){
		System.out.println("Balance : "+b);
	}	
	void deposit(int am){
		b+=am;
		System.out.println("Deposited : "+am);
		display();
	}
	void withdraw(int am) throws InsufficientFundsException{
		if(b<am){
			throw new InsufficientFundsException("Less Balance ");
		}else{
			b-=am;
			System.out.println("Withdrawn : "+am);
		}
	}
	public static void main(String[] ar){
		Bank1 b = new Bank1(1000);
		b.deposit(500);
		try{
			b.withdraw(1000);
		}catch(InsufficientFundsException e){
			System.out.println("Error : "+e.getMessage());
		}
		System.out.print("Running without stop ...");
	}
}