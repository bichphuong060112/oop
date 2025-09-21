public class Distance {
    public static void main (String[] args) {
        if (args.length < 2) {
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance = Math.sqrt(x * x + y * y);
        System.out.println(distance);
    }
}
