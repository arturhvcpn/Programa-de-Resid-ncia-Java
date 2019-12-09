package markEight;

public class markEightExercice {
    private String nome;
    private double preco;
    private int quantidade;

    public void addProdutos(int quantidade, int quantidade_nova){
        quantidade += quantidade_nova;
        System.out.println(quantidade);
    }

    public void removerProdutos(int quantidade,int quantidade_nova){
        quantidade -= quantidade_nova;
        System.out.println(quantidade);
    }

    public double valorTotalEmEstoque(){
        return (quantidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }
}
