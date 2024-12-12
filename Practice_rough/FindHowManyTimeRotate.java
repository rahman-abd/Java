package Practice_rough;
public class FindHowManyTimeRotate {
    public static void main(String[] args) {
        // int[]arr={4,5,6,7,8,0,1,2,3};
        int[] arr = {2,2,2,2,2,2,3,2};
        int ans = FindRotate(arr);
        // int ans=FindPivot(arr);
        System.out.println(ans + " times rotate this array");

    }

    static int FindRotate(int[] num) {
       // int pivot = FindPivot(num);
        int pivot=FindPivotDuplicate(num);
        int ans = pivot;
        return ans;
    }

    static int FindPivotDuplicate(int[]num){
    int start=0;
    int end=num.length-1;
    while (start<=end) {
    int mid=start+(end-start)/2;
    if (mid<end&& num[mid]>num[mid+1]) {
    return mid;
    }if (mid>start&& num[mid]<num[mid-1]) {
    return mid-1;
    }
    if (num[mid]==num[start]||num[mid]==num[end]) {
    if (num[start]>num[mid]) {
    return start;
    }
    start++;
    if (num[end]<num[end-1]) {
    return end-1;
    }
    end--;
    }
    else if (num[start]<num[mid]||(num[start]==num[mid]&&num[mid]>num[end])) {
    start=mid+1;
    }else{
    end=mid-1;
    }
    }
    return -1;
    }
    static int FindPivot(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && num[mid] > num[mid + 1]) {
                return mid;
            }
            if (mid > start && num[mid] < num[mid - 1]) {
                return mid - 1;
            }
            if (num[mid] <= num[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
