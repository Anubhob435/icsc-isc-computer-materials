//import java.io.FileWriter;
//import java.io.IOException;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt", true); //the 'true' here represents append 
        
        writer.write("Hello from Java!\n");
        writer.write("This is a text file created without try-catch again.");
        
        System.out.println("example.txt created successfully!");
        
        writer.close();
    }
}
