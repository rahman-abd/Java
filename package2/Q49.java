package package2;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter number of rows: ");
    int n=in.nextInt();
    in.close();
    int space=n-1;
    for (int i =1; i <=n; i++) {
        for (int j = i; j <=space; j++) {
            System.out.print(" ");
         }
         for (int j =1; j <=i ; j++) {
             System.out.print("* ");
         }
        System.out.println();
        
    }
            
        }
    }       


