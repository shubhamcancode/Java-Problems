package LC;
// 162 : https://leetcode.com/problems/find-peak-element/description/
public class FindingPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(binarySearch(arr));
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
//            case 1: descending array
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
//                case 2: ascending array
                start = mid + 1;
            }
        }
//        case 3: start == end
        return end;
    }
}
