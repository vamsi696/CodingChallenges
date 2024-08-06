package Practice_CodingNinjas;

import java.util.Scanner;

public class PrintAllEvenNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valueIs = s.nextInt();
        int i = 0;

        while (i <= valueIs){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
