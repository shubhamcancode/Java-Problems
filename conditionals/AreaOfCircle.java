package conditional.easy;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double rad,Area;
        final double pi = 3.142;

        System.out.println("Enter the radius of the circle = ");
        rad = sc.nextDouble();

        Area = pi * rad * rad;
        System.out.println("The Area of circle is = "+ Area);
    }
}
