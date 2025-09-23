public class Exp {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        boolean Negative = false;
        if (x < 0) {
            Negative = true;
            x = -x;
        }
        double term = 1.0;
        double sum = 0.0;
        int n = 1;
        while (sum != sum + term) { //Khai triển đến khi term tiến đến 0
            sum += term;
            term *= x / n;
            n++;
        }
        if (Negative) {
            sum = 1.0 / sum;
        }
        System.out.println(sum);
    }
}
