import java.util.*;
class Sort implements Comparable<Sort>{
    private String a;
    public Sort(String a){
        this.a = a;
    }
    public int compareTo(Sort s){
        return this.a.compareTo(s.a);
    }
    public String toString(){
        return a;
    }
}
public class AL{
    public static void main(String[] args) {
        ArrayList<Sort>  a = new ArrayList<>();
        a.add(new Sort("Hello"));
        a.add(new Sort("hi"));
        a.add(new Sort("csm"));
        a.add(new Sort("from"));
        a.add(2,new Sort("apple"));
        a.add(new Sort("3"));
        //Collections.sort(a);
        System.err.println(a);
        // System.err.println("Element set : "+a.set(4, "mango"));
        //System.err.println("Element removed  : "+a.remove(5));
        //System.err.println("index of element 'csm' : "+a.indexOf("csm"));
        //System.err.println("Value of element '"+a.indexOf("csm")+"' : "+a.get(a.indexOf("csm")));
        System.err.println("ArrayList size : "+a.size());
        System.err.println("Contains : "+a.contains("hi"));   
        System.err.println("Cleared : ");     
        a.clear();
    }
}