package Practice_rough;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={1,5,3,2,4};
       // bubble(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]num){
        for (int i = 0; i < num.length; i++) {
            int lastind=num.length-i-1;
            int maxelement=max(num,0,lastind);
            swap(num,maxelement,lastind);
        }
    }
    static void swap(int[]num,int start,int end){
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
    }
    static int max(int[]num,int start,int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if (num[max]<num[i]) {
                max=i;
            }
        }
        return max;
    }
    static void bubble(int[]num){
        boolean swapped;
        for (int i = 0; i < num.length; i++) {
            swapped=false;
            for (int j = 1; j < num.length-i; j++) {
                if (num[j]<num[j-1]) {
                    int tem=num[j-1];
                    num[j-1]=num[j];
                    num[j]=tem;
                    swapped=true;
                }
            }
            if (swapped==false) {
                break;
            }
        }
    }
}
