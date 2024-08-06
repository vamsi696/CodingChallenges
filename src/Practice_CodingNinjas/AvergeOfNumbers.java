package Practice_CodingNinjas;

import java.util.Scanner;

public class AvergeOfNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
            int x = s.nextInt(),
                y = s.nextInt(),
                z = s.nextInt(),
              Avg = s.nextInt();

            Avg = (x + y + z)/3;

        System.out.println(Avg);
    }
}
