package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -10, -5, 0, 2, 3, 5, 10, 11, 12, 15, 18, 20, 22, 42, 84};
        int target = 10;
        int ans = orderAgnosticBS(arr, target);
        System.out.println("Index = "+ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
//            find middle element
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
