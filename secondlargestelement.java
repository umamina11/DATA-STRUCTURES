// In the given array of integers, write a program that efficiently finds the second largest element
//present in the array.

// element in an array
import java.util.*;

public class secondlargestelement {

    // second largest elements
    static void print2largest(Integer arr[], int arr_size) {
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1; i < arr_size; i++) {
            // Comparing the elements
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                        + "element is %d\n",
                        arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                + "largest element\n");
    }

    public static void main(String[] args) {
        Integer arr[] = { 0, 1, 3, 2, 6, 1, 3, 6, 8 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
