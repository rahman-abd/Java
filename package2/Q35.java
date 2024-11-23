package package2;
import java.util.Scanner;

public class Q35 {
public static void main(String[] args) {
    Scanner s= new  Scanner(System.in);
    int num=s.nextInt();
    long ans= factorial(num);
    s.close();
    System.out.println("factorial of "+num+" is "+ans);
}
public static long factorial(int n){
           if (n==0) {
            return 1;
           }else{
            return n*factorial(n-1);
           }
}
}
