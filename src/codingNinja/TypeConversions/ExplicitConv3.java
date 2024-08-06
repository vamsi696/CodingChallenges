package codingNinja.TypeConversions;

import java.util.Scanner;

public class ExplicitConv3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double d = 123453.987;
        float f = (float) d;
        int i = (int) f;
        System.out.println(i);
    }
}
