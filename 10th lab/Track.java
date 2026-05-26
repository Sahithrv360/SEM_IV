import java.util.*;
public class Track{
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        HashMap<String,String> h = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        String []ord = {
    "Wireless Mouse - Logitech M331",
    "Bluetooth Headphones - Sony WH-CH520",
    "Laptop Stand - Adjustable Aluminum",
    "USB-C Charger - Anker 65W",
    "Notebook - Classmate Spiral Bound"
};

        for(String s : ord) a.add(s);
        for(int i = 0;i<a.size();i++){
            
            h.put(String.valueOf(i+1), a.get(i));
        }
        for(Map.Entry<String,String> m : h.entrySet()){
            System.err.println(m.getKey()+" ---> "+m.getValue());
            // to add new orders we can declare a global variable Ex : c = 0 and iterate through it
        }
    }
}