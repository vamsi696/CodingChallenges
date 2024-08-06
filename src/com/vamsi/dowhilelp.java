package com.vamsi;

public class dowhilelp {
    public static void main(String[] args) {
//        doWhile Loop - In this once the condition is given in do it will print atleast once if we give the condition is false also that
        int i=0;
        boolean keepLooping = true;
        do {
            System.out.println("Hello" + i++);
            keepLooping=false;
        } while (keepLooping);

    }
}
