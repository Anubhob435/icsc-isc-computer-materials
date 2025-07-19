public class Exxample {
    public static int world(int n){
        if (n < 1)
            return 0;
        System.out.println(" hello java");
        world(n-1);
        return 0;
    }

    public static int number(int x, int sum){
        if(x>10) {
            return 0;
        }

            System.out.println(x);
            System.out.println(sum);
        number(x+1, sum);
       return n + ()
    }

    public static void main(String [] args){
       // for(int i = 0; i <5; i+=0){
         // System.out.println(i);
         // i++;
        //}
        /*
        int x = 45871;
        int sum = 0;
        do {
            int mod = x % 10;
            x = x / 10;
            sum = sum + mod;
        }while (x !=0);
        System.out.println(sum);
        */

      //  world(5);
        //number(1, 0);
        int x = number(1, 0);
        System.out.println(x);

/*
        for(int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for( int j = 10; j>=1; j--){
            System.out.print(j+ " ");
        }
        */


    }
}
