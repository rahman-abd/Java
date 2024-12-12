package Array;


public class BsinfiiniteArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int ans=InfiniteSearch(arr, 4);
        System.out.println("ans:"+ans);   
        
    }
    static int InfiniteSearch(int[]num,int target){
        int start=0;
         int end=1;
        while (target>num[end]) {
            int newst=end+1;
            end=end+(end-start+1)*2;
            start=newst;
            
        }
        return binarySearch(num,target,start,end);
       // return Search(num,target,start,end);
    }
    static int binarySearch(int[]num,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target>num[mid]) {
                start=mid+1;
                
            }else if(target<num[mid]){
                end=mid-1;
            
            }else{
                return mid;
            }
        }
        return -1;
       
    }
}
