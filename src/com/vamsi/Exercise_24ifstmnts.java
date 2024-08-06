package com.vamsi;

public class Exercise_24ifstmnts {
    // create a String variable and assign it a value
    // create an `if` statement which grabs the first letter of your word and compares it against a Character value
    // print something to the console if the condition is met
    public static void main(String[] args) {
        String variable = "Hemanth";
        char specifiedCharater = 'e';
        if (variable.charAt(1) == specifiedCharater){
            System.out.println("The string starts with the specified character");
        } else  {
            System.out.println("The string doesn't start with the specified character!");
        }
    }
}
