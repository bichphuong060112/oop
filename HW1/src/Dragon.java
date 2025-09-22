public class Dragon {
    //Quy luật sinh Dragon Curve: D(n) = D(n - 1) + "L" + đảo ngược (từ L thành R và ngược lại) * và đổi chiều của Curve
    public static String dragonCurve(int n) {
        if (n == 0) {
            return "F";
        }
        String prev = dragonCurve(n - 1);
        return dragonCurve(n - 1) + "L" + reverseAndFlip(prev);
    }

    public static String reverseAndFlip (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) { //Đổi chiều chạy từ cuối lên
            char c = s.charAt(i);
            //Đảo ngược
            if (c == 'L') {
                sb.append('R'); //nối thêm một chuỗi hoặc ký tự vào cuối
            }
            else {
                if (c == 'R') {
                    sb.append('L');
                }
                else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        for (int i = 0; i < 6; i++) {
            String result = dragonCurve(i);
            System.out.println(result);
        }
    }
}
