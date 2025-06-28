public class BubbleSort {

    /**
     * Method to perform Bubble Sort on an array of integers
     * @param array The input array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0; // **Added: Variable to count the number of swaps**
        for (int i = 0; i < n-1; i++) {
            // Flag to check if any swaps were made in the inner loop
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                // If the current element is greater than the next element
                if (array[j] > array[j+1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true; // Set flag to true if a swap occurred
                    swapCount++; // **Increment swap count on each swap**
                }
            }
            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
            // Optional: Print the array after each pass to visualize the sorting process
            // printArray(array, i+1, "Pass", swapCount);
        }
        // **Print the total swap count after sorting**
        System.out.println("Sorting completed. Total swaps: " + swapCount);
    }

    /**
     * Helper method to print the array (optional)
     * @param array The array to print
     * @param passNumber The current pass number (for visualization)
     * @param message Custom message to display
     * @param swapCount Current swap count (for detailed visualization)
     */
    public static void printArray(int[] array, int passNumber, String message, int swapCount) {
        System.out.println(message + " " + passNumber + " [Swaps so far: " + swapCount + "]: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    /**
     * Main method to test the Bubble Sort implementation
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        bubbleSort(array);
        
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}