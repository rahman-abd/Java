package package2;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    

        System.out.print("Enter the value: ");
        int h=s.nextInt();
        int sum = 0;
        s.close();

        for (int i = 1; i <= h; i++) {
            if (isPrime(i)) {   
                sum+=i;
            }
        }

        System.out.print("ans: "+sum);
    }

    static boolean isPrime(int n) {
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(n);
        int i = 5;
        while (i <= limit) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
}
