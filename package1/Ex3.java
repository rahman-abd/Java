package package1;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the value: ");
        Long num=s.nextLong();
        System.out.print("Enter scearch element: ");
        int sc=s.nextInt();
        s.close();
        int count=0;
        while (num>0) {
            Long rem=num%10;
            if (rem==sc) {
                count++;
            }
            num/=10;
        }
        System.out.println("your given "+sc+" total count is: "+count);
}
}