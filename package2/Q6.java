package package2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the total student: ");
        int t=s.nextInt();
        System.out.println("Enter the st rollno: ");
        int r=s.nextInt();

       

        

        StringBuilder group1 =new StringBuilder( "Group 1:\n");
        StringBuilder group2 =new StringBuilder( "Group 2:\n");
        StringBuilder group3 =new StringBuilder( "Group 3:\n");
        StringBuilder group4 =new StringBuilder( "Group 4:\n");


        for (int roll = r; roll <r+t ; roll++) {
            if (roll%4==1) {
                group1.append(roll).append("\n");
            }
            else if (roll%4==2) {
                group2.append(roll).append("\n");
            }
            else if (roll%4==3) {
                group3.append(roll).append("\n");
            }
            else //(roll%4==0) 
            {
                group4.append(roll).append("\n");
            }
        }
            
            System.out.println(group1);
            System.out.println(group2);
            System.out.println(group3);
            System.out.println(group4);
        
        s.close();
        }
}
