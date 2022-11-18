package Arrays_codes.Easy;
import java.util.*;
public class SwapArray {
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
