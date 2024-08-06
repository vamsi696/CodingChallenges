package com.vamsi;

import java.util.Arrays;

public class Exercise_8lp {
    public static void main(String[] args) {
//     What happens when you try to reassign index 5 to any integer?
//        OutofbondException will occur

        int[] numbers = {1, 2, 3, 4, 5};
        numbers[5] =15;
        System.out.println(Arrays.toString(numbers));
    }
}
