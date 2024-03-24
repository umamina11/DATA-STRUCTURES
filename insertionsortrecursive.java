/** INSERTION SORT */

public class insertionsortrecursive {
    public static void main(String[] args) {
        int[] intarr = { 20, 35, -15, 7, 55, 1, -22 };
        // first call
        insertionSort(intarr, intarr.length);

        /*
         * for (int firstUnsortedIndex = 1; firstUnsortedIndex < intarr.length;
         * firstUnsortedIndex++) {
         * // imaginary location for the elemnt that is compared and inserted at
         * int newelement = intarr[firstUnsortedIndex];
         * int i;
         * // looking for insertion postion until we hit the index 1 and then at the
         * // starting of the array
         * for (i = firstUnsortedIndex; i > 0 && intarr[i - 1] > newelement; i--) {
         * // Shifting for inserting the element at right side
         * intarr[i] = intarr[i - 1];
         * 
         * }
         * // shifting and placing of element
         * intarr[i] = newelement;
         * }
         */
        for (int i = 0; i < intarr.length; i++) {
            System.out.println(intarr[i]);

        }
    }

    public static void insertionSort(int[] input, int numitems) {
        // break in conditon for the loop
        if (numitems < 2) {
            return;
        }
        insertionSort(input, numitems - 1);

        int newelement = input[numitems - 1];
        int i;
        // sorting the last element
        for (i = numitems - 1; i > 0 && input[i - 1] > newelement; i--) {
            input[i] = input[i - 1];

        }
        input[i] = newelement;
        // Printing each step in insertion sort
        System.out.println("result of call when numitems=" + numitems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("----------------");
    }
}
