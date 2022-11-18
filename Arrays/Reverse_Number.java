package Arrays_codes;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//52796  => 69725
        System.out.println("Enter the range");
        int[] number = new int [5];
        for(int i=0; i<5; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(number));

        for(int i=0; i< number.length/2; i++){
            int temp = number[i];

            number[i] = number[number.length - i - 1];
            number[number.length - i - 1] = temp;
        }
        System.out.println("Reverse Array : "+Arrays.toString(number));
    }
}
