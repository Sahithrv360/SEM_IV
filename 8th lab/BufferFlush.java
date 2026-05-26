import java.io.*;
public class BufferFlush{
    public static void main(String[] args) {
        try {
            Writer w =new FileWriter("sample.txt");
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("Hello World !this is a sample program");
            bw.flush();//sends the data to the file even if file is not closed
            //close() implicitly calls flush()
        } catch (Exception e) {
            e.getMessage();
        }
    }
}