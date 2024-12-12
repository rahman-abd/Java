package Array;

public class Minvalue {
    public static void main(String[] args) {
        int[]arr ={3,4,6,2,8,9};
        int ans=Min(arr);
        System.out.println(ans);
    }
    static int Min(int[] num){
        int minVal=num[0];
        // if (num.length==0) {
        //     return -1;
        // }
        for (int i = 0; i < num.length;i++) {
            if (num[i]<minVal) {
                minVal=num[i];
            }
        }
        return minVal;
    }
}