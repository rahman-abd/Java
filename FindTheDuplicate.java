public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 5, 7, 6, 3, 3 };
        System.out.println(find(arr));
    }

    static int find(int[] num) {
        int i = 0;
        while (i < num.length) {
            if (num[i] != i + 1) {
                int c = num[i];
                if (num[i] != num[c]) {
                    int t = num[i];
                    num[i] = num[c];
                    num[c] = t;

                } else {
                    return num[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }
}
