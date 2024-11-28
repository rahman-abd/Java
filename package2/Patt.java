package package2;

public class Patt {
   public static void main(String[] args) {
    patternn(9);
   }

   static void patternn(int n){
    int space1=0;
    int space2=n-2;
    int mid=(n/2)+1;
    for (int i =1; i <=n; i++) {
        for (int j = 0; j <space1; j++) {
            System.out.print(" ");
        }
        System.out.print(i);
            if (i<mid) {
                space1++;
            }else if(i>=mid){
                space1--;
            }
        for (int j = 0; j <space2; j++) {
            System.out.print(" ");
        }
            if (i<mid) {
                space2-=2;
            }else if (i>=mid) {
                space2+=2;
            }if (i!=mid) {
                System.out.print(i);
            }
        
        System.out.println();
        
    }
   }
}
