package Linear_search;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,4,5,6,7,3,12,4,34,50};
        int target = 5;
        int ans = linearSearch(arr,target);
        System.out.println("The index of number is = "+ans);

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
