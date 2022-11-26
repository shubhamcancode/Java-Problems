package Linear_search;

import java.util.Arrays;

public class Minin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {11,12,13},
                {21,22,23},
                {31,32,33}
        };

        int target = 33 ;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            {
                for (int col = 0; col < arr[row].length; col++) {
                    if(target == arr[row][col])
                        return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
