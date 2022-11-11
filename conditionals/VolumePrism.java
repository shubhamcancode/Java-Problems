package conditional.easy;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base ");
        double base = sc.nextDouble();

        System.out.println("Enter the value of height ");
        double height = sc.nextDouble();

        double volume = base * height;
        System.out.println("The volume of prism is = "+ volume);

    }
}