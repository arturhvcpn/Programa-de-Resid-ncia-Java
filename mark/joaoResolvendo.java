package mark;

import java.io.File;
import java.util.Scanner;

public class joaoResolvendo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o caminho de uma pasta");
		String textoCaminho = sc.next();
		
		File caminho = new File(textoCaminho);
		
		/*############## :: ##################
		 * Funcao que especifica o que se deseja filtrar
		 * Expressões: Lambda
		 * É importante entender que pode se colocar uma funcao como argumento
		 * so funciona no java 8 em diante
		 */
		File pastas[] = caminho.listFiles(File :: isDirectory);		
		
		System.out.println("################################");
		System.out.println("########## Diretórios ##########");
		
		for(File pasta : pastas) {
			System.out.println(pasta);
			System.out.println("getName: "+ pasta.getName());
		}			
		
		File arquivos[] = caminho.listFiles(File :: isFile);
		
		System.out.println("################################");
		System.out.println("########### Arquivos ###########");
		
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		/*
		File arquivosOcultos[] = caminho.listFiles(File :: isHidden	);
		
		System.out.println("################################");
		System.out.println("####### Arquivos Ocultos #######");
		
		for(File arquivoOculto : arquivosOcultos) {
			System.out.println(arquivoOculto);
		}
		*/
		boolean sucesso = new File(textoCaminho + "\\subDiretorio").mkdir();
		System.out.println("diretoria criado com sucesso "+ sucesso);
		sc.close();
		
	}
}