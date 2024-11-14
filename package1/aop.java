package package1;

import java.util.Scanner;

public class aop {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        s.close();

        System.out.print("init val of a= ");
        int a=s.nextInt();
        System.out.print("init val of b=");
        int b=s.nextInt();
        System.out.println("after value of a+= is: "+a);
         a+=5;
         System.out.println("after value of b+= is: "+b);
         b+=5;
         System.out.println("after value of a-= is: "+a);
         a-=5;
         System.out.println("after value of b-= is: "+a);
         b-=5;
         System.out.println("after value of a*= is: "+a);
         a*=5;
         System.out.println("after value of b*= is: "+a);
         b*=5;
         System.out.println("after value of a/= is: "+a);
         a/=5;
         System.out.println("after value of b/= is: "+a);
         b/=5;

    }
    
}
