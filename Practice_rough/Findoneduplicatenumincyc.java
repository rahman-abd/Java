package Practice_rough;

import java.util.ArrayList;
import java.util.List;

public class Findoneduplicatenumincyc {
    public static void main(String[] args) {
        
        int[]arr={1,4,3,3,6,6,5,4,2};
        
        List<Integer> ans=cyclicsort(arr);
        System.out.println(ans);
    }
    static List<Integer> cyclicsort(int[] num){
        int i=0;
        while (i<num.length){
            int c=num[i]-1;
            if (num[i]!=num[c]) {
                swap(num,i,c);
            }else{
                i++;
            }
        }
        List<Integer>a=new ArrayList<>();
        for (int j = 0; j < num.length; j++) {
            if (j!=num[j]-1) {
                a.add(num[j]);
            }
        }
        return a;
            
        }
        static void swap(int[] num,int f,int s){
            int temp=num[f];
            num[f]=num[s];
            num[s]=temp;
        }
    }


