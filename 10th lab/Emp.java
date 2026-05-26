import java.util.*;
class Emp{
    public static void main(String[] args) {
        List<List> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
                List ad = new ArrayList<>();
                System.err.print("Enter Id : ");
                int id = sc.nextInt();
                System.err.print("Enter name : ");
                String name = sc.next();
                System.err.print("Enter dept : ");
                String dept = sc.next();
                ad.add(id);ad.add(name);ad.add(dept);
                a.add(ad);
        }
        Iterator iterator = a.iterator();
          while(iterator.hasNext()){
            System.err.println(iterator.next());
        }  
            
        a.sort(Comparator.comparing(o -> (String) o.get(1)));

        // Print sorted list
        for (List<Object> emp : a) {
            System.err.println(emp);
        }

    }
}