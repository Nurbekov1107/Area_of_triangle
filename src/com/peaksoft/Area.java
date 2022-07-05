package com.peaksoft;

public class Area {
    int a;
    int b;
    int c;

    void area() {
        double s = (a + b + c) / 2d;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }

}
