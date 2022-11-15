package Functions;

import java.util.Scanner;
//Write a function that returns the sum of first n natural numbers.
public class SumOfAll_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N = ");
        int n = sc.nextInt();

       SumAll(n);
    }
    static void SumAll(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
