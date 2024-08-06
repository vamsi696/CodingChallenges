package com.vamsi;

import java.util.Arrays;

public class Exercise_7lp {
    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        // print the contents to the console

        int[] num = new int[3];
        System.out.println(Arrays.toString(num));

        // fill it with the number `4`
        // print the array to the console

        int[] num_1 = new int[4];
        System.out.println(Arrays.toString(num_1));

        // reassign the second value in the array to the number `17`
        // print the array to the console

        int[] num_2 = new int[4];
        num_2[1] = 17;
        System.out.println(Arrays.toString(num_2));

    }
}
