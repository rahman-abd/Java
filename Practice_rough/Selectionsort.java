package Practice_rough;

import java.util.Arrays;

public class Selectionsort{
    public static void main(String[] args) {
        int[]arr={5,4,3,5,2};
        //selection(arr);
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]num){
        for (int i = 0; i < num.length; i++) {
            int lastind=num.length-i-1;
            int maxelementindex=max(num,0,lastind);
            swap(num,maxelementindex,lastind);
        }
    }
    static void swap(int[]num,int first,int last){
        int temp=num[first];
        num[first]=num[last];
        num[last]=temp;
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
                    int temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
