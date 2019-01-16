public class Pi {
    /**
    *@param args this is the main method
    */

    public static void main(String[] args) {
        int numTries = 1000000;
        int in = 0;
        int total;
        for (total = 1; total <= numTries; total++) {
            double x = Math.random();
            double y = Math.random();
            in += (((x * x) + (y * y) <= 1.0) ? 1 : 0);
        }
        System.out.println("Pi Estimate: " + ((double) 4 * in) / total);
    }
}
