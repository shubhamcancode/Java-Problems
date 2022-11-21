package Arrays_codes.Tests;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

//        Multiple Inputs
        for(int i=0; i<5; i++){
             list.add(sc.nextInt());
        }

//        get item at any index
        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+" "); //pass index here, list[index] will not work here
        }

    }
}
