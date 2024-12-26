package Practice_rough;

import java.util.Arrays;

public class exS {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 7;
        int[] ans = find(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bs(int[][]num,int row,int Cstart,int Cend,int target){
        while (Cstart<=Cend) {
            int mid=Cstart+(Cend-Cstart)/2;
            if (num[row][mid]==target) {
                return new int[]{row,mid};
            }
            if (num[row][mid]<target) {
                Cstart=mid+1;
            }
            else{
                Cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[]find(int[][]num,int target){
        int rows=num.length;
        int cols=num[0].length;
        if (rows==1) {
            return bs(num,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int Cmid=cols/2;
        while (rStart<(rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if (num[rStart][mid]==target) {
                return new int[]{rStart,mid};
            }if (num[rStart][mid]<=target) {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        if (num[rStart][Cmid]==target) {
            return new int[]{rStart,Cmid};
        }
        if (num[rStart+1][Cmid]==target) {
            return new int[]{rStart+1,Cmid};
        }
        if (num[rStart][Cmid-1]>=target) {
            return bs(num, rStart,0, Cmid-1, target);
        }
        if (num[rStart][Cmid+1]<=target&&target<=num[rStart][cols-1]) {
            return bs(num, rStart,Cmid+1, cols-1, target);
        }
        if (num[rStart+1][Cmid-1]>=target) {
            return bs(num, rStart+1,0, Cmid-1, target);
        }
        else {
            return bs(num, rStart+1,Cmid+1, cols-1, target);
        }

       

    }
}
