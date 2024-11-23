package package2;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char l=s.next().charAt(0);
        s.close();

        if (l>='A'&&l<='Z'||l>='a'&&l<='z') {
            System.out.println(l+" is Alphabet");
            
        }else{
            System.out.println(l+" is not a Alphabet");
        }
    }
}
