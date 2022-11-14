package Functions;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.
public class PrimeNum_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        PrimeNum(num);

    }
    static void PrimeNum(int x){
        int count = 0;
        for(int div=2; div*div <= x; div++){
            if (x % div == 0) {
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("The number "+x+" is Prime ");
        }
        else{
            System.out.println("The number "+x+" is Not Prime ");
        }
    }
}
