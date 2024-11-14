package package1;


public class WhileQ2 {
    public static void main(String[] args) {
        System.out.println("your even num is 1 to 100: ");
        int num=2;
        int rem=0;
        while (num<=100) {
            rem=num%2;
            
            if (rem==0) {
            System.out.print(num+" ");
            }
            num++;
            
            
        }
    }
}
