package package1;

import java.util.Scanner;

public class WhileQ6 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter num: ");
        int x=s.nextInt();
        System.out.print("Enter limit: ");
        int y=s.nextInt();
        s.close();
        int  i=1;
        while(i<=y) {
            System.out.println(x+" x "+i+" = "+(x*i));
            i++;
            
        }

    }
    
}
