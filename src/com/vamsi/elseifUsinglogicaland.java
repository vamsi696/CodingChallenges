package com.vamsi;

public class elseifUsinglogicaland {
    public static void main(String[] args) {
//        Else if Using Logical and Operator

        int age = 18;
        boolean isAdult = age >= 16;

        if (isAdult){
            System.out.println("is an adult :)");
        } else if (age == 0) {
            System.out.println("baby!");
        } else if (age > 0 && age <= 3) {
            System.out.println("toddler");
        } else if (age > 3 && age <= 15) {
            System.out.println("teenager");
        } else {
            System.out.println("Not an adult :(");
        }

    }
}
