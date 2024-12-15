package Practice_rough;
import java.util.Scanner;
public class Pearl {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Husband name:");
        String h=s.nextLine();
        System.out.print("Enter Wife name: ");
        String f=s.nextLine();
        s.close();
        System.out.println(h+" >>----Weds----> "+f);
       
    }

    
}
