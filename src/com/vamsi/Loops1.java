package com.vamsi;

public class Loops1 {
    public static void main(String[] args) {
        System.out.println("for i loop");
        String[] names = {"vamsi, rubi, pavan, srinu, ganesh"};
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("Enhanced loop");
        for (String name : names){
            System.out.println(name);

        }
    }
}
