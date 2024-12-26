package Practice_rough;

public class FindOneTimeComesElement {
    public static void main(String[] args) {
        int[]arr={1,1,2,3,4,3,4};
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
    static int singleNumber(int[] num) {
        int res=0;
        for (int i = 0; i < num.length; i++) {
            res^=num[i];
        }
        return res;
    }
}
