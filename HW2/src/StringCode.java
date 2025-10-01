public class StringCode {
    public static String blowup(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                if (i + 1 < n) {
                    int times = c - '0';
                    char next = str.charAt(i + 1);
                    for (int j = 0; j < times; j++) {
                        sb.append(next);
                    }
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int maxRun(String str) {
        if (str == null) {
            return 0;
        }
        int max = 1;
        int times = 1;
        int n = str.length();
        for (int i= 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                times++;
                if (times > max) {
                    max = times;
                }
            } else {
                times = 1;
            }
        }
        return max;
    }

    public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0) {
            return false;
        }
        if (a.length() < len || b.length() < len) {
            return false;
        }
        int na = a.length();
        int nb = b.length();
        for (int i = 0; i <= na - len; i++) {
            String subA = a.substring(i, i + len);
            for (int j = 0; j <= nb - len; j++) {
                String subB = b.substring(j, j + len);
                if (subA.equals(subB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(blowup("a3tx2z"));
        System.out.println(blowup("12x"));
        System.out.println(maxRun("xxyyyz"));
        System.out.println(maxRun("xyz"));
        System.out.println(stringIntersect("abcde", "xycdez", 3));
    }
}
