package conditional.easy;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of width  ");
        float width = sc.nextFloat();
        System.out.println("Enter the value of length ");
        float length = sc.nextFloat();

        float Area;
        Area = width*length;

        System.out.println("The Area of Rectangle is = "+Area);

    }
}
