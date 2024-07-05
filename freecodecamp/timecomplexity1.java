package freecodecamp;

public class timecomplexity1 {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        timecomplexity1 demo = new timecomplexity1();
        System.out.println(demo.findsum(999));

        System.out.println("Time Taken by Approch 1" + (System.currentTimeMillis() - now) + "millisecs");
    }

    public int findsum(int n) {
        return n * (n + 1) / 2;
    }

}
