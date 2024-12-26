package patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern1(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int num){
        for (int i = 1; i<=num; i++) {
            for (int j = 1; j <=num+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int num){
        for (int i = 1; i<=num; i++) {
            for (int j = 1; j<=num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int num){
        for (int i = 1; i <=2*num-1; i++) {
            int tcol= i>num?2*num-i:i;
            for (int j = 1; j <=tcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
