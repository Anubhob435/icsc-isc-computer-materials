import java.awt.desktop.SystemEventListener;

public class PascalTriangle{
    public static void main(String[] args){
        int N = 4;
        for (int i =1; i<= 4; i++) {

            for (int z = 4; z > i; z--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int x = i - 1; x >= 1; x--) {
                System.out.print(x + " " );
            }
            System.out.println();


        }
        int M = N -1;

        for (int k = M; k>= 1; k--){
            for(int p = 4; p > k; p --){
                System.out.print("  ");
            }

            for(int q = 1; q <= k; q ++){
                System.out.print(q + " ");
            }
            for (int o = k -1; o >= 1; o --){
                System.out.print(o + " ");
            }


            System.out.println();
        }
    }
}