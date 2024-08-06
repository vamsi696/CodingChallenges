package codingNinja.Fundamentals;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int index = s.nextInt();
        char ch = str.charAt(index);
        int Ascii = (int) ch;
        System.out.println(Ascii);
    }
}
