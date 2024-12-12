package Array;

public class Bs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int[]arr={9,8,7,6,5,4,3,2,1};
        int target = 6;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }

    static int BinarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // boolean b= num[start]<num[end];
            // if(b){
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {

                start = mid + 1;

            } else {
                return mid;
            }
        }
        // else{
        // if (target<num[mid]) {
        // start=mid+1;
        // }else if (target>num[mid]) {

        // end=mid-1;

        // }else{
        // return mid;
        // }
        // }
        // }
        return -1;
    }
}
