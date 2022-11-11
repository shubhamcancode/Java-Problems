package conditional.easy;

import java.util.Scanner;

public class PeriOfEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Equal side = ");
        int side = sc.nextInt();

        double Peri = 3 * side;
        System.out.println("The Perimeter of Equilateral Triangle = "+ Peri);


    }
}
