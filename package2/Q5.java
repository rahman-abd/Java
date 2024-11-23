package package2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char l = s.next().charAt(0);
        s.close();
        if (l < 'A' || l > 'Z'&& l < 'a' || l > 'z') {
            System.out.print("invalid try again !");
            return;
        }
        if (l >= 'A' && l <= 'Z') {
            
        
        for (char ch = l; ch >= 'A'; ch--) {
            for (char i = 0; i < (ch - 'A' + 1); i++) {
                System.out.print(ch);

            }
            System.out.println();

        }
    }
        else {
            
        
        for (char ch = l; ch >= 'a'; ch--) {
            for (char i = 0; i < (ch - 'a' + 1); i++) {
                System.out.print(ch);

            }
            System.out.println();

        }
    }
}
}
