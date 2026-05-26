class Account_info{
	double balance ;
	int Acc_no  = 128;
	void deposit(double dep){
		if(check() == false) System.out.println("Account not found ");
		else balance += dep;
	}
	void withdraw(double wd){
		if(check() == false) System.out.println("Account not found ");
		else {
			System.out.println("Amount Withdrawn : " + wd);
			balance -= wd;
		}
	}
	boolean check(){
		if(Acc_no != 128) return false;
		else return true;
	}
	void display(){
		if(!check()) System.out.println("Account not found ");
		else {
			System.out.println("Account Details : ");
			System.out.println("Account Number : " + Acc_no);
			System.out.println("Account Balance : "+balance);
			}
	}
}
public class Bank{
	public static void main(String[] a){
		Account_info b = new Account_info();
		b.Acc_no = 128;
		b.deposit(100.34);
		b.withdraw(23);
		b.display();

	}
}