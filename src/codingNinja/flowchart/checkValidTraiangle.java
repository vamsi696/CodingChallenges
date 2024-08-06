package codingNinja.flowchart;

import java.util.Scanner;

public class checkValidTraiangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a == (b = c)){
            System.out.println("1");
        }  else {
            System.out.println("-1");
        }
    }
}
