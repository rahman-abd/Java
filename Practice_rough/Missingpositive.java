package Practice_rough;

public class Missingpositive {
    public static void main(String[] args) {
        
        int[]arr={1,0,7,-1,4,2};
        
        int ans=cyclicsort(arr);
        System.out.println(ans);
    }
    static int cyclicsort(int[] num){
        int i=0;
        while (i<num.length){
            int c=num[i]-1;
            if (num[i]>0&&num[i]<=num.length &&num[i]!=num[c]) {
                swap(num,i,c);
            }else{
                i++;
            }
        }
        
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j+1) {
                return j+1;
            }
        }

        return num.length+1;
            
        }
        static void swap(int[] num,int f,int s){
            int temp=num[f];
            num[f]=num[s];
            num[s]=temp;
        }
    
}
