package Practice_rough;
public class UPStartPatt {
    public static void main(String[] args) {
        patt(9);
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

    }
}
