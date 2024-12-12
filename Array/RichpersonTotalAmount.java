package Array;

public class RichpersonTotalAmount {
    public static void main(String[] args) {
        int[][]arr={
                    {1,2,3},
                    {4,5,6}
                   };
        System.out.println(accounts(arr));
    }
    static int accounts(int[][]num){
          int max=Integer.MIN_VALUE;
          for (int row = 0; row < num.length; row++) {
              int sum=0;
            for (int col = 0; col < num[row].length; col++) {
                 sum+=num[row][col];
                if (sum>max) {
                    max=sum;
                }
            }
          }
          return max;
    }
}
