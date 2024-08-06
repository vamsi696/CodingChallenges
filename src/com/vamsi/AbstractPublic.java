package com.vamsi;

public class AbstractPublic {
//    We are using the Access Modifiers, This is a Public Modifier
//    Can Access it out of the class and package as well using class Name.
//    Within the class we can utilize the data as well in the methods, classes, attributes & Modifiers
//    If we are using the private modifiers it can be accessed within the class only
//    Default modifier can be accessed within the package and the class
    private static String foo = "Vamsi";
    static int valueIs = 1234;

    public static void main(String[] args) {
        System.out.println(foo);
    }
}
