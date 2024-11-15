package package1;

import java.util.Scanner;

public class Sumofd {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=n.nextInt();
        int sum=0;
        n.close();
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
            
        }
        System.out.println("ans:"+sum);
    }
}
