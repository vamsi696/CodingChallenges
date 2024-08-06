package codingNinja.Fundamentals;

import java.util.Scanner;

public class MultiplyingTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        System.out.println(a * b);
        int c = (int) a + (int) b;
        System.out.println(c);
    }
}
