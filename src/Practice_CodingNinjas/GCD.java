package Practice_CodingNinjas;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int temp;

        while (b != 0){
            temp = a%b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}
