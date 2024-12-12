package Practice_rough;
public class AsendingBS {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int target=8;
        int ans=BS(arr,target);
        System.out.println(ans);
    }
    static int BS(int[]num,int target){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<num[mid]) {
                end=mid-1;
            }else if (target>num[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
