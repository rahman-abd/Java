package package2;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num to check odd or even: ");
        int num= s.nextInt();
        s.close();
        if (num%2==1) {
            System.out.println("num is odd");
        }else{
            System.out.println("num is even");
        }
    }
    
}
