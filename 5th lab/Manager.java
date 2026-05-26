class Person{
int h;
void display(){
System.out.println("H = "+h);
}
}
class Employee extends Person{
String e;
void display(){
System.out.println("E = "+e);
}
}
public class Manager extends Employee{
double d;
void display(){
System.out.println("D = "+d);
}
public static void main(String[] a){
Manager m = new Manager();
Manager m1 = new Manager();
Manager m2 = new Manager();
//Person m = new Person();
//Employee m1 = new Employee();
//Manager m2 = new Manager();
m.h=1;
m1.e="hello";
m2.d=2.3;
m.display();
m1.super().display();
m2.super().display();
}
}


