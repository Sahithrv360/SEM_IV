import java.util.*;
class Prod{
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.err.print("Enter key : ");
            int id = sc.nextInt();
            System.err.print("Enter name : ");
            String name = sc.next();
            h.put(id, name);
        }
        System.err.print("Enter product ID : ");
        int find = sc.nextInt();
        boolean b = false;
        for(Map.Entry<Integer,String> e : h.entrySet()){
            if(find == e.getKey()){
                System.err.print("Value : "+e.getValue());
                b = true;
                break;
            }else {
                b = false;
            }
        }
        if(!b){
            System.err.println("not found");
        }
    }
}