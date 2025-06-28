import java.util.Scanner;
class Dance{

    int power(int x, int y){
        int product = 1;
        for(int i= 1; i<=y; i++){
            product = product*x;
        }
        return product;

    }

    static double usser(){
            System.out.println("Hello World");

        return 0.0;
    }

}
public class Searching extends Dance {
    private static String school(){
        String name = "scis";
        return name;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println( " enter x and y");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        usser();
       System.out.println(school());

       Dance key = new Dance();
       int keyyy= key.power(x,y);
       System.out.println(keyyy);
       System.out.println(Math.pow(x,y));
       
    }


}