package com.vamsi;

import java.util.Arrays;

public class Exercise_15arlp {
    // create a for loop which goes through each string in our array
    // make each word uppercase
    // assign the value in the array to the uppercase string
    // print our resulting array

    public static void main(String[] args) {
        String[] name = {"i", "sure", "do", "love", "bees"};
        for (int i=0; i < name.length; i++){
            name[i] = name[i].toUpperCase();
        }
        System.out.print("Uppercase Array words : ");
        for (String word:name){
            System.out.print(word);
        }
    }


}
