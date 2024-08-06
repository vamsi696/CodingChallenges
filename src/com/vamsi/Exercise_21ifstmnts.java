package com.vamsi;

public class Exercise_21ifstmnts {

    public static void main(String[] args) {

        // create an string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal

        String firstvariable = new String("Hemanth");
        String secondvariable = new String("Hemanth");

        if (firstvariable.equals(secondvariable)){
            System.out.println("They are equal");
        }
    }
}
