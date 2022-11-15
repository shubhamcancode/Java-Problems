package Functions;

import java.util.Scanner;

public class PrimeNumRange_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range = ");

        int low = sc.nextInt();
        int high = sc.nextInt();

        PrimeRange(low, high);
    }
    static int PrimeRange(int low, int high){
        for(int n = low; n <= high; n++){
            int count=0;
            for(int div=2; div*div <= n; div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
        return low;
    }
}
