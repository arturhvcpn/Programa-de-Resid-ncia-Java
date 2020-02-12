package Study;

public class Conta {
        private static int numero;
        private static String nomeCliente;
        protected static double saldo;

    public Conta(int numero, String nomeCliente, double saldo) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void deposito(double valor){
        saldo += valor;
    }
    public static void saque(double valor){
        saldo -= valor;
    }
}
