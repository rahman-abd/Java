import java.util.HashMap;

public class Rough {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        memo.put(0, 0);
        memo.put(1, 1);
        System.out.println(f(50));
    }

    static int f(int n) {
        if (n < 2) {
            return n;
        }
        memo.put(n-1, f(n-1));
        return memo.get(n-1) + memo.get(n-2);
    }
}