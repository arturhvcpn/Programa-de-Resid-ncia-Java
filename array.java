package array;

import java.util.Scanner;

public class array {

	public static void markOne() {
		int[] array = new int[3];
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
		int[] array = new int[3];

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
		int[] array = new int[3];

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
		int[] array = new int[5];
		int soma = 0;
		
		Scanner read = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe um valor :: ");
			array[i] = read.nextInt();
			soma = soma + array[i];
		}
		System.out.println("Soma total array :: " + soma);

	}

	public static void main(String[] args) {
		// markOne();
		// markTwo();
		//markThree();
		//markFour();
	}
}
