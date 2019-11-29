package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.w3c.dom.ranges.RangeException;
import java.math.*;
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
    public static void markThree(){
        int range = 2;
        int array_bi[][] = new int[range][range];

        for(int i = 0; i < range; i++){
            for (int it = 0; it < range; it++){
                System.out.print(array_bi[i][it] +" ");
            }
            System.out.println();
        }
    }
    public static void markFour(){
        int range = 100;
        int array_bi[][] = new int[range][range];

        for(int i = 0; i < range ;i++){
            for (int it = 0; it<range;it++){

                if (i!=it){
                    array_bi[i][it] = 0;
                    System.out.print(array_bi[i][it] + " ");
                }
                else{
                    array_bi[i][it] = 1;
                    System.out.print(array_bi[i][it] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void markFive(){


        Scanner read = new Scanner(System.in);

       System.out.print("Informe o tamanho da matriz :: ");
       int range = read.nextInt();
        int array_bi[][]= new int[range][range];

        for(int i = 0; i < range; i++){
            for (int it=0; it<range; it++){
                if (i!=it){
                    array_bi[i][it] = 0;
                    System.out.print(array_bi[i][it] + " ");
                }
                else{
                    array_bi[i][it] = 1;
                    System.out.print(array_bi[i][it] + " ");
                }
            }
            System.out.println();
        }
        read.close();
}
    public static void markSix(){
        int range = 5;
        int array_bi[][] = new int[range][range];
        for(int i = 0; i <range; i++){
            for (int it = 0;it<range; it++){
                if (i > it){
                    array_bi[i][it] = 3;
                    System.out.print(array_bi[i][it] + " ");
                }
                else if(it > i){
                    array_bi[i][it] = 2;
                    System.out.print(array_bi[i][it] + " ");
                }
                else{
                    array_bi[i][it] = 1;
                    System.out.print(array_bi[i][it] + " ");
                }
            }
            System.out.println();
        }
}
    public static void markSeven(){
        int range = 3;
        int array_bi[][] = new int [range][range];
        // Desenhando um X com um array bidimensional
        for (int i = 0; i<range; i++){
            for (int it = 0; it< range; it++){
                if(i!=it){
                    array_bi[i][it] = 0;
                    System.out.print(" ");
                }
                else{
                    array_bi[i][it] = 1;
                    System.out.print(array_bi[i][it] + " ");
                }
            }
            System.out.println();
        }
}
    public static void markEight(){
    int range = 2, p1 = 0,p2 = 0;
    int array_bi[][] = new int[range][range];
        Scanner read = new Scanner(System.in);
    // brincando
    for (int i =0; i < range; i++){
            for (int it = 0; it < range;it++){
                for(int ith = 0; ith < range; ith++){
                    System.out.println("Informe o valor da matriz :: " + it + "  value :: " + ith);
                    array_bi[it][ith] = read.nextInt();
                    p1 = array_bi[it][ith] * array_bi[it][ith];
                    System.out.println(p1);
                }
            }
    }

/*    for (int is = 0; is<range;is++){
        for (int its = 0; its<range;its++){
            System.out.print(array_bi[i][it] + " ");
        }
        System.out.println();
    }*/
        read.close();
}

    public static  void markNine(){
    int range_one = 6, range_two = 2;
    int array_bi[][] = new int[range_one][range_two];
    double array[] = new double[range_one];

    Scanner read = new Scanner(System.in);

    for (int i = 0; i<range_one;i++){
        for(int it = 0; i< range_two; it++){
            System.out.print("Informe o valor  da posicao ::  " + i + "  coluna :: " + it );
            array_bi[i][it] = read.nextInt();
        }
    }
    for(int i = 0; i< range_one;i++){
        for (int it = 0; i < range_two; it++){
            array[i] = Math.sqrt(array_bi[i][it] * array_bi[i][it+1]);
            it++;
        }
    }
    for(int i = 0; i<6;i++){
        System.out.printf("%.2%n",array[i]);
        System.out.println();
    }
    read.close();
    }
    public static void markTen(){
        int a = 10;
        int b =20;
        int soma = a+b;
        System.out.println(soma);
    }
    public static int soma(int x, int y){
        return x + y;
    }
    public static int subtracao(int x,int y){
        return x - y;
    }
    public static int multiplicar(int x , int y){
        return x * y;
    }
    public static int dividir(int x, int y){
        return x / y;
    }
    public static void main(String[] args) {

        int x , y , conti;
        char escolha;

        Scanner read = new Scanner(System.in);
        Main calculadora = new Main();


       do {
           System.out.print("\nDeseja utilizar a calculadora digite 1 para sair ou qualquer outro numero para continuar :: ");
           conti = read.nextInt();
           System.out.print("\nInforme um valor :: ");
           x = read.nextInt();
           System.out.print("\nInforme um valor :: ");
           y = read.nextInt();
           System.out.print("\nInforme que tipo de operacao  +  -  *  /  ");
           escolha = read.next().charAt(0);

           switch (escolha) {
               case '+':
                   System.out.printf("Resultado da soma foi :: ", calculadora.soma(x, y));
                   break;
               case '-':
                   System.out.printf("Resultado da subtracao foi :: ", calculadora.subtracao(x, y));
                   break;
               case '*':
                   System.out.printf("Resultado da multiplicacao foi :: ", calculadora.multiplicar(x, y));
                   break;
               case '/':
                   System.out.printf("Resultado da divisao foi :: ", calculadora.dividir(x, y));
               break;
               default:
                   System.out.println("Operação inválida");
                   break;
           }
       }while(conti != 1);
        read.close();
    }
}
