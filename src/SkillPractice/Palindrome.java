package SkillPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if(isPalindrome(input)){
            System.out.println("This is a Palindrom!");
        } else{
            System.out.println("This is not a Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
