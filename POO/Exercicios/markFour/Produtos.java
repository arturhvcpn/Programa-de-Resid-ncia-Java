package markFour;

import java.util.Scanner;

public class Produtos {
    menu myMenu = new menu();

    public int add_Produto(int quantidade_produto, int quantidade_nova){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos a ser adicionada:");
        quantidade_nova = read.nextInt();

        quantidade_produto = quantidade_produto + quantidade_nova;
        return quantidade_produto;
    }

    public static void mark_rmv_Produto(){

    }
    public int rmv_Produto(int quantidade_produto, int quantidade_nova){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos a ser removida:");
        quantidade_nova = read.nextInt();

        quantidade_produto = quantidade_produto-quantidade_nova;
        return quantidade_produto;
    }
}