import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayListExmaple {
    public static void main(String[] args) {

        //syntax.
        //cannot pass primitive datatypes.
        //only Wrapper classes allowed.
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(43);
//        list.add(84);
//        list.add(99);
//        list.add(34);
//        list.add(32);
//        list.add(12);
//        list.add(43);
//        list.add(84);
//        list.add(99);
//        list.add(34);
//        list.add(32);
//        list.add(12);
//        list.add(43);
//        list.add(84);
//        list.add(99);
//        list.add(34);
//        list.add(32);
//        list.add(12);
        
//        list.set(2,98);
//        list.remove(4);
        
        //input
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        //output
        System.out.println(list);
    }
}
