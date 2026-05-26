abstract class Bank{
    double amt;
    double bal;
    Bank(double amt,double bal){
        this.amt = amt;
        this.bal = bal;
    }
    abstract void deposit();
    abstract void withdraw(double with);
    
    void displayBalance() {
        System.out.println("Current Balance: " + bal);
    }
}
class Savings extends Bank{
    Savings(double amt,double bal){
        super(amt,bal);
    }
    void deposit(){
        bal += amt;
        System.out.println("Deposited " + amt + " in Savings Account.");
    }
    void withdraw(double with){
        if(amt <=50000 && amt > 0){
            if (with <= bal) {
                bal -= with;
                System.out.println("Withdrew " + with + " from Savings Account.");
            } else {
                System.out.println("Insufficient Balance in Savings Account.");
            }
        }
    }
}
class Current extends Bank{
    Current(double amt,double bal){
        super(amt,bal);
    }
    void deposit(){
        bal += amt;
        System.out.println("Deposited " + amt + " in Savings Account.");
    }
    void withdraw(double with){
        if(amt <=200000 && amt > 0){
            if (with <= bal) {
                bal -= with;
                System.out.println("Withdrew " + with + " from Current Account.");
            } else {
                System.out.println("Insufficient Balance in Current Account.");
            }
        }
    }
}


public class Main{
    public static void main (String[] args) {
        Savings b ;
        b = new Savings(1000,134734);
        b.deposit();
        b.withdraw(348.34);
        b.displayBalance();
    }
}
