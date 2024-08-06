package com.vamsi;

import java.util.Arrays;

public class Exercise_9arr {
    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console

        String [] name = {"a", "b", "c", "d"};
        System.out.println("OriginalArray" +  Arrays.toString(name));
        System.out.println();

        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare

        String [] secondarray = name;
        System.out.println("OriginalArray" +  Arrays.toString(name));
        secondarray[0] = "z";
        System.out.println("SecondaryArray" +  Arrays.toString(secondarray));
        System.out.println();


    }
}
