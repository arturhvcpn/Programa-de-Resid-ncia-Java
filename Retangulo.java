package com.company;

public class Retangulo {
    public double base, altura;

    public double perimetroRetangulo(){
        double perimetro;
        perimetro = (2 * base) + (2* altura);
        return perimetro;
    }
    public double areaRetangulo(){
        double area;
        area = base * altura;
        return area;
    }
}