package com.vamsi;

import java.util.Arrays;

public class Exercise_10arr {
    public static void main(String[] args) {

        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String [] name = {"a", "b", "c", "d"};
        String[] anotherarray = Arrays.copyOf(name,4);
        System.out.println("OriginalArray" +  Arrays.toString(name));
        anotherarray[0] = "Z";
        System.out.println("CopyofArray" + Arrays.toString(anotherarray));
    }
}
