package codingNinja.flowchart;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n > 0){
            System.out.println("1");
        } else if (n < 0) {
            System.out.println("-1");
        }else{
            System.out.println("0");
        }

    }
}
