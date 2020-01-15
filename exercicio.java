package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tentar {
    public static void main(String[]args){
        System.out.println("*** Método 1 - Início ***");
        imprimir();
        System.out.println("*** Método 1 - Fim ***");
    }
    private static  void imprimir(){
        Scanner read = new Scanner(System.in);

        try{
            System.out.println("*** Método 2 - Início ***");
            String vetor[] = read.nextLine().split(" ");
            System.out.print("Informe qual posição deseja imprimir: ");
            int i = read.nextInt();
            System.out.println(vetor[i]);
            System.out.println("*** Método 2 - Fim ***");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fora de alcance");
            //e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Campo preenchido de forma inválida");
            //e.printStackTrace();
        }
        finally {
            read.close();
        }
    }
}
