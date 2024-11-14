package package1;
import java.util.*;

public class Reversestring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String a=s.nextLine();
        
        String reverse="";
        s.close();
        for(int i= a.length()-1;i>=0;i--){
            reverse+=a.charAt(i);
        }
        System.out.println("reversed String: "+reverse);
    }
}