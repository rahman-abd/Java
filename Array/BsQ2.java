package Array;

public class BsQ2 {
    public static void main(String[] args) {
        char[]ch={'c','f','j'};
        char target2='f';
        char ans=Large(ch,target2);
        System.out.println(ans);
        System.out.println(ch.length);
    }
    public static char Large(char[]let,char target2){
        int start=0;
        int end=let.length-1;
        while (start<=end) {
             int mid=start+(end-start)/2;
             if (target2<let[mid]) {
                 end=mid-1;
                }else {
                 start=mid+1;
             }
        }
       return let[start%let.length];
      

}
    
}
