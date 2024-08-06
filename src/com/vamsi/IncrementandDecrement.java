package com.vamsi;


public class IncrementandDecrement {
    public static void main(String[] args) {
        int number = 0;

        //DecrementOperator
        System.out.println(number--);
        System.out.println(number);
        System.out.println(--number);
        System.out.println(number);


        //IncrementOperator
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number);

        int increment = number + 1;
        int decrement = number - 1;
        System.out.println(increment);
        System.out.println(decrement);
    }
}
