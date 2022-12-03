package LC;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//function to check whether the number is even or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
//        if(numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;


//        optimised ways
        return numberOfDigits % 2 == 0;
    }

//    function to count the numbers
    static int digits(int num){
        int count = 0;
//            while(num > 0){
//                count++;
//                num = num/10;
//            }
//        return count;
//

//            super optimised way to count numbers
        return (int)(Math.log10(num)) + 1;
    }
}
