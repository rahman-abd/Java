package package1;

public class CountNum {
    public static void main(String[] args) {
        int n = 652378987;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;

        }
        System.out.println(count);
    }
}