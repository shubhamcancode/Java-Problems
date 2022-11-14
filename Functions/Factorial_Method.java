package Functions;

import java.util.Scanner;

public class Factorial_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

//        int ans = Factorial(num);
        Factorial(num);
//        System.out.println("The Factorial of "+num+" is = "+num);

    }
    static void Factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
