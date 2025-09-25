public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] visited = new boolean[n][n]; //đánh dấu ô đã chạm
        int steps = 0;
        int toVisit = n * n;
        int[][] walkers = new int[n][2]; //tọa độ của n người
        for (int i = 0; i < n; i++) { // Khởi tạo ở trung tâm
            walkers[i][0] = n / 2;
            walkers[i][1] = n / 2;
        }
        visited[n / 2][n / 2] = true;
        toVisit--;
        while (toVisit > 0) {
            for (int i = 0; i < n; i ++) {
                double r = Math.random();
                int newX = walkers[i][0];
                int newY = walkers[i][1];
                if (r <= 0.25) newX = walkers[i][0] + 1; //sang phải
                else if (r <= 0.5) newX = walkers[i][0] - 1; //sang trái
                else if (r <= 0.75) newY = walkers[i][1] + 1; //lên trên
                else newY = walkers[i][1] - 1; //xuống dưới
                if (newX >= 0 && newX < n && newX != walkers[i][0]) {
                    steps++;
                    walkers[i][0] = newX;
                }
                if (newY >= 0 && newY < n && newY != walkers[i][1]) {
                    steps++;
                    walkers[i][1] = newY;
                }
                if (!visited[walkers[i][0]][walkers[i][1]]) {
                    toVisit--;
                    visited[walkers[i][0]][walkers[i][1]] = true;
                }
            }
        }
        System.out.println(steps);
    }
}
