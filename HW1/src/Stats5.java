public class Stats5 {
    public static void main (String[] args) {
        double[] u = new double[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            u[i] = Math.random(); //random các số trong khoảng [0,1)
            System.out.println(u[i]);
            sum += u[i];
        }
        System.out.println("Trung bình cộng = " + (sum / 5.0));
        double min = Math.min(u[0], Math.min(u[1], Math.min(u[2], Math.min(u[3], u[4])))); //Chỉ so sánh 2 số 1 lần
        double max = Math.max(u[0], Math.max(u[1], Math.max(u[2], Math.max(u[3], u[4]))));
        System.out.println("Giá trị nhỏ nhất = " + min);
        System.out.println("Giá trị lớn nhất = " + max);
    }
}
