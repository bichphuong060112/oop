public class TetrisGrid {
    private boolean[][] grid;

    public boolean[][] getGrid() {
        return grid;
    }

    public void setGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public void clearRows() {
        int width = grid.length;
        int height = grid[0].length;
        int target = 0;
        for (int y = 0; y < height; y++) {
            if ( !isFull(y)) {
                for (int x = 0; x < width; x++) {
                    grid[x][target] = grid[x][y];
                }
                target++;
            }
        }
        for (int y = target; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = false;
            }
        }
    }

    private boolean isFull(int y) {
        for (int x = 0; x < grid.length; x++) {
            if (!grid[x][y]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[][] {
                {false, false, true},
                {true, true, false}
        };
        TetrisGrid tg = new TetrisGrid(grid);
        tg.clearRows();
        int width = grid.length;
        int height = grid[0].length;
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }
    }
}
