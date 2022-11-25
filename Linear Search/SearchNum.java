package Linear_search;

import java.util.Scanner;

public class SearchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,23,22,-13, 45, 56, 23,55,65};

        System.out.println("Enter the Target value = ");
//        int target = sc.nextInt();
        int target = 23;
        int ans = linearSearch(arr, target);
        System.out.println("The index of element is = "+ans);
    }
    static int linearSearch(int[] arr, int target){
//        edge cases
        if(arr.length == 0){
            return -1;
        }

//        run a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
