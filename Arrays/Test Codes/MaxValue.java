package Arrays_codes.Tests;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,55};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}