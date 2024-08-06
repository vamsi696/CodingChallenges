package com.vamsi;

import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
import java.util.TreeMap;

public class HowToUseImports {
    public static void main(String[] args) {
        Point point = new Point();
        Color color = new Color(0xFFFF0000, true);
        Arrays.toString(new int[]{0});
        TreeMap treeMap = new TreeMap();

//        Ctrl+alt+o is used to Optimise the imports if not needed

//        There are two Date imports in java one is util.Date and sql.Date if we are using both the date then we need to
//          do the following way. So with full import statement we need to pass it for Date conflict.
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(1);

//        If we are using the lang package there is no need for import it behaves as default package for java
        String name = "HemanthKandalla";
        System.out.println(Math.PI);
    }
}
