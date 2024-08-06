package codingNinja.TypeConversions;

import java.util.Scanner;

public class ExplictConv1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 12345;
        byte b = (byte) i;
        System.out.println(b);
//        The integer value 12345 is explicitly cast to a byte using (byte) i. In Java, a byte has a range from -128 to 127.
//        Since 12345 falls within this range, the casting will result in 57. Therefore,
//        the output of System.out.println(b) is 57.
    }
}
