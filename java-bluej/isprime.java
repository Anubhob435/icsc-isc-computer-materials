import java.util.Scanner;
public class isprime{
    public static boolean isprime( int n ){
        boolean x = true;
        if( n ==2){
            x =true;
            
        } 
        
        for(int i = 2; i<n; i++){
            if(n%i==0){
                x = false;
            }
            
            
        }
        return x;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] x = new int[5];
        System.out.println(" enter ");
        for(int i = 0; i<5; i++){
         x [i]= sc.nextInt();
        
    }
        

    for(int j = 0; j<5; j++){  
        int n = x[j];
        if( isprime(n)==true){
            System.out.println(x[j] + " it is a prime no");
        }
        
    }
        for(int j = 0; j<5; j++){  
        int n = x[j];
        if( isprime(n)==false){
            System.out.println(x[j] + " it is not prime no");
        }
        
    }
}
}