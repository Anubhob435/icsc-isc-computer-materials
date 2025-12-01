
import java.io.*;

public class inOut {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("2Dpractice.txt");
            // You can now use fr to read the file
            // Example: read and print the file contents
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
