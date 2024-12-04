package Array;

public class Clone {
    public static void main(String args[]){
        int[] arr1={1, 2, 3, 4, 5};
        for (int i =0; i < arr1.length; i++) {
            System.out.println("Arr1: "+i+" = "+arr1[i]);
            
        }
        int[] arr2=arr1.clone();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            
        }
    }
}
