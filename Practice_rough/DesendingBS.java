package Practice_rough;
public class DesendingBS {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 8;
        int ans = BS(arr, target);
        System.out.println(ans);
    }

    static int BS(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                start = mid + 1;
            } else if (target > num[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
