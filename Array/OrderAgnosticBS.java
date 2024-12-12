package Array;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr = { -12, -3, -1, 0, 3, 6, 7, 89 };
        System.out.print("Enter your search element:");
        int target = s.nextInt();
        s.close();
        int ans = orderAgnosticBS(arr, target);
        if (ans==-1) {
            System.out.println("un numberey illada venna movana en time than waste! poda poi velaya paruda");
            return;
        }
        System.out.println("yor element is available in the index of: "+ans);
    }


    static int orderAgnosticBS(int[]num,int target){
        int start=0;
        int end=num.length-1;
        boolean isAgn= num[start]<num[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return mid;
            }if (isAgn) {
                if (target>num[mid]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if (target<num[mid]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
