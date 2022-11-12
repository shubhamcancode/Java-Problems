package Functions;
import java.lang.*;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
//        Odd or Even
//        1.Brure Force Method
//
//        if(n%2 == 0){
//            System.out.println("The number "+n+" "+"= Even");
//        }else{
//            System.out.println("The number "+n+" "+"= Odd");
//        }


//    Bitwise " OR " i.e " | "
//        System.out.println("Enter the number n = ");
//    int n = sc.nextInt();

        if ((n | 1) > n) {
            System.out.println("The number " + n + " is Even ");
        }else{
            System.out.println("The number "+ n + " is Odd");
        }
    }
}

