package codingNinja.flowchart;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        fact = 1;
        int i = 1;
        while   (i<=n){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
