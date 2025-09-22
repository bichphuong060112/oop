public class BMI {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        System.out.println(weight / (height * height));
    }
}
