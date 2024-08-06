package codingNinja.flowchart;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a = 0;
        int b = 1;
        while(a<n){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }

    }
}
