package com.company;

import java.util.Scanner;

public class Main {
    public static void markOne(){
        String ANome[] = new String[3];
        String ASituacao[] = new String[3];
        double A1VA[] = new double[3];
        double A2VA[] = new double[3];
        double AMedia[] = new double[3];

        Scanner read = new Scanner(System.in);

        for(int i = 0; i < ANome.length; i++){
            System.out.print("Insira o nome individuo "+ i + " :: ");
            ANome[i] = read.next();

            System.out.print("Insira sua nota da avaliacao 1 da  "+ i + " unidade :: ");
            A1VA[i] = read.nextDouble();

            System.out.print("Insira sua nota da avaliacao 2 da"+ i + " unidade :: ");
            A2VA[i] = read.nextDouble();

            AMedia[i] = (A1VA[i] + A2VA[i]) / 2;
            if (AMedia[i] >= 7){
                ASituacao[i] = "Aprovado";
            }
            else if(AMedia[i] < 7){
                ASituacao[i] = "Reprovado";
            }
        }
        for (int i = 0;i<ANome.length; i++) {
            if (AMedia[i] >= 7 && AMedia[i] <= 10){
                System.out.println("Nota == " + AMedia[i]);
                System.out.println(ASituacao[i]);
            }
            else if (AMedia[i] < 7 && AMedia[i] <= 0){
                System.out.println("Nota == " + AMedia[i]);
                System.out.println(ASituacao[i]);
            }
        }
    }
    public static void main(String[] args) {
    markOne();
    }
}
