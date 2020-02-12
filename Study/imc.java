package Study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class imc {
    public static void calculoImc(double peso, double altura){
        try{
            Scanner read = new Scanner(System.in);

            System.out.print("insira seu peso: ");
            peso = read.nextDouble();

            System.out.print("insira sua altura: ");
            altura = read.nextDouble();

            double calculoDoImc = peso / Math.pow(altura,altura);

            if(calculoDoImc < 18.5 ){
                System.out.println("Magreza, IMC: "+ calculoDoImc);
            }
            else if(calculoDoImc > 18.5 || calculoDoImc < 24.9){
                System.out.println("Saudável, IMC: "+ calculoDoImc);
            }
            else if(calculoDoImc > 25 || calculoDoImc < 29.9){
                System.out.println("Sobrepeso, IMC: "+ calculoDoImc);
            }
            else if(calculoDoImc > 30){
                System.out.println("Obeso, IMC: "+ calculoDoImc);
            }
            else{
                System.out.println("Error, IMC: "+ calculoDoImc);
            }
        } catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("Erro de entrada");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        double peso = 0 , altura = 0;
        calculoImc(peso, altura);
    }
}
