package Practice_rough;
public class Floor {
    public static void main(String[] args) {
        int[]arr={-4,-2,-1,0,1,2,3,4,5,6,7,8,9,13};
        int target=-5;
        int ans=floor(arr,target);
        if (ans==arr.length) {
            System.out.println("Sorry, your target num is less than start element so i can't find it.");
            return;
        }
        System.out.println(ans);
    }
    static int floor(int[]num,int target){
        int start=0;
        int end=num.length-1;
        for (int i=0;i<num.length-1;i++) {
            if (target<num[start]) {
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
        return num[end];
    }
}
