package SearchAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] intArr = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println(LinearSearch(intArr, -15));
        System.out.println(LinearSearch(intArr, 15));
    }

    public static int LinearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
