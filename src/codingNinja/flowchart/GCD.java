package codingNinja.flowchart;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        while (b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}
