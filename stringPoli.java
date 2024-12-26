public class stringPoli {
    public static void main(String[] args) {
        String a = "absa";
        boolean ans = find(a);
        System.out.println(ans);
    }

    static boolean find(String a) {
        if (a == null || a.length() == 0) {
            return true;
        }
        a = a.toLowerCase();
        // for (int i = 0; i <= a.length() / 2; i++) {
        //     char start = a.charAt(i);
        //     char end = a.charAt(a.length() - 1 - i);
        //     if (start != end) {
        //         return false;
        //     }

        // }
        // return true;
        int i=0;
         while(i <= a.length() / 2) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);
            if (start != end) {
                return false;
            }
            i++;

        }
        return true;

    }
}
