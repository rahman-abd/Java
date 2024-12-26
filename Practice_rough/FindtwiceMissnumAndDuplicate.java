package Practice_rough;

import java.util.Arrays;

public class FindtwiceMissnumAndDuplicate {
    public static void main(String[] args) {
        
        int[]arr={1,2,2,3,5,4};
        
        int[] ans=cyclicsort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] cyclicsort(int[] num){
        int i=0;
        while (i<num.length){
            int c=num[i]-1;
            if (num[i]!=num[c]) {
                swap(num,i,c);
            }else{
                i++;
            }
        }
        
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j+1) {
                return new int[]{num[j],j+1};
            }
        }

        return new int[]{-1,-1};
            
        }
        static void swap(int[] num,int f,int s){
            int temp=num[f];
            num[f]=num[s];
            num[s]=temp;
        }
}
