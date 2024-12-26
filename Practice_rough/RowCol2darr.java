package Practice_rough;

import java.util.Arrays;

public class RowCol2darr {
    public static void main(String[] args) {
        
        int[][]arr={
                     {1,4,7,10},
                     {2,5,8,12},
                     {5,6,9,13},
                     {12,14,15,16}
                   };
       int target=9;
       int[]ans=find(arr, target);
       System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][]num,int target){
        int r=0;
        int c=num.length-1;
        while (r<num.length&&c>=0) {
            if (num[r][c]==target) {
                return new int[]{r,c};
            }
            if (num[r][c]<target) {
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};

    }
}

    

