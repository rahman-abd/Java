package Array;

public class CountEvenDig {
    public static void main(String[] args) {
        int[] arr={23,44,567,456,4567,789654};
        int ans=couneven(arr);
        System.out.println("Ans is: "+ans);
        System.out.println(digit(-8756476));
    }
    static int couneven(int[] num){
        int count=0;
        for (int i = 0; i < num.length; i++) {
            
            if (Correct(num[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean Correct(int i){
           int num=digit(i);
           return num%2==0;
    }
    static int digit(int num){
        if (num<0) {
            num=num*-1;
        }
        if (num==0) {
            return 1;
        }
        // int count=0;
        // while (num>0) {
        //     count++;
        //     num/=10;
       // int nums=num;
        String str=String.valueOf(num);
        int len=str.length();
        //}
        // return count;
        return len;
    }
}
