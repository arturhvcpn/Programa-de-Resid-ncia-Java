package Conta;

import java.util.Scanner;

public class Conta_main {
    public static void main(String[]args){

        Scanner read = new Scanner(System.in);

        System.out.print("Insira o número da conta :: ");
        int numero = read.nextInt();

        System.out.print("Insira o nome do cliente ::");
        String nomeCliente = read. next();

        Conta myConta = new Conta(numero,nomeCliente,0);

        System.out.print("Deseja fazer um deposito (s/n) :: ");
        char decisao = read.next().charAt(0);
        double saldo = 0;
        if (decisao == 's'){
            System.out.print("Informe o valor para deposito :: ");
             saldo = read.nextDouble();
             myConta.deposito(saldo);
            System.out.println(myConta.toString());
        }else{
            System.out.println(myConta.toString());
        }
        System.out.print("Deseja fazer um saque (s/n) :: ");
        char decisao_saque = read.next().charAt(0);
        if(decisao_saque == 's'){
            System.out.print("Informe o valor para saque :: ");
            saldo = read.nextDouble();
            myConta.saque(saldo);
            System.out.println(myConta.toString());
        }else{
            System.out.println(myConta.toString());
        }
    }
}
