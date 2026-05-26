import java.util.*;
public class LL{
    public static void main(String[] args) {
        LinkedList a = new LinkedList<>();
        a.add("Hello");
        a.add("hi");
        a.add("csm");
        a.add("from");
        a.add(2,"apple");
        a.add(3);
        System.err.println(a);
        System.err.println("Element set : "+a.set(4, "mango"));
        System.err.println("Element removed  : "+a.remove(5));
        System.err.println("index of element 'csm' : "+a.indexOf("csm"));
        System.err.println("index of element 'csm' : "+a.get(a.indexOf("csm")));
        System.err.println("ArrayList size : "+a.size());
        System.err.println("Contains : "+a.contains("apple"));   
        System.err.println("Cleared : ");     

        ArrayList  l = new ArrayList<>();
        String []sub = {"asd","java","ds","ade","daa"};
        for(String t : sub) l.add(t);
        a.addAll(l);
        LinkedList m = new LinkedList<>();
        
        m.add("vishal");
        m.add("bharghav");
        m.addAll(2,a);
        System.err.println("addAll from 3 : "+m);
        System.err.println("addAll  : "+a);
        System.err.println(a);
        
        Object ll = a.clone();
        System.err.println("after Cloning : "+ll);

        System.err.println("remove poll : "+a.poll());
        System.err.println("remove pollFirst : "+a.pollFirst());
        System.err.println("remove pollLast : "+a.pollLast());
        System.err.println(a);
        l.addFirst("HELLO");
        a.addLast("daa");
        a.addLast("daa");
        System.err.println("After adding hello and daa : "+l);
        a.removeFirstOccurrence("daa");
        a.removeLastOccurrence("daa");
        System.err.println("remove first and last occurence of daa : "+ a);
        l.removeFirst();
        l.removeLast();
        
        System.err.println("remove first and last element : "+ l);
        System.err.println("After adding hello and daa : "+l);

        l.remove(a);
        System.err.println("After removing linkedlist : "+l);
        System.err.println("Last of ll : "+a.getLast());
        System.err.println("First of Al : "+l.getFirst());
        l.clear();
        a.clear();
        //add(string),add(index,str),addAll(collec),addAll(index,collec),contains(),size(),clone(),clear(),set(),indexOf(),remove()*3
        //get(),poll(),pollFirst(),pollLast(),addFirst(),addLast(),removeFirstOccurrence(),removeLastOccurrence(),removeFirst()
        //removeLast(),getLast(),getFirst()

    }
}