package package1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter name: ");
        String a= s.nextLine();
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println((char)(a.charAt(0)+1));
        // System.out.println(a.indexOf("hi"));
        // String fn="Abdul";
        // String ls="Rahman";
        // String a="hi";
        // String b="hello";
        // // System.out.println(a+" from "+fn+"\t"+b+" from "+ls);
        // System.out.println(fn.concat(ls));
        s.close();

    }
    
}
