package Array;

public class BsQ4FindMountainArrPeakVal{
    public static void main(String[] args) {
        int[]arr={1,3,5,7,7,7,6,4,2};
        int ans=BinarySearch(arr);
        System.out.println(ans);
    }
    static int BinarySearch(int[]num){
        int start=0;
        int end=num.length-1;
        while (start<end) {
            int mid =start+(end-start)/2;
            if (num[mid]>num[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return num[start];
    }
    
} 