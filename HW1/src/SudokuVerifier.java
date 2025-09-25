import java.util.Scanner;

public class SudokuVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i ++) { //Kiểm tra hàng
            if (!isValid(board[i])) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) { //Kiểm tra cột
            int[] column = new int[9];
            for (int i = 0; i < 9; i++) {
                column[i] = board[i][j];
            }
            if (!isValid(column)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) { //Kiểm tra 9 ô
            for (int j = 0; j < 9; j += 3) {
                int[] block = new int[9];
                int idx = 0;
                for (int blockRow = i; blockRow < i + 3; blockRow++) {
                    for (int blockCol = j; blockCol < j + 3; blockCol++) {
                        block[idx++] = board[blockRow][blockCol];
                    }
                }
                if(!isValid(block)) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean isValid (int[] a) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 9; i++) {
            if (a[i] < 1 || a[i] > 9 || seen[a[i]]) {
                return false;
            }
            seen[a[i]] = true;
        }
        return true;
    }
}
