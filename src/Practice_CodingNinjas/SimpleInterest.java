package Practice_CodingNinjas;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int SI, p = s.nextInt(),
                t = s.nextInt(),
                r = s.nextInt();

        SI = (p * r * t)/100;

        System.out.println(SI);
    }
}
