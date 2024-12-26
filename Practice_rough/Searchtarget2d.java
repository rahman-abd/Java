package Practice_rough;

import java.util.Arrays;

public class Searchtarget2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 8;
        int[] ans = find(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find(int[][]num,int target){
        int n=num.length;
        int m=num[0].length;
        int rs=0;
        int re=n-1;
        while (rs<=re) {
            int mid=rs+(re-rs)/2;
            if (target >= num[mid][0] && target <= num[mid][m - 1]) {
                return new int[]{mid,bs(num[mid],0, m - 1, target)};
            }
            
            if (num[mid][0]<target) {
                rs=mid+1;
            }else{
                re=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int bs(int[] num,int s,int e,int target){
        while (s<=e) {
            int m=s+(e-s)/2;
            if (m==target) {
                return m;
            }if (m<target) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}
