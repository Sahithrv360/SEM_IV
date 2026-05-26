import java.net.*;
public class Net{
    public static void main(String[] args) {
        try{
        InetAddress i = InetAddress.getByName("cbit.ac.in");
        System.err.println("Host : " + i.getHostName());
        System.err.println("Ip : "+i.getHostAddress());
        }catch(Exception e){
            e.getMessage();
        }
    }
}