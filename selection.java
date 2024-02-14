/**
 * SELECTION SORT IMPLEMENTATION
 */

public class selection {
    public static void main(String[] args) {
        int[] intarr = { 20, 35, -15, 7, 55, 1, -22 };
        for (int lasunsortedindex = intarr.length - 1; lasunsortedindex > 0; lasunsortedindex--) {
            int largest = 0;

            for (int i = 1; i <= lasunsortedindex; i++) {
                if (intarr[i] > intarr[largest]) {
                    largest = i;
                }

            }
            swap(intarr, largest, lasunsortedindex);

        }
        for (int i = 0; i < intarr.length; i++) {
            System.out.println(intarr[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;

        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
