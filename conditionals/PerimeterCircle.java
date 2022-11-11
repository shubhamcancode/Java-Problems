package conditional.easy;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
//        peri = 2 pi r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius = ");
        double rad = sc.nextDouble();
        final double pi = 3.142;

        double peri  = 2 * pi * rad;
        System.out.println("The perimeter of circle = "+peri);

    }
}
