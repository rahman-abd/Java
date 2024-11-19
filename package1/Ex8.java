package package1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the fruit : ");
        String f= s.nextLine();
        s.close();

        switch (f) {

            case "apple" -> System.out.print(f+" is "+"red");
            case "orange" -> System.out.print(f+" is "+"orange");
            default -> System.out.print("not valid fruit try again!!!");

        }
    }
}
