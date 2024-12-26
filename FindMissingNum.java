public class FindMissingNum {
    public static void main(String[] args) {
        int[]arr={1,2,0,3,5};
        
        System.out.println(find(arr));
    }
    static int find(int[]num){
        int i=0;
        while(i<num.length){
            int c=num[i];
            if (num[i]==num.length) {
                i++;
            }
            else if (num[i]!=num[c]) {
                int t=num[i];
                num[i]=num[c];
                num[c]=t;
            }else{
                i++;
            }
        }
        for (int j = 0; j < num.length; j++) {
            if (num[j]!=j) {
                return j;
            }
        }
        return num.length;
    }
}
