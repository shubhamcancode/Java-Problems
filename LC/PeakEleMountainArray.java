package LC;

public class PeakEleMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2, 1};
        binarySearch(arr);
        System.out.println(binarySearch(arr));
    }
    static int binarySearch(int[] arr){
        int start = 0, end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
