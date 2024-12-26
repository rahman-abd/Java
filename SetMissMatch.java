import java.util.Arrays;

public class SetMissMatch {
     public static void main(String[] args) {
        int[]arr={1,2,2,4};
        int[] ans=find(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[]num){
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
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j+1) {
                return new int[]{num[j],j+1};
            }
        }
        return new int[]{-1,-1};
                   
    }
    static void  swap(int[]num,int f,int s){
        int tem=num[f];
        num[f]=num[s];
        num[s]=tem;
    }
}
