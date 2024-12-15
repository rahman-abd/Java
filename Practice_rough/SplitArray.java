package Practice_rough;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int k = 6;
        int ans = splitans(arr, k);
        if (ans==-1) {
            System.out.println("not possible of divid sub arrays ");
            return;
        }if (ans==-2) {
            System.out.println("k more than element");
            return;
        }
        System.out.println(ans);
    }

    static int splitans(int[] nums, int k) {
        if (k>nums.length) {
            return -2;
        }
        int ans = -1;
        int start = 0;
        int end=0;
        for (int num : nums) {
            end=end+num;
            if (num > start) {
                start = num;
            }

        }
        while (start<=end) {
            int mid=(start+end)/2;
            int a=Partition(nums,mid);
            if (a<=k) {
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    static int Partition(int[]nums,int mid){
        int partition=1;
        int sum=0;
        for (int num:nums) {
            sum=sum+num;
            if (sum>mid) {
                sum=num;
                partition++;
            }
        }
        return partition;

    }

}
