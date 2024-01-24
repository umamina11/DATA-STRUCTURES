//Rearrange the array elements so that positive and negative numbers are placed alternatively. 
//A number of positive and negative numbers need not be equal. If there are more positive numbers they
// appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.

import java.io.*;

public class positivenegative {

    static void rearrange(int arr[], int n) {

        int i = -1, temp = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int pos = i + 1, neg = 0;

        while (pos < n && neg < pos && arr[neg] < 0) {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    /* Driver function to check for above functions */
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: ");
        printArray(arr, n);
    }
}
