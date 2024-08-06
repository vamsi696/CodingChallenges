package com.vamsi;

import java.util.Arrays;

public class Exercise_10lp2 {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array
        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }

        String[] name = {"vam", "hem", "kand", "rubi", "pavan"};
        for (int i =0; i<name.length; i++){
            System.out.println(name[i]);
        }

        String [] b = {"a, b, c, d"};
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
