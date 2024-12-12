package Practice_rough;
public class Ex6 {
    public static void main(String[] args) {
       // int[]arr={4,5,6,7,0,1,2,3};
       int[]arr={2,9,2,2,2};
        int target=9;
        int ans=Search(arr,target);
       int ans2=FindPivot(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int Search(int[]num,int target){
        int pivot=FindPivot(num);
        if(pivot==-1){
            return BinarySearch(num, target, 0, num.length-1);
        }
        if (num[pivot]==target) {
            return pivot;
        }
        if (target>=num[0]) {
            return BinarySearch(num, target,0,pivot-1);
        }
        return BinarySearch(num, target, pivot+1,num.length-1);
    }
    static int BinarySearch(int[] num, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {

                start = mid + 1;

            } else {
                return mid;
            }
        }
        
        return -1;
    }
    static int FindPivot(int[]num){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (mid<end&& num[mid]>num[mid+1]) {
                return mid;
            }if (mid>start&& num[mid]<num[mid-1]) {
                return mid-1;
            }
            //if (num[mid]<=num[start]) {
            //     end=mid-1;
            // }else{
            //     start=mid+1;
            // }
            if (num[mid]==num[start]||num[mid]==num[end]) {
                if (num[start]>num[start+1]) {
                    return start;
                }
                start++;
                if (num[end]<num[end-1]) {
                    return end-1;
                }
                end--;
            }
           else if(num[start]<num[mid]||(num[mid]==num[start]&&num[mid]>num[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
