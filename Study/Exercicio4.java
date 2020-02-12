package Study;

import java.util.Scanner;

public class Exercicio4 {
    public static void Exercicio4() {
       try {
                int maior = 0,menor = 0,auxiliar = 0,quantidade = 0, numero = 0,contador = 0, media = 0;

                Scanner read = new Scanner(System.in);

                System.out.println("Informe quantos números deseja digitar");
                quantidade = read.nextInt();

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("indice: "+ i );
                    numero = read.nextInt();

                    auxiliar = auxiliar + numero;


                    if(numero % 2 == 0){
                        System.out.println("Numéros pares");
                        contador++;
                    }else{

                    }

                    media = auxiliar / quantidade;

                    System.out.println("Media" + media);
                    System.out.println("Quantidade de números pares" + contador);
                }

       }
       catch (Exception e){
           e.printStackTrace();
       }
       finally {
           System.out.println("DeadLine");
       }
    }

    public static void main(String[] args) {
        Exercicio4();
    }
}
