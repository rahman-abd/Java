package package1;

import java.util.Scanner;

public class Sum {
    public int sum(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=s.nextInt();
        System.out.println("Enter num2: ");
        int num2=s.nextInt();
        s.close();
        int sum=num1+num2;
        System.out.println("the sum is:  "+sum);
        return sum;
    
}
}
