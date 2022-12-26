package Binary_Search;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakEleMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
//            if array is descending
//            mid > mid + 1
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start; //return end; as both start and end are equal; start = end;
    }
}
