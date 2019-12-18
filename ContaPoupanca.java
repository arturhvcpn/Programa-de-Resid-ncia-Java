package Conta;

public class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca(int numero, String nomeCliente, double saldo,double taxaJuros) {
        super(numero, nomeCliente, saldo);
        this.taxaJuros = taxaJuros;
    }
    //upCasting Downcasting

    public void renderJuros(double valor){
        saldo += (this.taxaJuros*valor);
    }
}