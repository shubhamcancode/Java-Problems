package Functions;

import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.
public class Productof_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number = ");
        num1 = sc.nextInt();

        System.out.println("Enter the second number = ");
        num2 = sc.nextInt();

        prod(num1, num2);
    }
    static void prod(int x, int y){
        int mul = 0;
        mul = x*y;
        System.out.println("The product of numbers is = "+mul);

    }
}
