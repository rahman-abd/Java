package Array;

public class Minvalue {
    public static void main(String[] args) {
        int[] arr={44, 55 ,66,34,244,22};
        // System.out.println(Min(arr));
        Min(arr);
        
    }
    static void Min(int[] arr){
        int minVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
                if (minVal>arr[i]) {
                    minVal=arr[i];
                 
            }
        }
        System.out.println(minVal);

        
    }
}
