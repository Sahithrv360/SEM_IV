final class AadharGenerator {
    private static long Id = 1000_0000_0000L;
    public String generator(){
        Id++;
        return String.valueOf(Id);
    }
}
public class ID extends AadharGenerator{
    public static void main (String[] args) {
        ID i = new ID();
        System.out.println(i.generator());
    }
}