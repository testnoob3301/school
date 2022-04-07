import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
public class rdfl {
public static void main(String[] args) {
    
    try{
        FileWriter writer = new FileWriter("./lib/file.txt");
        String x = Integer.toString(library.rtprice);
        System.out.println(x);
        writer.write(x);
        writer.close();
        System.out.println("File written");
    } catch (Exception e) {
        System.out.println(e);
    }
}

}