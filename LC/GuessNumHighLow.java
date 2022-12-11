package LC;
//374. Guess Number Higher or Lower
public class GuessNumHighLow {
    public static void main(String[] args) {
        int ans = guessNumber(int n);
        System.out.println(ans);
    }
    static int guessNumber(int n){
        int start = 0, end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            int result = guess(mid);


            if(result < 0){
                end = mid - 1;
            }else if(result > 0){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
