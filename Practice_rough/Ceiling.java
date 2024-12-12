package Practice_rough;
public class Ceiling {
    public static void main(String[] args) {
        int[]arr={-4,-2,-1,0,1,2,3,4,5,6,7,8,9,13};
        int target=11;
        int ans=ceiling(arr,target);
        if (ans==arr.length) {
            System.out.println("Sorry, your target num is larger than end element so i can't find it.");
            return;
        }
        System.out.println(ans);
    }
    static int ceiling(int[]num,int target){
        int start=0;
        int end=num.length-1;
        for (int i=0;i<num.length-1;i++) {
            if (target>num.length-1) {
                return num.length;
            }            
        }
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<num[mid]) {
                end=mid-1;
            }else if (target>num[mid]) {
                start=mid+1;

            }else{
                return num[mid];
            } 
        }
        return num[start];
    }

}
