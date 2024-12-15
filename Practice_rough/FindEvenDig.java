package Practice_rough;

public class FindEvenDig {
    public static void main(String[] args) {
        int[] arr = { 2, 33, 444, 5555, 666, 7777, 888888,888,3456,-1234};
        int ans = Evendig(arr);
        System.out.println(ans);
    }

    static int Evendig(int[] num) {
        int count = 0;
        for (int i:num) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int i){
        int number=count(i);
        return number%2==0;

    }
    static int count(int num){
        // int count=0;
        if (num==0) {
            //count=1;
            return 1;
        }if (num<0) {
            num=num*-1;
        }
        // while (num>0) {
        //     count++;
        //     num/=10;
        // }
        // return count;
        String f=String.valueOf(num);
        int len=f.length();
        return len;
    }

}
