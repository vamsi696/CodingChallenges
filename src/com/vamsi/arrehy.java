package com.vamsi;

import java.util.Arrays;

public class arrehy {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0]=1;
        numbers[1]=24;
        numbers[2]=3;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers1 = {1, 3, 5, 6, 7, 8, 2};
        System.out.println(Arrays.toString(numbers1));
        numbers1[2] = 4;
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers.length);

        String[] name = new String[3];
        name[0] = "Vamsi";
        name[1] = "Rubi";
        name[2] = "Hemanth";
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);

        String [] nam1 = {"Vamsi", "Rubi"};
        System.out.println(Arrays.toString(nam1));
        System.out.println(nam1.length);

    }
}

