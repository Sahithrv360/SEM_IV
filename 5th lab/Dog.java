class Animal{
void sound(){
System.out.println("Barks");
}
}
public class Dog extends Animal{
String b;
Dog(String B){ b=B;}
void breed() {
System.out.println("Breed : "+b);
}
public static void main(String[] a){
Dog d = new Dog("lab");
d.breed();
d.sound();
}
}
