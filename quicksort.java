public class quicksort {

    public static void main(String[] args) {
        // array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        // calling sort method
        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        // recursive call
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // empty loop when i crosess the j
            while (i < j && input[--j] >= pivot)
                ;
            if (i < j) {
                input[i] = input[j];
            }

            // empty loop body when j crossess the i
            while (i < j && input[++i] <= pivot)
                ;
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}
