package package1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=s.nextInt();
        int c=2;
        boolean b=true;
        s.close();
        if(num<0){
            System.out.println("negative not allowed");
        }
        else{
            while (c<num) {
                if(num%c==0){
                    b=false;
                }
                c++;
    
            }
                 if (b) {
                    System.out.println("number is prime");
                }
                else{
                    System.out.println("number is not prime");
                }

        }
 }
    
}
