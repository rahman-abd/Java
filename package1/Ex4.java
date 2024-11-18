package package1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = s.nextInt();
        int num2= num;
        int num3=num;
        s.close();
        int dig = 0;
        while (num > 0) {
            num /= 10;
            dig++;
         }
         int sum=0;
         while (num2>0) {
            int rem=num2%10;
            sum+=Math.pow(rem, dig);
            num2/=10;
         }
         if (num3==sum) {
            System.out.println("amstrong");
            
         }else{
            System.out.println("not");
         }
    }
}