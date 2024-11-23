package package2;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter letter: ");
        char ch=s.next().charAt(0);
        s.close();
        if (ch<'A'||ch>'Z'&&ch<'a'||ch>'z') {
            System.out.println("invalid letter");
        }
        else if (ch>='A'&&ch<='Z') {
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                System.out.println("Letter is vowel");
            }else{
                System.out.println("Letter is consonant");
            }
        }else {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    System.out.println("Letter is vowel");
                }else{
                    System.out.println("Letter is consonant");
                }
            }
    }
}
