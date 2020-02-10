package model;

public class monday {
    private String nome, situacao; //private String situacao;
    private double nota1,nota2,media; //private double nota2;private double media;

    public monday(String nome,double nota1,double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media = (nota1 + nota2)/2;
    }

    public String getSituacao() {
        if(media>=7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Monday" +
                "Nome =" + nome +
                ", Media =" + media +
                ", Situacao =" + situacao;
    }
}
