package markFour;

import java.util.Scanner;

public class menu {
    public static String nome_produto;
    public static double preco_produto, valor_total;
    public static int quantidade_produto,quantidade_nova;

    public static void mark_Print(){
        System.out.println(nome_produto +", R$ "+ preco_produto +", "+ quantidade_produto + " unidades, Total R$ "+ valor_total);
    }

    public static void mark_add_Quantidade(){
        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos a ser adicionada:");
        quantidade_nova = read.nextInt();

        quantidade_produto = quantidade_produto + quantidade_nova;

        valor_total = preco_produto * quantidade_produto;

        mark_Print();
    }

    public static void mark_rmv_Quantidade(){
        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos a ser removida:");
        quantidade_nova = read.nextInt();

        quantidade_produto = quantidade_produto - quantidade_nova;

        valor_total = preco_produto * quantidade_produto;

        mark_Print();
    }

    public static void mark_Input(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe os dados do Produto:");

        System.out.println("Nome:");
        nome_produto = read.next();

        System.out.println("Preço:");
        preco_produto = read.nextDouble();

        System.out.println("Quantidade em Estoque:");
        quantidade_produto = read.nextInt();

        valor_total = preco_produto * quantidade_produto;
    }

    public static void mark_Main(){
        mark_Input();
        mark_Print();
        mark_add_Quantidade();
        mark_rmv_Quantidade();
    }
}