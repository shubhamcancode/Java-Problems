package Binary_Search;

import java.util.Arrays;

public class UnsortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target = 44;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

// Big O of N square = O(N^2)
