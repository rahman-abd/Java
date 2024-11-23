package package2;
import java.util.*;
public class Main
{
    public static void main(String[] args)
{
        String name;
        int age;
        Scanner s=new Scanner(System.in);
        s.close();
        System.out.println("Enter person name:");
        name=s.nextLine();
        System.out.println("Enter person age:");
        age=s.nextInt();
        System.out.println("person Name:"+name);
        System.out.println("Person age:"+age);
        
    }

}