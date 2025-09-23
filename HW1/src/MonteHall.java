public class MonteHall {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int win = 0;
        for (int i = 0; i < n; i++) {
            int prize = (int) (3 * Math.random());
            int choice = (int) (3 * Math.random());
            int open;
            do {
                open = (int) (3 * Math.random());
            } while ((open == choice) || (open == prize)); //random đến khi khác choice và prize
            int remain = 3 - choice - open;
            if (remain != prize) {
                win++;
            }
        }
        System.out.println((double) win / n);
    }
}
