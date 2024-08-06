package com.vamsi;

import java.awt.*;

public class passByValueWithObjects {
    public static void main(String[] args) {
        Point PointA = new Point(10, 10);
        Point PointB = PointA;

        PointA.x =100;
        PointB.y = 50;

        System.out.println(PointA);
        System.out.println(PointB);

        PointB = new Point(100, 50);
        PointB.x = 35;
        System.out.println(PointA);
        System.out.println(PointB);
    }
}
