public class MagicSquare {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0 || n < 0) {
            return;
        }
        int[][] magic = new int[n][n];
        int row = n - 1;
        int col = n / 2;
        magic[row][col] = 1;
        for (int i = 2; i <= n * n; i++) {
            if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n; //đi xuống
                col = (col + 1) % n; // sang phải
            }
            else {
                row = (row - 1 + n) % n; //đi lên
            }
            magic[row][col] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }
    }
}
