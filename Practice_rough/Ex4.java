package Practice_rough;
public class Ex4 {
    public static void main(String[] args) {
        int[]arr={1,999,8,4,3,2,1};
        int ans=Peakelement(arr);
        System.out.println(ans);
       }
    static int Peakelement(int[]num){
        int start=0;
        int end=num.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (num[mid]<num[mid+1]) {
                start=mid+1;
            }//else (num[mid]>num[mid+1])
            else {
                end=mid;
            }
        }
        return start;
       }
}
