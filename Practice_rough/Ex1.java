package Practice_rough;
public class Ex1 {
    public static void main(String[] args) {
    int[]arr={1,2,4,5,6,7,8,9};
    //int target=6;
    int ans=searchinrange(arr,6);
        System.out.println(ans);    
        }
    
    static int searchinrange(int[] num, int target) {
           int start=0;
           int end=1;
           while (target>num[end]) {
            int nst=end+1;
            end=end+(end-start+1)*2;
            start=nst;
           }
           return bS(num,target,start,end);
        }
        static int bS(int[]num,int target, int start , int end){
            while (start<=end) {
                int mid = start+(end-start)/2;
                //         2+3/2=3
                //         3+1/2=
                if (target<num[mid]) {
                    end=mid-1;
                }else if (target>num[mid]) {
                    start=mid+1;
                }else{
                    return mid;
                }

            }
            return -1;
        }

}
