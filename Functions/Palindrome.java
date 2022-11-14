package Functions;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        if(checkPalindrome(n) == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    static boolean checkPalindrome(int n){
        int rev = 0, temp=n;
        while(temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (rev == n);
    }
}
