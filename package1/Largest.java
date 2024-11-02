package package1;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        s.close();

        // int max=a;
        
        // if (b>max) {
        //     max=b;
        // }
        // if (c>max) {
        //     max=c;
        // }
        int max=Math.max(c,(Math.max(a,b)));
        System.out.println(max);
    }
}
