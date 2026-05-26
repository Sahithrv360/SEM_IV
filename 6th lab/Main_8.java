class Animal{
    void makeSound(){
        System.out.println("Sound Varies ");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Sound : Bark ");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Sound : Meow ");
    }
}
class Cow  extends Animal{
    void makeSound(){
        System.out.println("Sound : Moo ");
    }
}
public class Main_8{
    public static void main (String[] args) {
        Animal []a = {new Dog(),new Cat(),new Cow()};
        for (int i =0;i < a.length;i++ ){
            a[i].makeSound();
        } 
    }
}