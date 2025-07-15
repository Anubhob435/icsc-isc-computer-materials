import java.util.Scanner;
public class Pronicnumber {
    void pronic(int n){

        boolean is_pronic = false;
        int product = 0;
        for(int i = 1; i<=n; i++){
            product = i* (i+1);
            if( product == n){
                //System.out.println(" it is pronic");
                is_pronic = true;
                break;
            }

        }
        if (is_pronic == true)

            System.out.println(" it is pronic");


    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter");
        int n = scanner.nextInt();

        Pronicnumber obj = new Pronicnumber();
        obj.pronic(n);
    }
}
