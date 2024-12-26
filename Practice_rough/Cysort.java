package Practice_rough;

import java.util.ArrayList;
import java.util.List;

public class Cysort {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        List<Integer>ans=find(arr);
        System.out.println(ans);
    }
    static List<Integer> find(int[] num){
        int n=num.length;
        int i=0;
        while(i<num.length) {
            int c=num[i];
            if (num[i]==n) {
                  i++;
            }else if (num[i]!=num[c]) {
                int temp=num[c];
                num[c]=num[i];
                num[i]=temp;
             }
            else{
                i++;
            }
        }
        List<Integer>a=new ArrayList<>();
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j+1) {
                a.add(num[j+1]);
            }
        }
        return a;

    }

}
