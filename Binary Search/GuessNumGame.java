package Binary_Search;
//374. Guess Number Higher or Lower
public class GuessNumGame {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        here we supposed to pick a number randomly
        int pick =10;
        int ans = guessNum(nums, pick);

        System.out.println("Ans = "+ans);
    }
    static int guessNum(int[] nums, int pick){
        int start = 0, end = nums.length;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(pick < nums[mid]){
                end = mid - 1;
            } else if (pick > nums[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
