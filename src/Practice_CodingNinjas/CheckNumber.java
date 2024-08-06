package Practice_CodingNinjas;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valueIs = s.nextInt();

        if (valueIs > 0){
            System.out.println("1");
        } else if (valueIs < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}
