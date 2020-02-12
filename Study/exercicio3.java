package Study;

import java.util.Scanner;

public class exercicio3 {
    public static void Exercicio3(int opcao){
     try {
         Scanner read = new Scanner(System.in);

         System.out.println("Informe as opcões");
         opcao = read.nextInt();

         switch (opcao) {
             case 1:
                 System.out.println("Cadastrar Clientes");
                 break;
             case 2:
                 System.out.println("Editar Clientes");
                 break;
             case 3:
                 System.out.println("Remover Clientes");
                 break;
             default:
                 System.out.println("Inválido");
                 break;
         }
     }catch (Exception e){
         e.printStackTrace();
     }
     finally {

     }




    }
    public static void main(String[]args){
        int opcao = 0;
        Exercicio3(opcao);
    }
}
