package Arrays_codes.Tests;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //    Syntax : ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(654);
        list.add(43);
        list.add(234);

        System.out.println(list);

        list.set(0, 446);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
