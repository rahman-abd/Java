package package1;

public class Sum1toN {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println(sum);
        System.out.println(n * (n + 1) / 2);
        print(n);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(--n);
    }
}