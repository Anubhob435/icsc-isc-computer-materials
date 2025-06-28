import java.util.Scanner;
public class practice2 {

    public static boolean isprime(int n){

        boolean isprime= true;

        if(n <= 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else{
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    isprime = false;
                    break;
                }

            }
        }
        return isprime;
    }


    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int A = scanner.nextInt();


        System.out.println("enterr b");
        int b = scanner.nextInt();


        if(Math.abs(A-b)==2){
            if(isprime(A) == true && isprime(b)== true){
                System.out.println("TWIN PRIME");

            }
            else{
                System.out.println("not twinn prime");
            }

        }
        else{
            System.out.println(" not twin prime");
        }


    }


}


