package codingNinja.TypeConversions;

import java.util.Scanner;

public class ImplicitConv1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short s1 = 123;
        int i = s1;
        System.out.println(i);
    }
}
