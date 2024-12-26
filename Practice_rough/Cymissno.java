package Practice_rough;

public class Cymissno{
    public static void main(String[] args) {
        int[]arr={3,0,1};
        int ans=number(arr);
        System.out.println(ans);
    }
    static int number(int[]num){
    //     int n=num.length;
    // int e=n*(n+1)/2;
    // int a=0;
    // for (int i = 0; i < num.length; i++) {
    //     a=i+a;
    // }
    // return e-a;
       int n=num.length;
       int i=0;
       while (i<num.length) {
        int c=num[i];
        if (num[i]==n) {
            i++;
        }else if (num[i]!=num[c]) {
            S_B_I.swap(num, i, c);
        }else{
            i++;
        }
       }
       for (int j = 0; j < num.length; j++) {
        if (j!=num[j]) {
            return j;
        }
       }
       return n;
       /* */
            
    }
    
}
