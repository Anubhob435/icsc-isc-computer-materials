import java.util.Scanner;
public class Fascinatingnumber {
    void fasinating(int n){

        int nn = 55;
        double xy = 10.5;
       // int z = nn * xy;


        int n2 = n * 2;
        int n3 = n * 3;

        String combine = n + "" + n2 + "" + n3;
        System.out.println(combine);
    }
    public static void main(String [] args){
        Fascinatingnumber obj = new Fascinatingnumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter");
        int n = scanner.nextInt();

        if( n>=100)
        obj.fasinating(5);
    }
}




