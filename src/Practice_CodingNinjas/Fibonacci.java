package Practice_CodingNinjas;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valueLimit = s.nextInt();
        int a = 0;
        int b = 1;
        int temp;

        while (a < valueLimit){
            System.out.println(a);
              temp = a + b;
              a = b;
              b = temp;
        }
    }
}
