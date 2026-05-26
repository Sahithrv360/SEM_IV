import java.util.*;
class Stu{
    public static void main(String[] args) {
        TreeMap<String,Integer> h = new TreeMap<>();
        String[] names = { "Chirag", "Amit","Bhavna"};
        int[] marks = {85, 92, 78};

        for(int i = 0,j=0;i<names.length && j<marks.length;i++,j++){
            h.put(names[i], marks[j]);
        }

        for(Map.Entry<String,Integer> e : h.entrySet()){
            System.err.println(e);
        }

    }
}