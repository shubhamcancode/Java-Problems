package conditional.medium;

import java.util.Scanner;

//Average of N number
public class AvgOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of inputs ");
        int j = sc.nextInt();
        System.out.println("Enter the value of N = ");
        int n = sc.nextInt();
        int sum = 0;
        int avg = 1;
        for (int i = 0; i < j; i++) {
            sum = sum + i;
            avg = sum / n;
        }
        System.out.println("The average of N numbers is = " + avg);
    }
}
