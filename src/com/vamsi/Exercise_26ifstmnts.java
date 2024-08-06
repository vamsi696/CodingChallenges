package com.vamsi;

public class Exercise_26ifstmnts {
    public static void main(String[] args) {
        // create a for loop which goes from 0 to 20
        // print each even value
        int value = 20;
        for (int i = 0; i <= value; i++){
         if (i % 2 == 0){
             System.out.println(i);
         }
        }
    }
}
