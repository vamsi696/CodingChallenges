package com.vamsi;

public class Exercise_23ifstmnts {
    public static void main(String[] args) {
        // create three `int` variables. Assign them values with the first value sitting between the other two
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met

        int firstVariable = 5;
        int secondVariable = 7;
        int thirdVariable = 10;
//          Logical AND Operator
        if (firstVariable > secondVariable && firstVariable < thirdVariable){
            System.out.println("The above statement is Valid");
        } else {
            System.out.println("The above statement is not a valid");
        }

        System.out.println(" ");

//          Logical OR Operator
        if (firstVariable > secondVariable || firstVariable < thirdVariable){
            System.out.println("The above statement is Valid");
        } else {
            System.out.println("The above statement is not a valid");
        }

    }
}
