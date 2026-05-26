import java.net.*;
public class Receiver{
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(3000);
        byte []by = new byte[1024];
        DatagramPacket dp = new DatagramPacket(by, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.err.println(str);
        ds.close();
    }
}