package Practice_rough;

public class SecLarge {
    public static void main(String[] args) {
        int[]arr={12, 35,35, 1, 10, 34, 1};
        int ans=Large(arr);
        System.out.println(ans);
    }
    static int Large(int[]arr){
        int large=0;
        int secLarge=0;
        for(int num:arr ){
            if(num>large){
                large=num;
            }
            if(num==large){
              continue;  
            }else if(num>secLarge){
               secLarge=num; 
             }
        }
        if (secLarge==0) {
            return -1;
        }
       // return secLarge;
        return large;
    }
    }

