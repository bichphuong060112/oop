public class FibonacciWord {
    public static void main (String[] args) {
        String f0 = "a";
        String f1 = "b";
        System.out.println(f0);
        System.out.println(f1);
        String fn1 = f0;
        String fn2 = f1;
        for (int i = 2; i <= 10; i++) {
            String fn = fn1 + fn2;
            System.out.println(fn);
            fn2 = fn1;
            fn1 = fn;
        }
    }
}
