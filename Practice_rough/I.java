package Practice_rough;

import java.util.Arrays;

public class I {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 5, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]num){
       // int n=num.length;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (num[j]<num[j-1]) {
                    int tem=num[j];
                    num[j]=num[j-1];
                    num[j-1]=tem;
                }else{
                    break;
                }
            }
        }
    }

}