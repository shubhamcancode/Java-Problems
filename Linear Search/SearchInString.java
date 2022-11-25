package Linear_search;
import java.util.Arrays;
public class SearchInString {
    public static void main(String args[]){
        String name = "Shubham";
        char target = 'u';
        System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target ==  str.charAt(i)){
                return true;
            }
        }
        return false;
    }
//    Print charArray
    static boolean search1(String str, char target){
        if(str.length() == 0){
            return false;
        }
//        char ch;
        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }



}
