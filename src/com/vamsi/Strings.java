package com.vamsi;

import java.nio.charset.StandardCharsets;

public class Strings {
    public static void main(String[] args) {
        String name = "Vamsi";
        String nameOne = "vam";

        String one = (name + nameOne);
        System.out.println(one);

        System.out.println(one.toUpperCase());
        System.out.println(one.toLowerCase());
        System.out.println(one.isEmpty());
        System.out.println(one.getBytes(StandardCharsets.UTF_8));
        System.out.println(one.substring(3));
        System.out.println(one.charAt(4));
        System.out.println(one.hashCode());
        System.out.println(one.length());
        System.out.println(one.replace('a', 'o'));
        System.out.println("  V  ".trim());
        //System.out.println(one.indexOf(-4));
    }
}
