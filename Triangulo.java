package com.company;

public class Triangulo {
    public double a,b,c;

    public double area() {
        double p = (a+b+c)/2;
        double area_triangulo = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area_triangulo;
    }
}