package Practice_rough;

public class FindMaxSeq1s {
    public static void main(String[] args) {
        int[]arr={1,1,0,1,1,1,0,1,1,1,1,1};
        int ans=findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
    static int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int count=0;
        for(int i:nums){
            if(i==1)count++;
            if (max<count)max=count;
            if(i==0)count=0;
        }
        return max;
    }
}
