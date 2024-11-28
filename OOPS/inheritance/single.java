package OOPS.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class single extends child{
    void abc() {
        System.out.println("djhkchds");
    }

    

    public static void main(String[] args) {
        single s = new single();
        s.abc();
        s.adb();

        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }

        Stream<Integer> sum = ll.stream().map(i ->  i*2);
    }



    @Override
    void adb() {
        System.out.println("hghghg");
   }
}

 abstract class child{

    abstract void adb();

    void abc(){
        System.out.println("I'm child");
    }
}

