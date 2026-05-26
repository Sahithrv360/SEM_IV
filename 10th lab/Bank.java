import java.util.*;
class Bank{
    public static void main(String[] args) {
        var l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        l.add("1000");
        while(true){
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.err.println("Amount to add : ");
                    String a  = sc.next();
                    l.add("amount added "+a);
                    break;
                case 2:
                    System.err.print("Amount to withdraw : ");
                    String w  = sc.next();
                    l.add("Withdrawn "+w);
                    break;
                case 3:
                    ListIterator<String> listIterator = l.listIterator();
                    while (listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                    }
                    break;
                default:
                    System.err.println("Exited from interfce .....");
                    return;
            }
        }
    }
}