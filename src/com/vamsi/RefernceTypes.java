package com.vamsi;

import java.awt.*;

public class RefernceTypes {
    public static void main(String[] args) {
        //RefereneTypes/object
        int age = 21;
        Point PointA = new Point(10, 10);
        System.out.println("PointA = " + PointA);
        PointA.move(10, 11);
        System.out.println("PointA = " + PointA);
        PointA.hashCode();
        System.out.println(PointA.hashCode());
        System.out.println(PointA.toString());
    }
}
