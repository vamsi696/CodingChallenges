package codingNinja.flowchart;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
