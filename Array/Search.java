package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] num={1, 2, 3, 4, 5, 6, 7, 8, 9};
        while(true){
            System.out.print("enter the target value to find index:");
            int target=s.nextInt();
            s.close();
        int ans=Searcharr(num,target);

        if (ans==-1) {
            System.out.println("array not found!!!");
        }else if (ans==-2) {
            System.out.println("num is not available in this array!");
        }else{
        System.out.println("num "+target+" index is = "+ans);
        }
    }
    
}
    

    static int Searcharr(int[] arr,int target){
        if (arr.length==0) {
            return -1;
            
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (element==target) {
                return i;
                
            }
        }
        return -2;
    }
}
