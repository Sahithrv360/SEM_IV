import java.util.*;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();

        int[] a = {1, 2, 3, 4};
        String[] s = {"hi", "Hello", "csm", "java"};

        // ✅ Correct way to insert values from two arrays
        for (int i = 0; i < a.length && i < s.length; i++) {
            m.put(a[i], s[i]);
        }

        // Adding few more entries
        m.put(5, "Five");
        m.put(6, "Six");

        // Display all
        System.out.println("HashMap: " + m);

        // Demonstrate common methods
        System.out.println("Get key 2: " + m.get(2));
        System.out.println("Replace key 3: " + m.replace(3, "cse-aiml"));
        m.remove(4);
        System.out.println("After removing key 4: " + m);
        System.out.println("Contains key 1: " + m.containsKey(1));
        System.out.println("Size: " + m.size());

        // Display all key-value pairs using entrySet
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Clear all entries
        m.clear();
    }
}
