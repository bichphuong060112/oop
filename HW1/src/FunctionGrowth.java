public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.printf("%-6s %-8s %-12s %-15s %-20s\n", "ln n", "n", "n ln n", "n ^ 2", "n ^ 3");
        for (long i = 2; i <= 2048; i *= 2) {
            long lnN = (long) Math.log(i);
            long nLnN = (long) (i * Math.log(i));
            long n2 = i * i;
            long n3 = i * i * i;
            System.out.printf("%-6d %-8d %-12d %-15d %-20d\n", lnN, i, nLnN, n2, n3);
        }
    }
}
