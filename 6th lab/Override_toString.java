class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "Product Id = "+id+
               "\nName : "+name+
               "\nPrice : "+price;
    }

}
public class Override_toString{
    public static void main (String[] args) {
        Product o = new Product(14121,"Shampoo",399.99);
        System.out.println(o.toString());
    }
}
