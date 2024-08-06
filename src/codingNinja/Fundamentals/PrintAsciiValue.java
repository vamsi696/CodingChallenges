package codingNinja.Fundamentals;

import java.util.Scanner;

public class PrintAsciiValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(3);
        int x = (char) ch;
        System.out.println(x);
    }
}
