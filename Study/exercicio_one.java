package Study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio_one {
    public static void calcularMedia(double nota1,double nota2){
        try {
            double media;

            Scanner read = new Scanner(System.in);

            System.out.print("Insira a nota da unidade um: ");
            nota1 = read.nextDouble();

            System.out.print("Insira a nota da unidade dois: ");
            nota2 = read.nextDouble();

            media = (nota1 + nota2) / 2;

            if (media >= 7) {
                System.out.println("Aprovado, media : " + media);
            } else {
                System.out.println("Reprovado media: " + media);
            }
        } catch(InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.print("####### Fim de execução #######");
        }
    }
    public static void main(String[]args){
        double nota1 = 0,nota2 = 0;
        calcularMedia(nota1,nota2);
    }
}