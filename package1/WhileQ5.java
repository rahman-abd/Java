package package1;

import java.util.Scanner;

public class WhileQ5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter sum of odd num till u want: ");
        int end=s.nextInt();
        int st=1;
        int sum=1;
        while (st<=end) {
            if (st%2!=0) {
                sum=st*sum;
                
            }

            st++;
        }
        System.out.println("you sum of odd num is:"+sum);
        s.close();
    }
    
}
