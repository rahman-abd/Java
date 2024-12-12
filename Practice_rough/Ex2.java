package Practice_rough;
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 16, 20, 18, 17,3, 2 };
        int target = 78;
        // int ans = Peakelement(arr);
        // System.out.println(ans);
        int index = SearchElement(arr, target);
        System.out.println(index);
    }

    static int SearchElement(int[] num, int target) {
        int peak = Peakelement(num);
        int start1 = 0;
        int start2 = peak + 1;
        int end = num.length - 1;
        int try1 = Bssss(num, target, start1, peak);
        // int try2 = Bssss(num, target, start2, end);
        // if (try1==try2) {
        // return try1;
        // }else if(try1==-1&&try2==-1){
        // return -1;
        // }else if (try1==-1) {
        // return try2;
        // }else{
        // return try1;
        // }
        if (try1!=-1) {
            return try1;
        }
        return Bssss(num, target, start2, end);

    }

    static int Peakelement(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] < num[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int Bssss(int[]num,int target,int start,int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target==num[mid]) {
                return mid;
            }
            boolean b=num[start]<num[end];
            if(b){
            if (target < num[mid]) {
                end = mid - 1;
            } else{

                start = mid + 1;

            } 
        }else{
            if (target < num[mid]) {
                start = mid + 1;
            } else{

                end = mid - 1;

            } 
            }
        }
        
        return -1;
       }
}
