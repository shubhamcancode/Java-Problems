package Methods;

import java.util.Scanner;

public class MaxNumByTwoMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        int first, second, third;

        System.out.println("Enter the first number = ");
        first = sc.nextInt();

        System.out.println("Enter the second number = ");
        second = sc.nextInt();

        System.out.println("Enter the third number = ");
        third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.print("The maximum number is = "+largest);
        System.out.println();
        System.out.print("The minimum number is = "+smallest);


    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if(first>max){
            max=first;
        }
        if(second>max){
            max=second;
        }
        if(third>max){
            max=third;
        }
        return  max;
    }
    public static int smallest(int first, int second, int third){
        int min = first;
        if(first<min){
            min=first;
        }
        if(second<min){
            min=second;
        }
        if(third<min){
            min=third;
        }
        return min;

    }
}
