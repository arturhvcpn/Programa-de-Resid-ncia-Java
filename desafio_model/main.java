package desafio_model;

import model.monday;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        List<arquivo> listaProdutos = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo");
        String caminhoArquivo = read.next();

        File arquivoOriginal = new File(caminhoArquivo);
        String caminhoPasta = arquivoOriginal.getParent();

        boolean sucesso = new File(caminhoPasta +"\\out").mkdir();

        String caminhoArquivoSaida = caminhoPasta + "\\out\\resumoVendas.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivoSaida))){
        String itemCsv = br.readLine();

        while (itemCsv!=null){
            String campo[] = itemCsv.split(",");
            String varProduto = campo[0];
            int varQuantidade = Integer.parseInt(campo[1]);
            BigDecimal varValor = new BigDecimal(campo[2]);
            BigDecimal varValorTotal = new BigDecimal(campo[3]);

            listaProdutos.add(new arquivo(varProduto, varQuantidade,  varValor,  varValorTotal));
            itemCsv = br.readLine();
        }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivoSaida))){
                for(){
                    bw.write();
                    bw.newLine();
                }
            }

        }catch (IOException e){
            System.out.println("Erro na leitura do arquivo");
            e.getStackTrace();
        }
    }
}
