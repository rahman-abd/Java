package Practice_rough;
public class UPStartPatt {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
       int space=n-1;
       for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=space; j++) {
            System.out.print(" ");
        }space-=1;
        for (int j = 1; j<=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
       }
       int n2=n-1;
       int space2=1;
       for(int i=n2;i>=1;i--){
            for(int j=1;j<=space2;j++){
                System.out.print(" ");
            }space2++;
            for (int j = i; j>=1; j--) {
                System.out.print("* ");
            }
             System.out.println();

       }

    }
}
