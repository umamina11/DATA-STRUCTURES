/**
 * public class array {
 * public static void main(String[] args) {
 * // defining and initalising the array
 * int[] intArray = new int[9]; // array name and number of elements in arry
 * 
 * // Defining the element of array at given index
 * intArray[0] = 11;
 * intArray[1] = 1;
 * intArray[2] = -12;
 * intArray[3] = 9;
 * intArray[4] = 61;
 * intArray[5] = -1;
 * intArray[6] = 80;
 * intArray[7] = 111;
 * intArray[8] = -21;
 * 
 * // Printing the elements of array
 * // loop around and iterate the array
 * for (int i = 0; i < intArray.length; i++) {
 * System.out.println(intArray[i]);
 * }
 * 
 * }
 * 
 * }
 * 
 * This is the code now modify this according to the user demand for the number
 * as the index value of the array is not known by the user
 */

public class arrayindex {
    public static void main(String[] args) {
        // defining and initalising the array
        int[] intArray = new int[9]; // array name and number of elements in arry

        // Defining the element of array at given index
        intArray[0] = 11;
        intArray[1] = 1;
        intArray[2] = -12;
        intArray[3] = 9;
        intArray[4] = 61;
        intArray[5] = -1;
        intArray[6] = 80;
        intArray[7] = 111;
        intArray[8] = -21;

        int index = -1;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 61) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }

}
