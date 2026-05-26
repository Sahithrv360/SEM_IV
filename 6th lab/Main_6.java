class Vehicle{
    void toshowspeed(){
        System.out.println("General Speed : ");
    }
}
class Bike extends Vehicle{
    void toshowspeed(){
        System.out.println("General Speed in clear road: 70");
    }
}
class Car extends Vehicle{
    void toshowspeed(){
        System.out.println("General Speed in Highway: 120");
    }
}
public class Main_6{
    public static void main (String[] args) {
        Vehicle v;
        v = new Bike();
        v.toshowspeed();
        v = new Car();
        v.toshowspeed();
    }
}