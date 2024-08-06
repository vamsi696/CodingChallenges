package codingNinja.TypeConversions;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long f1 = s.nextLong();
        int f2 = s.nextInt();
        System.out.println(f1 * f2);

        int i = s.nextInt();
        long l = s.nextLong();
        System.out.println(i * l);
    }
}
