package Practice_rough;

public class RotateKtime {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
                 // 7,1,2,3,4,5,6
                 // 6,7,1,2,3,4,5
                 // 5,6,7,1,2,3,4
                 // 4,5,6,7,1,2,3
                 // 3,4,5,6,7,1,2
                 // 2,3,4,5,6,7,1
                 // 1,2,3,4,5,6,7
                 // 7,1,2,3,4,5,6
        int k=12;
        Rotate(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void Rotate(int[]num,int k){
        int n=num.length;
        k=k%n;

        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
    }
    static void reverse(int[]num,int start,int end){
        while (start<=end) {
            int temp=num[start];
             num[start]=num[end];
             num[end]=temp;
             start++;
             end--;
            
        }
    }
}
