import java.util.*;
class Email{
    public static void main(String[] args) {
        HashSet h = new HashSet();
        var sc = new Scanner(System.in); 
        h.add("blaze@gmail.com");
        h.add("blaze123@gmail.com");
        h.add("blaze12@gmail.com");
        h.add("blaze12@gmail.com");
        System.err.println("Enter email id : ");
        String str = sc.next();
        if(h.contains(str)){
            System.err.println("Email already exits ! enter a new one ");
        }else{
            h.add(str);
        }
        Iterator <String> it  = h.iterator(); 
        while(it.hasNext()){
            System.err.println(it.next());
        }
    }
}