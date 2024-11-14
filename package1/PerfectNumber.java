package package1;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 100000000; i++) {
            if (isPerfect(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPerfect(int n) {
        if (n == 1) {
            return false;
        }
        int limit = (int) Math.sqrt(n);
        int i = 2;
        int sum = 1;
        while (i <= limit) {
            if (n % i == 0) {
                sum += i;
                if (i != (n/i)) {
                    sum += (n / i);
                }
            }
            i++;
        }
        return sum == n;
    }
}
