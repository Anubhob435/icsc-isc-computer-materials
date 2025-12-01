import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt", true);
        writer.write("Hello from Java!\n");
        writer.write("This is a text file created without try-catch again.");
        writer.close();
        System.out.println("example.txt created successfully!");
    }
}
