//Take integer inputs till the user enters 0 and print the sum of all numbers

package conditional.easy;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;
        n= sc.nextInt();
        while(n!=0){
            System.out.println("Enter the value of n ");
            n= sc.nextInt();
            sum = sum + n;
        }
        System.out.println("The sum = "+sum);
    }
}


/*
System.out.println("Enter the value (0 to QUIT) = ");
        int n = sc.nextInt();
        int rem = 0;
        while(n!=0){
            for(int i=1; i<=n; i++){
                n=n%10;
                rem = rem + n;
                n=n/10;
            }
            System.out.println("The sum = "+rem);
        }
*/