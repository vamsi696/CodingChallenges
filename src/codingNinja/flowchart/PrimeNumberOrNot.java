package codingNinja.flowchart;

import java.util.Scanner;

public class PrimeNumberOrNot  {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int div = 2;
        if (n % div == 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
//        while(div < n){
//            System.out.println("prime");
//            if (n % div == 0){
//                System.out.println("NotPrime");
//            }
//            div++;
//        }
    }
}
