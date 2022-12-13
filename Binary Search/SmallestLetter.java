package Binary_Search;
//744. Find Smallest Letter Greater Than Target (Leetcode)
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j','x','y'};
        char target = 'r';

        char ans = smallestLetter(letters, target);
        System.out.println("Ceiling char = "+ans);
    }
    static char smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
