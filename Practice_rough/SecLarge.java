package Practice_rough;

public class SecLarge {
    public static void main(String[] args) {
        int[]arr={1,2,5,3,4};
        int ans=Large(arr);
        System.out.println(ans);
    }
    static int Large(int[]arr){
        int large=0;
        int secLarge=0;
        for(int num:arr ){
            if(num>large){
            secLarge=large;
            large=num;
            }
            if(num<large&&secLarge<num){
            secLarge=num;
            }
           
        }
         //return secLarge;
    return large;
    }
}


