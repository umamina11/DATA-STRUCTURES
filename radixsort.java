public class radixsort {

    public static void main(String[] args) {
        int[] arr = { 4725, 4586, 1330, 8792, 1594, 5729 };
        radixxsort(arr, 10, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // radix sort
    public static void radixxsort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixsinglesort(input, i, radix);
        }
    }

    // radix single sort
    public static void radixsinglesort(int[] input, int position, int radix) {
        int numitems = input.length;

        int[] countarray = new int[radix];

        for (int value : input) {
            countarray[getdigit(position, value, radix)]++;
        }
        // adjust the count array for better functionlity
        for (int j = 1; j < radix; j++) {
            countarray[j] += countarray[j - 1];
        }
        // stable counting sort
        int[] temp = new int[numitems];
        for (int tempindex = numitems - 1; tempindex >= 0; tempindex--) {
            temp[--countarray[getdigit(position, input[tempindex], radix)]] = input[tempindex];
        }
        // copy the values back to input array
        for (int tempindex = 0; tempindex < numitems; tempindex++) {
            input[tempindex] = temp[tempindex];
        }
    }

    public static int getdigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix; // (radix,position) this will get 1 as result
    }
}
