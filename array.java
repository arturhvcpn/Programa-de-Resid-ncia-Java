package array;

import java.util.Scanner;

public class array {

	public static void markOne() {
		int array[] = new int[3];
		array[0] = 2;
		array[1] = 1;
		array[2] = 0;

		/*
		 * erro em i<=3 for (int i = 0; i <= 3; i++) { System.out.println("valor " +
		 * array[i]); }
		 */
		for (int i = 0; i <= 2; i++) {
			System.out.println("Valor do array " + i + " ==  " + array[i]);
		}
	}

	public static void markTwo() {
		int array[] = new int[3];

		Scanner read = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.print("Informe um valor :: ");
			array[i] = read.nextInt();
		}
		for (int i = 0; i <= 2; i++) {
			System.out.println("Valor do array " + i + " ==  " + array[i]);
		}
	}

	public static void markThree() {
		int array[] = new int[3];

		Scanner read = new Scanner(System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.print("Informe um valor :: ");
			array[i] = read.nextInt();
		}
		System.out.println();
		for (int i = 2; i >= 0; i--) {

			System.out.println("Valor do array " + i + " ==  " + array[i]);
		}
	}

	public static void markFour() {
		int array[] = new int[5];
		int soma = 0;

		Scanner read = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe um valor :: ");
			array[i] = read.nextInt();
			soma = soma + array[i];
		}
		System.out.println("Soma total array :: " + soma);

	}

	public static void markFive() {
		int len;
		Scanner read = new Scanner(System.in);

		System.out.print("Informe o tamanho do array :: ");
		len = read.nextInt();
		int array[] = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.print("Informe um valor do array :: ");
			array[i] = read.nextInt();
		}
		for (int i = 0; i < len; i++) {
			System.out.println("Indice :: " + i + " valor  " + array[i]);
		}
	}

	public static void markSix() {
		int len, lpar = 0, limpar = 0, menor = 0, maior = 0;
		double media = 0,soma = 0;
		Scanner read = new Scanner(System.in);

		System.out.print("Informe a quantidade de valores que deseja ler :: ");
		len = read.nextInt();
		int array[] = new int[len];

		// i <= len - 1
		for (int i = 0; i < len; i++) {
			System.out.print("Informe o valor :: ");
			array[i] = read.nextInt();

			if (i == 0) {
				maior = array[i];
				menor = array[i];
			} else {
				if (array[i] > maior) {
					maior = array[i];
				} else if (array[i] < menor) {
					menor = array[i];
				}
			}
			// soma
			soma = soma + array[i];

			// media
			media = soma / len;
			// contador de pares
			if (array[i] % 2 == 0) {
				lpar++;
			}
			// contador de impares
			else {
				limpar++;
			}

		}
		System.out.println("\n==============================================");
		System.out.println("Valor da soma de todos os arrays :: " + soma);
		System.out.println("Valor da média de todos os arrays :: " + media);
		System.out.println("Quantidade de numeros pares :: " + lpar);
		System.out.println("Quantidade de numeros impares :: " + limpar);
		System.out.println("Valor de array maior :: " + maior);
		System.out.println("Valor de array menor :: " + menor);

	}

	public static void main(String[] args) {
		// markOne();
		// markTwo();
		// markThree();
		// markFour();
		// markFive();
		markSix();
	}
}
