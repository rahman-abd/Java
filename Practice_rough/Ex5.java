package Practice_rough;
public class Ex5 {
    public static void main(String[] args) {
        char[]arr={'c','f','j'};
        char target='a';
        char ans=LesthanLargest(arr,target);
        System.out.println(ans);
    }
  static char LesthanLargest(char[]let,char target){
        int start=0;
        int end=let.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<let[mid]) {
                end=mid-1; 

            }else{
                start=mid+1;
            }
        }
    return let[start%let.length];
}
}
