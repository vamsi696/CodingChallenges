package Practice_CodingNinjas;

import java.util.Scanner;

public class CheckPrimeNumberorNot {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valueIsPrime = s.nextInt();

        if (valueIsPrime % 2 == 0){
            System.out.println("isNotPrime");
        }else {
            System.out.println("isPrime");
        }
    }
}
