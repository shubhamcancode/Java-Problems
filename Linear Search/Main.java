package Linear_search;
//Code for Linear Search in an Array
public class Main {
    public static void main(String args[]){
    int[] num = {1,2,3,4,6,7,12,15,11,16,20};
    int target = 7;
    int ans = linearSearch(num, target);
        System.out.println("index of array = "+ans);

    int ans1 = linearSearch2(num, target);
        System.out.println("element of the array = "+ans1);

    boolean ans2 = linearSearch3(num,target);
        System.out.println(ans2);
    }

    static int linearSearch(int arr[], int target){
//if element is not there, return -1 index
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
//        if no element found return -1
        return -1;
    }

    static int linearSearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index< arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }

    static boolean linearSearch3(int arr[], int target){
        if(arr.length == 0){
            return false;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return true;
            }

        }
        return false;
    }
}

