package day00;

import javax.swing.JOptionPane;

public class exercicio {
	public static void imprimir() {

		String valor;
		double i, ano = 365.25;
		valor = JOptionPane.showInputDialog("Insira sua idade");
		i = Double.parseDouble(valor);
		i = i * ano;
		JOptionPane.showMessageDialog(null, "Sua idade em dias == " + i);
	}

	public static void exercicio_sala() {
		String quadrado;
		int z;

		quadrado = JOptionPane.showInputDialog("Insira um valor para Imprimir o quadrado ");
		z = Integer.parseInt(quadrado);
		z = z * z;
		JOptionPane.showMessageDialog(null, "quadrado  == " + z);
	}

	public static void converter() {
		int numero;
		double pi = 3.14;
		numero = (int) pi;
		String x;
		numero = Integer.parseInt(JOptionPane.showInputDialog("numero  == " + numero));
	}

	public static void imc() {
		double peso, altura, imc;
		String imcA, imcB;

		imcA = JOptionPane.showInputDialog("Insira seu peso em Quilogramas");
		imcB = JOptionPane.showInputDialog("Insira sua altura em Metros");
		// peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso ::"));
		// altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura ::"));
		peso = Double.parseDouble(imcA);
		altura = Double.parseDouble(imcB);

		imc = peso / (altura * altura);

		if (imc > 24.9) {
			JOptionPane.showMessageDialog(null, "Seu IMC == " + imc + ", indica que você possui Sobrepeso");
		} else if (imc < 24.9 && imc > 18.5) {
			JOptionPane.showMessageDialog(null, "Seu IMC == " + imc + ", indica que você é Saudável");
		} else if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Seu IMC == " + imc + ", indica que você possui Magreza");
		} else {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}

	public static void exercicio_onze() {
		int ler;
		do {
			ler = Integer
					.parseInt(JOptionPane.showInputDialog(" 1 Caderno\n 2 Lápis\n 3 Caneta \n 4 Diversos \n 5 Sair"));

			switch (ler) {
			case 1:
				JOptionPane.showMessageDialog(null, " ---- Caderno ----");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, " ---- Lápis ----");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, " ---- Caneta ----");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, " ---- Diversos ----");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, " ---- Sair ----");
				break;
			default:
				JOptionPane.showMessageDialog(null, " ---- Inválido ----");
				break;
			}
		} while (ler != 5);
	}

	public static void exercicio_par_impar() {
		int i;

		i = Integer.parseInt(JOptionPane.showInputDialog("== Insira um número =="));

		if (i % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Número par");
		} else {
			JOptionPane.showMessageDialog(null, "Número ímpar");
		}
	}

	public static void exercicio_contador() {
		int cont, w;
		cont = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um intervalo"));
		for (int i = 1; i <= cont; i++) {
			w = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
		}
	}

	public static void exercicio_vinte_cinco() {
		int cont, value, contpar = 0, soma = 0, maior = 0, menor = 0;
		double media = 0;

		cont = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um intervalo"));

		for (int i = 1; i <= cont; i++) {
			value = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero"));

			soma = soma + value;
			media = soma / cont;
			if (i == 1) {
				maior = value;
				menor = value;
			} else {
				if (value > maior) {
					value = maior;
				} else if (value < menor) {

					value = menor;
				}
			}
			if (value % 2 == 0) {
				contpar++;
			}

		}
		JOptionPane.showMessageDialog(null, "Pares " + contpar + " de números pares");
		// JOptionPane.showMessageDialog(null, "Média " + media + " de números pares");
	}

	public static void main(String[] args) {
		// imprimir();
		// exercicio_sala();
		// imc();
		// exercicio_onze();
		// exercicio_par_impar();
		exercicio_vinte_cinco();
	}
}
