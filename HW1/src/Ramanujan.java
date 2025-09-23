public class Ramanujan {
    public static void main (String[] args) {
        if (args.length != 1) {
            return;
        }
        int n = Integer.parseInt(args[0]);
        int limit = (int) Math.cbrt(n) + 1; //do a ^ 3 phải nhỏ hơn hoặc bằng n
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int a3 = a * a * a;
                int b3 = b * b * b;
                int s = a3 + b3;
                if (s > n) continue;
                for(int c = a + 1; c <= limit; c++) {
                    int c3 = c * c * c;
                    for (int d = c; d <= limit; d++) {
                        int d3 = d * d *d;
                        if (c3 + d3 > s) break;
                        if (c3 + d3 == s) {
                            System.out.println(s + " = " + a + " ^ 3 + " + b + " ^ 3 = " + c + " ^ 3 + " + d + " ^ 3");
                        }
                    }
                }
            }
        }
    }
}
