package Study;

import java.util.Scanner;

public class exercicio5 {
    public static void Exercicio5(){

        try{
            Scanner read = new Scanner(System.in);
            int numero = 0,auxiliar = 0, numeroCalc = 0;

            System.out.println("Informe a quantidade de numeros");
            numero = read.nextInt();

            for(int i = 0; i < numero; i++) {
                System.out.println("Informe os numeros");
                numeroCalc = read.nextInt();
                auxiliar = auxiliar + numeroCalc;
            }
                System.out.println(auxiliar);
      }catch (Exception e){
          e.printStackTrace();
      }
      finally {
          System.out.println("###### Deadline ######");
      }
    }

    public static void main(String[]args){
        Exercicio5();
    }
}
