package conditional.easy;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pie = 3.142;
        System.out.println("Enter the radius of cone = ");
        double r = sc.nextDouble();

        System.out.println("Enter the height of the cone = ");
        double h = sc.nextDouble();

        double Vol = (pie * r * r * (h/3));
        System.out.println("The volume of cone = "+Vol);


    }
}
