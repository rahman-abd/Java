package package1;

import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=s.nextInt();
        int count=0;
        s.close();
        while (num>0) {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}