package Practice_rough;

import java.util.Arrays;

public class Exbs2d {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        int target=6;
        int[]ans=find(arr,target);
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

            }else{
                Cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] find(int[][]num,int target){
        int rows=num.length;
        int cols=num[0].length;
        if (rows==1) {
            return bs(num,0,0,cols-1,target);
        }
        int Rstart=0;
        int Rend=rows-1;
        int Cmid=cols/2;
        while (Rstart <(Rend-1)) {
            int mid=Rstart+(Rend-Rstart)/2;
            if (num[Rstart][mid]==target) {
                return new int[]{Rstart,mid};
            }
            if (num[Rstart][mid]<target) {
                Rstart=mid;
            }else{
                Rend=mid;
            }
        }
            if (num[Rstart][Cmid]==target) {
                return new int[]{Rstart,Cmid};
            }
            if (num[Rstart+1][Cmid]==target) {
                return new int[]{Rstart+1,Cmid};
            }
            if (num[Rstart][Cmid-1]>=target) {
                return bs(num, Rstart, 0, Cmid-1, target);
            }
            if (num[Rstart][Cmid+1]<=target&&target<=num[Rstart][cols-1]) {
                return bs(num, Rstart, Cmid-1, cols-1, target);
            }
            if (num[Rstart+1][Cmid-1]>=target) {
                return bs(num, Rstart+1, 0, Cmid-1, target);
            } 
            else{
                return bs(num, Rstart+1, Cmid+1, cols-1, target);
            }
           
    }
}