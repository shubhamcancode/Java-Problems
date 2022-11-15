package Functions;

import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Sumof_Methods {
    public static void main(String args[]){
        sum();
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number = ");
        a = sc.nextInt();

        System.out.println("Enter the second number = ");
        b = sc.nextInt();

        c = a+b;
        System.out.println("The sum = "+c);
    }
}
