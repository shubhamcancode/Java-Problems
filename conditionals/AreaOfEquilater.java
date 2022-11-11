package conditional.easy;

import java.util.Scanner;

public class AreaOfEquilater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side = ");
        int side = sc.nextInt();

        double Area = (Math.sqrt(3)/4) * Math.pow(side,2);
        System.out.println("The Area of Equilateral Triangle = "+Area);

    }



}
