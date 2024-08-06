package com.vamsi;

public class ArthematicOperator {
    public static void main(String[] args) {
        int numberTwo = 2;
        int numberOne = 10;
        System.out.println(numberTwo + numberOne);
        System.out.println(numberTwo - numberOne);
        System.out.println(numberTwo * numberOne);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberTwo % numberOne);

        //BODMAS
        // B= Brackets
        // O=Orders (Powers/indices or roots)
        // D= Division
        // M= Multiplication
        // A= Addition
        // S= Subtraction

        System.out.println((2*2) * (10/2) + 4);

    }
}
