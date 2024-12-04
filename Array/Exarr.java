package Array;
import java.util.Scanner;

public class Exarr {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr=new int[5];
        for (int row = 0;row < arr.length; row++) {
          arr[row]=s.nextInt();
          //System.out.println("index of "+row+" = "+arr[row]);

        }
        s.close();
        for (int j =0; j < arr.length; j++) {
            
                System.out.println("index of "+j+" = "+arr[j]);
            }   
         }
}
