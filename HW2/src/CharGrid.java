public class CharGrid {
    private char[][] grid;

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    public int charArea(char ch) {
        int row = grid.length;
        int col = grid[0].length;
        int minRow = row, maxRow = -1;
        int minCol = col, maxCol = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        if (maxRow == -1) {
            return 0;
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public int countPlus() {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (isCenterOfPlus(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isCenterOfPlus(int i, int j) {
        char ch = grid[i][j];
        int up = countBranch(i, j, -1, 0, ch);
        int down = countBranch(i, j, 1, 0, ch);
        int left = countBranch(i, j, 0, -1, ch);
        int right = countBranch(i, j, 0, 1, ch);
        if (up >= 2 && down >= 2 && left >=2 && right >= 2) {
            return (up == down && left == right);
        }
        return false;
    }

    private int countBranch(int i, int j, int di, int dj, char ch) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int ni = i + di;
        int nj = j + dj;
        while (ni >= 0 && ni < row && nj >= 0 && nj < col && grid[ni][nj] == ch) {
            count++;
            ni += di;
            nj += dj;
        }
        return count;
    }

    public static void main (String[] args) {
        char[][] grid = new char[][] {
                {'a', 'b', 'c', 'd'},
                {'a', ' ', 'c', 'b'},
                {'x', 'b', 'c', 'a'}
        };
        CharGrid cg = new CharGrid(grid);
        System.out.println(cg.charArea('a'));
        System.out.println(cg.charArea('c'));
        System.out.println(cg.countPlus());
    }
}
