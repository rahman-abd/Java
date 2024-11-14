package package1;
import java.util.Scanner;
public class Primex{
   public static void main (String[] args){
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the value: ");
    int num=s.nextInt();
    int ans=1;
    if (num<0) {
        System.out.print("Not Accept negetive Value");
    }
    else
    {
        for(int i=2;i<num;i++){
            if (num%i==0) {
                ans=0;
                
                
            }
        }
        if (ans==1) {
            System.out.print("num is prime");
        }
        else{
            System.out.println("num not prime");
        }
        
        
        
    }
    s.close();
   }
}
