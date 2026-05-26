import java.io.*;
import java.net.*;
public class Sender{
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String str  = "Bheeshma is a Gay";
        FileInputStream fp = new FileInputStream("chap.pdf");
        byte[]buf = new byte[1000];
        
        InetAddress ip = InetAddress.getByName("192.168.1.38");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}
// import java.io.File;
// import java.io.FileInputStream;
// import java.net.DatagramPacket;
// import java.net.DatagramSocket;
// import java.net.InetAddress;
// import java.util.Arrays;

// public class Sender {

//     public static void main(String[] args) throws Exception {
//         // --- 1. CONFIGURATION ---
//         String FILE_PATH = "C:/Users/sahit/OneDrive/Pictures/Screenshot 2024-06-01 142650.png"; // ⬅️ CHANGE THIS to your file path
//         String RECEIVER_IP = "192.168.1.7";              // ⬅️ CRITICAL CHANGE: Receiver's IP
//         int RECEIVER_PORT = 3000;
//         int PACKET_SIZE = 1000;                           // Max size of data in each packet

//         // --- 2. SETUP NETWORK & FILE ---
//         DatagramSocket ds = new DatagramSocket();
//         InetAddress ip = InetAddress.getByName(RECEIVER_IP);
//         File file = new File(FILE_PATH);
        
//         if (!file.exists()) {
//             System.err.println("Error: File not found at " + FILE_PATH);
//             ds.close();
//             return;
//         }

//         FileInputStream fis = new FileInputStream(file);
//         byte[] buffer = new byte[PACKET_SIZE];
//         int bytesRead;
//         long totalBytesSent = 0;
//         int sequenceNumber = 0;

//         // --- 3. SEND FILE DATA IN CHUNKS ---
//         System.out.println("Starting transfer of file: " + file.getName() + " (" + file.length() + " bytes)");

//         while ((bytesRead = fis.read(buffer)) != -1) {
            
//             // Create a packet for the current chunk of data
//             // We use Arrays.copyOf to ensure the packet size is exactly 'bytesRead' for the last chunk
//             byte[] dataToSend = Arrays.copyOf(buffer, bytesRead);

//             // You would normally add a HEADER here with sequence number and file info
//             // For simplicity, we just send the raw data
//             DatagramPacket dp = new DatagramPacket(
//                 dataToSend, 
//                 dataToSend.length, 
//                 ip, 
//                 RECEIVER_PORT
//             );

//             ds.send(dp);
//             totalBytesSent += bytesRead;
//             sequenceNumber++;

//             // Optional: Slow down sending to avoid overwhelming a basic receiver
//              Thread.sleep(1); 
//         }

//         fis.close();
//         System.out.println("File data sent: " + totalBytesSent + " bytes in " + sequenceNumber + " packets.");

//         // --- 4. SEND COMPLETION SIGNAL ---
//         String completeMsg = "!!!FILE_TRANSFER_COMPLETE!!!" + file.getName();
//         DatagramPacket completeDp = new DatagramPacket(
//             completeMsg.getBytes(), 
//             completeMsg.length(), 
//             ip, 
//             RECEIVER_PORT
//         );
//         ds.send(completeDp);
        
//         System.out.println("Completion signal sent.");
//         ds.close();
//     }
// }