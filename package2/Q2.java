package package2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter letter between(A-Z): ");
        char stch = s.next().charAt(0);
        s.close();

        // if (stch>='a'&& stch<='z') {
        // stch=(char)(stch-32);
        // }
        

        if (stch < 'A' || stch >= 'Z' && stch < 'a' || stch >= 'z') {

            System.out.println("invalid char so please enter crct char:");
            return;
        }
        // Validate input
        // Print characters from startChar to 'Z'
        if (stch >= 'A' && stch <= 'Z') {

            for (char ch = stch; ch <= 'Z'; ch++) {
                System.out.print(" " + ch);
            }
        } 
        else {
            for (char ch = stch; ch <= 'z'; ch++) {
                System.out.print(" " + ch);
            }
        }
        System.out.println(); // For better formatting

    }
}
