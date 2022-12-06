package Binary_Search;

public class CeilingNumberBS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ans = ceilingNumber(arr, target);
        System.out.println("Ceiling = " + ans);
    }

//    return index : smallest number <= target
    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//  but, if target > arr.length , return -1;
        if(target > arr[arr.length - 1]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
