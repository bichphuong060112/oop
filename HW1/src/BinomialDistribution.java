public class BinomialDistribution {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        double[][] binomial = new double [n + 1][]; //mảng jagged, mỗi phần tử là 1 mảng, "mảng trong mảng"
        binomial[1] = new double[3];
        binomial[1][1] = 1.0;
        for (int i = 2; i<=n; i++) {
            binomial[i] = new double[i + 2];
            for (int j = 1; j < binomial[i].length - 1; j++) {
                binomial[i][j] = (binomial[i - 1][j - 1] + binomial[i - 1][j]) * 0.5;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < binomial[i].length - 1; j++) {
                System.out.print(binomial[i][j] + " ");
            }
            System.out.println();
        }
    }
}
