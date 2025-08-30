
import java.util.Arrays;

//remove duplicate elements from array

public class question1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Arrays.sort(arr);

        int x = arr.length;

        for (int i = 0; i < x - 1; i++){
            if(arr[i] != arr[i + 1]){
                System.out.println(arr[i]);
            }
        }
        // Print the last element as it won't be checked in the loop
        System.out.println(arr[x - 1]);
    }
}