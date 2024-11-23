package package2;
import java.util.Scanner;

public class Q5_ex{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter letter: ");
        char l= s.next().charAt(0);
        s.close();
        if (l<'A'||l>'Z'&&l<'a'||l>'z') {
            System.out.println("invalid try again !");
            return;
            
        }
        if (l>='A'&&l<='Z') {
            for (char ch = l; ch >='A' ;ch--) {
                for (int i = 0; i <(ch-'A'+1); i++) {
                    System.out.print(ch);
                    
                }
                System.out.println();
            }
            
        }else{
            for (char ch = l; ch >='a' ;ch--) {
                for (int i = 0; i <(ch-'a'+1); i++) {
                    System.out.print(ch);
                    
                }
                System.out.println();
            }

        }


    }
}
