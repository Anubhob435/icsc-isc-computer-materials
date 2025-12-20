import java.io.*;
public class Equation{

    public static void main (String[] args)  throws IOException{
        FileWriter writer = new FileWriter("java.txt");
        writer.write(" this is a java code \n");
        System.out.println(" it has been created ");
        writer.close();
    }

    
}