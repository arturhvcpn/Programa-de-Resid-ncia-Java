package mark;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mark01 {

	public static void main(String[] args) {
		String nome = null, telefone = null;			
		String caminho = "c://temp//artur.txt";
		
		Scanner read = new Scanner(System.in);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))){			
			
			String [] linhas = new String[] {nome,telefone};
			
			System.out.println("Informe o Nome");
			nome = read.next();
			
			System.out.println("Informe o Telefone");
			telefone = read.next();
			
			for(String linha : linhas){			
				bw.write(linha);				
				bw.newLine();
			}
		}
		catch(IOException e ){
			e.getStackTrace();
			e.printStackTrace();
		}
	read.close();	
	}

}