package package1;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();

        System.out.println("Enter num: ");

        int num = s.nextInt();
        int num2 = num;
        int num3 = num;
        int digits = 0;

        while (num > 0) {
            num = num / 10;
            digits++;
        }

        int sum = 0;
        while (num2 > 0) {
            int rem = num2 % 10;
            sum += Math.pow(rem, digits);
            num2 /= 10;
        }

        if (num3 == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NO");
        }

    }
}