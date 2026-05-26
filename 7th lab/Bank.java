class InsufficientFunds extends Exception {
    public InsufficientFunds(String message) {
        super(message);
    }
}
class Bank{
	int bal ,amt;
	Bank(int b,int a){bal=b;amt=a;}
	class Process{
		 void display(){
			System.out.println("Balance : "+bal);
		}
		public void deposit(){
			bal += amt;
			System.out.println("Deposited : "+amt);
			display();
		}

		public void withdraw(int with) throws InsufficientFunds {
    try {
        if (bal < with) {
            throw new InsufficientFunds("Not enough balance");
        }
        bal -= with;
        System.out.println("Withdrawn : " + with);
    } finally {
        display();
    }
}

    
}
	public static void main(String[] ar){
		Bank b = new Bank(1000,450);
		Bank.Process p = b.new Process();
		p.deposit();
		try {
        p.withdraw(2000); // This might throw InsufficientFunds
    } catch (InsufficientFunds e) {
        System.out.println("Exception caught: " + e.getMessage());
    }
	}
}
