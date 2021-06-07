package Array;

import java.util.Scanner;

public class EscolhaMatriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int [][] numeros = new int [2][2];
		int [][] numeros2 = new int [2][2];
		int [][] numeros3 = new int [2][2];
		int l,c, op, constante;
		
		System.out.println("\nInforme o valor da sua constante: ");
		constante = leia.nextInt();
		
			for (l = 0; l < 2; l++) {
		
			for (c = 0; c < 2; c++) {
				System.out.println("\nInforme o valor para armazenar da primeira matriz: ");
				numeros[l][c] = leia.nextInt();
			}

		}
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("\nInforme o valor para armazenar da segunda matriz: ");
				numeros2[l][c] = leia.nextInt();
			}

		}
		
		System.out.println("Escolha a opção que você deseja: ");
		System.out.println("(1) somar as duas matrizes\r\n"
				+ "(2) subtrair a primeira matriz da segunda\r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes\r\n");
		op = leia.nextInt();
		
		do{
		switch (op) {
		case 1:
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					numeros3[l][c] = numeros[l][c] + numeros2[l][c];
					System.out.println("Soma: " + numeros3[l][c]);
				}

			}
			break;
		case 2:
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					numeros3[l][c] = numeros[l][c] - numeros2[l][c];
					System.out.println("Subtração: " + numeros3[l][c]);
				}

			}
			break;

		case 3:

			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					numeros[l][c] = numeros[l][c] + constante;
					numeros2[l][c] = numeros2[l][c] + constante;
					System.out.println("Matriz 1: " + numeros[l][c]);
					System.out.println("Matriz 2: " + numeros2[l][c]);
				}

			}
			break;

		case 4:
			System.out.println("Matriz 1: \n");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf("\t %d \t ", numeros[l][c]);
				}
				System.out.println();
			}
			System.out.println("Matriz 2: \n");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.printf("\t %d \t ", numeros2[l][c]);
				}
				System.out.println();
			} break;			
			}
			System.out.println("\nEscolha a opção que você deseja: ");
			System.out.println("(1) somar as duas matrizes\r\n"
					+ "(2) subtrair a primeira matriz da segunda\r\n"
					+ "(3) adicionar uma constante as duas matrizes\r\n"
					+ "(4) imprimir as matrizes\r\n"
					+ "(0) Sair\r\n");
			op = leia.nextInt();
		}while(op!=0);

		leia.close();

	}

}
