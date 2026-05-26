import java.util.*;
public class TS{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        
        ts.add("Hello");
        ts.add("hi");
        ts.add("csm");
        ts.add(null);
        ts.add("from");
        ts.add("apple");
        System.err.println(ts);
        System.err.println("contains : "+ts.contains("apple"));
        System.err.println("Hashcode : "+ts.hashCode());
        System.err.println("Size : "+ts.size());
        System.err.println("code : "+ts.toString());
        System.err.println("hastset empty or not : "+ts.isEmpty());
        ts.clear();
    }
}