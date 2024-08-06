package codingNinja.ConditionsAndLoops;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a != b) {
            System.out.println("Not Equal");
        } else {
            System.out.println("Equal");
        }
    }
}
