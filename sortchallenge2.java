/* SORT CHALLENGE 2
 * Change the insertion sort so that it uses recursion
 * sort the usual example array 
 * you can start with the project in the resources section
 * 
 * 
 * Understanding
 * insertion sort as we know in insertion sort we take up a value comapre it with the other elements 
 * and place it at the right position in the array 
 * the mechanism work as take index 0 values comapare it with index1 and then index 2 and soo on...
 * using the for loop 
 * for recusion we need to call the method itself in the code 
 * so we will create a class and then call it for sorting the array 
 * 
 */

public class sortchallenge2 {
    public static void insertionSortRecursive(int[] arr, int n) {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive(arr, n - 1);

        // Insert last element at its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements greater than last to one position ahead of their current
        // position
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place last element at its correct position
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = { 12, -11, 13, 5, 6 };
        int n = arr.length;

        insertionSortRecursive(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
