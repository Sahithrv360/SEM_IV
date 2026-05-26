import java.util.*;
public class HS{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add(null);
        hs.add("Hello");
        hs.add("hi");
        hs.add("csm");
        hs.add("from");
        hs.add("apple");
        System.err.println(hs);
        System.err.println("contains : "+hs.contains("apple"));
        System.err.println("Hashcode : "+hs.hashCode());
        System.err.println("Size : "+hs.size());
        System.err.println("code : "+hs.toString());
        System.err.println("hashset empty or not : "+hs.isEmpty());
        hs.clear();
    }
}