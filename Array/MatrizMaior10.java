package Array;

import java.util.Scanner;

public class MatrizMaior10 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int l, c, cont=0;
		int[][] numeros = new int[3][3];

		for (l=0;l < 3; l++) 
		{
			for (c = 0; c < 3; c++) {
				System.out.println("Informe o valor: ");
				numeros[l][c] = leia.nextInt();

				if (numeros[l][c]>10) 
				{
					cont++;
				}

			}

		}
		System.out.println("Quantidade de número informados, maiores que 10: "+ cont);

	}
}