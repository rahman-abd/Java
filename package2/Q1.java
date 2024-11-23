package package2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);
        // System.out.print("Enter the multiplication number: ");
        // int x=s.nextInt();
        // System.out.print("Enter limit: ");
        // int y=s.nextInt();
        // int i=1;
        // s.close();
        // while (i<=y) {

        //     System.out.println(i+" x "+x+" = "+(x*i));
        //     i++;
            
        // }
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the multiplication number: ");
        int x=s.nextInt();
        System.out.print("Enter limit: ");
        int y=s.nextInt();
        int i=1;
        s.close();
        while (i<=y) {

            System.out.println(x+" - "+i+" = "+(x-i));
            i++;
            
        }

            
        }
        
    }
    

