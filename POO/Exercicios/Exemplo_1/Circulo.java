package com.company;

public class Circulo {
    public double raio;
    public double pi = 3.14;
    public double diamentro_Circulo() {
        double diamentro;
        diamentro = raio*2;
        return diamentro;
    }
    public double circunferencia_Circulo(){
        double circu;
        circu = 2*pi*(raio*raio);
        return circu;
    }

    public double area_Circulo() {
        double area_Circulo;
        area_Circulo = pi*(raio*raio);
        return area_Circulo;
    }
}