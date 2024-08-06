package com.vamsi;

public class passByValue {
    public static void main(String[] args) {
        // PassBy Value
        int age =21;
        int ageCopy = increment(age);
        int ageSample = decrement(age);
        System.out.println(age);
        System.out.println(ageCopy);
        System.out.println(ageSample);
    }
    static int increment (int age){
        return ++age;
    }
    static int decrement(int age){
        return --age;
    }
}
