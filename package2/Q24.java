package package2;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the character: ");
        char a=s.next().charAt(0);
        s.close();
        int assci=(int)(a);
        System.out.print("ASSCII VALUE IS: "+assci);
    }
}
