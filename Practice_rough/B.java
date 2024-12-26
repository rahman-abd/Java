package Practice_rough;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,0,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []num){
        boolean swap;
        for (int i = 0; i < num.length; i++) {
            swap=false;
            for (int j = 1; j <=num.length-i-1; j++) {
                if (num[j]<num[j-1]) {
                    int temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                    swap=true;
                }                
            }
            if (!swap) {
                break;
            }
        }
    }
}
