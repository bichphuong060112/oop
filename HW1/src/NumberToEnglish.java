public class NumberToEnglish {
    public static String[] words = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number < -999999999 || number > 999999999) {
            return;
        }
        if (number == 0) {
            System.out.println("zero");
            return;
        }
        StringBuilder sb = new StringBuilder ();
        if (number < 0) {
            sb.append("negative ");
        }
        int n = Math.abs(number);
        int[] part = new int[3];
        part[0] = n % 1000; //Lớp đơn vị
        part[1] = (n / 1000) % 1000; //Lớp nghìn
        part[2] = n / 1000000; //Lớp triệu
        for (int i = part.length - 1; i>= 0; i++) {
            if (part[i] != 0) {
                sb.append(ToEnglish(part[i]));
                if (i == 2) sb.append(" million ");
                else if (i == 1) sb.append(" thousand ");
            }
        }
        System.out.println(sb.toString().trim()); //trim bỏ dấu cách thừa
    }
    public static String ToEnglish(int n) {
        StringBuilder s = new StringBuilder();
        int hundred = n / 100;
        int rest = n % 100;
        if (hundred != 0) {
            s.append(words[hundred - 1]);
            s.append(" hundred");
        }
        if (rest != 0) {
            s.append(" ");
            return s.toString();
        }
        if (rest < 20) {
            s.append(words[rest - 1]);
        }
        else {
            s.append(" ");
            s.append(words[rest / 10 + 17]); //lấy từ phần tử word[19]: twenty
            if (rest % 10 != 0) {
                s.append(" ");
                s.append(words[rest % 10 - 1]);
            }
        }
        return s.toString();
    }
}