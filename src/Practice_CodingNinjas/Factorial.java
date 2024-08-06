package Practice_CodingNinjas;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valueIs = s.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= valueIs){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
