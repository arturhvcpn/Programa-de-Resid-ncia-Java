package exercice;

import java.util.ArrayList;
import  java.util.Scanner;

public class exercicio {
    public static void main(String[]args){

        ArrayList<String> nome = new ArrayList<String>();
        Scanner read = new Scanner(System.in);

        String cad;
        int choice;

        do {
            System.out.println("1. Cadastro de nome");
            System.out.println("2. Consulta de nome");
            System.out.println("3. Listagem de nome");
            System.out.println("4. Exclusão de nome");
            System.out.println("5. Está vazio");
            System.out.println("6. Limpar Array list");
            System.out.println("7. Sair");
            choice = read.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Informe o nome para cadastrar: ");
                    cad = read.next();
                    nome.add(cad);
                    System.out.println("Nome cadastrado com sucesso! ");
                    break;
                case 2:
                    System.out.println("Informe o nome para consultar: ");
                    String cons = read.next();
                    nome.listIterator();
                    break;
                case 3:
                    for (String show: nome){
                        System.out.println(show.toString());
                    }
                    break;
                case 4:
                    System.out.println("Informe o nome para ser excluído: ");
                    String rmv = read.next();
                    nome.remove(rmv);
                    break;
                case 5:
                    nome.listIterator();
                    break;
                case 6:
                    nome.clear();
                    break;
                case 7:
                    System.out.println("Fim de execução");
                    break;
                default:
                    System.out.println("Opção inválida ");
                    break;
            }
        }while (choice != 7);
    }
}
