public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        System.out.println("r = " + Math.sqrt(x * x + y * y));
        System.out.println("theta = " + Math.atan2(y, x)); //Tính arctan của y/x
    }
}
