package markNine;

import java.util.Scanner;

public class Venda {

    private int numero;
    private String nomeMae;
    private int pontos;

    public Venda(int numero, String nomeMae,int pontos){
        this.numero = numero;
        this.nomeMae = nomeMae;
        this.pontos = pontos;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public int getPontos() {
        return this.pontos;
    }
    public void adicionarPontos(int valor){
        this.pontos = this.pontos + valor;
    }
    public String toString(){
        return ("Número :: " + this.numero + " Nome da mãe :: " + this.nomeMae + " Pontos :: "+ this.pontos);
    }
}
