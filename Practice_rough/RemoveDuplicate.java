package Practice_rough;


public class RemoveDuplicate {
     public static void main(String[] args) {
        int[]arr={1,1,2,3};
        int ans=remove(arr);
        System.out.print("no of unique element:"+ans);
        System.out.print("element is: [ ");
        for (int i = 0; i <ans; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

     }
     static int remove(int[]num){
        int ans=0;
        for (int i = 1; i < num.length; i++) {
            if (num[i]!=num[ans]) {
                ans++;
                num[ans]=num[i];
            }
     
       }
       return ans+1;
     }

}

