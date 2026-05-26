abstract class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    abstract double calculateSalary();
    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}
class Fulltime extends Employee{
    double ms;
    Fulltime(int id,String name,double ms){
        super(id,name);
        this.ms = ms;
    }
    double calculateSalary(){
        return ms;
    }
}
class Parttime extends Employee{
    double hrs_worked,hr_sal;
    
    Parttime(int id,String name,double hrs_worked,double hr_sal){
        super(id,name);
        this.hrs_worked = hrs_worked;
        this.hr_sal = hr_sal;
    }
    double calculateSalary(){
        return hr_sal*hrs_worked;
    }
}
public class Main{
    public static void main (String[] args) {
        Employee f = new Fulltime(101,"Abc",520000);
        Employee p = new Parttime(212,"Def",12,1000);
        f.display();
        p.display();
    }
}