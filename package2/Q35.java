package package2;
import java.util.Scanner;

public class Q35 {
public static void main(String[] args) {
    Scanner s= new  Scanner(System.in);
    int num=s.nextInt();
    long ans= factorial(num);
    long sum=ans;
    s.close();
    System.out.println("factorial of "+num+" is "+ans);
    long a=0;
    while (sum>0) {
    long rem=sum%10;
    a=a+rem;
    sum/=10;
    }
    System.out.println("S O D "+ans+" is "+a);
    System.out.println("ans: "+basicfac(6));
}
public static long factorial(int n){
           if (n==0) {
            return 1;
           }else{
            return n*factorial(n-1);
           }
}
static int basicfac(int n){
    int ans=1;
for (int i = n; i >0; i--){
    ans=ans*i;
}
return ans;


}

    


}

