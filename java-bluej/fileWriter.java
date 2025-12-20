import java.io.*;

public class fileWriter{
    public static void main(String[] args) throws IOException {
 

    FileWriter fw = new FileWriter("example.txt");
    //FileWriter fw = new FileWriter("example.txt",true); append = true
    fw.write("Hello, File Handling!");
    fw.close();
 
    }
}