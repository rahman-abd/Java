package package1;

public class PerfectNumbersOptimized {

    public static void main(String[] args) {
        int limit = 100_000_000;
        System.out.println("Perfect numbers under " + limit + ":");

        for (int p = 2; ; p++) {
            int mersennePrime = (1 << p) - 1; // 2^p - 1
            if (isPrime(mersennePrime)) {
                long perfectNumber = (1L << (p - 1)) * mersennePrime; // 2^(p-1) * (2^p - 1)
                if (perfectNumber >= limit) break;
                System.out.println(perfectNumber);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
