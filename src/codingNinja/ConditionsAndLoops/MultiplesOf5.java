package codingNinja.ConditionsAndLoops;

import java.util.Scanner;

public class MultiplesOf5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 5 == 0){
            System.out.println("Multiples of 5");
        } else {
            System.out.println("Not a Multiples of 5");
        }
    }
}
