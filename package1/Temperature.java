package package1;

import java.util.Scanner;
/*Temperature*/
public class Temperature {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter temp in c:");
        float $tempC=s.nextFloat();
        float tempF=($tempC*9/5)+32;
        System.out.println("The value of Fahrenheit is:"+tempF);
        s.close();
    }    
}