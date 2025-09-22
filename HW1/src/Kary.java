public class Kary {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        int k = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        if(base < 2 || base >16) {
            return;
        }
        if (k == 0) {
            return;
        }
        String digits = "0123456789ABCDEF";
        String result = "";
        while (k > 0) {
            int r = k % base;
            result = digits.charAt(r) + result;
            k = k / base;
        }
        System.out.println(result);
    }
}
