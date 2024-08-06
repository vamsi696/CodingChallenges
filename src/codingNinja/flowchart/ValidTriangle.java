package codingNinja.flowchart;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a+b > c){
            System.out.println("ValidTriangle");
        } else if (b+c>a) {
            System.out.println("B ValidTriangle");
        } else if (c + a > b) {
            System.out.println("C validTriangle");
        } else{
            System.out.println("Not a ValidTriangle");
        }
    }
}
