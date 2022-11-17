package Methods;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers to be compared");
        System.out.println("Enter the first number ");
        int a = sc.nextInt();

        System.out.println("Enter the second number ");
        int b = sc.nextInt();

        System.out.println("Enter the third number ");
        int c = sc.nextInt();

        int large = large(a, b, c);
        int small = small(a, b, c);

        System.out.printf("The largest of three numbers %d %d %d is = %d %n", a, b, c, large);
        System.out.printf("The smallest of three numbers %d %d %d is = %d %n", a, b, c, small);
    }
    public static int large(int a, int b, int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    public static int small(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
