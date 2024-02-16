/** INSERTION SORT */

public class insertion {
    public static void main(String[] args) {
        int[] intarr = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intarr.length; firstUnsortedIndex++) {
            // imaginary location for the elemnt that is compared and inserted at
            int newelement = intarr[firstUnsortedIndex];
            int i;
            // looking for insertion postion until we hit the index 1 and then at the
            // starting of the array
            for (i = firstUnsortedIndex; i > 0 && intarr[i - 1] > newelement; i--) {
                // Shifting for inserting the element at right side
                intarr[i] = intarr[i - 1];

            }
            // shifting and placing of element
            intarr[i] = newelement;
        }

        for (int i = 0; i < intarr.length; i++) {
            System.out.println(intarr[i]);

        }
    }

}
