package Practice_rough;

public class Sortandrotate {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        boolean ans=check(arr);
        System.out.println(ans);
    }
    // static boolean check(int[] arr) {
    //     int count = 0;
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < arr[i-1]) count++;
    //         if (count > 1) return false;
    //     }

    //     if (count == 1 && arr[0] < arr[arr.length-1])  return false;

    //     return true;
    // }
    static boolean check(int[] nums) {
        int count=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
        if(nums[i]>nums[(i+1)%n]){
            count++;
        }
        if(count>1){
            return false;
        }
        }
        return true;
    }
}
