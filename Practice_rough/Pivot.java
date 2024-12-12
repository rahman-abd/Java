package Practice_rough;
public class Pivot {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,8,9,19,199,1999,0,1,2,3};
        int[]arr2={2,2,2,2,2,2,2,2,2,3,2,2,2,2};
        int ans=FP(arr);
        int ans2=FPD(arr2);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int FP(int[]num){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
          int mid=start+(end-start)/2;
          if (mid<end&&num[mid]>num[mid+1]) {
                 return mid;
          }if (mid>start&&num[mid]<num[mid-1]) {
            return mid-1;
          }if (num[mid]<=num[start]) {
            end=mid-1;
          }else{
            start=mid+1;
          }
        }
        return -1;
    }
    static int FPD(int[]num){
        int start=0;
        int end=num.length-1;
        //int[]arr2={2,2,2,2,2,2,2,2,2,3,2,2,2,2};
        while (start<=end) {
          int mid=start+(end-start)/2;
          if (mid<end&&num[mid]>num[mid+1]) {
                 return mid;
          }if (mid>start&&num[mid]<num[mid-1]) {
            return mid-1;
          }if (num[mid]==num[start]||num[mid]==num[end]){

            if (num[start]>num[mid]) {
                return start;
            }
            start++;
            if (num[end]<num[end-1]) {
                return end-1;
            }
            end--;
          }else if (num[start]<num[mid]||(num[start]==num[mid]&&num[mid]>num[end])) {
              start=mid+1;
           
          }else{
            end=mid-1;
          }
        }
        return -1;
    }
}
