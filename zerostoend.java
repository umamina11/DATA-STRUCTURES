//Given an array of random numbers, Push all the zero’s of a given array to the end of the array

import java.io.*;

public class zerostoend {

    // Function which contain the line of code for moving back the 0 of the array.
    static void pushZerosToEnd(int arr[], int n) {
        int count = 0; // Count of non-zero elements

        // if the element encountered is non zeros then change the index value by
        // shifting is in front.
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    @Override
    public String toString() {
        return "zerostoend []";
    }
}
