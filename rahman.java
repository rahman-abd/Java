import java.util.*;
public class rahman{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        s.close();
        int num=123456789;
        int ans=0;
        while (num>0) {
            int rem=num%10;
            num/=10;
            ans=ans*10+rem;
            
        }
        System.out.println(ans);
    }
}
