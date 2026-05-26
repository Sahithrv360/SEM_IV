interface Student{
    static void Hello(){
        System.err.println("hello");
    }
    default  void add() {
        System.err.println(2+3);
    }
}
public class Basic_Interface implements Student{
    public static void main(String[] args) {
        Student.Hello();
        Basic_Interface k = new Basic_Interface();
        k.add();
        System.err.println("Hi");
    }
}