package package1;

import java.util.Scanner;

public class WhileQ4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter num to sum of before all even numbers: ");
        int num=s.nextInt();
        int st=1;
        int sum=1;
        s.close();
        while (st<=num) {
            if (st%2==0) {
                sum*=st;
                
            }
            
            st++;

        }
        System.out.println("you sum is: "+sum);
    }
    
}
