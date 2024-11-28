package package2;
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int num=s.nextInt();
        int sum=num*(num+1)/2;
        System.out.println(sum);
        // String sumstr=Integer.toString(sum);
        // int largedig=0;
        // for (int i = 0; i < sumstr.length(); i++) {
            
        //     int digit=Character.getNumericValue(sumstr.charAt(i));
        //     if (digit>largedig) {
        //         largedig=digit;
        //     }
        // }
        // System.out.println("the sum of first "+num+" natural num is: "+sum);
        // System.out.println("large digit of sum is: "+largedig);
        int largest=0;
        while (sum>0) {
            
            int rem =sum%10;
            //largest=Math.max(largest, rem);
            if (rem>largest) {
                largest=rem;
            }
            sum/=10;
        }
        //System.out.println(sum);
        System.out.println(largest);
        s.close();
    
    }
}
