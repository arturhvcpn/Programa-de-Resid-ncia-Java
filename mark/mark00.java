package mark;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class mark00 {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Bom dia!","meu mozinho","já nasceu lá na fazendinha","\\\\"};
		
		String caminho = "c://temp//out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,false))){
			
			for(String linha : linhas) {
				bw.write(linha);				
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.getStackTrace();
			e.printStackTrace();
		}
	}
}