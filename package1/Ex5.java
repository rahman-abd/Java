package package1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the value: ");
        int num=s.nextInt();
        s.close();
        for (int i=num; i>=0; i--) {
            System.out.println(i);
        }
        }
    
}

