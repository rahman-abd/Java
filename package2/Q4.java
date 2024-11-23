package package2;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1st integer: ");
        int a=s.nextInt();
        System.out.println("Enter the 2nd integer: ");
        int b=s.nextInt();
        s.close();
        System.out.println("\noparand: "+"a = "+a+" b = "+b);
        System.out.println("bitwise And a & b = "+(a&b));
        System.out.println("bitwise or a | b = "+(a|b));
        System.out.println("bitwise not ~a = "+(~a));
        System.out.println("bitwise xor a ^ b = "+(a^b));
        System.out.println("Right Shift a >> b = "+(a>>b));
        System.out.println("Left Shift a << b = "+(a<<b));
    }
}
