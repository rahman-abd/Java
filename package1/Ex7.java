package package1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans = 0;
        boolean k = true;
        while (k){
            System.out.println("Enter the operator: ");
            char op = s.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int a = s.nextInt();
                int b = s.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
                System.out.println(ans);

            } else if (op == 'x' || op == 'X') {
                System.out.println("exit");

                k = false;
            } else {
                System.out.println("invalid");
            }

        }

        s.close();
    }
}