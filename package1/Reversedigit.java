package package1;

import java.util.Scanner;

public class Reversedigit {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter num: ");
        int a=s.nextInt();
        System.out.print("ans: ");
        while (a >0) {
            System.out.print(a);
           
            a--;
            
        }
        s.close();
    }
}
