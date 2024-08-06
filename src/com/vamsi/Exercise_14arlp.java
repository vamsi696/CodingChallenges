package com.vamsi;

public class Exercise_14arlp {
    public static void main(String[] args) {
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum

        int[] numbers = {1, 3, 5, 7, 9};

        int sum=0;

        for (int nNumbers:numbers){
            sum +=nNumbers;
        }
        System.out.println("Totalsum: " + sum);

    }
}
