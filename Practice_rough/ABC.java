package Practice_rough;

public class ABC {
    public static void main(String[] args) {
        char ch='Z';
        Print(ch);
    }
    static void Print(char ch){
        for (char i = ch; i>='A'; i--) {
            for (int let =1; let <=(i-'A'+1); let++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
