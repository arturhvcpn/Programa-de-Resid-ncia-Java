package com.company;

public class quarta {
           /* Scanner read = new Scanner(System.in);
        uma exceção é qualquer condicao de erro ou comportamento inesperado encontrado por um programa em execução
        * em java uma excecao é um obj herdado da classe java.lang.Exception - o compilador obriga a tratar ou propagar
        * java.lang.RunTimeException - o compilador não obriga a tratar ou propagar

        try{
            int vetor[] = new int[3];
            for(int i = 0; i < vetor.length; i++){
                System.out.print(i + " - Número: ");
                vetor[i] = read.nextInt();
            }
            for(int i = 0; i < vetor.length; i++){
                System.out.print(vetor[i]+"\t");
            }
            System.out.println("\nIndice:");
            int indice = read.nextInt();
            System.out.println(vetor[indice]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
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
        /*
        catch (ArrayIndexOutOfBoundsException || InputMismatchException e) {
            String tipo = e.getClass().getSimpleName();
            if(tipo.equals("ArrayIndexOutOfBoundsException"))System.out.println();
            if(tipo.equals("InputMismatchException"))System.out.println();
            //e.printStackTrace();
        }
         */
}
