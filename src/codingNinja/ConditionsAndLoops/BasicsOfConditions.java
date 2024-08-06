package codingNinja.ConditionsAndLoops;

import java.util.Scanner;

public class BasicsOfConditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b){
            System.out.println("First Num is greater");
        } else {
            System.out.println("Second Num is greater");
        }
        System.out.println("Outside Ifelse");
    }
}
