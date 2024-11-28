package package2;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three number to find largest: ");
        int  a=s.nextInt();
        int  b=s.nextInt();
        int  c=s.nextInt();
        s.close();
        int max=Math.max(a,(Math.max(c, b)));
        if(a!=b&&b!=c&&c!=a){
            System.out.println("max: "+max);
        }else{
         if(a==b&&b==a&&c==a){
             System.out.println("all value are same");
        }else if (a==b) {
            System.out.println("a value and b value is same");
            
        }else if(b==c){
             System.out.println("b and c is same");
        }else{
            System.out.println("c and a same");
        }
        System.out.println("max: "+max);
    }
    // if (a>b&&a>c) {
    //     System.out.println("a is max");
    // }else if (b>c) {
    //     System.out.println("b is max");
    // }else{
    //     System.out.println("c is max");
    // }
}
}
