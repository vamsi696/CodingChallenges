package SkillPractice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valueIs = s.nextInt();
        if (valueIs <= 0){
            System.out.println("Invalid Input Please enter the Value Againg");
        } else {
           int sum = finalSum(valueIs);
            System.out.println(sum);
            }
    }
    public static int finalSum(int n){
        int sum = 0;
        int tempValue = n;

        while (tempValue > 0) {
            int totalSum = tempValue % 10;
            sum += totalSum;
            tempValue /= 10;
        }
        return  sum;
    }
}
