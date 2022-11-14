package Functions;
// Calculate if the person is eligible for voting by using methods
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of candidate = ");
        int age = sc.nextInt();

        Ageof(age);
    }
    static void Ageof(int x){
        if(x >= 18){
            System.out.println("The candidate is Eligible for Voting");
        }else{
            System.out.println("The candidate is Not Eligible for Voting");
        }
    }
}
