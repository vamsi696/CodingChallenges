package codingNinja.Strings;

import java.util.Scanner;
import java.util.SplittableRandom;

public class output3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        printAllChars(a);
    }
    public static void printAllChars(String a){
        for (int i = 0; i<a.length(); i++){
            System.out.print(a.charAt(i));
        }
    }
}
