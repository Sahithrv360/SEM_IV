import java.util.*;
class Login{
    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<>();
        h.put("blaze", "12345");
        h.put("crimson", "6789");
        var sc = new Scanner(System.in);
        System.err.print("Enter user name : ");
        String s = sc.next();
        if(h.containsKey(s)){
            System.err.println("Enter password : ");
            String p = sc.next();
            if(h.containsValue(p)){
                System.err.println("Logged IN ....");
            }else{
                System.err.println("Inavlid password ! .....");
            }
        }else{
            System.err.println("Inavlid Username ! .....");
        }
    }
}