package codingNinja.flowchart;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater!!");
        } else if (b>a && b>c) {
            System.out.println("B is greater!!");
        }else{
            System.out.println("C is greater!");
        }
    }
}
