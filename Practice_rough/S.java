package Practice_rough;

import java.util.Arrays;

public class S  {
    public static void main(String[] args) {
        int[]arr={3,5,3,362,2};
        slelection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void slelection(int[]num){
        for (int i = 0; i < num.length; i++) {
            
                int last=num.length-i-1;
                int max=max(num,0,last);
                swap(num,max,last);
            }
        
    }
    static int max(int[]num,int f,int s){
        int max=f;
        for (int i = f; i <=s; i++) {
            if (num[max]<num[i]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] num, int f, int s) {
        int temp = num[f];
        num[f] = num[s];
        num[s] = temp;
    }
}
