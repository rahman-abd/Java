package package1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter emp id");
        int id=s.nextInt();
        switch (id) {
            case 1:
                System.out.println("rahman");
                
                break;
            case 2:
                System.out.println("abdul");
                
                break;
            case 3:
            System.out.println("Enter dept");
            String department=s.next();
            s.close();
                System.out.println("Employee id 3");
                switch (department) {
                    
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("Management department");
                        break;
                    default:
                    System.out.println("Enter correct dept");
                }
                
                break;
            
            default:
            System.out.println("Enter correct emp id");
                break;
        }
    }
}
    

