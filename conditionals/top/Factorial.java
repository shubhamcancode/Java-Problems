package conditional.medium;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact=1;
        System.out.println("Enter the number = ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            fact = fact*i;

        }
        System.out.println("The "+n+"! is = "+fact);
    }
}
