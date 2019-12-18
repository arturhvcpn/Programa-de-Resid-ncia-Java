package Conta;

public class Conta {
    private int numero;
    private String nomeCliente;
    protected double saldo;

    public Conta(int numero, String nomeCliente,double saldo){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposito(double saldo){
        this.saldo += saldo;
    }
    public void saque(double saldo){
        this.saldo -=(saldo + 5);
    }

    public String toString(){
        return ("Número da conta :: " + this.numero + " Nome do Cliente :: "+ this.nomeCliente + " Saldo R$" + this.saldo);
    }
}