class Student {
    String gu,gp;
    public Student(String gu,String gp){
        this.gu = gu;
        this.gp = gp;
    }
    void getGrade(){
        System.out.println("Normal Print");
    }
}
class UGStudent  extends Student{
    public UGStudent(String gu){
        super(gu,"");
    }
    void getGrade(){
        System.out.println("Grade of Ug : "+gu);
    }
}
class PGStudent extends Student{
    public PGStudent(String gp){
        super("",gp);
    }
    void getGrade(){
        System.out.println("Grade of Pg : "+gp);
    }
}
public class Main{
    public static void main (String[] args) {
        Student p,q,r;
         System.out.println("Student 1 : ");
         p = new UGStudent("A");
         p.getGrade();
         p = new PGStudent("S");
         p.getGrade();
         System.out.println("Student 2 : ");
         p = new UGStudent("F");
         p.getGrade();
         p = new PGStudent("B");
         p.getGrade();         
         System.out.println("Student 3 : ");         
         p = new UGStudent("D");
         p.getGrade();
         p = new PGStudent("S");
         p.getGrade();
    }
}