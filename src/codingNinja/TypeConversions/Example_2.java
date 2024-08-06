package codingNinja.TypeConversions;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();
        int l = s.nextInt();
        System.out.println(d * l);

        int f2 = s.nextInt();
        double f1 = s.nextDouble();
        System.out.println(f2 * f1);

    }
}
