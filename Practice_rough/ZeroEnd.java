package Practice_rough;

import java.util.Arrays;

public class ZeroEnd {
    public static void main(String[] args) {
        int[]arr={0,0,0,0,0,0,0};
        movezero(arr);
    }
    static void movezero(int[]nums){
        if (nums.length<1) {
            System.out.println("Array is empty");
            return;
        }
        int zerocount=0;
        int sum=0;
        for (int i : nums) {
            if (i==0) {
                zerocount++;
            }
            sum+=i;
        }
        if (sum==0) {
            System.out.println(Arrays.toString( nums));
            return;
        }else if (zerocount!=0) {
            System.out.println(Arrays.toString(nums));
        }
    }
    static void swap(int[]num){
        int temp=num[0];
        num[0]=num[1];
        num[1]=temp;
    }
}
