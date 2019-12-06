package com.company;

import java.util.Scanner;
import com.company.*;


public class Main {

    public static void main(String[] args) {

        Triangulo newClass = new Triangulo();
        Circulo newCirculo = new Circulo();
        Retangulo newRetangulo = new Retangulo();
        Cinematica newCinematica = new Cinematica();

        //Triangulo
        newClass.a = 3;
        newClass.b = 4;
        newClass.c = 5;

        //Circulo
        newCirculo.raio = 1;

        //Retângulo
        newRetangulo.base = 5;
        newRetangulo.altura = 5;

        //Física Cinemática Básica
        newCinematica.espaco = 1000;
        newCinematica.tempo = 20;
        newCinematica.velocidade = 40;

        System.out.println("=========== Triângulo");
        System.out.println("Triangulo :: " + newClass.area());

        System.out.println("\n=========== Círculo");
        System.out.println("Circulo Diâmetro :: " + newCirculo.diamentro_Circulo());
        System.out.println("Circulo Circunferência:: " + newCirculo.circunferencia_Circulo());
        System.out.println("Circulo Área :: " + newCirculo.area_Circulo());

        System.out.println("\n=========== Retângulo");
        System.out.println("Retângulo Área :: " + newRetangulo.areaRetangulo());
        System.out.println("Retângulo Perímetro:: " + newRetangulo.perimetroRetangulo() );

        System.out.println("\n========== Física Cinemática Básica");
        System.out.println("Velocidade Média " + newCinematica.velocidadeMedia() + " Km/h");
        System.out.println("Aceleração " + newCinematica.aceleracao() + " m/s2");
    }
}