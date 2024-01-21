
//Given an array arr[] of integers, segregate even and odd numbers in the array such that all the even numbers should be
// present first, and then the odd numbers.

public class seperatingevenodd {

    static void arrayEvenAndOdd(int arr[], int n) {

        int i = -1, j = 0;
        while (j != n) {
            if (arr[j] % 2 == 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        // Printing segregated array
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;
        arrayEvenAndOdd(arr, n);
    }
}