package Practice_rough;
public class StarPatt {
    public static void main(String[] args) {
       patt(9); 
    }
    static void patt(int n){
        int space=0;
        for (int i = n; i >0; i--) {
            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }
            space+=1;
            for (int j = i; j>0 ; j--) {
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
