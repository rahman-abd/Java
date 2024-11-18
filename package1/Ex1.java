package package1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the value: ");
        int num=s.nextInt();
        s.close();
        int ans=0;
        while (num>0 ){
            int rem=num%10;
            ans= ans*10+rem;
            num/=10;
        }
        System.out.println("ans: "+ans);
    }
    
}
