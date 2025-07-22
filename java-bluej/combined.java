import java.util.Scanner;
public class combined{
    public static int factorial(int n ){
        
        int product = 1;
        for(int i = 1; i<=n; i++){
            product = i* product;
        }
        
        return product;
    }
    
    public static void fibbonaci(int x){
        int a = 0;
        int b = 1;

        System.out.print( a + " " + b);
        
        if( x<=2){
            System.out.println(" already printed");
        
        }
        else{
            for( int i = 3; i<=x; i++){
                int c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
    public static int sum(int[] array){
        
        int length = array.length -1;
        
        int sum = 0;
        
        for( int i = 0; i<=length; i++){
            
            sum = sum+array[i];
        }
        return sum;
    }
    
    public static  String conversion(String x){
        int length = x.length()-1;
        String reverse = "";
        for(int i = length; i<=0; i--){
            reverse = reverse + x.charAt(i);
            
        }
        
        return reverse;

        
    }
    
}