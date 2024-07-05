package freecodecamp;

public class timecomplexity2 {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        timecomplexity2 demo2 = new timecomplexity2();
        System.out.println(demo2.findSum2(999));

        System.out.println("Time Taken by Approch 1" + (System.currentTimeMillis() - now) + "millisecs");
    }

    public int findSum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = +i;

        }
        return sum;
    }
}
