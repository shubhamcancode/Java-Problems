//Leet Code Problem : 1281
//Subtract the Product and Sum of Digits of an Integer
//n=234 , pro = 2*3*4 & sum = 2+3+4

package conditional.easy;
import java.util.Scanner;
public class ReturnSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();


        int pro=1;
        int sum=0;
        while(num>0){
            int lastDig = num%10;
            pro = pro * lastDig;
            sum = sum + lastDig;
            num = num/10;
        }
        int sub = pro-sum;
        System.out.println("The Substract of the Pro & Sum = "+sub);
    }
}
