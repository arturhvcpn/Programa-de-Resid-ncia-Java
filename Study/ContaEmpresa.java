package Study;

public class ContaEmpresa extends Conta {
    private static double limiteEmprestimo;

    public ContaEmpresa(int numero, String nomeCliente, double saldo) {
        super(numero, nomeCliente, saldo);
    }
    public static void deposito(double valor){
        saldo += valor;
    }
    public static void saque(double valor){
        saldo -= valor;
    }
    public static void emprestimo(double valor){
        if( valor > limiteEmprestimo ){
            System.out.println("valor excede o limite");
        }
        else{
            saldo += valor;
        }
    }
}
