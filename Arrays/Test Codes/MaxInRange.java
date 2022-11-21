package Arrays_codes.Tests;

import java.util.Scanner;

public class MaxInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23,13,34,53,34};
        System.out.println(maxRange(arr,1,3));
    }
   static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[1];

       for (int i = 0; i < arr.length; i++) {
           if(arr[i] > maxVal){
               maxVal = arr[i];
           }
       }
       return maxVal;
    }
}
