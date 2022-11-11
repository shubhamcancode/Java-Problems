package conditional.easy;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height, Area;
        System.out.println("Enter the value of base ");
        base = sc.nextDouble();

        System.out.println("Enter the value of height ");
        height = sc.nextDouble();

        Area = 0.5 * base * height;
        System.out.println("The Area of Triangle is = "+Area);
    }
}
