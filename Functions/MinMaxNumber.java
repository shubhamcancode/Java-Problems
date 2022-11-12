package Functions;

import java.util.Scanner;
//  Find the maximum and minimum number from the given 3 numbers. Consider the three numbers as Int
public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int first = sc.nextInt();

        System.out.print("Enter the second number = ");
        int second = sc.nextInt();

        System.out.print("Enter the third number = ");
        int third = sc.nextInt();

        int Maximum = largest(first, second, third);
        int Minimum = smallest(first, second, third);

        System.out.println("The Maximum number = "+Maximum);
        System.out.println("The Minimum number = "+Minimum);

    }
    public static int largest(int first, int second, int third){
        int max=first;
        if(max < second){
            max = second;
        }
        if(max < third){
            max=third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third){
        int min = first;
        if(min > second){
            min=second;
        }
        if(min > third){
            min=third;
        }
        return min;
    }
}
