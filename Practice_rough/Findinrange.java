package Practice_rough;
import java.util.Arrays;

public class Findinrange {
    public static void main(String[] args) {
        int[]arr={2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6};
        int target=3;
        int[] ans=range(arr,target);
        System.out.println(Arrays.toString(ans));
        // int ans2=Bs(arr,target);
        // System.out.println(ans2);
    }
    static int[] range(int[]num,int target){
        int[] ans={-1,-1};
        int start=Bs(num,target,true);
        int end=Bs(num,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int Bs(int[]num,int target,boolean find){
        int ans=-1;
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<num[mid]) {
                end=mid-1;
            }else if (target>num[mid]) {
                start=mid+1;
            }else {
                ans=mid;
                if (find) {
                    end=mid-1;
            }else{
                start=mid+1;
            }

        }

    }
    return ans;
}
}
