package Array;

import java.util.Arrays;

public class BsQ3FindStEnd {
    public static void main(String[] args) {
        int[]arr={5,7,7,7,7,8,8,9};
        int target=7;
        int[] ans=SearchStart(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] SearchStart(int[]num,int target){
        int[] ans={-1,-1};
        int start=Search(num, target, true);
        int end=Search(num, target, false);
        ans[0]=start;
        ans[1]=end;

            return ans;
        }
        static int Search(int[]num,int target,boolean Findstart){
            int ans=-1;
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
                if (target>num[mid]) {
                    start=mid+1;
                }else if (target<num[mid]) {
                    
                    end=mid-1;
                }else{
                    ans=mid;
                    if (Findstart) {
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
