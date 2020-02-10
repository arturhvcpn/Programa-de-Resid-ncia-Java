package desafio_model;

import java.math.BigDecimal;

public class arquivo {
    private String varProduto;
    private int varQuantidade;
    private double varDesconto;
    private BigDecimal varValor,varValorTotal;


    public arquivo(String varProduto, int varQuantidade, BigDecimal varValor, BigDecimal varValorTotal){
        this.varProduto = varProduto;
        this.varQuantidade = varQuantidade;
        this.varValor = varValor;
        this.varValorTotal = varValorTotal;
    }

    public void setVarProduto(String varProduto) {
        this.varProduto = varProduto;
    }

    public void setVarQuantidade(int varQuantidade) {
        this.varQuantidade = varQuantidade;
    }

    public void setVarValor(BigDecimal varValor) {
        this.varValor = varValor;
    }

    public void setVarValorTotal(BigDecimal varValorTotal) {
        this.varValorTotal = varValorTotal;
    }

    public String getVarProduto() {
        return varProduto;
    }

    public int getVarQuantidade() {
        return varQuantidade;
    }

    public BigDecimal getVarValor() {
        return varValor;
    }

    public double getVarDesconto() {
        return varDesconto;
    }

    public BigDecimal getVarValorTotal() {

        if(varQuantidade >= 10){
            return varValorTotal = (varValor.multiply(BigDecimal.valueOf(varQuantidade * varDesconto)));
        }
        else{
            return varValorTotal = (varValor.multiply(BigDecimal.valueOf(varQuantidade)));
        }
    }

    @Override
    public String toString() {
        return "arquivo{" +
                "varProduto='" + varProduto + '\'' +
                ", varQuantidade=" + varQuantidade +
                ", varDesconto=" + varDesconto +
                ", varValor=" + varValor +
                ", varValorTotal=" + varValorTotal +
                '}';
    }
}
