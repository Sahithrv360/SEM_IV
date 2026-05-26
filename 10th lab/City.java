import java.util.*;
class City{
    public static void main(String[] args) {
        TreeSet<String> h = new TreeSet<>();
        String[] cities = {
    "Mumbai", "Delhi", "Bengaluru", "Hyderabad", "Chennai",
    "Kolkata", "Ahmedabad", "Pune", "Jaipur", "Lucknow",
    "Kochi", "Chandigarh", "Bhopal", "Patna", "Indore",
    "Surat", "Visakhapatnam", "Nagpur", "Thiruvananthapuram", "Guwahati"
};
        for(String s : cities){
            h.add(s);
        }
        System.err.println(h);
        Iterator<String> it  = h.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }
    }
}