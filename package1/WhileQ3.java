package package1;

public class WhileQ3 {
    
    public static void main(String[] args) {
        System.out.println("your odd num is 1 to 100: ");
        int num=1;
        int rem=0;
        while (num<=100) {
            rem=num%2;
            
            if (rem==1) {
            System.out.print(num+" ");
            }
            num++;
            
            
        }
    }
}

    
