package SkillPractice;

import java.util.Scanner;

public class FibanocciSeries {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int valueIs = s.nextInt();
        if(valueIs<0){
            System.out.println("Enter valid Credentials");
        }else{
            int a = 0;
            int b = 1;
            int temp;

            while (a < valueIs) {
                System.out.println(a);
                temp = a + b;
                a = b;
                b = temp;
            }
        }
    }
}
