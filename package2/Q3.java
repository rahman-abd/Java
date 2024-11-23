package package2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=s.nextInt();
        int num1=num;
        int ans=0;
        s.close();
        while (num>0) {
            int rem=num%10;
            ans=ans*10+rem;
            num/=10;
            
        }
        //int sum=0;
        System.out.println("Your reverse num is: "+ans);
        // sum=num1-ans;
        System.out.println("normal num (" +num1+ ") - reverse num (" +ans+ ") is = "+(num1-ans));
    }
}
