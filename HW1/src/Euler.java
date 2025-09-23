public class Euler {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long e = 1; e <= n; e++) {
            long e5 = e * e * e * e * e;
            for(long a = 1; a <= e; a++) {
                long a5 = a * a * a * a * a;
                if (5 * a5 > e5) break;
                for (long b = a + 1; b <= e; b++) {
                    long b5 = b * b * b * b * b;
                    if (a5 + 4 * b5 > e5) break;
                    for(long c = b + 1; c <= e; c++) {
                        long c5 = c * c * c * c * c;
                        if (a5 + b5 + 2 * c5 > e5) break;
                        for(long d = c + 1; d <= e; d++) {
                            long d5 = d * d * d * d * d;
                            long s = a5 + b5 + c5 + d5;
                            if(s > e5) break;
                            if(s == e5) {
                                System.out.println(a + " ^ 5 + " + b + " ^ 5 + " + c + " ^ 5 + " + d + " ^ 5 = " + e + " ^ 5");
                            }
                        }
                    }
                }
            }
        }
    }
}
