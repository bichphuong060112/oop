public class SumOfTwoDice {
    public static void main (String[] args) {
        int a = 1 + (int) (Math.random() * 6); //random số nguyên trong khoảng [0, 6)
        int b = 1 + (int) (Math.random() * 6);
        System.out.println(a + b);
    }
}
