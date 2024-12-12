package Array;

import java.util.Scanner;

public class BsQ1 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      int[] arr = { -12, -3, -1, 0, 3, 6, 7,13, 89 };
      
       // int[] arr = { 33,22,11,8,6,4,3,2 };
       System.out.print("Enter your search element:");
        int target = s.nextInt();
        s.close();
        int ans1 = ceilingTarget(arr, target);
        int ans2 = Floor(arr, target);
         if (ans1==arr.length) {
           System.out.println("un numberey illada venna movana en time than waste! poda poi velaya paruda");
            //return;
         }else{
            System.out.println("Ceiling of "+target+" is: "+ans1);
            //System.out.println(arr[arr.length-1]);

         }
         if (ans2==arr[0]-1) {
           System.out.println("un numberey illada venna movana en time than waste! poda poi velaya paruda");
            //return;
         }else{
        System.out.println("Floor of "+target+" is: "+ans2);}
       // System.out.println(arr[0]-1);
    }
    static int ceilingTarget(int[]num,int target){
        int start=0;
        for (int i = 0; i < num.length; i++) {
            if (target>num.length-1) {
                return num.length;
            }
        }
        int end=num.length-1;
        boolean isAgn= num[start]<num[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return num[mid];
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
        return num[start];
    }
    static int Floor(int[]num,int target){
        int start=0;
        for (int i = 0; i < num.length; i++) {
            if (target<num[start]) {
                return num[start]-1;
            }
        }
        int end=num.length-1;
        boolean isAgn= num[start]<num[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return num[mid];
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
        return num[end];
    }

    
    
}
