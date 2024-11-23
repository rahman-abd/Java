package package2;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter width: ");
        double w=s.nextDouble();
        System.out.println("enter hight: ");
        double h=s.nextDouble();
        s.close();
        double area=w*h;
        if (w==h) {
            System.out.println("it is not a rectangle it is square!");
            System.out.println("your square area is: "+area);
        }else{
        System.out.println("area of rectangle is: "+area);
    }
}
}