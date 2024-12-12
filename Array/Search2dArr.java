package Array;

import java.util.Arrays;

public class Search2dArr {
    public static void main(String[] args) {
        int[][] arr={
            {1,0,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 10;
        int[] ans = Searchelement(arr,target);
        System.out.println("ans is = "+Arrays.toString(ans));
        System.out.println("Max value is : "+Max(arr));
        System.out.println("Man value is : "+Min(arr));
     }

     static int[] Searchelement(int[][] num,int target){
    
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                
                if (num[row][col]==target) {
                    return new int[]{row,col};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
     static int Max(int[][] num){
        int maxval=Integer.MIN_VALUE;
    
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                
                if (num[row][col]>maxval) {
                    maxval=num[row][col];
                    
                }
            }
            
        }
        return maxval;
    }
     static int Min(int[][] num){
        int minval=Integer.MAX_VALUE;
    
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                
                if (num[row][col]<minval) {
                    minval=num[row][col];
                    
                }
            }
            
        }
        return minval;
    }
}
