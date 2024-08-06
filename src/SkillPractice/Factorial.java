package SkillPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valueIs = s.nextInt();
        if (valueIs < 0){
            System.out.println("Please Enter non-negative integer");
        } else {
            int ans = calcFact(valueIs);
            System.out.println(ans);
        }
    }
    public static int calcFact(int n){
        int ans = 1;
        for(int i =1;i <= n;i++){
            ans *= i;
        }
        return ans;
    }
}
