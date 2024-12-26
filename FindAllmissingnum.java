import java.util.ArrayList;
import java.util.List;

public class FindAllmissingnum {
     public static void main(String[] args) {
        
        int[]arr={ 4, 3,2,7,8,2,3,1};
        List<Integer>a=sort(arr);
        System.out.println(a);
    }
    static List<Integer> sort(int[]num){
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
        List<Integer>a=new ArrayList<>();
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j+1) {
                a.add(j+1);
            }
        }
        return a;
                   
    }
    static void  swap(int[]num,int f,int s){
        int tem=num[f];
        num[f]=num[s];
        num[s]=tem;
    }
}
