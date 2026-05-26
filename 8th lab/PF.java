import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class PF {
    public static void main(String[] args) {
        try (FileChannel channel = new FileOutputStream("output.txt").getChannel()) {

            ByteBuffer buffer = ByteBuffer.wrap("Hello from FileChannel!".getBytes());
            channel.write(buffer);

            System.out.println("Data written successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
