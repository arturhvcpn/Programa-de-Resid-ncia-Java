package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
            else{
                ASituacao[i] = "Reprovado";
            }
        }
        for (int i = 0;i<ANome.length; i++) {
            if (AMedia[i] >= 7){
                System.out.println("Nota == " + AMedia[i]);
                System.out.println(ASituacao[i]);
            }
            else if (AMedia[i] < 7){
                System.out.println("Nota == " + AMedia[i]);
                System.out.println(ASituacao[i]);
            }
        }
    }
    public static void markTwo(){
        String var[] = {"Caderno","Lápis","Borracha","Outros", "Sair"};
        int ind = 0;
do {
    ind = JOptionPane.showOptionDialog(null,"Escolha uma opcao ", "Menu de Opcoes", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,var,var[0]);
    switch (ind){
        case 0:
            JOptionPane.showMessageDialog(null,"Caderno");
            break;
        case 1:
            JOptionPane.showMessageDialog(null,"Lápis");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Borracha");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Outros");
            break;
        case 4:
            break;
    }
}while (ind != 4);
    }

    public static void main(String[] args) {
        //markOne();
        markTwo();
    }
}
