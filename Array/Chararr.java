package Array;

import java.util.Arrays;

public class Chararr {
    public static void main(String[] args) {
        String name= "Rahman";
        char target='h';
        boolean ans=Check(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Check(String str, char target){
        if (str.length()==0) {
            return false;
            }
            char[] charArray=str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i]; 
         
                if (ch==target) {
                    return true;
                }
            }
            return false;
    }
}
