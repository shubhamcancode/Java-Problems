package Linear_search;
public class MinimumNumber{
    public static void main(String args[]){
        int[] arr = {10,12,14,15,13,2,3,4};
        System.out.println(min(arr));
    }
//    The array.length != 0
//return minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}