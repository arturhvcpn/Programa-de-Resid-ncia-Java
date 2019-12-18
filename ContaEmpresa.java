package Conta;

public class ContaEmpresa extends Conta {

    private double limiteEmprestimo;

    public ContaEmpresa(int numero,String nomeCliente, double saldo, double limiteEmprestimo){
       super(numero,nomeCliente,saldo);
       this.limiteEmprestimo = limiteEmprestimo;
   }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return this.limiteEmprestimo;
    }

    public void emprestimo(double valor){

        if(valor > limiteEmprestimo){
            System.out.println("O valor do empréstimo excede o seu limite ");
        }
        else{
            deposito(valor);
            System.out.println(saldo);
        }
        // se o valor do emprestimo for maior que o limiteEmprestimo não é possível realizar o emprestimo
   }
}