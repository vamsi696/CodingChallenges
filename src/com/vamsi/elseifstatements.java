package com.vamsi;

public class elseifstatements{
    public static void main(String[] args) {
//        Else if statements
        int age = 4;
        boolean isAdult = age >= 16;

        if (isAdult){
            System.out.println("He is adult :)");
        } else if (age == 0) {
            System.out.println("baby");
        } else if (age == 1) {
            System.out.println("toddler");
        } else if (age == 2) {
            System.out.println("toddler");
        } else if (age == 3) {
            System.out.println("toddler");
        } else {
            System.out.println("Not an adult :(");
        }

    }
}
