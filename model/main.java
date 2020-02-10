package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        List<monday> mondayList = new ArrayList<>();
        String caminho = "C:\\temp\\exemplo.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
                fr = new FileReader(caminho);
                br = new BufferedReader(fr);

                String linhas[];
                String linha = br.readLine();
                while (linha != null) {
                    String campo[] = linha.split(",");
                    String nome = campo[0];
                    Double nota1 = Double.parseDouble(campo[1]);
                    Double nota2 = Double.parseDouble(campo[2]);
                    Double media = (nota1 + nota2) / 2;
                    String situacao = null;
                    mondayList.add(new monday(nome, nota1, nota2));

                    linha = br.readLine();
            }
            caminho = "C:\\temp\\situacao.csv";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
                for(monday monday:mondayList){
                    bw.write(monday.getNome() + "," + monday.getMedia() + "," + monday.getSituacao());
                    bw.newLine();
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro:" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro:" + e.getMessage());
        }
    }
}