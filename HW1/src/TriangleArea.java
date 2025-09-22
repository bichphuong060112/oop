public class TriangleArea {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if ( a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            return;
        }
        double s = (a + b + c) / 2;
        System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
