package codingNinja.TypeConversions;

import java.util.Scanner;

public class ExplicitConv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();
        int i = (int) l;
        short s1 = (short) i;
        System.out.println(s1);
    }
}
