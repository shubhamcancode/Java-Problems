package conditional.medium;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float p, d, dis;
        System.out.print("Enter the Amount ");
        p = sc.nextFloat();

        System.out.print("Enter the Discount rate = ");
        d = sc.nextFloat();

        dis = p * (d/100);

        p = p - dis;
        System.out.println("The Discounted price is = "+p);
    }
}
