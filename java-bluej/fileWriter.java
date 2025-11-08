import java.io.FileWriter;

public class fileWriter{
    public static void main(String[] args) throws java.io.IOException {
 

    FileWriter fw = new FileWriter("example2.txt");
    fw.write("Hello, File Handling!");
    fw.close();
 
    }
}