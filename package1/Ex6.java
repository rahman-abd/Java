package package1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the value: ");
        int num=s.nextInt();
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        int count=2;
        s.close();
        while (count<=num) {
            int temp = b;
            b = b + a;
            a = temp;
           System.out.print(" " + b);
            count++;
        }
        //System.out.println("ans: "+b);
}
}