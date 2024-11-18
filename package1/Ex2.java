package package1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the value: ");
        int num=s.nextInt();
        int ans=0;
        s.close();
        while (num>0) {
            int rem=num%10;
            ans=ans+rem;
            num/=10;
        }
        System.out.println("ans: "+ans);
    
}
}
