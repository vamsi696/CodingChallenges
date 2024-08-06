package com.vamsi;

public class whileLoop {
    public static void main(String[] args) {
        int i= 0;
        boolean keepLooping = true;
        while (keepLooping){
            System.out.println("Hello" + i++);
            keepLooping = false;
        }
    }
}
