package package2;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a= s.nextInt();
        System.out.println("Enter the second num: ");
        int b= s.nextInt();
        s.close();
        System.out.println("before swap");
        System.out.println("a = "+a+" b ="+b);
        // int temp=a;
        // a=b;
        // b=temp;
        System.out.println("after swap");
        System.out.println("a = "+b+" b ="+a);
    }
    
}
