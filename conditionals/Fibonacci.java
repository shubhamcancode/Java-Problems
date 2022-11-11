package conditional.easy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }

//         for(int i=1; i<=n; i++){
//            System.out.println(first_num+", ");
//            int next = first_num + second_num;
//            first_num = second_num;
//            second_num = next;
//        }


    }
}


/*
import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        int value, sum, pro, sub;
        sum=0;
        pro=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>0){
            value = n % 10;
            sum = sum + value;
            pro = pro * value;
            n = n / 10;
        }
        System.out.println("The sum = "+sum+"\n The product = "+pro);
        sub = pro - sum;
        System.out.println("The sub = "+sub);

    }


}*/