import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("example.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
