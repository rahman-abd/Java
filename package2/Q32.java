package package2;
import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number to check possitive or negative: ");
        int num=s.nextInt();
        s.close();
        if (num<0) {
            System.out.println("num("+num+") is negative");
            
        }else{
            System.out.println("num("+num+") is possitive");

        }
    }
}
