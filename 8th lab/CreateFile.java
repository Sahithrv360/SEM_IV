import java.io.File;
public class CreateFile{
    public static void main(String[] args) {
        try{
        File f = new File("abc.txt");
        String s = "hello";
        System.err.println(""+f.exists());
        if (f.createNewFile()) System.err.println("File created : "+f.getName());
        else System.err.println("File already created");
        }catch(Exception e){
            e.getMessage();
        }
    }
}