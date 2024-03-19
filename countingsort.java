public class countingsort {
    public static void main(String[] args) {
        int[] intarr = { 2, 5, 9, 2, 8, 7, 10, 4, 3 };
        counting(intarr, 1, 10);
        for (int i = 0; i < intarr.length; i++) {
            System.out.println(intarr[i]);
        }

    }

    public static void counting(int[] input, int min, int max) {
        int[] countarr = new int[(max - min) + 1];

        // travsrse the array
        for (int i = 0; i < input.length; i++) {
            countarr[input[i] - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countarr[i - min] > 0) {
                input[j++] = i;
                countarr[i - min]--;
            }
        }
    }
}