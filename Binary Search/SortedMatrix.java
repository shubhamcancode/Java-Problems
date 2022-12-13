package Binary_Search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 34;

        int[] ans = sortedMatrix(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortedMatrix(int[][] arr, int target){
        int row = 0, col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row, col};
            }
            if(arr[row][col] < target){
                row ++;
            }
            if(arr[row][col] > target){
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
