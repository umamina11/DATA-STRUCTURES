/*SORT ALGORITHM _CHALLENGE 1 */

/* modify the merge sort algorithm so that it sorts integers in DESCENDING order
 * Use the usual example of array 
 * you can start with rpoejct in the resource section
 * 
 */

/**
 * theortical idea
 * so if we look at the merge sort what is the fucntion of merger sort it
 * divides the array in two parts and then furhter divide both individuall in
 * two differnt parts and then perfom this untill we get single element array
 * till the end
 * 
 * once we reach at that point we start sorting individual array and merge
 * so slowing we get back to the top sorting each array and merging them and get
 * a final sorted array
 * By deafault the algorithm will sort it in ascedning order so here we will
 * make the conditon of swaping and
 * placement of elements who is larger will comes at the left side and the
 * smaller one at the right side.
 * 
 * process
 * 
 * first print the array in the main function
 * then another class named as merge sort where the functions of the sorting
 * will take
 * place
 * splitting the array until we get the single element array using the for loop
 * now merging stages which the imoortant one and where we need to make the
 * changes
 * a tmeporray array which will collected the sorted elements and then place it
 * in the
 * input array
 */
package challenges;

public class sortchallenge1 {

    public static void main(String[] args) {
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 }; // defining the array
        mergesort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergesort(int[] input, int start, int end) {
        // this method will break when we have the one element array
        if (end - start < 2) {
            return;
        }

        // when we have more than one element in the array

        int mid = (start + end) / 2;
        mergesort(input, start, mid); // left part of the array
        mergesort(input, mid, end); // right part of the array

        // merge method to merge all the array
        merge1(input, start, mid, end);

    }

    public static void merge1(int[] input, int start, int mid, int end) {
        // no need of merging for the mid element as it is last and the first element in
        // the left and the right partitation
        if (input[mid - 1] >= input[mid]) {
            return;
        }
        // variables that are going to use for the merging and assigning the inital
        // values
        int i = start;
        int j = mid;
        int tempindex = 0;
        // temporary array

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            // travesing the between the left and the right array
            temp[tempindex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        // handeling the remaining elements that has not been traversed in the left the
        // array
        System.arraycopy(input, i, input, start + tempindex, mid - i);
        System.arraycopy(temp, 0, input, start, tempindex);// copying the number we copied in temp array
    }
}
