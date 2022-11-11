package conditional.easy;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        pi*r*r*h
        final double pi = 3.142;
        System.out.println("Enter the values of radius & h");
        double rad = sc.nextDouble();

        double hei = sc.nextDouble();

        double Vol = pi * rad * rad * hei;
        System.out.println("The volume of cylinder =  "+Vol);

    }
}
