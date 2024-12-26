package Practice_rough;

public class MissingNum {
    public static void main(String[] args) {
        int[]arr={3,0,1};
        int ans=miss(arr);
        System.out.println(ans);
        
    }
    static int miss(int[]num){
        int n=num.length;
        int exsum=n*(n+1)/2;
        int acsum=0;
        for (int i : num) {
            acsum+=i;
        }
        return exsum-acsum;
    }
}
