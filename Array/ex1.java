package Array;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] arr = new Integer[5];// create to heap memory
        // arr[0] = 1;// input index value
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // arr[5]=6;// index out of bounds
        // System.out.println(arr[5]);
        int[] arr2 = { 1, 2, 3, 4, 5 };// starting initialization
        System.out.println("Enter val");
        for (int row = 0; row < arr.length; row++) {
        arr[row]=s.nextInt();// run time ask input
        }

        Arrays.sort(arr);// sort method
        arr[0] = 199;// change index value
        System.out.println(Arrays.toString(arr));// print proper Arrays way

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("index of " + i + " value is " + arr[i]);// arr2 printing statement
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr2[i]*2;//modified element
        }
        s.close();

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("modified:"+i+" "+arr2[i]);
        }
    //   int newelement=6;
    //     int[] newarr2={1,2,3,4,5,6};


    }
}

