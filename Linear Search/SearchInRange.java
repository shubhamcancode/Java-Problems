package Linear_search;

public class SearchInRange {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println(SearchRange(arr,target,3,9));


    }
    static int SearchRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<end; i++){
            int element = arr[i];
            if(element == target){
                return 1;
            }
        }
        return -1;
    }

}
