package codingNinja.TypeConversions;

import java.util.Scanner;

public class ImplicitConv2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte b = 100;
        short s1 = b;
        int i = s1;
        long l = i;
        System.out.println(l);
    }
}
