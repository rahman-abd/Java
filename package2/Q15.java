package package2;
import java.util.Scanner;

public class Q15 {
    //2 · π · r · (r + h)
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r=s.nextDouble();
        System.out.println("Enter hight: ");
        double h=s.nextDouble();
        s.close();
        double area=2*Math.PI*r*(r+h);
        System.out.println("Area of your given cylinder is : "+area);
    }
}
