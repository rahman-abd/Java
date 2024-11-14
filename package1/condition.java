package package1;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        int salary;
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter your current salary: ");
        salary=s.nextInt();
        if (salary>=25000) {
            salary+=1000;
            System.out.println("Congrats!\n Your eligible for bonus.\n Now your salary is:"+salary);
        }
        else
        {
            System.out.println("Your not eligible for bonus!\n Work well after you will got a bonus.\n Thank you!");
        }
        s.close();    
            
    }
}
  