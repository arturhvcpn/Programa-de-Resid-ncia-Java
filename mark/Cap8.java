package mark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cap8 {
    public static void main (String[]args){
        String caminho = "c:\\temp\\in.txt";               

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {                        

            String linha = br.readLine();
            
            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}