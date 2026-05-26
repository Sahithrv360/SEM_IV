class Order{
    double amt;
    Order(double amt){
        this.amt = amt;
    }
    double calculateDiscount(){
        return 0;
    }
}
class PremiumCustomerOrder  extends Order{
    PremiumCustomerOrder(double amt){
        super(amt);
    }
    double calculateDiscount(){
            return amt * 0.2;
    }
}
class RegularCustomerOrder  extends Order{
    RegularCustomerOrder(double amt){
        super(amt);
    }
    double calculateDiscount(){
            return amt * 0.05;
    }
}
public class Main_7{
    public static void main (String[] args) {
        Order v;
        v = new PremiumCustomerOrder(1000);
        System.out.println(v.calculateDiscount());
        v = new RegularCustomerOrder(1000);
        System.out.println(v.calculateDiscount());
    }
}