//Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements to its right side.

import java.io.*;

public class leader {

    void printLeaders(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        leader lead = new leader();
        int arr[] = new int[] { 24, 12, 5, 6, 1, 9, 10 };
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
