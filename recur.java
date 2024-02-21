public class recur {
    public static void main(String[] args) {
        System.out.println(interativefactorial(10));
        System.out.println(recursivefactorial(5));
    }

    /*
     * this function will work as
     * recursivefactorial (o)
     * recursivefactorial (1)
     * recursivefactorial (2)
     * recursivefactorial (3)
     * .
     * .
     * .
     * .
     * so on unitll it reach the user demand
     */
    public static int recursivefactorial(int num) {
        if (num == 0) {
            return 1;

        }
        return num * recursivefactorial(num - 1);
    }

    /**
     * here this function will work as
     * 0! = 1
     * 1 * 0! = 1
     * 2 * 1 * 0! = 2
     * 3 * 2 * 1 * 0! = 6
     * .
     * .
     * .
     * so on until gets the user wanted result
     */
    public static int interativefactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

}
