package Practice_rough;

import java.util.Arrays;

public class S_B_I {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 4 };
        int[] ar = { 1, 2, 3, 4, 5 };
        int[] a = { 5, 3, 2, 1, 4, 0 };
        insertion(a);
        selection(arr);
        bubble(ar);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(a));
    }

    // Selection sort>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    static void selection(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int lastindex = num.length - i - 1;
            int maxelementodaintex = max(num, 0, lastindex);
            swap(num, maxelementodaintex, lastindex);

        }
    }

    static void swap(int[] num, int f, int s) {
        int temp = num[f];
        num[f] = num[s];
        num[s] = temp;
    }

    static int max(int[] num, int s, int e) {
        int max = s;
        for (int i = s; i <= e; i++) {
            if (num[max] < num[i]) {
                max = i;
            }
        }
        return max;
    }

    // bubble sort>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    static void bubble(int[] num) {
        boolean swapp;
        for (int i = 0; i < num.length; i++) {
            swapp = false;
            for (int j = 1; j <= num.length - i - 1; j++) {
                if (num[j] < num[j - 1]) {
                    // int temp = num[j - 1];
                    // num[j - 1] = num[j];
                    // num[j] = temp;
                    swap(num, j, j - 1);
                    swapp = true;
                }
            }
            if (!swapp) {
                break;
            }
        }
    }

    // **************************************************************************
    static void insertion(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    swap(num, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
