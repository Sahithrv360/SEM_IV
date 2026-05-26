class Employee{
    private String name;
    private int id;
    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        return this.id == e.id;
    }
}
public class Main{
    public static void main (String[] args) {
        Employee e1 = new Employee(101, "Alice");
        Employee e2 = new Employee(101, "Bob");
        Employee e3 = new Employee(102, "Charlie");
        
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        System.out.println("e1.equals(e3): " + e1.equals(e3));
    }
}