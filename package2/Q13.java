package package2;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the side length of square: ");
        double l=s.nextDouble();
        s.close();
        double area=areafun(l);
        System.out.println("ans: "+(int)area);
    }
        static double areafun(double l)
        {
        double area=l*l;
        return area;
    }
}
