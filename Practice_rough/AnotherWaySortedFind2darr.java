package Practice_rough;

import java.util.Arrays;

public class AnotherWaySortedFind2darr {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=4;
        int[] ans=find(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] find(int[][]num,int target){
       int n=num.length;
       int m=num[0].length;
       int s=0;
       int e=n*m-1;
       while (s<=e) {
        int mid=s+(e-s)/2;
        int r=mid/m;
        int c=mid%m;
        if (num[r][c]==target) {
            return new int[]{r,c};

        }if (num[r][c]<target) {
            s=mid+1;
            
        }else{
            e=mid-1;
        }
       }
        return new int[]{-1,-1};
    }
}
