package Practice_rough;
import java.util.Arrays;

public class BsmyKnowledgetest {
    public static void main(String[] args) {
        int[]arr={5,5,5,6,6,7,7,7,7,8,8,9,9};
        int target=9;
        int[]ans=searchInRange(arr, target);
        // System.out.print("[");
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.print(ans[i]);
        //     if(i<ans.length-1) {
        //         System.out.print(", ");
        //     }
        // }System.out.print("]");
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchInRange(int[]num,int target){
        int[]ans={-1,-1};
        int start=startAndEndindexFind(num,target,true);
        int end=startAndEndindexFind(num,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int startAndEndindexFind(int[]num,int target,boolean trueOrFalse){
        int ans=-1;
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<num[mid]) {
                end=mid-1;
            }else if (target>num[mid]) {
                start=mid+1;
            }else{
                ans=mid;
                if (trueOrFalse) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            
        }
        return ans;
    }
}
