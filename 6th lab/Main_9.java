class Printer{
    void printDocument(){
        System.out.println("Normal Print");
    }
}
class LaserPrinter  extends Printer{
    void printDocument(){
        System.out.println("Laser Print");
    }
}
class InkjetPrinter  extends Printer{
    void printDocument(){
        System.out.println("Inkjet print");
    }
}
public class Main{
    public static void main (String[] args) {
        Printer p ;
         p = new LaserPrinter();
         p.printDocument();
         p = new InkjetPrinter();
        p.printDocument();
    }
}