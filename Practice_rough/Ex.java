package Practice_rough;
public class Ex {
    public static void main(String[] args) {
        char ch='c';
        //char ans=printing(letter);
        //System.out.println(ans);
        for (char i=ch;i>='a';i--) {
            for (int j=0 ; j<(ch-'a'+1); j++) {
                System.out.print(i);
            }
            System.out.println();
       }
    }}
//     static char printing(char let){
//         for (char i=let;i>='a';i--) {
//             for (char ch = let; i <=(ch-'a'+1); ch--) {
//                 System.out.print(i);
//             }
//         }
//         return 0;
//     }
// }
