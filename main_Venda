package markNine;

import  java.util.Scanner;

public class principalVenda {

    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número");
        int number = read.nextInt();

        System.out.println("Insira o nome da mãe");
        String nameMother = read.next();

        System.out.println("Existe quantidade de pontos iniciais s/n");
        int points_read = read.next().charAt(0);
        int points = 0;
        if (points_read == 's'){
            System.out.println("Quantos pontos iniciais");
            points = read.nextInt();
        }

        Venda myVenda = new Venda(number,nameMother,points);

        System.out.println("Faz aniversário em Maio (s/n)");
        char birthday = read.next().charAt(0);
        if (birthday == 's'){
            System.out.println("Quantos anos tem");
            int ageMother = read.nextInt();
            myVenda.adicionarPontos(ageMother);
            System.out.println(myVenda.toString());
        }
    }
}
