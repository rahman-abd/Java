package Practice_rough;

import java.util.Arrays;

public class CyclingSort {
    public static void main(String[] args) {
        int[]arr={7,6,3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]num){
        int i=0;
        while (i<num.length) {
            int c=num[i]-1;
            if (num[i]!=num[c]) {
                swap(num, i, c);
            }
            else{
                i++;
            }
        }
                   
    }
    static void  swap(int[]num,int f,int s){
        int tem=num[f];
        num[f]=num[s];
        num[s]=tem;
    }
}

