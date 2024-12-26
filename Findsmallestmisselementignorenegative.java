

public class Findsmallestmisselementignorenegative {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 3, 4 };

        // System.out.println(Arrays.toString(arr));
        System.out.println(find(arr));
    }

    static int find(int[] num) {
        int i = 0;
        while (i < num.length) {

            int c = num[i] - 1;
            if ( num[i] > 0 && num[i] <= num.length&&num[i] != num[c]) {
                int t = num[i];
                num[i] = num[c];
                num[c] = t;

            } else {
                i++;
            }
        }

        for (int j = 0; j < num.length; j++) {
            if (num[j] != j + 1) {
                return j + 1;
            }
        }
        return num.length + 1;
    }
}
