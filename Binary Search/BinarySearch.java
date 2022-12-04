package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -10, -5, 0, 2, 3, 5, 10, 11, 12, 15, 18, 20, 22, 42, 84};
        int target = -18;

        int ans = binarySearch(arr, target);
        System.out.println("The index = "+ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
