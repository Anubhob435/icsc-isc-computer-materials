public class scratch {
    public static void main(String[] args) {
        int N = 4;
        int sum = 0;
        int x = 1;
        int total = 0;

        for(int i = 0; i < N; i++){
            sum = sum + x;
            x = x + 3;
            total = total + sum ;
        }
        System.out.println(total);
    }
}