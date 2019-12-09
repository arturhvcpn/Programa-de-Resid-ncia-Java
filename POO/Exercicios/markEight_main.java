package markEight;

public class markEight {
    public static void main(String[]args){

        markEightExercice markEight_print = new markEightExercice();

        markEight_print.setNome("TV");
        markEight_print.setPreco(900);
        markEight_print.setQuantidade(10);

        System.out.println("nome == " + markEight_print.getNome());
        System.out.println("preco == " + markEight_print.getPreco());
        System.out.println("quantidade == " + markEight_print.getQuantidade());
    }
}
