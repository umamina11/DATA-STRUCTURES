public class merge {

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
        } // this will end then mergeing phase will start

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
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        // varibales that are going to use for the merging and assigning the inital
        // values
        int i = start;
        int j = mid;
        int tempindex = 0;
        // temporary array

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            // travesing the between the left and the right array
            temp[tempindex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // handeling the remaining elements that has not been traversed in the left the
        // array
        System.arraycopy(input, i, input, start + tempindex, mid - i);
        System.arraycopy(temp, 0, input, start, tempindex);// copying the number we copied in temp array
    }
}
