package Functions;

import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Areaof_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        double rad = sc.nextDouble();

        area(rad);
    }
    static void area(double x){
        double pi = 3.14;
//        area of circle =  pi*r*r;
        double Area = pi * x * x;
        System.out.println("The Area of Circle = "+Area);
//        cir of circle =  2*pi*r;
        double Circum = 2 * pi * x;
        System.out.println("The Circumference of Circle = "+Circum);
    }
}
