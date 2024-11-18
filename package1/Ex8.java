package package1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the fruit : ");
        enum fruit{
            apple,orange;
        }
        String a=s.nextLine();
        fruit f= fruit.valueOf(a);
        s.close();

        switch (f) {

            case apple,orange -> System.out.print(f+" is "+"red");
            //case orange -> System.out.print(f+" is "+"orange");
            default -> System.out.print("not valid fruit try again!!!");

        }
    }
}
