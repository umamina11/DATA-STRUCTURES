/*implementing the bubble sort  */

public class bubble_Sort {
    public static void main(String[] args) {
        // array for the sorting purpose
        int[] intarray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastunsortedindex = intarray.length - 1; lastunsortedindex > 0; lastunsortedindex--) {
            for (int i = 0; i < lastunsortedindex; i++) {
                if (intarray[i] > intarray[i + 1]) {
                    swap(intarray, i, i + 1);
                }
            }
        }
        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }

    }

    // Swap method
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
