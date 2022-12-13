package Binary_Search;
//34. Find First and Last Position of Element in Sorted Array
public class FirstLastPositionInSR {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,9};
        int target = 7;
    }
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

//    this function just returns the target
    int search(int[] nums, int target, boolean findStartIndex){
        int start = 0, end = nums.length - 1;


        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
//                potential answer
                ans = mid;

                if(findStartIndex == true){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
