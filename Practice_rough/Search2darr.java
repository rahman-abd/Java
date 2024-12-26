package Practice_rough;

import java.util.Arrays;

public class Search2darr {
    public static void main(String[] args) {
        
        int[][]arr={{1,2,3},
                    {4,5},
                    {6,7,8}
                    };
        int target = 5;
        int[] ans=element(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] element(int[][]num,int target){
            if (num.length==0) {
            return new int[]{-1,-1};
        }
        for (int row = 0; row <num.length; row++) {
            for (int col = 0; col <num[row].length; col++) {
                if (num[row][col]==target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
