package Array;

public class Sumarr {
    public static void main(String[] args) {
        int[] ar=new int[2];
        ar[0]=1;
        ar[1]=2;
       Sum(ar);
        int[] arrr={10,30};
       Sum(arrr);
        System.out.println("ar sum = "+Sum(ar));
        System.out.println("arrr sum = "+Sum(arrr));

    }
    static int Sum(int[] arr){
        int sum=arr[0]+arr[1];
        return sum;
    }

}
