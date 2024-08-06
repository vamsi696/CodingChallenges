package com.vamsi;

import java.util.Arrays;

public class arrehy1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Arrays.fill(numbers, 12);
        numbers[2] = 5;
    System.out.println(Arrays.toString(numbers));

        String [] name = new String[3];
        Arrays.fill(name, "Rubi");
        name[1] = "vamsi";
        System.out.println(Arrays.toString(name));
    }
}
