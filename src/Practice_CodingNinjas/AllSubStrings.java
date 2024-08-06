package Practice_CodingNinjas;

import java.util.Scanner;

public class AllSubStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        AllSubStrings.PrintSubString(str);
    }

    public static void PrintSubString(String str){
        for (int i = 0; i < str.length(); i++){
            for (int j = i; j <= str.length(); j++){
                System.out.println(str.substring(i, j));

            }
        }
    }
}
