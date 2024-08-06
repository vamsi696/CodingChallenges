package Practice_CodingNinjas;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x1, x2, y1, y2;
        x1 = s.nextInt();
        x2 = s.nextInt();
        y1 = s.nextInt();
        y2 = s.nextInt();

        int areaOfRectangle = (x2 - x1) * (y2 - y1);

        System.out.println(areaOfRectangle);
    }
}
