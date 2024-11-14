package package1;

import java.util.Scanner;

public class abd {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=s.nextInt();
        System.out.print("enter 2nd number:");
        int b=s.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("sum of the num is: "+add);
        System.out.println("subraction: "+sub);
        System.out.println("multiplication: "+mul);
        System.out.println("division: "+div);
        System.out.println("modluation: "+mod);


    }
    
}
